package com.bytedance.android.livesdk.broadcast.preview.widget.levelup;

import X.C0IJT;
import X.C0UOA;
import X.C1143680frq;
import X.C1143780fs0;
import X.C16F5;
import X.C16FV;
import X.C474500IjA;
import X.C500260Jjc;
import X.C760180Trs;
import X.C786410Ut5;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.AnchorCheckOutTipsFinished;
import com.bytedance.android.livesdk.broadcast.CppAgeVerifyResponse;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TtliveGameSwitchAgeAssuranceBannerHideOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GamePreviewLevelUpNotifyWidget extends BannerWidget {
    public String LLJI;
    public Integer LLJIJIL;
    public Integer LLJILJIL;
    public C16F5 LLJILJILJ;
    public ImageView LLJILLL;
    public C16FV LLJJ;
    public boolean LLJJIJI;
    public C0UOA LLJJIJIIJIL;
    public final AnimatorSet LLJJI = new AnimatorSet();
    public final AnimatorSet LLJJIII = new AnimatorSet();
    public final String LLJJIJIL = "lop_banner";

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void N1() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("banner_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("creator_onboard", "banner_type");
        c474500IjALIZ.LJJII(1, "banner_position");
        c474500IjALIZ.LJJII(0, "is_fe");
        c474500IjALIZ.LJJII(1, "is_anchor");
        c474500IjALIZ.LJJII("live_take_page", "banner_page");
        c474500IjALIZ.LJJII(this.LLJI, "banner_content_starling_key");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
    }

    public final void O1() {
        C1143680frq.LJI(this.LLJJ, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_4", "ttlive_icon_level_up_new_preview.png"), null, true);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() throws Exception {
        if (this.LLJJIJI) {
            boolean value = TtliveGameSwitchAgeAssuranceBannerHideOptSetting.INSTANCE.getValue();
            C0UOA c0uoa = this.LLJJIJIIJIL;
            boolean z = c0uoa != null && c0uoa.getStage() == C0UOA.AGE_REVIEWING_STAGE.getStage();
            if (value && z) {
                return;
            }
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        View view;
        super.E1();
        hide();
        if (!C760180Trs.LJI() && (view = getView()) != null) {
            view.setBackgroundResource(R.drawable.dlu);
        }
        View view2 = getView();
        this.LLJILJILJ = view2 != null ? (C16F5) view2.findViewById(R.id.rr2) : null;
        View view3 = getView();
        this.LLJILLL = view3 != null ? (ImageView) view3.findViewById(R.id.unable_complete_stage_warning) : null;
        this.LLJJ = (C16FV) this.contentView.findViewById(R.id.rr1);
        ImageView imageView = this.LLJILLL;
        if (imageView != null) {
            C500260Jjc.LJIILIIL(imageView);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 346));
            dataChannel.EQ2(this, CppAgeVerifyResponse.class, new AwS591S0100000_12(this, 347));
        }
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.br9);
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 0);
            C500260Jjc.LJLIIIL(500L, liveIconView, new AwS591S0100000_12(this, 348));
        }
        View view4 = this.contentView;
        if (view4 != null) {
            C500260Jjc.LJLIIIL(1000L, view4, new AwS591S0100000_12(this, 349));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, AnchorCheckOutTipsFinished.class, new AwS591S0100000_12(this, 1211));
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return C760180Trs.LJI() ? R.layout.gzp : R.layout.h0h;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        AnimatorSet animatorSet = this.LLJJI;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.LLJJIII;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
        AnimatorSet animatorSet3 = this.LLJJI;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.LLJJIII;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String H1() {
        return this.LLJJIJIL;
    }
}
