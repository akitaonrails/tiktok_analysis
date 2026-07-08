package com.bytedance.ies.sdk.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AnimationInfo {
    public Animator hideAnimator;
    public final int id;
    public final LayeredElementContext layeredElementContext;
    public Animator showAnimator;

    public Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        return null;
    }

    public Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        return null;
    }

    public void onHide() {
    }

    public void onHideAnimationEnd(ConstraintProperty constraintProperty) {
    }

    public void onHideAnimationStart(ConstraintProperty constraintProperty) {
    }

    public void onShow() {
    }

    public void onShowAnimationEnd(ConstraintProperty constraintProperty) {
    }

    public void onShowAnimationStart(ConstraintProperty constraintProperty) {
    }

    public final void animateHide() {
        Animator animator = this.hideAnimator;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.hideAnimator;
        if (animator2 != null) {
            animator2.removeAllListeners();
        }
        ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(this.id);
        if (constraintPropertyById != null) {
            Animator animatorOnCreateHideAnimator = onCreateHideAnimator(constraintPropertyById);
            if (animatorOnCreateHideAnimator != null) {
                animatorOnCreateHideAnimator.setDuration(animationDuration());
                animatorOnCreateHideAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.ies.sdk.widgets.AnimationInfo$animateHide$1$1$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator3) {
                        super.onAnimationEnd(animator3);
                        this.this$0.hideAnimationEnd();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator3) {
                        super.onAnimationStart(animator3);
                        this.this$0.hideAnimationStart();
                    }
                });
                animatorOnCreateHideAnimator.start();
            } else {
                animatorOnCreateHideAnimator = null;
            }
            this.hideAnimator = animatorOnCreateHideAnimator;
        }
    }

    public final void animateShow() {
        Animator animator = this.showAnimator;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.showAnimator;
        if (animator2 != null) {
            animator2.removeAllListeners();
        }
        ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(this.id);
        if (constraintPropertyById != null) {
            Animator animatorOnCreateShowAnimator = onCreateShowAnimator(constraintPropertyById);
            if (animatorOnCreateShowAnimator != null) {
                animatorOnCreateShowAnimator.setDuration(animationDuration());
                animatorOnCreateShowAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.ies.sdk.widgets.AnimationInfo$animateShow$1$1$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator3) {
                        super.onAnimationEnd(animator3);
                        this.this$0.showAnimationEnd();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator3) {
                        super.onAnimationStart(animator3);
                        this.this$0.showAnimationStart();
                    }
                });
                animatorOnCreateShowAnimator.start();
            } else {
                animatorOnCreateShowAnimator = null;
            }
            this.showAnimator = animatorOnCreateShowAnimator;
        }
    }

    public long animationDuration() {
        return this.layeredElementContext.getAnimationDuration();
    }

    public final void cancelHideAnimation() {
        Animator animator;
        Animator animator2 = this.hideAnimator;
        if (animator2 == null || !animator2.isRunning() || (animator = this.hideAnimator) == null) {
            return;
        }
        animator.cancel();
    }

    public final void cancelShowAnimation() {
        Animator animator;
        Animator animator2 = this.showAnimator;
        if (animator2 == null || !animator2.isRunning() || (animator = this.showAnimator) == null) {
            return;
        }
        animator.cancel();
    }

    public final void hideAnimationEnd() {
        this.layeredElementContext.notifyHideAnimationEnd$live_widget_release(this.id);
        ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(this.id);
        if (constraintPropertyById != null) {
            onHideAnimationEnd(constraintPropertyById);
        }
    }

    public final void hideAnimationStart() {
        this.layeredElementContext.notifyHideAnimationStart$live_widget_release(this.id);
        ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(this.id);
        if (constraintPropertyById != null) {
            onHideAnimationStart(constraintPropertyById);
        }
    }

    public final void notifyHide() {
        this.layeredElementContext.notifyHide$live_widget_release(this.id);
    }

    public final void notifyShow() {
        this.layeredElementContext.notifyShow$live_widget_release(this.id);
    }

    public final void showAnimationEnd() {
        this.layeredElementContext.notifyShowAnimationEnd$live_widget_release(this.id);
        ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(this.id);
        if (constraintPropertyById != null) {
            onShowAnimationEnd(constraintPropertyById);
        }
    }

    public final void showAnimationStart() {
        this.layeredElementContext.notifyShowAnimationStart$live_widget_release(this.id);
        ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(this.id);
        if (constraintPropertyById != null) {
            onShowAnimationStart(constraintPropertyById);
        }
    }

    public final int getId() {
        return this.id;
    }

    public final LayeredElementContext getLayeredElementContext() {
        return this.layeredElementContext;
    }

    public AnimationInfo(int i, LayeredElementContext layeredElementContext) {
        this.id = i;
        this.layeredElementContext = layeredElementContext;
    }
}
