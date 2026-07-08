package com.bytedance.android.livesdk.broadcast.preview.widget.revision;

import X.C0UJU;
import X.C0ULO;
import X.C1161920gLG;
import X.C16F5;
import X.C20721089v;
import X.C2782015w;
import X.C500260Jjc;
import X.C760180Trs;
import X.C786410Ut5;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.api.PreviewLiveTabCapsuleColorThemeChangeEvent;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.schema.PreviewSchemaOpenPanelEvent;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenter50FollowerDisplay;
import com.bytedance.android.livesdk.livesetting.broadcast.OptLiveCenterInLiveTakePageSchema;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostTux;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.LiveGoLivePageContainer;
import webcast.data.TopRightBannerContainerComponent;
import webcast.data.TopRightContainerComponent;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewLIVECenterWidget extends PreviewWidget {
    public TuxIconView LLILZ;
    public C16F5 LLILZIL;
    public TopRightContainerComponent LLILZLL;
    public Map<Integer, LiveGoLivePageContainer> LLIZ;
    public int LLIZLLLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1f;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void G1() {
        LiveGoLivePageContainer liveGoLivePageContainerLIZIZ;
        DataChannel dataChannel;
        Map<Integer, LiveGoLivePageContainer> map = this.LLIZ;
        TopRightContainerComponent topRightContainerComponent = null;
        if (map == null || (liveGoLivePageContainerLIZIZ = C760180Trs.LIZIZ(this.dataChannel, map)) == null) {
            return;
        }
        List<TopRightContainerComponent> list = liveGoLivePageContainerLIZIZ.topRightContainer;
        if (list != null) {
            Iterator<TopRightContainerComponent> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TopRightContainerComponent next = it2.next();
                if (next.type == 3) {
                    topRightContainerComponent = next;
                    break;
                }
            }
            topRightContainerComponent = topRightContainerComponent;
        }
        this.LLILZLL = topRightContainerComponent;
        if (topRightContainerComponent == null) {
            hide();
            return;
        }
        C2782015w.LIZIZ(this.dataChannel, topRightContainerComponent.trackExtra);
        TopRightContainerComponent topRightContainerComponent2 = this.LLILZLL;
        if (topRightContainerComponent2 == null) {
            hide();
        } else if (!Intrinsics.LJFF(C20721089v.LIZ(topRightContainerComponent2.tuxUrl), "IconHousePlayFill")) {
            ((IHostTux) C1161920gLG.LIZJ(IHostTux.class)).Xl2(this.LLILZ, topRightContainerComponent2.tuxUrl, this.context, false);
        }
        TopRightContainerComponent topRightContainerComponent3 = this.LLILZLL;
        if (topRightContainerComponent3 != null) {
            if (TextUtils.isEmpty(topRightContainerComponent3.text)) {
                C16F5 c16f5 = this.LLILZIL;
                if (c16f5 != null) {
                    C786410Ut5.LLJJJJ(c16f5, 8);
                }
            } else {
                C16F5 c16f52 = this.LLILZIL;
                if (c16f52 != null) {
                    C786410Ut5.LLJJJJ(c16f52, 0);
                }
                C16F5 c16f53 = this.LLILZIL;
                if (c16f53 != null) {
                    c16f53.setText(topRightContainerComponent3.text);
                }
            }
        }
        TopRightBannerContainerComponent topRightBannerContainerComponent = liveGoLivePageContainerLIZIZ.topRightBannerContainer;
        if (topRightBannerContainerComponent == null || topRightBannerContainerComponent.targetTopRightContainerItemType != 3 || (dataChannel = this.dataChannel) == null) {
            return;
        }
        dataChannel.zW(PreviewBannerAnchorViewChannel.class, getView());
    }

    public final void H1() {
        String str;
        TopRightContainerComponent topRightContainerComponent = this.LLILZLL;
        if (topRightContainerComponent == null || (str = topRightContainerComponent.schema) == null || str.length() == 0) {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(OptLiveCenterInLiveTakePageSchema.INSTANCE.getValue()).buildUpon().appendQueryParameter("click_time", String.valueOf(System.currentTimeMillis()));
            String str2 = CardStruct.IStatusCode.DEFAULT;
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("is_textmessage", CardStruct.IStatusCode.DEFAULT);
            if (SecondPageCodeCacheABSetting.INSTANCE.isMatch()) {
                str2 = "1";
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.context, builderAppendQueryParameter2.appendQueryParameter("enable_code_cache", str2).build().toString());
        } else {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.context, str);
        }
        DataChannel dataChannel = this.dataChannel;
        TopRightContainerComponent topRightContainerComponent2 = this.LLILZLL;
        C2782015w.LIZ(dataChannel, topRightContainerComponent2 != null ? topRightContainerComponent2.trackExtra : null);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final String y1() {
        return LiveCenter50FollowerDisplay.INSTANCE.enable() ? "live_center" : "";
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        View view;
        LiveMode liveMode;
        super.C1();
        G1();
        if (!AnchorPreviewUniformStyleABSetting.INSTANCE.enable() || (view = getView()) == null) {
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        int i = (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) ? -1 : C0UJU.LIZ[liveMode.ordinal()];
        if (i == 1) {
            C0ULO.LIZ(view, 1, "PreviewCampaignCenterWidget", false);
        } else if (i != 2) {
            C0ULO.LIZ(view, 0, "PreviewCampaignCenterWidget", false);
        } else {
            C0ULO.LIZ(view, this.LLIZLLLIL, "PreviewCampaignCenterWidget", false);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.LLILZIL = (C16F5) findViewById(R.id.y3b);
        this.LLILZ = (TuxIconView) findViewById(R.id.z0m);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 391));
            dataChannel.EQ2(this, PreviewLiveTabCapsuleColorThemeChangeEvent.class, new AwS591S0100000_12(this, 392));
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, PreviewSchemaOpenPanelEvent.class, new AwS591S0100000_12(this, 393));
        View view = getView();
        if (view != null) {
            C500260Jjc.LJLIIIL(1000L, view, new AwS591S0100000_12(this, 394));
        }
    }
}
