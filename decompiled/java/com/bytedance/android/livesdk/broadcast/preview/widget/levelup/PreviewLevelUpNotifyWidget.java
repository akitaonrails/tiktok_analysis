package com.bytedance.android.livesdk.broadcast.preview.widget.levelup;

import X.C0GY9;
import X.C0IJT;
import X.C0IPN;
import X.C0JT6;
import X.C0UKZ;
import X.C0UO5;
import X.C0UOA;
import X.C1143680frq;
import X.C1143780fs0;
import X.C13LE;
import X.C16F5;
import X.C16FV;
import X.C19ME;
import X.C354201Zc;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C770220UJg;
import X.C786410Ut5;
import Y.ALAdapterS9S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.UnifiedBannerData;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.AnchorCheckOutTipsFinished;
import com.bytedance.android.livesdk.broadcast.CppAgeVerifyResponse;
import com.bytedance.android.livesdk.dataChannel.LevelupNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewLevelUpNotifyWidget extends PreviewWidget {
    public Integer LLILZ;
    public Integer LLILZIL;
    public Boolean LLILZLL;
    public String LLIZ;
    public Integer LLIZLLLIL;
    public Integer LLJ;
    public boolean LLJI;
    public C16F5 LLJIJIL;
    public ImageView LLJILJIL;
    public C16FV LLJILJILJ;
    public final AnimatorSet LLJILLL = new AnimatorSet();
    public final AnimatorSet LLJJ = new AnimatorSet();
    public boolean LLJJI;
    public UnifiedBannerData LLJJIII;
    public C0UOA LLJJIJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h0h;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void G1() {
        if (this.LLJJI) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("banner_show");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII("creator_onboard", "banner_type");
            c474500IjALIZ.LJJII(1, "banner_position");
            c474500IjALIZ.LJJII(0, "is_fe");
            c474500IjALIZ.LJJII(1, "is_anchor");
            c474500IjALIZ.LJJII("live_take_page", "banner_page");
            c474500IjALIZ.LJJII(this.LLIZ, "banner_content_starling_key");
            LiveMode liveMode = (LiveMode) this.dataChannel.gg0(LiveModeChannel.class);
            c474500IjALIZ.LJJII(liveMode != null ? C354201Zc.LIZ(liveMode) : null, "live_type");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LIZ();
            } else {
                c474500IjALIZ.LJJIJLIJ();
                c474500IjALIZ.LJJIJL();
            }
        }
    }

    public final void N1() {
        C1143680frq.LJI(this.LLJILJILJ, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_4", "ttlive_icon_level_up_new_preview.png"), null, true);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(LevelupNotifyBannerChannel.class));
        this.LLJJI = false;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(LevelupNotifyBannerChannel.class));
        this.LLJJI = true;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        C0UOA c0uoa = this.LLJJIJI;
        if (c0uoa == null || c0uoa.getStage() != C0UOA.AGE_REVIEWING_STAGE.getStage()) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        hide();
        View view = getView();
        if (view != null) {
            view.setBackgroundResource(R.drawable.dlu);
        }
        View view2 = getView();
        this.LLJIJIL = view2 != null ? (C16F5) view2.findViewById(R.id.rr2) : null;
        View view3 = getView();
        this.LLJILJIL = view3 != null ? (ImageView) view3.findViewById(R.id.unable_complete_stage_warning) : null;
        this.LLJILJILJ = (C16FV) this.contentView.findViewById(R.id.rr1);
        ImageView imageView = this.LLJILJIL;
        if (imageView != null) {
            C500260Jjc.LJIILIIL(imageView);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 353));
            dataChannel.EQ2(this, CppAgeVerifyResponse.class, new AwS591S0100000_12(this, 354));
        }
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.br9);
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 0);
            C500260Jjc.LJLIIIL(500L, liveIconView, new AwS591S0100000_12(this, 355));
        }
        View view4 = this.contentView;
        if (view4 != null) {
            C500260Jjc.LJLIIIL(1000L, view4, new AwS591S0100000_12(this, 356));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, AnchorCheckOutTipsFinished.class, new AwS591S0100000_12(this, 1212));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        AnimatorSet animatorSet = this.LLJILLL;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.LLJJ;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
        AnimatorSet animatorSet3 = this.LLJILLL;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.LLJJ;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
    }

    public final void H1(boolean z) {
        C0UO5 c0uo5;
        ViewGroup.LayoutParams layoutParams;
        int i;
        ImageView imageView = this.LLJILJIL;
        if (imageView != null) {
            C500260Jjc.LLFFF(imageView);
        }
        C16F5 c16f5 = this.LLJIJIL;
        if (c16f5 != null) {
            if (z) {
                i = 2131843712;
            } else {
                i = 2131843713;
            }
            c16f5.setText(C497740JfY.LJIJI(i));
        }
        if (z) {
            c0uo5 = C0UO5.TNS_STAGE1_KEY;
        } else {
            c0uo5 = C0UO5.TNS_STAGE2_KEY;
        }
        this.LLIZ = c0uo5.getKey();
        M1(false);
        C16F5 c16f52 = this.LLJIJIL;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (c16f52 != null) {
            layoutParams = c16f52.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(5.0f));
        }
        C16F5 c16f53 = this.LLJIJIL;
        if (c16f53 != null) {
            C786410Ut5.y6(c16f53, marginLayoutParams);
        }
    }

    public final void I1(int i) {
        Resources resources;
        C16F5 c16f5 = this.LLJIJIL;
        if (c16f5 != null) {
            Integer num = this.LLILZIL;
            String quantityString = null;
            if (num != null) {
                int iIntValue = num.intValue();
                Context context = this.context;
                if (context != null && (resources = context.getResources()) != null) {
                    quantityString = resources.getQuantityString(i, iIntValue, Integer.valueOf(iIntValue));
                }
            }
            c16f5.setText(quantityString);
        }
    }

    public final void L1(boolean z) {
        show();
        if (Intrinsics.LJFF(this.LLILZLL, Boolean.TRUE)) {
            H1(false);
            return;
        }
        if (z) {
            C16F5 c16f5 = this.LLJIJIL;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131843709));
            }
            this.LLIZ = C0UO5.L1_COMPLETE_KEY.getKey();
            M1(true);
            return;
        }
        C0JT6<Boolean> c0jt6 = C0UKZ.LJLLJ;
        if (c0jt6.LIZ() == null) {
            C16F5 c16f52 = this.LLJIJIL;
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIJI(2131843709));
            }
            this.LLIZ = C0UO5.L1_COMPLETE_KEY.getKey();
            G1();
            M1(true);
            Interpolator interpolatorLIZIZ = C0GY9.LIZIZ(0.47f, 0.0f, 0.75f, 0.72f);
            ObjectAnimator objectAnimatorJ1 = J1(this.LLJIJIL, true, interpolatorLIZIZ, 300L, Mp4ScreenVideoLoadTimeout.CONTROL);
            ObjectAnimator objectAnimatorJ12 = J1(this.LLJILJILJ, true, interpolatorLIZIZ, 300L, Mp4ScreenVideoLoadTimeout.CONTROL);
            AnimatorSet animatorSet = this.LLJJ;
            if (animatorSet != null) {
                animatorSet.playTogether(objectAnimatorJ1, objectAnimatorJ12);
            }
            AnimatorSet animatorSet2 = this.LLJJ;
            if (animatorSet2 != null) {
                animatorSet2.addListener(new ALAdapterS9S0100000_12(this, 12));
            }
            AnimatorSet animatorSet3 = this.LLJJ;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
            c0jt6.LIZJ(Boolean.FALSE);
            return;
        }
        M1(false);
        I1(2131755585);
        this.LLIZ = C0UO5.L1_TASK_KEY.getKey();
        G1();
    }

    public final void M1(boolean z) {
        String strLJIIJ;
        if (z) {
            strLJIIJ = C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), "ttlive_icon_level_up_completed_preview.png");
        } else {
            strLJIIJ = C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_normal_1"), "ttlive_icon_level_up_preview.png");
        }
        C1143680frq.LJI(this.LLJILJILJ, strLJIIJ, null, true);
    }

    public final ObjectAnimator J1(View view, boolean z, Interpolator interpolator, long j, long j2) {
        ObjectAnimator objectAnimatorOfFloat;
        if (z) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        }
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(interpolator);
        objectAnimatorOfFloat.setStartDelay(j2);
        return objectAnimatorOfFloat;
    }
}
