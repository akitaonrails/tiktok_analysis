package com.bytedance.android.livesdk.hashtag;

import X.C0IJT;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C2188811AlT;
import X.C236000ve;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C468960IaE;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5183020f;
import X.C754670Tiz;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC754690Tj1;
import X.ViewOnClickListenerC512201z6;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.HashTagResp;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.livesdk.dataChannel.GameTagIdChangedChannel;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewOpenHashtagAnchorDialogEvent;
import com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewRevisionAdjustIconStyleABSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import qo2.w;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewHashtagWidget2 extends PreviewWidget {
    public static final /* synthetic */ int LLJ = 0;
    public TextView LLILZ;
    public String LLILZIL = C497740JfY.LJIJI(2131842853);
    public LiveMode LLILZLL;
    public LiveIconView LLIZ;
    public TuxIconView LLIZLLLIL;

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.hib;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void I1() {
        DataChannel dataChannel;
        LiveMode liveMode = this.LLILZLL;
        if (liveMode == null) {
            return;
        }
        EnumC754690Tj1.Companion.getClass();
        EnumC754690Tj1 enumC754690Tj1LIZ = C754670Tiz.LIZ(liveMode);
        if (enumC754690Tj1LIZ != null) {
            Hashtag hashtag = enumC754690Tj1LIZ.getHashtag();
            GameTag gameTag = enumC754690Tj1LIZ.getGameTag();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(hashtag != null && C468960IaE.LIZ(hashtag) ? !AnchorPreviewUniformStyleABSetting.INSTANCE.enable() ? hashtag.title : "" : !AnchorPreviewUniformStyleABSetting.INSTANCE.enable() ? C497740JfY.LJIJI(2131842853) : C497740JfY.LJIJI(2131842008));
            if (AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) {
                if (this.LLILZLL == LiveMode.THIRD_PARTY) {
                    stringBuffer = new StringBuffer();
                    stringBuffer.append((hashtag == null || !C468960IaE.LIZ(hashtag)) ? C497740JfY.LJIJI(2131842008) : gameTag == null ? hashtag.title : gameTag.showName);
                } else if (gameTag != null) {
                    stringBuffer.append(String.valueOf(gameTag.showName));
                }
            } else if (gameTag != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" | ");
                sbLIZ.append(gameTag.showName);
                stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (this.hasAttached) {
                TextView textView = this.LLILZ;
                if (textView != null) {
                    textView.setText(stringBuffer);
                }
                if (hashtag != null && C468960IaE.LIZ(hashtag)) {
                    C1143680frq.LJ(this.LLIZ, "tiktok_live_broadcast_demand_8", "live_revision_topic_select.png", ImageView.ScaleType.CENTER_CROP);
                    G1(R.raw.icon_number_fill);
                } else {
                    C1143680frq.LJ(this.LLIZ, "tiktok_live_broadcast_demand_8", "live_revision_topic.png", ImageView.ScaleType.CENTER_CROP);
                    G1(R.raw.icon_circle_plus);
                }
            } else {
                this.LLILZIL = stringBuffer.toString();
            }
            Hashtag hashtag2 = enumC754690Tj1LIZ.getHashtag();
            if (hashtag2 == null) {
                hashtag2 = new Hashtag(0L, "", null, 0);
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.zW(HashtagChangedChannel.class, hashtag2);
            }
            GameTag gameTagFB = ((IGameTopicService) C1161920gLG.LIZJ(IGameTopicService.class)).fB(this.LLILZLL);
            if (gameTagFB == null || (dataChannel = this.dataChannel) == null) {
                return;
            }
            dataChannel.zW(PreviewPagerSelectedGameItem.class, gameTagFB);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        DataChannel dataChannel = this.dataChannel;
        LiveMode liveMode = dataChannel != null ? (LiveMode) dataChannel.gg0(LiveModeChannel.class) : null;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_component_show");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII("topic", "component_name");
        c474500IjALIZ.LJJII(C236000ve.LIZ(liveMode), "live_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void show() {
        Long l;
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) this.dataChannel.gg0(RoomCreateInfoChannel.class);
        if (roomCreateInfo == null || (l = roomCreateInfo.live_house_status) == null || l.longValue() != 4) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void C1() {
        super.C1();
        this.LLILZLL = (LiveMode) this.dataChannel.gg0(LiveModeChannel.class);
        I1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, GameTagIdChangedChannel.class, new AwS591S0100000_12(this, 1034));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void E1() {
        super.E1();
        if (PreviewRevisionAdjustIconStyleABSetting.INSTANCE.isMatch()) {
            View view = getView();
            C500260Jjc.LLFFF(view != null ? view.findViewById(R.id.x1c) : null);
        } else {
            View view2 = getView();
            C500260Jjc.LLFFF(view2 != null ? view2.findViewById(R.id.x1h) : null);
        }
        View view3 = getView();
        this.LLIZ = view3 != null ? (LiveIconView) view3.findViewById(R.id.k0z) : null;
        View view4 = getView();
        this.LLIZLLLIL = view4 != null ? (TuxIconView) view4.findViewById(R.id.k0p) : null;
        TextView textView = (TextView) findViewById(R.id.x1w);
        this.LLILZ = textView;
        if (textView != null) {
            textView.setText(this.LLILZIL);
        }
        DataChannel dataChannel = this.dataChannel;
        dataChannel.BQ2(this, RoomCreateInfoChannel.class, new C5183020f(this, 121));
        dataChannel.BQ2(this, HashTagResp.class, new AwS591S0100000_12(this, 569));
        View view5 = getView();
        if (view5 != null) {
            C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 36), view5);
        }
        this.dataChannel.BQ2(this, PreviewOpenHashtagAnchorDialogEvent.class, new AwS591S0100000_12(this, 570));
        C1143680frq.LJ(this.LLIZ, "tiktok_live_broadcast_demand_8", "live_revision_topic.png", ImageView.ScaleType.CENTER_CROP);
        G1(R.raw.icon_circle_plus);
    }

    public final void G1(int i) {
        Integer numLIZJ;
        TuxIconView tuxIconView = this.LLIZLLLIL;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            Context context = this.context;
            if (context != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.exs, context);
            } else {
                numLIZJ = null;
            }
            c419910GdJ.LIZLLL = numLIZJ;
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H1(final kotlin.jvm.functions.Function1<? super com.bytedance.android.livesdk.model.GameTag, kotlin.Unit> r6) {
        /*
            r5 = this;
            X.0Tiz r1 = X.EnumC754690Tj1.Companion
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r5.LLILZLL
            r1.getClass()
            X.0Tj1 r4 = X.C754670Tiz.LIZ(r0)
            java.lang.String r2 = "PreviewHashtagWidget2"
            if (r4 != 0) goto L2a
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "openHashtagAnchorDialog previewLiveMode : "
            r1.append(r0)
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r5.LLILZLL
            r1.append(r0)
            java.lang.String r0 = " return as tag is null"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LJIIIZ(r2, r0)
            return
        L2a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "openHashtagAnchorDialog() hashTagGameTag = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LJIIIZ(r2, r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            java.lang.Class<X.0TZe> r0 = X.C748880TZe.class
            java.lang.Object r3 = r1.gg0(r0)
            androidx.fragment.app.FragmentManager r3 = (androidx.fragment.app.FragmentManager) r3
            if (r3 == 0) goto L8e
            X.0Tge r2 = new X.0Tge
            r2.<init>()
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = r5.LLILZLL
            if (r1 != 0) goto L54
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
        L54:
            java.lang.String r0 = "add_topic"
            X.C754790TjB.LIZ(r3, r2, r4, r1, r0)
            java.lang.String r0 = "live_topic_click"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            java.lang.String r1 = "enter_rom"
            java.lang.String r0 = "start"
            r2.LJJII(r0, r1)
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r5.LLILZLL
            if (r0 == 0) goto L92
            int[] r1 = X.C2783015x.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L8f
            r0 = 2
            if (r1 != r0) goto L92
            java.lang.String r1 = "screen_share"
        L7a:
            java.lang.String r0 = "live_type"
            r2.LJJII(r1, r0)
            java.lang.String r1 = "position"
            java.lang.String r0 = "outside"
            r2.LJJII(r0, r1)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.dataChannel
            r2.LJIJJLI(r0)
            r2.LIZ()
        L8e:
            return
        L8f:
            java.lang.String r1 = "video_live"
            goto L7a
        L92:
            java.lang.String r1 = "third_party"
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.hashtag.PreviewHashtagWidget2.H1(kotlin.jvm.functions.Function1):void");
    }
}
