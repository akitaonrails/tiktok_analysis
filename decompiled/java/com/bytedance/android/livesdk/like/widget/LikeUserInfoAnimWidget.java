package com.bytedance.android.livesdk.like.widget;

import X.C0IPN;
import X.C1087930ePv;
import X.C1121670fIL;
import X.C1143680frq;
import X.C1151460g4O;
import X.C1161920gLG;
import X.C1295960jpS;
import X.C20441214yg;
import X.C341701Uh;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1085480eLy;
import X.InterfaceC1087920ePu;
import Y.ACListenerS152S0100000_17;
import Y.ALAdapterS13S0100000_17;
import Y.AObjectS360S0100000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.LiveHostAutoAdaptiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveU18HiddenCountSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostPerfAutoAdaptiveSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public class LikeUserInfoAnimWidget extends LiveRecyclableWidget implements InterfaceC1087920ePu {
    public static final float LLJJJJ;
    public View LL;
    public ProgressBar LLILLJJLI;
    public ValueAnimator LLILLL;
    public ObjectAnimator LLILZ;
    public ObjectAnimator LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public AnimatorSet LLIZLLLIL;
    public AnimatorSet LLJ;
    public Keyframe[] LLJI;
    public AnimatorSet LLJIJIL;
    public Keyframe[] LLJILJIL;
    public C1295960jpS LLJILJILJ;
    public View LLJILLL;
    public ImageView LLJJ;
    public TextView LLJJI;
    public AnimatorSet LLJJIII;
    public C1151460g4O LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final boolean LLJJJ;
    public boolean LLJJJIL;

    @Override // X.InterfaceC1087920ePu
    public final String JA() {
        return "LikeUserInfoAnimWidget";
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gxf;
    }

    @Override // X.InterfaceC1087920ePu
    public final /* synthetic */ void onResult(String str) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        InterfaceC1085480eLy interfaceC1085480eLyO41;
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room != null && (interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(room.getId())) != null && interfaceC1085480eLyO41.isEnabled() && interfaceC1085480eLyO41.LIZIZ()) {
            interfaceC1085480eLyO41.LJIL(this);
        }
        AnimatorSet animatorSet = this.LLJJIII;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLILLL.cancel();
        this.LLILZ.cancel();
        this.LLILZIL.cancel();
        this.LLIZLLLIL.cancel();
        this.LLJ.cancel();
        this.LLJILJILJ.cancelAnimation();
        this.LLJJIJIL = false;
        this.LLJJIJIIJIL = false;
    }

    static {
        LLJJJJ = C497740JfY.LJJ() ? -18.0f : 18.0f;
    }

    public LikeUserInfoAnimWidget() {
        this.LLJJJ = DiggParamsSetting.INSTANCE.getValue().diggShowEastereggDirect != 0;
        this.LLJJJIL = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LL = findViewById(R.id.jl9);
        this.LLILLJJLI = (ProgressBar) findViewById(R.id.s8j);
        C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.cxt);
        this.LLJILJILJ = c1295960jpS;
        c1295960jpS.addAnimatorListener(new ALAdapterS13S0100000_17(this, 13));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 1200);
        this.LLILLL = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new AUListenerS266S0100000_17(this, 16));
        this.LLILLL.setDuration(1200L);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LL, (Property<View, Float>) View.ROTATION, 0.0f, LLJJJJ, 0.0f);
        this.LLILZ = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.LL, PropertyValuesHolder.ofKeyframe(View.SCALE_X, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.6f, 1.7f), Keyframe.ofFloat(1.0f, 1.5f)), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.6f, 1.7f), Keyframe.ofFloat(1.0f, 1.5f)));
        this.LLILZIL = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        this.LLJI = new Keyframe[]{Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.375f, 1.15f), Keyframe.ofFloat(1.0f, 0.0f)};
        AnimatorSet animatorSet = new AnimatorSet();
        this.LLJ = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofPropertyValuesHolder(this.LLILLJJLI, PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, this.LL.getAlpha()), Keyframe.ofFloat(0.5f, 0.0f))));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.LLIZLLLIL = animatorSet2;
        animatorSet2.setDuration(400L);
        this.LLJILJIL = new Keyframe[]{Keyframe.ofFloat(0.0f, 1.5f), Keyframe.ofFloat(0.375f, 1.7f), Keyframe.ofFloat(1.0f, 0.0f)};
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.LLJIJIL = animatorSet3;
        animatorSet3.setDuration(400L);
        this.LLJILLL = findViewById(R.id.ws1);
        this.LLJJ = (ImageView) findViewById(R.id.ws0);
        this.LLJJI = (TextView) findViewById(R.id.ws2);
        this.LLJJIJI = new C1151460g4O(Integer.class, 1);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        InterfaceC1085480eLy interfaceC1085480eLyO41;
        this.LLJJJIL = LiveU18HiddenCountSetting.INSTANCE.showEngagementCount((Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class));
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room != null && (interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(room.getId())) != null && interfaceC1085480eLyO41.isEnabled() && interfaceC1085480eLyO41.LIZIZ()) {
            interfaceC1085480eLyO41.LJIIJ(this);
        }
        C786410Ut5.LJLLLLLL(8, this.LLJILLL);
        if (room != null && room.getOwner() != null) {
            C1121670fIL.LJIIL(this.LLJJ, room.getOwner().getAvatarThumb(), R.drawable.el_);
            C786410Ut5.Q7(this.LLJJ, new ACListenerS152S0100000_17(room, 187));
        }
        C786410Ut5.Ob(this.LL, 0.0f);
        C786410Ut5.pc(this.LL, 0.0f);
        C786410Ut5.Ab(this.LL, 0.0f);
        C786410Ut5.X4(this.LLILLJJLI, 0.0f);
        this.LLILLJJLI.setProgress(0);
        C786410Ut5.LLD(4, this.LLJILJILJ);
        this.LLILZLL = 0;
        this.LLIZ = 0;
        if (LiveHostPerfAutoAdaptiveSetting.enable()) {
            this.dataChannel.BQ2(this, LiveHostAutoAdaptiveChannel.class, new AObjectS360S0100000_17(this, 170));
        }
    }

    @Override // X.InterfaceC1087920ePu
    public final void Py(LikeHelper likeHelper, int i) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder3;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder4;
        if (!this.LLJJJIL) {
            C20441214yg.LJIIIZ("LikeUserInfoAnimWidget", "isProgressEffectEnabled() has invoked,and showEngagementCount is false");
        }
        if (likeHelper.LJIJJ() && this.LLJJJIL) {
            if (this.LLJJIJIL) {
                if (i >= likeHelper.LLJJIJIL || i >= likeHelper.LLJJJ) {
                    LiveHostAutoAdaptiveParams.INSTANCE.setDisableLikeAvatarLastTime(SystemClock.uptimeMillis());
                    return;
                }
                return;
            }
            if (i >= likeHelper.LLJJJ) {
                if (this.LLILZIL.isRunning()) {
                    this.LLILZIL.cancel();
                    View view = this.LL;
                    objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe(View.SCALE_X, Keyframe.ofFloat(0.0f, view.getScaleX()), Keyframe.ofFloat(1.0f, 0.0f)));
                    View view2 = this.LL;
                    objectAnimatorOfPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(view2, PropertyValuesHolder.ofKeyframe(View.SCALE_Y, Keyframe.ofFloat(0.0f, view2.getScaleY()), Keyframe.ofFloat(1.0f, 0.0f)));
                } else {
                    objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(this.LL, PropertyValuesHolder.ofKeyframe(View.SCALE_X, this.LLJILJIL));
                    objectAnimatorOfPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(this.LL, PropertyValuesHolder.ofKeyframe(View.SCALE_Y, this.LLJILJIL));
                }
                this.LLJIJIL.playTogether(objectAnimatorOfPropertyValuesHolder3, objectAnimatorOfPropertyValuesHolder4, this.LLJ);
                this.LLJIJIL.start();
                AnimatorSet animatorSet = this.LLJJIII;
                if (animatorSet != null) {
                    animatorSet.cancel();
                } else {
                    this.LLJJIII = new AnimatorSet();
                }
                TextView textView = this.LLJJI;
                textView.setText(textView.getContext().getString(2131844055, C341701Uh.LIZIZ(i)));
                this.LLJILLL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                float f = 1300L;
                ObjectAnimator objectAnimatorOfPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(this.LLJILLL, PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(200.0f / f, 1.0f)), PropertyValuesHolder.ofKeyframe(this.LLJJIJI, Keyframe.ofInt(0.0f, (int) C497740JfY.LIZIZ(36.0f)), Keyframe.ofInt(100.0f / f, (int) C497740JfY.LIZIZ(36.0f)), Keyframe.ofInt(1.0f, this.LLJILLL.getMeasuredWidth())));
                objectAnimatorOfPropertyValuesHolder5.setInterpolator(new DecelerateInterpolator());
                objectAnimatorOfPropertyValuesHolder5.setDuration(1300L);
                ViewGroup.LayoutParams layoutParams = this.LLJJI.getLayoutParams();
                layoutParams.width = this.LLJILLL.getMeasuredWidth();
                C786410Ut5.g6(this.LLJJI, layoutParams);
                ObjectAnimator objectAnimatorOfPropertyValuesHolder6 = ObjectAnimator.ofPropertyValuesHolder(this.LLJILLL, PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(800.0f / 1000, 1.0f), Keyframe.ofFloat(1.0f, 0.0f)), PropertyValuesHolder.ofKeyframe(this.LLJJIJI, Keyframe.ofInt(0.0f, this.LLJILLL.getMeasuredWidth()), Keyframe.ofInt(1.0f, (int) C497740JfY.LIZIZ(36.0f))));
                objectAnimatorOfPropertyValuesHolder6.setInterpolator(new DecelerateInterpolator());
                objectAnimatorOfPropertyValuesHolder6.setDuration(1000L);
                objectAnimatorOfPropertyValuesHolder6.setStartDelay(2000L);
                this.LLJJIII.playSequentially(objectAnimatorOfPropertyValuesHolder5, objectAnimatorOfPropertyValuesHolder6);
                this.LLJJIII.addListener(new ALAdapterS13S0100000_17(this, 94));
                this.LLJJIII.start();
                return;
            }
            if (i < likeHelper.LLJJIJIL) {
                return;
            }
            if (this.LLILLL.isRunning()) {
                this.LLILLL.cancel();
                View view3 = this.LL;
                objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view3, PropertyValuesHolder.ofKeyframe(View.SCALE_X, Keyframe.ofFloat(0.0f, view3.getScaleX()), Keyframe.ofFloat(1.0f, 0.0f)));
                View view4 = this.LL;
                objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view4, PropertyValuesHolder.ofKeyframe(View.SCALE_Y, Keyframe.ofFloat(0.0f, view4.getScaleY()), Keyframe.ofFloat(1.0f, 0.0f)));
            } else {
                objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.LL, PropertyValuesHolder.ofKeyframe(View.SCALE_X, this.LLJI));
                objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.LL, PropertyValuesHolder.ofKeyframe(View.SCALE_Y, this.LLJI));
            }
            this.LLIZLLLIL.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2, this.LLJ);
            this.LLIZLLLIL.start();
        }
    }

    @Override // X.InterfaceC1087920ePu
    public final void Pb(InterfaceC1085480eLy interfaceC1085480eLy, int i, int i2, float f, float f2, float f3, float f4) {
        if (!this.LLJJJIL) {
            C20441214yg.LJIIIZ("LikeUserInfoAnimWidget", "isProgressEffectEnabled() has invoked,and showEngagementCount is false");
        }
        if (interfaceC1085480eLy.LJIJJ() && this.LLJJJIL) {
            if (this.LLJJIJIIJIL) {
                if (i2 >= interfaceC1085480eLy.LJIILLIIL() || i2 >= interfaceC1085480eLy.LJIIJJI()) {
                    LiveHostAutoAdaptiveParams.INSTANCE.setDisableLikeAvatarLastTime(SystemClock.uptimeMillis());
                    return;
                }
                return;
            }
            if (this.LLJJJ) {
                int iLJIIJJI = i2 % interfaceC1085480eLy.LJIIJJI();
                if (iLJIIJJI == 0 && i2 > 0) {
                    i2 = interfaceC1085480eLy.LJIIJJI();
                } else {
                    i2 = iLJIIJJI;
                }
            }
            if (i2 >= interfaceC1085480eLy.LJIIJJI()) {
                if (this.LLIZ != i) {
                    this.LLIZ = i;
                    if (this.LLILLL.isRunning()) {
                        this.LLILLJJLI.setProgress(100);
                        C786410Ut5.X4(this.LLILLJJLI, 1.0f);
                        this.LLILLL.cancel();
                    }
                    C786410Ut5.Pd(this.LLILZIL);
                }
                C786410Ut5.Pd(this.LLILZ);
                if (!this.LLJILJILJ.isAnimating()) {
                    C786410Ut5.LLD(0, this.LLJILJILJ);
                    if (i2 == interfaceC1085480eLy.LJIIJJI()) {
                        C1143680frq.LJIILJJIL(this.LLJILJILJ, C0IPN.LIZ("tiktok_live_lottie_resource", "tiktok_live_watch_resource_normal_1"), "full_progress_bubbles_lottie.zip", true);
                    } else {
                        C1143680frq.LJIILJJIL(this.LLJILJILJ, C0IPN.LIZ("tiktok_live_lottie_resource", "tiktok_live_watch_resource_normal_1"), "like_after_full_progress_bubbles_lottie.zip", true);
                    }
                    this.LLJILJILJ.playAnimation();
                }
                C1087930ePv.LJFF++;
                return;
            }
            if (i2 < interfaceC1085480eLy.LJIILLIIL()) {
                return;
            }
            if (this.LLILZLL != i) {
                this.LLILZLL = i;
                this.LLILLL.start();
            }
            C786410Ut5.Pd(this.LLILZ);
            this.LLILLJJLI.setProgress((int) ((100.0f / (interfaceC1085480eLy.LJIIJJI() - interfaceC1085480eLy.LJIILLIIL())) * (i2 - interfaceC1085480eLy.LJIILLIIL())));
            C1087930ePv.LJ++;
        }
    }
}
