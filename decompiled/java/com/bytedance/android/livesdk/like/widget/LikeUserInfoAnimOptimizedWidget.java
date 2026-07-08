package com.bytedance.android.livesdk.like.widget;

import X.C011Z;
import X.C0ID8;
import X.C1086050eMt;
import X.C1087930ePv;
import X.C1119850fFP;
import X.C1121670fIL;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1295960jpS;
import X.C19ME;
import X.C20441214yg;
import X.C2188811AlT;
import X.C341701Uh;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1085480eLy;
import X.InterfaceC1087920ePu;
import Y.ACListenerS152S0100000_17;
import Y.ALAdapterS12S0100000_16;
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
import com.bytedance.android.live.setting.LiveMainFrameUpdateFontOptSetting;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.FollowGuideNewStyleVisibility;
import com.bytedance.android.livesdk.dataChannel.LiveHostAutoAdaptiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveU18HiddenCountSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostPerfAutoAdaptiveSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUserInfoLikeSweepAnimOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public class LikeUserInfoAnimOptimizedWidget extends LiveRecyclableWidget implements InterfaceC1087920ePu {
    public static final float LLJJJJJIL;
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
    public C1086050eMt LLJILJILJ;
    public View LLJILLL;
    public ImageView LLJJ;
    public TextView LLJJI;
    public AnimatorSet LLJJIII;
    public C0ID8 LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final boolean LLJJJIL;
    public boolean LLJJJJ;

    @Override // X.InterfaceC1087920ePu
    public final String JA() {
        return "LikeUserInfoAnimOptimizedWidget";
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gxf;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // X.InterfaceC1087920ePu
    public final /* synthetic */ void onResult(String str) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void initView() {
        show();
        if (this.LLJJIJIIJIL) {
            return;
        }
        this.LLJJIJIIJIL = true;
        this.LL = findViewById(R.id.jl9);
        this.LLILLJJLI = (ProgressBar) findViewById(R.id.s8j);
        this.LLJILJILJ = new C1086050eMt(getView());
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 1200);
        this.LLILLL = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new AUListenerS266S0100000_17(this, 146));
        this.LLILLL.setDuration(1200L);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LL, (Property<View, Float>) View.ROTATION, 0.0f, LLJJJJJIL, 0.0f);
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
        this.LLJJIJI = new C0ID8(Integer.class, 1);
        x1();
        if (LiveMainFrameUpdateFontOptSetting.INSTANCE.disableFontSizeScale()) {
            C1119850fFP c1119850fFP = C011Z.LIZ;
            View view = this.contentView;
            c1119850fFP.getClass();
            C1119850fFP.LIZ(view);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        InterfaceC1085480eLy interfaceC1085480eLyO41;
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room != null && (interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(room.getId())) != null && interfaceC1085480eLyO41.isEnabled() && interfaceC1085480eLyO41.LIZIZ()) {
            interfaceC1085480eLyO41.LJIL(this);
        }
        if (this.LLJJIJIIJIL) {
            AnimatorSet animatorSet = this.LLJJIII;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.LLILLL.cancel();
            this.LLILZ.cancel();
            this.LLILZIL.cancel();
            this.LLIZLLLIL.cancel();
            this.LLJ.cancel();
            C1086050eMt c1086050eMt = this.LLJILJILJ;
            C1295960jpS c1295960jpS = c1086050eMt.LIZ;
            if (c1295960jpS == null) {
                c1295960jpS = null;
            }
            C786410Ut5.LLD(8, c1295960jpS);
            C1295960jpS c1295960jpS2 = c1086050eMt.LIZ;
            (c1295960jpS2 != null ? c1295960jpS2 : null).cancelAnimation();
            this.LLJJIJIL = false;
        }
    }

    static {
        LLJJJJJIL = C497740JfY.LJJ() ? -18.0f : 18.0f;
    }

    public LikeUserInfoAnimOptimizedWidget() {
        this.LLJJJIL = DiggParamsSetting.INSTANCE.getValue().diggShowEastereggDirect != 0;
        this.LLJJJJ = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public final void onViewAttached() {
        super.onViewAttached();
        if (enableAttachOpt() && this.LLJJIJIIJIL) {
            x1();
        }
    }

    public final void x1() {
        if (LiveUserInfoLikeSweepAnimOptSetting.enable() && this.LLJILLL.getParent() != null && (this.LLJILLL.getParent() instanceof ViewGroup) && (((View) this.LLJILLL.getParent()).getLayoutParams() instanceof C19ME)) {
            ViewGroup viewGroup = (ViewGroup) this.LLJILLL.getParent();
            C19ME c19me = (C19ME) viewGroup.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c19me).width = 0;
            c19me.endToEnd = R.id.user_info_container;
            C786410Ut5.X5(c19me, viewGroup);
        }
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        C786410Ut5.LJLLLLLL(8, this.LLJILLL);
        if (room != null && room.getOwner() != null) {
            C1121670fIL.LJIIL(this.LLJJ, room.getOwner().getAvatarThumb(), R.drawable.el_);
            C786410Ut5.Q7(this.LLJJ, new ACListenerS152S0100000_17(room, 186));
        }
        C786410Ut5.Ob(this.LL, 0.0f);
        C786410Ut5.pc(this.LL, 0.0f);
        C786410Ut5.Ab(this.LL, 0.0f);
        C786410Ut5.X4(this.LLILLJJLI, 0.0f);
        this.LLILLJJLI.setProgress(0);
        C1295960jpS c1295960jpS = this.LLJILJILJ.LIZ;
        if (c1295960jpS == null) {
            c1295960jpS = null;
        }
        C786410Ut5.LLD(4, c1295960jpS);
        this.LLILZLL = 0;
        this.LLIZ = 0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        InterfaceC1085480eLy interfaceC1085480eLyO41;
        this.LLJJJJ = LiveU18HiddenCountSetting.INSTANCE.showEngagementCount((Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class));
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room != null && (interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(room.getId())) != null && interfaceC1085480eLyO41.isEnabled() && interfaceC1085480eLyO41.LIZIZ()) {
            interfaceC1085480eLyO41.LJIIJ(this);
        }
        if (!enableAttachOpt() && this.LLJJIJIIJIL) {
            x1();
        }
        if (LiveHostPerfAutoAdaptiveSetting.enable()) {
            this.LLJJIJIL = false;
            this.LLJJJ = false;
            this.dataChannel.BQ2(this, LiveHostAutoAdaptiveChannel.class, new AObjectS360S0100000_17(this, 169));
        }
    }

    @Override // X.InterfaceC1087920ePu
    public final void Py(LikeHelper likeHelper, int i) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder3;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder4;
        if (!likeHelper.LJIJJ() || !this.LLJJJJ) {
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && Boolean.TRUE.equals(dataChannel.gg0(FollowGuideNewStyleVisibility.class))) {
            return;
        }
        if (this.LLJJJ) {
            if (i >= likeHelper.LLJJIJIL || i >= likeHelper.LLJJJ) {
                LiveHostAutoAdaptiveParams.INSTANCE.setDisableLikeAvatarLastTime(SystemClock.uptimeMillis());
                return;
            }
            return;
        }
        if (i >= likeHelper.LLJJJ) {
            initView();
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
            if (LiveUserInfoLikeSweepAnimOptSetting.enable()) {
                if (this.LLJILLL.getParent() != null && (this.LLJILLL.getParent() instanceof ViewGroup)) {
                    this.LLJILLL.measure(View.MeasureSpec.makeMeasureSpec(((View) this.LLJILLL.getParent()).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
            } else {
                this.LLJILLL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
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
            this.LLJJIII.addListener(new ALAdapterS12S0100000_16(this, 21));
            this.LLJJIII.start();
            return;
        }
        if (i < likeHelper.LLJJIJIL) {
            return;
        }
        initView();
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

    @Override // X.InterfaceC1087920ePu
    public final void Pb(InterfaceC1085480eLy interfaceC1085480eLy, int i, int i2, float f, float f2, float f3, float f4) {
        if (!interfaceC1085480eLy.LJIJJ()) {
            return;
        }
        if (!this.LLJJJJ) {
            C20441214yg.LJIIIZ("LikeUserInfoAnimOptimizedWidget", "onLike() has invoked,and showEngagementCount is false");
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && Boolean.TRUE.equals(dataChannel.gg0(FollowGuideNewStyleVisibility.class))) {
            return;
        }
        if (this.LLJJIJIL) {
            if (i2 >= interfaceC1085480eLy.LJIILLIIL() || i2 >= interfaceC1085480eLy.LJIIJJI()) {
                LiveHostAutoAdaptiveParams.INSTANCE.setDisableLikeAvatarLastTime(SystemClock.uptimeMillis());
                return;
            }
            return;
        }
        if (this.LLJJJIL) {
            int iLJIIJJI = i2 % interfaceC1085480eLy.LJIIJJI();
            if (iLJIIJJI == 0 && i2 > 0) {
                i2 = interfaceC1085480eLy.LJIIJJI();
            } else {
                i2 = iLJIIJJI;
            }
        }
        if (i2 >= interfaceC1085480eLy.LJIIJJI()) {
            initView();
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
            if (i2 == interfaceC1085480eLy.LJIIJJI()) {
                C1086050eMt c1086050eMt = this.LLJILJILJ;
                c1086050eMt.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("full_progress_bubbles_lottie");
                sbLIZ.append(".zip");
                c1086050eMt.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                C1086050eMt c1086050eMt2 = this.LLJILJILJ;
                c1086050eMt2.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("like_after_full_progress_bubbles_lottie");
                sbLIZ2.append(".zip");
                c1086050eMt2.LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            C1086050eMt c1086050eMt3 = this.LLJILJILJ;
            C1295960jpS c1295960jpS = c1086050eMt3.LIZ;
            C1295960jpS c1295960jpS2 = null;
            if (c1295960jpS == null) {
                c1295960jpS = null;
            }
            if (!c1295960jpS.isAnimating()) {
                C1295960jpS c1295960jpS3 = c1086050eMt3.LIZ;
                if (c1295960jpS3 == null) {
                    c1295960jpS3 = null;
                }
                C786410Ut5.LLD(0, c1295960jpS3);
                C1295960jpS c1295960jpS4 = c1086050eMt3.LIZ;
                if (c1295960jpS4 == null) {
                    c1295960jpS4 = null;
                }
                C1143680frq.LJIILJJIL(c1295960jpS4, "tiktok_live_watch_resource_normal_1", c1086050eMt3.LIZIZ, true);
                C1295960jpS c1295960jpS5 = c1086050eMt3.LIZ;
                if (c1295960jpS5 != null) {
                    c1295960jpS2 = c1295960jpS5;
                }
                c1295960jpS2.playAnimation();
            }
            C1087930ePv.LJFF++;
            return;
        }
        if (i2 < interfaceC1085480eLy.LJIILLIIL()) {
            return;
        }
        initView();
        if (this.LLILZLL != i) {
            this.LLILZLL = i;
            this.LLILLL.start();
        }
        C786410Ut5.Pd(this.LLILZ);
        this.LLILLJJLI.setProgress((int) ((100.0f / (interfaceC1085480eLy.LJIIJJI() - interfaceC1085480eLy.LJIILLIIL())) * (i2 - interfaceC1085480eLy.LJIILLIIL())));
        C1087930ePv.LJ++;
    }
}
