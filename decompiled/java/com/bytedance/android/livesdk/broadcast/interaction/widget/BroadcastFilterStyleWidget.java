package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.AnimationAnimationListenerC1151570g4Z;
import X.C01GW;
import X.C12DM;
import X.C12DN;
import X.C16F5;
import X.C292401Bi;
import X.C497740JfY;
import X.C500260Jjc;
import X.C761650TuF;
import X.C784440Upu;
import Y.AfS181S0100000_12;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class BroadcastFilterStyleWidget extends LiveWidget {
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public C16F5 LLILZ;
    public int LLILZIL;
    public final C01GW LLILZLL = C292401Bi.LIZ(new AwS561S0100000_17(this, 114));
    public final C01GW LLIZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 115));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.g14;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LL = findViewById(R.id.view_filter_arrow1);
        this.LLILLJJLI = findViewById(R.id.view_filter_arrow2);
        View view = getView();
        this.LLILLL = view;
        C500260Jjc.LJIILLIIL(view);
        this.LLILZ = (C16F5) findViewById(R.id.hyf);
        this.LLILZIL = C497740JfY.LJIIZILJ();
        C784440Upu.LIZ().LIZJ(this, C761650TuF.class).LIZJ(new AfS181S0100000_12(this, 61));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        View view = this.LLILLL;
        if (view != null) {
            view.clearAnimation();
        }
        ((Animation) this.LLILZLL.getValue()).cancel();
        ((Animation) this.LLILZLL.getValue()).cancel();
    }

    public final AnimationSet x1(boolean z) {
        int width;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            width = c16f5.getWidth();
        } else {
            width = 0;
        }
        int i = (this.LLILZIL - width) / 2;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new C12DN());
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC1151570g4Z(this, 2));
        if (z) {
            f = -i;
        } else {
            f = i;
        }
        float f6 = -50.0f;
        if (z) {
            f2 = -50.0f;
        } else {
            f2 = 50.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f, f2, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new C12DN());
        translateAnimation.setDuration(300L);
        if (z) {
            f3 = -50.0f;
            f4 = 50.0f;
        } else {
            f3 = 50.0f;
            f4 = -50.0f;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(f3, f4, 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new LinearInterpolator());
        translateAnimation2.setStartOffset(300L);
        translateAnimation2.setDuration(200L);
        translateAnimation2.setAnimationListener(new AnimationAnimationListenerC1151570g4Z(this, 4));
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(500L);
        alphaAnimation2.setInterpolator(new C12DM());
        alphaAnimation2.setDuration(300L);
        if (z) {
            f6 = 50.0f;
            f5 = i;
        } else {
            f5 = -i;
        }
        TranslateAnimation translateAnimation3 = new TranslateAnimation(f6, f5, 0.0f, 0.0f);
        translateAnimation3.setStartOffset(500L);
        translateAnimation3.setInterpolator(new C12DM());
        translateAnimation3.setDuration(300L);
        translateAnimation3.setAnimationListener(new AnimationAnimationListenerC1151570g4Z(this, 3));
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        return animationSet;
    }

    public final void y1(String str, boolean z) {
        Animation animation;
        Animation animation2;
        if (this.isViewValid && str != null && str.length() != 0) {
            C16F5 c16f5 = this.LLILZ;
            if (c16f5 != null) {
                c16f5.setText(str);
            }
            View view = this.LLILLL;
            if (view != null) {
                view.clearAnimation();
            }
            if (C497740JfY.LJJ()) {
                View view2 = this.LLILLL;
                if (view2 != null) {
                    if (z) {
                        animation2 = (Animation) this.LLIZ.getValue();
                    } else {
                        animation2 = (Animation) this.LLILZLL.getValue();
                    }
                    view2.startAnimation(animation2);
                    return;
                }
                return;
            }
            View view3 = this.LLILLL;
            if (view3 == null) {
                return;
            }
            if (z) {
                animation = (Animation) this.LLILZLL.getValue();
            } else {
                animation = (Animation) this.LLIZ.getValue();
            }
            view3.startAnimation(animation);
        }
    }
}
