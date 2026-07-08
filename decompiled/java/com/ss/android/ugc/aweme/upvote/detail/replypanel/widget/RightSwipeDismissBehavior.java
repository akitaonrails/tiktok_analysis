package com.ss.android.ugc.aweme.upvote.detail.replypanel.widget;

import X.C13LZ;
import X.C16G0;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class RightSwipeDismissBehavior<V extends View> extends BottomSheetBehavior<V> {
    public final float LIZ;
    public float LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public int LJ;
    public float LJFF;
    public float LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public VelocityTracker LJIIJ;
    public Animator LJIIJJI;

    public RightSwipeDismissBehavior() {
        this.LIZ = 0.5f;
        this.LIZJ = 250L;
        this.LIZLLL = 200L;
    }

    public RightSwipeDismissBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = 0.5f;
        this.LIZJ = 250L;
        this.LIZLLL = 200L;
    }

    public final void LIZ(long j, View view) {
        Animator animator = this.LJIIJJI;
        if (animator != null) {
            animator.cancel();
        }
        this.LJIIJJI = null;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), 0.0f);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        C786410Ut5.Pd(objectAnimatorOfFloat);
        this.LJIIJJI = objectAnimatorOfFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r7, V r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r0)
            int r0 = r6.LJ
            if (r0 != 0) goto L12
            int r0 = r1.getScaledTouchSlop()
            r6.LJ = r0
        L12:
            float r0 = r6.LIZIZ
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r4 = 0
            r2 = 1
            if (r0 != 0) goto L22
            int r0 = r1.getScaledMinimumFlingVelocity()
            float r0 = (float) r0
            r6.LIZIZ = r0
        L22:
            int r3 = r9.getActionMasked()
            r1 = 0
            if (r3 == 0) goto L94
            if (r3 == r2) goto L86
            r0 = 2
            if (r3 == r0) goto L36
            r0 = 3
            if (r3 == r0) goto L86
        L31:
            boolean r0 = super.onInterceptTouchEvent(r7, r8, r9)
            return r0
        L36:
            android.view.VelocityTracker r0 = r6.LJIIJ
            if (r0 == 0) goto L3d
            r0.addMovement(r9)
        L3d:
            boolean r0 = r6.LJII
            if (r0 != 0) goto L81
            float r3 = r9.getX()
            float r0 = r6.LJFF
            float r3 = r3 - r0
            float r4 = r9.getY()
            float r0 = r6.LJI
            float r4 = r4 - r0
            float r1 = java.lang.Math.abs(r3)
            int r0 = r6.LJ
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L65
            float r1 = java.lang.Math.abs(r4)
            int r0 = r6.LJ
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L81
        L65:
            r6.LJII = r2
            boolean r0 = r6.LJIIIZ
            if (r0 == 0) goto L7f
            float r0 = -r3
        L6c:
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L81
            float r1 = java.lang.Math.abs(r3)
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L81
            r6.LJIIIIZZ = r2
            return r2
        L7f:
            r0 = r3
            goto L6c
        L81:
            boolean r0 = r6.LJIIIIZZ
            if (r0 == 0) goto L31
            return r2
        L86:
            boolean r0 = r6.LJIIIIZZ
            if (r0 != 0) goto L31
            android.view.VelocityTracker r0 = r6.LJIIJ
            if (r0 == 0) goto L91
            r0.recycle()
        L91:
            r6.LJIIJ = r1
            goto L31
        L94:
            float r0 = r9.getX()
            r6.LJFF = r0
            float r0 = r9.getY()
            r6.LJI = r0
            r6.LJII = r4
            r6.LJIIIIZZ = r4
            int r0 = r8.getLayoutDirection()
            if (r0 != r2) goto Lab
            r4 = 1
        Lab:
            r6.LJIIIZ = r4
            android.animation.Animator r0 = r6.LJIIJJI
            if (r0 == 0) goto Lb4
            r0.cancel()
        Lb4:
            r6.LJIIJJI = r1
            android.view.VelocityTracker r0 = r6.LJIIJ
            if (r0 == 0) goto Lbd
            r0.recycle()
        Lbd:
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r0.addMovement(r9)
            r6.LJIIJ = r0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.replypanel.widget.RightSwipeDismissBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        float height;
        if (!this.LJIIIIZZ) {
            return super.onTouchEvent(c16g0, v, motionEvent);
        }
        VelocityTracker velocityTracker = this.LJIIJ;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        float xVelocity = 0.0f;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    LIZ(this.LIZLLL, v);
                    this.LJIIIIZZ = false;
                    VelocityTracker velocityTracker2 = this.LJIIJ;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                    }
                    this.LJIIJ = null;
                }
                return true;
            }
            float x = motionEvent.getX() - this.LJFF;
            if (this.LJIIIZ) {
                x = -x;
            }
            int width = v.getWidth();
            if (width > 0) {
                height = v.getHeight() / width;
            } else {
                height = 1.0f;
            }
            C786410Ut5.ed(v, C13LZ.LIZLLL(x * height, 0.0f, v.getHeight()));
            return true;
        }
        VelocityTracker velocityTracker3 = this.LJIIJ;
        if (velocityTracker3 != null) {
            velocityTracker3.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
            xVelocity = velocityTracker3.getXVelocity();
        }
        if (this.LJIIIZ) {
            xVelocity = -xVelocity;
        }
        if (v.getTranslationY() <= v.getHeight() * this.LIZ && xVelocity <= this.LIZIZ) {
            LIZ(this.LIZLLL, v);
        } else {
            setState(5);
            LIZ(this.LIZJ, v);
        }
        this.LJIIIIZZ = false;
        VelocityTracker velocityTracker4 = this.LJIIJ;
        if (velocityTracker4 != null) {
            velocityTracker4.recycle();
        }
        this.LJIIJ = null;
        return true;
    }
}
