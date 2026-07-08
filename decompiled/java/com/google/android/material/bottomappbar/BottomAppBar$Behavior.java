package com.google.android.material.bottomappbar;

import X.C16G0;
import X.C16G1;
import X.C19XG;
import X.C19XL;
import X.C19XM;
import X.C19Z0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes34.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior<C19XG> {
    public final Rect LIZLLL;
    public WeakReference<C19XG> LJ;
    public final C19XM LJFF;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19XM] */
    public BottomAppBar$Behavior() {
        this.LJFF = new View.OnLayoutChangeListener() { // from class: X.19XM
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.LL.LJ.get() != null && (view instanceof C19Z0)) {
                    this.LL.LIZLLL.set(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    throw null;
                }
                view.removeOnLayoutChangeListener(this);
            }
        };
        this.LIZLLL = new Rect();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19XM] */
    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJFF = new View.OnLayoutChangeListener() { // from class: X.19XM
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.LL.LJ.get() != null && (view instanceof C19Z0)) {
                    this.LL.LIZLLL.set(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    throw null;
                }
                view.removeOnLayoutChangeListener(this);
            }
        };
        this.LIZLLL = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.19XN] */
    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, View view, int i) {
        C19Z0 c19z0;
        final C19XG c19xg = (C19XG) view;
        this.LJ = new WeakReference<>(c19xg);
        View viewLJIJI = c19xg.LJIJI();
        if (viewLJIJI != null && !viewLJIJI.isLaidOut()) {
            ((C16G1) viewLJIJI.getLayoutParams()).LIZLLL = 49;
            if (viewLJIJI instanceof C19Z0) {
                C19Z0 c19z02 = (C19Z0) viewLJIJI;
                c19z02.addOnLayoutChangeListener(this.LJFF);
                c19z02.LIZIZ();
                c19z02.LIZJ(new AnimatorListenerAdapter() { // from class: X.19XN
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        c19xg.getClass();
                        throw null;
                    }
                });
                c19z02.LIZLLL();
            }
            C19XL topEdgeTreatment = c19xg.getTopEdgeTreatment();
            c19xg.getFabTranslationX();
            topEdgeTreatment.getClass();
            c19xg.LJIJI();
            if (c19xg.LLLJIL) {
                View viewLJIJI2 = c19xg.LJIJI();
                if ((viewLJIJI2 instanceof C19Z0) && (c19z0 = (C19Z0) viewLJIJI2) != null) {
                    c19z0.LJII();
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        c16g0.LJIIL(i, c19xg);
        return super.onLayoutChild(c16g0, c19xg, i);
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, X.C16BC
    public final boolean onStartNestedScroll(C16G0 c16g0, View view, View view2, View view3, int i, int i2) {
        C19XG c19xg = (C19XG) view;
        if (c19xg.getHideOnScroll() && super.onStartNestedScroll(c16g0, c19xg, view2, view3, i, i2)) {
            return true;
        }
        return false;
    }
}
