package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0IJT;
import X.C0JBN;
import X.C13LE;
import X.C16F5;
import X.C16FV;
import X.C1819620xS4;
import X.C474500IjA;
import X.C5183020f;
import X.C770220UJg;
import X.C786410Ut5;
import X.InterfaceC772190UQv;
import X.ViewOnClickListenerC511801z2;
import X.ViewOnClickListenerC512201z6;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.LiveGrowTriggerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGrowthMVPBannerChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import tikcast.api.anchor.AnchorGrowLevelTriggerInfo;
import tikcast.api.anchor.GrowthJourneyBannerItem;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewLiveGrowthMVPWidget extends PreviewWidget {
    public C16F5 LLILZ;
    public C16FV LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public Integer LLJI;
    public Long LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ = 1;
    public String LLJJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hhm;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(LiveGrowthMVPBannerChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(LiveGrowthMVPBannerChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        hide();
        Double dLIZ = InterfaceC772190UQv.H3.LIZ();
        this.LLJ = dLIZ != null ? (int) dLIZ.doubleValue() : 0;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, LiveGrowTriggerChannel.class, new C5183020f(this, 91));
        }
    }

    public final void G1(GrowthJourneyBannerItem growthJourneyBannerItem) {
        C16F5 c16f5;
        C16FV c16fv;
        LiveIconView liveIconView;
        String str;
        View view = getView();
        String str2 = null;
        if (view != null) {
            c16f5 = (C16F5) view.findViewById(R.id.brk);
        } else {
            c16f5 = null;
        }
        this.LLILZ = c16f5;
        View view2 = getView();
        if (view2 != null) {
            c16fv = (C16FV) view2.findViewById(R.id.brn);
        } else {
            c16fv = null;
        }
        this.LLILZIL = c16fv;
        C16F5 c16f52 = this.LLILZ;
        if (c16f52 != null) {
            if (growthJourneyBannerItem != null) {
                str = growthJourneyBannerItem.bannerContent;
            } else {
                str = null;
            }
            c16f52.setText(str);
        }
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        if (growthJourneyBannerItem != null) {
            str2 = growthJourneyBannerItem.bannerIcon;
        }
        c0jbnLIZ.setUrl(str2).LJJI(this.LLILZIL);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_growth_journey_takepage_banner_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("video_live", "live_type");
        c474500IjALIZ.LJJII(this.LLJI, "banner_type");
        c474500IjALIZ.LJJII(this.LLJILJIL, "growth_instance_strategy");
        c474500IjALIZ.LJJII(this.LLJIJIL, "growth_stage");
        c474500IjALIZ.LJJII(this.LLJILJILJ, "banner_frequency_key");
        c474500IjALIZ.LIZ();
        View view3 = getView();
        if (view3 != null) {
            C786410Ut5.I7(new ViewOnClickListenerC511801z2(this, growthJourneyBannerItem, 4), view3);
        }
        View view4 = getView();
        if (view4 != null && (liveIconView = (LiveIconView) view4.findViewById(R.id.e1y)) != null) {
            C786410Ut5.g8(liveIconView, new ViewOnClickListenerC512201z6(this, 23));
        }
    }

    public final void H1(int i, AnchorGrowLevelTriggerInfo anchorGrowLevelTriggerInfo, GrowthJourneyBannerItem growthJourneyBannerItem) {
        String str;
        Long lValueOf;
        this.LLJI = Integer.valueOf(i);
        String str2 = null;
        if (anchorGrowLevelTriggerInfo != null) {
            str = anchorGrowLevelTriggerInfo.growthInstanceStrategy;
        } else {
            str = null;
        }
        this.LLJILJIL = str;
        if (anchorGrowLevelTriggerInfo != null) {
            lValueOf = Long.valueOf(anchorGrowLevelTriggerInfo.growthStage);
        } else {
            lValueOf = null;
        }
        this.LLJIJIL = lValueOf;
        if (growthJourneyBannerItem != null) {
            str2 = growthJourneyBannerItem.bannerFrequencyKey;
        }
        this.LLJILJILJ = str2;
        this.LLJILLL = true;
    }
}
