package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes33.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet LIZIZ;

    public abstract AnimatorSet LIZIZ(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void LIZ(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        AnimatorSet animatorSet = this.LIZIZ;
        if (animatorSet != null) {
            z3 = true;
            animatorSet.cancel();
        } else {
            z3 = false;
        }
        AnimatorSet animatorSetLIZIZ = LIZIZ(view, view2, z, z3);
        this.LIZIZ = animatorSetLIZIZ;
        animatorSetLIZIZ.addListener(new AnimatorListenerAdapter() { // from class: X.19L3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.LL.LIZIZ = null;
            }
        });
        this.LIZIZ.start();
        if (!z2) {
            this.LIZIZ.end();
        }
    }
}
