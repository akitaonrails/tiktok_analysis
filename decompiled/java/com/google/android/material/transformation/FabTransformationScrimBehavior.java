package com.google.android.material.transformation;

import X.C15E4;
import X.C16G0;
import X.C194U;
import X.C19Z0;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final C194U LIZJ;
    public final C194U LIZLLL;

    public FabTransformationScrimBehavior() {
        this.LIZJ = new C194U(75L);
        this.LIZLLL = new C194U(0L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZJ = new C194U(75L);
        this.LIZLLL = new C194U(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, X.C16BC
    public final boolean layoutDependsOn(C16G0 c16g0, View view, View view2) {
        return view2 instanceof C19Z0;
    }

    @Override // X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        return super.onTouchEvent(c16g0, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet LIZIZ(View view, final View view2, final boolean z, boolean z2) {
        C194U c194u;
        ObjectAnimator objectAnimatorOfFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        if (z) {
            c194u = this.LIZJ;
        } else {
            c194u = this.LIZLLL;
        }
        if (z) {
            if (!z2) {
                C786410Ut5.T4(view2, 0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c194u.LIZ(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        C15E4.LIZ(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.19Kz
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (!z) {
                    C786410Ut5.LJLLLLLL(4, view2);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (z) {
                    C786410Ut5.LJLLLLLL(0, view2);
                }
            }
        });
        return animatorSet;
    }
}
