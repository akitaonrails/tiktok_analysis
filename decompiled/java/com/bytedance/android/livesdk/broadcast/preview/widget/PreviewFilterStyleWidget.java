package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.AnimationAnimationListenerC1151570g4Z;
import X.C01GW;
import X.C12DM;
import X.C12DN;
import X.C16F5;
import X.C292401Bi;
import X.C497740JfY;
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
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class PreviewFilterStyleWidget extends PreviewWidget {
    public View LLILZ;
    public View LLILZIL;
    public C16F5 LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LLJ = C292401Bi.LIZ(new AwS561S0100000_17(this, 118));
    public final C01GW LLJI = C292401Bi.LIZ(new AwS561S0100000_17(this, 119));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.g1q;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (this.LLIZLLLIL) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        View view = getView();
        if (view != null) {
            view.clearAnimation();
        }
        this.LLIZLLLIL = false;
        hide();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.LLILZ = findViewById(R.id.view_filter_arrow1);
        this.LLILZIL = findViewById(R.id.view_filter_arrow2);
        this.LLILZLL = (C16F5) findViewById(R.id.hyf);
        this.LLIZ = C497740JfY.LJIIZILJ();
        C784440Upu.LIZ().LIZJ(this, C761650TuF.class).LIZJ(new AfS181S0100000_12(this, 271));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        View view = getView();
        if (view != null) {
            view.clearAnimation();
        }
    }

    public final AnimationSet G1(boolean z) {
        int width;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        C16F5 c16f5 = this.LLILZLL;
        if (c16f5 != null) {
            width = c16f5.getWidth();
        } else {
            width = 0;
        }
        int i = (this.LLIZ - width) / 2;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new C12DN());
        alphaAnimation.setDuration(300L);
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
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        animationSet.setAnimationListener(new AnimationAnimationListenerC1151570g4Z(this, 5));
        return animationSet;
    }

    public final void H1(String str, boolean z) {
        Animation animation;
        Animation animation2;
        if (this.isViewValid && str != null && str.length() != 0) {
            C16F5 c16f5 = this.LLILZLL;
            if (c16f5 != null) {
                c16f5.setText(str);
            }
            View view = getView();
            if (view != null) {
                view.clearAnimation();
            }
            if (C497740JfY.LJJ()) {
                View view2 = getView();
                if (view2 != null) {
                    if (z) {
                        animation2 = (Animation) this.LLJI.getValue();
                    } else {
                        animation2 = (Animation) this.LLJ.getValue();
                    }
                    view2.startAnimation(animation2);
                    return;
                }
                return;
            }
            View view3 = getView();
            if (view3 == null) {
                return;
            }
            if (z) {
                animation = (Animation) this.LLJ.getValue();
            } else {
                animation = (Animation) this.LLJI.getValue();
            }
            view3.startAnimation(animation);
        }
    }
}
