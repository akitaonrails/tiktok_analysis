package com.google.android.material.behavior;

import X.C12DL;
import X.C16BC;
import X.C16G0;
import X.C194V;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes34.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends C16BC<V> {
    public int LIZ;
    public int LIZIZ;
    public ViewPropertyAnimator LIZJ;

    @Override // X.C16BC
    public boolean onStartNestedScroll(C16G0 c16g0, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
        this.LIZIZ = 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZIZ = 2;
    }

    @Override // X.C16BC
    public boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        this.LIZ = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(c16g0, v, i);
    }

    public final void LIZ(View view, int i, long j, C12DL c12dl) {
        this.LIZJ = view.animate().translationY(i).setInterpolator(c12dl).setDuration(j).setListener(new AnimatorListenerAdapter() { // from class: X.19XO
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.LL.LIZJ = null;
            }
        });
    }

    @Override // X.C16BC
    public final void onNestedScroll(C16G0 c16g0, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.LIZIZ != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.LIZJ;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    v.clearAnimation();
                }
                this.LIZIZ = 1;
                LIZ(v, this.LIZ, 175L, C194V.LIZJ);
                return;
            }
            return;
        }
        if (i2 >= 0 || this.LIZIZ == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.LIZJ;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            v.clearAnimation();
        }
        this.LIZIZ = 2;
        LIZ(v, 0, 225L, C194V.LIZLLL);
    }
}
