package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C011Z;
import X.C01GW;
import X.C0UFE;
import X.C0UKC;
import X.C0UPF;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C13IQ;
import X.C13LE;
import X.C1548820qPI;
import X.C1871910yoP;
import X.C19719912Dl;
import X.C202139147l;
import X.C20441214yg;
import X.C20516015Pq;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C262100zr;
import X.C418440Gaw;
import X.C452501pT;
import X.C486790J7d;
import X.C500260Jjc;
import X.C751980Tee;
import X.C753070TgP;
import X.C753200Tgc;
import X.C754410TiZ;
import X.C760180Trs;
import X.C771670UOv;
import X.C781270Ukn;
import X.C814420VxA;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.LiveGoalFeatureEnableChannel;
import com.bytedance.android.livesdk.broadcast.PreviewLiveModeTitleChannel;
import com.bytedance.android.livesdk.broadcast.PreviewPromoteTopicChannel;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.GiftDisableVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorHashTagHideSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLOP0OptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewRevisionCoverTitleWidget extends PreviewWidget implements InterfaceC1141530foN {
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public C1324720kZq LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public View LLJIJIL;
    public String LLJILJIL;
    public C20516015Pq LLJILJILJ;
    public C20516015Pq LLJILLL;
    public C20516015Pq LLJJ;
    public C20516015Pq LLJJI;
    public C20516015Pq LLJJIII;
    public C754410TiZ LLJJIJI;
    public LiveMode LLJJJ;
    public RoomCreateInfo LLJJJIL;
    public final String LLILZ = "promote_change_topic";
    public final Map<LiveMode, Boolean> LLJJIJIIJIL = new LinkedHashMap();
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(64));

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        this.LLILLL = false;
        ((LinkedHashMap) this.LLJJIJIIJIL).clear();
        C0UPF c0upfLJ = C771670UOv.LJ();
        if (c0upfLJ != null) {
            c0upfLJ.LIZLLL = null;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hkv;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        LiveMode liveModeLIZJ;
        int i;
        String str = null;
        if (!LiveAnchorHashTagHideSetting.INSTANCE.enable()) {
            C19719912Dl c19719912DlJM1 = C781270Ukn.LJIIIZ().jM1();
            if ((c19719912DlJM1 instanceof C13IQ) && c19719912DlJM1 != null) {
                C0UKC.LIZ(c19719912DlJM1, this.LLJILJILJ, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class)}, true);
            }
        }
        if ((C751980Tee.LIZJ(this.dataChannel) == LiveMode.SCREEN_RECORD || C751980Tee.LIZJ(this.dataChannel) == LiveMode.THIRD_PARTY) && AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) {
            C19719912Dl c19719912DlUS0 = C781270Ukn.LJIIIZ().uS0();
            if ((c19719912DlUS0 instanceof C13IQ) && c19719912DlUS0 != null) {
                C0UKC.LIZ(c19719912DlUS0, this.LLJILLL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class)}, true);
            }
        }
        LiveMode liveModeLIZJ2 = C751980Tee.LIZJ(this.dataChannel);
        if (liveModeLIZJ2 == null || !((i = C753200Tgc.LIZ[liveModeLIZJ2.ordinal()]) == 1 || i == 2)) {
            C500260Jjc.LJIILIIL(this.LLJILLL);
            C500260Jjc.LJIILIIL(this.LLJIJIL);
            C500260Jjc.LLFFF(this.LLIZ);
            C500260Jjc.LLFFF(this.LLIZLLLIL);
            C500260Jjc.LLFFF(this.LLJI);
            View view = this.LLJ;
            if (view != null) {
                C500260Jjc.LJLJL(0, view);
            }
            View view2 = this.LLJI;
            if (view2 != null) {
                C500260Jjc.LJLJJL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), view2);
            }
        } else {
            C500260Jjc.LLFFF(this.LLJILLL);
            C500260Jjc.LLFFF(this.LLJIJIL);
            C500260Jjc.LJIILIIL(this.LLIZ);
            C500260Jjc.LJIILIIL(this.LLIZLLLIL);
            C500260Jjc.LJIILIIL(this.LLJI);
            View view3 = this.LLJ;
            if (view3 != null) {
                C500260Jjc.LJLJL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), view3);
            }
        }
        String str2 = this.LLJILJIL;
        if (str2 == null || str2.length() == 0) {
            Map map = (Map) this.dataChannel.gg0(PreviewLiveModeTitleChannel.class);
            if (map != null) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel == null || (liveModeLIZJ = C751980Tee.LIZJ(dataChannel)) == null) {
                    liveModeLIZJ = LiveMode.VIDEO;
                }
                str = (String) map.get(liveModeLIZJ);
            }
            L1(str);
        }
        C0UPF c0upfLJ = C771670UOv.LJ();
        if (c0upfLJ != null) {
            c0upfLJ.LIZLLL = new AwS591S0100000_12(this, 308);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewDescriptionWidget.class), this.LLJJIII, new C13IQ[0], true);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && Intrinsics.LJFF(dataChannel2.gg0(LiveGoalFeatureEnableChannel.class), Boolean.TRUE)) {
            I1();
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, LiveGoalFeatureEnableChannel.class, new AwS591S0100000_12(this, 1060));
        }
        if (C500260Jjc.LJJJJIZL(getView())) {
            J1();
        }
        super.C1();
    }

    public final void G1() {
        LiveMode liveModeLIZJ;
        LiveMode liveModeLIZJ2;
        LiveMode liveModeLIZJ3;
        Map<LiveMode, Boolean> map = this.LLJJIJIIJIL;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveModeLIZJ = C751980Tee.LIZJ(dataChannel)) == null) {
            liveModeLIZJ = LiveMode.VIDEO;
        }
        Object obj = ((LinkedHashMap) map).get(liveModeLIZJ);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(obj, bool) || ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount()) {
            return;
        }
        Map<LiveMode, Boolean> map2 = this.LLJJIJIIJIL;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (liveModeLIZJ2 = C751980Tee.LIZJ(dataChannel2)) == null) {
            liveModeLIZJ2 = LiveMode.VIDEO;
        }
        map2.put(liveModeLIZJ2, bool);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attachLiveGoalPreviewWidget video=");
        DataChannel dataChannel3 = this.dataChannel;
        sbLIZ.append((dataChannel3 == null || (liveModeLIZJ3 = C751980Tee.LIZJ(dataChannel3)) == null) ? null : liveModeLIZJ3.name());
        sbLIZ.append('}');
        C20441214yg.LIZIZ("PreviewRevisionCoverTitleWidget", C2188811AlT.LIZIZ(sbLIZ));
        C0UKC.LIZ(C13LE.LIZ(LiveGoalRevisionPreviewWidget.class), this.LLJJ, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(LiveGoalVisibilityChannel.class)}, true);
    }

    public final TuxTextView H1() {
        return (C751980Tee.LIZJ(this.dataChannel) == LiveMode.SCREEN_RECORD || C751980Tee.LIZJ(this.dataChannel) == LiveMode.THIRD_PARTY) ? this.LLILZLL : this.LLILZIL;
    }

    public final void I1() {
        DataChannel dataChannel = this.dataChannel;
        if ((dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(LiveGoalFeatureEnableChannel.class), Boolean.FALSE)) && (!LiveLOP0OptSetting.INSTANCE.enable() || C753070TgP.LJFF(this.dataChannel, AFwS245S0000000_12.get$arr$(129), null) == C0UFE.ON)) {
            G1();
        }
        C0UKC.LIZ(C13LE.LIZ(GiftDisableInPrivateAccountPreviewWidget.class), this.LLJJI, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(GiftDisableVisibilityChannel.class)}, true);
    }

    public final void J1() {
        C760180Trs.LJIIJJI(this.dataChannel, "title");
        if (!B1()) {
            DataChannel dataChannel = this.dataChannel;
            if ((dataChannel != null ? dataChannel.gg0(LiveModeChannel.class) : null) != LiveMode.LIVE_VOICE) {
                return;
            }
        }
        C760180Trs.LJIIJJI(this.dataChannel, "cover");
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        Pair pair;
        LiveMode liveModeLIZJ;
        super.E1();
        View view = getView();
        this.LLIZ = view != null ? (C1324720kZq) view.findViewById(R.id.mvv) : null;
        View view2 = getView();
        this.LLILZIL = view2 != null ? (TuxTextView) view2.findViewById(R.id.y3b) : null;
        View view3 = getView();
        this.LLILZLL = view3 != null ? (TuxTextView) view3.findViewById(R.id.is8) : null;
        View view4 = getView();
        this.LLIZLLLIL = view4 != null ? view4.findViewById(R.id.mvy) : null;
        View view5 = getView();
        this.LLJ = view5 != null ? view5.findViewById(R.id.ccd) : null;
        View view6 = getView();
        this.LLJI = view6 != null ? view6.findViewById(R.id.y0w) : null;
        View view7 = getView();
        this.LLJIJIL = view7 != null ? view7.findViewById(R.id.is7) : null;
        View view8 = getView();
        this.LLJILJILJ = view8 != null ? (C20516015Pq) view8.findViewById(R.id.jgy) : null;
        View view9 = getView();
        this.LLJILLL = view9 != null ? (C20516015Pq) view9.findViewById(R.id.iqp) : null;
        View view10 = getView();
        this.LLJJ = view10 != null ? (C20516015Pq) view10.findViewById(R.id.j3l) : null;
        View view11 = getView();
        this.LLJJI = view11 != null ? (C20516015Pq) view11.findViewById(R.id.iww) : null;
        View view12 = getView();
        this.LLJJIII = view12 != null ? (C20516015Pq) view12.findViewById(R.id.fpk) : null;
        View view13 = getView();
        if (view13 != null) {
            C500260Jjc.LJLIIIL(500L, view13, AFwS245S0000000_12.get$arr$(39));
        }
        C486790J7d.LIZ.post(new ARunnableS112S0100000_12(this, 81), this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (pair = (Pair) dataChannel.gg0(PreviewPromoteTopicChannel.class)) != null && C500260Jjc.LJJIIZ((CharSequence) pair.getSecond())) {
            L1((String) pair.getSecond());
            this.LLJILJIL = (String) pair.getSecond();
            Map map = (Map) this.dataChannel.gg0(PreviewLiveModeTitleChannel.class);
            if (map != null) {
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 == null || (liveModeLIZJ = C751980Tee.LIZJ(dataChannel2)) == null) {
                    liveModeLIZJ = LiveMode.VIDEO;
                }
                map.put(liveModeLIZJ, pair.getSecond());
            }
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 309));
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.EQ2(this, PreviewTitleChannel.class, new AwS591S0100000_12(this, 310));
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.EQ2(this, LiveModeChannel.class, new AwS591S0100000_12(this, 311));
        }
        C1548820qPI.LIZLLL(this.LLILZ, this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ(this.LLILZ, this);
        C754410TiZ c754410TiZ = this.LLJJIJI;
        if (c754410TiZ != null) {
            C202139147l c202139147l = c754410TiZ.LIZIZ;
            if (c202139147l != null) {
                c202139147l.LIZ();
                c754410TiZ.LIZIZ = null;
            }
            c754410TiZ.LIZJ = null;
        }
        this.LLJJIJI = null;
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        J1();
    }

    public final void L1(String str) {
        if (str != null && str.length() != 0) {
            if (!TextUtils.isEmpty(str)) {
                TuxTextView tuxTextViewH1 = H1();
                if (tuxTextViewH1 != null) {
                    tuxTextViewH1.setText(str);
                }
                TuxTextView tuxTextViewH12 = H1();
                if (tuxTextViewH12 != null) {
                    tuxTextViewH12.setTextColor(C20736316Cj.LIZJ(R.attr.exp, H1()));
                    return;
                }
                return;
            }
            return;
        }
        TuxTextView tuxTextViewH13 = H1();
        if (tuxTextViewH13 != null) {
            tuxTextViewH13.setText(2131840910);
        }
        TuxTextView tuxTextViewH14 = H1();
        if (tuxTextViewH14 != null) {
            tuxTextViewH14.setTextColor(C20736316Cj.LIZJ(R.attr.exr, H1()));
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJIIIZ();
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        LiveMode liveModeLIZJ;
        if (Intrinsics.LJFF(c262100zr.LIZ, this.LLILZ)) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            String strLJFF2 = null;
            if (interfaceC1107590evd != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "promote_topic_id", "");
            } else {
                strLJFF = null;
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd2, "promote_topic_name", "");
            }
            if (strLJFF != null && C500260Jjc.LJJIIZ(strLJFF) && strLJFF2 != null && C500260Jjc.LJJIIZ(strLJFF2)) {
                L1(strLJFF2);
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.zW(PreviewPromoteTopicChannel.class, new Pair(strLJFF, strLJFF2));
                }
                Map map = (Map) this.dataChannel.gg0(PreviewLiveModeTitleChannel.class);
                if (map != null) {
                    DataChannel dataChannel2 = this.dataChannel;
                    if (dataChannel2 == null || (liveModeLIZJ = C751980Tee.LIZJ(dataChannel2)) == null) {
                        liveModeLIZJ = LiveMode.VIDEO;
                    }
                    map.put(liveModeLIZJ, strLJFF2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N1(com.bytedance.android.live.broadcast.model.RoomCreateInfo r6, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r7) {
        /*
            r5 = this;
            com.bytedance.tux.input.TuxTextView r1 = r5.H1()
            if (r1 == 0) goto Lb
            r0 = 1095761920(0x41500000, float:13.0)
            r1.setMinTextSize(r0)
        Lb:
            com.bytedance.tux.input.TuxTextView r3 = r5.H1()
            if (r3 == 0) goto L64
            boolean r0 = X.C0UQK.LIZIZ(r6)
            java.lang.String r4 = ""
            if (r0 == 0) goto L21
            com.bytedance.android.live.broadcast.model.LiveEventInfo r0 = r6.mLiveEventInfo
            if (r0 == 0) goto L21
            java.lang.String r2 = r0.title
            if (r2 != 0) goto L22
        L21:
            r2 = r4
        L22:
            int r0 = r2.length()
            if (r0 <= 0) goto L65
            r0 = 1
        L29:
            r1 = 2
            if (r0 == 0) goto L67
            java.lang.String r0 = r5.LLJILJIL
            if (r0 == 0) goto L36
            int r0 = r0.length()
            if (r0 != 0) goto L67
        L36:
            r3.setTextDirection(r1)
            r5.L1(r2)
            Y.ACListenerS116S0200000_12 r1 = new Y.ACListenerS116S0200000_12
            r0 = 18
            r1.<init>(r5, r6, r0)
            X.C786410Ut5.h9(r3, r1)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            if (r1 == 0) goto L5b
            java.lang.Class<com.bytedance.android.livesdk.broadcast.PreviewLiveModeTitleChannel> r0 = com.bytedance.android.livesdk.broadcast.PreviewLiveModeTitleChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L5b
            if (r7 != 0) goto L58
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r7 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
        L58:
            r0.put(r7, r2)
        L5b:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            if (r1 == 0) goto L64
            java.lang.Class<com.bytedance.android.livesdk.broadcast.PreviewTitleChannel> r0 = com.bytedance.android.livesdk.broadcast.PreviewTitleChannel.class
            r1.zW(r0, r2)
        L64:
            return
        L65:
            r0 = 0
            goto L29
        L67:
            r3.setTextDirection(r1)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            java.lang.Class<com.bytedance.android.livesdk.broadcast.PreviewLiveModeTitleChannel> r0 = com.bytedance.android.livesdk.broadcast.PreviewLiveModeTitleChannel.class
            java.lang.Object r1 = r1.gg0(r0)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto Lbb
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.dataChannel
            if (r0 == 0) goto L80
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = X.C751980Tee.LIZJ(r0)
            if (r0 != 0) goto L82
        L80:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
        L82:
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Lbb
        L8a:
            r5.L1(r2)
            if (r2 == 0) goto L98
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            if (r1 == 0) goto L98
            java.lang.Class<com.bytedance.android.livesdk.broadcast.PreviewTitleChannel> r0 = com.bytedance.android.livesdk.broadcast.PreviewTitleChannel.class
            r1.zW(r0, r2)
        L98:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            if (r1 == 0) goto Lb0
            java.lang.Class<com.bytedance.android.livesdk.broadcast.PreviewLiveModeTitleChannel> r0 = com.bytedance.android.livesdk.broadcast.PreviewLiveModeTitleChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto Lb0
            if (r7 != 0) goto Laa
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r7 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
        Laa:
            if (r2 == 0) goto Lad
            r4 = r2
        Lad:
            r0.put(r7, r4)
        Lb0:
            Y.ACListenerS147S0100000_12 r1 = new Y.ACListenerS147S0100000_12
            r0 = 146(0x92, float:2.05E-43)
            r1.<init>(r5, r0)
            X.C786410Ut5.h9(r3, r1)
            return
        Lbb:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_VOICE
            if (r7 != r0) goto Lc2
            java.lang.String r2 = r6.voiceTitle
            goto L8a
        Lc2:
            java.lang.String r2 = r6.mTitle
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionCoverTitleWidget.N1(com.bytedance.android.live.broadcast.model.RoomCreateInfo, com.bytedance.android.livesdkapi.depend.model.live.LiveMode):void");
    }

    public final void M1(C754410TiZ c754410TiZ, int i, ImageModel imageModel, boolean z) {
        TextView textView;
        C1324720kZq c1324720kZq = this.LLIZ;
        View view = getView();
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.zuu);
        } else {
            textView = null;
        }
        c754410TiZ.LIZJ(i, imageModel, z, c1324720kZq, textView, 102);
    }
}
