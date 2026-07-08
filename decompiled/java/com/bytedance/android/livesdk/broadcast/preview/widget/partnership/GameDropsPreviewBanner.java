package com.bytedance.android.livesdk.broadcast.preview.widget.partnership;

import X.C0IJT;
import X.C20337914i1;
import X.C474500IjA;
import X.C5183020f;
import X.C760180Trs;
import X.C786410Ut5;
import X.C823050WQl;
import X.InterfaceC772390URp;
import X.ViewOnClickListenerC512201z6;
import Y.ARunnableS107S0100000_7;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.GameRewardsNoticeChannel;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.broadcast.PartnershipDropsV1ShowInfoChannel;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsShowCountSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class GameDropsPreviewBanner extends BannerWidget {
    public boolean LLJIJIL;
    public final String LLJI = "game_partnership_drops_banner";
    public String LLJILJIL = "";

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i15;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void J1() {
        C20337914i1<Long> c20337914i1 = InterfaceC772390URp.W;
        c20337914i1.LJFF(Long.valueOf(c20337914i1.LIZIZ().longValue() + 1));
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() throws Exception {
        if (this.LLJIJIL && InterfaceC772390URp.W.LIZIZ().longValue() < GameLivePartnershipDropsShowCountSetting.INSTANCE.getCount()) {
            if (!C760180Trs.LJI()) {
                super.show();
                return;
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(GameRewardsNoticeChannel.class, this.LLJILJIL);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        C823050WQl.LIZIZ().submit(new ARunnableS107S0100000_7(this, 16));
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 25), view);
        }
        hide();
        this.dataChannel.EQ2(this, PartnershipDropsV1ShowInfoChannel.class, new C5183020f(this, 96));
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        super.onShow();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_drops_banner_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(this.LLJILJIL, "banner_id");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String H1() {
        return this.LLJI;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
    }
}
