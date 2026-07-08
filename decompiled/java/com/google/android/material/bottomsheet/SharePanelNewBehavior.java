package com.google.android.material.bottomsheet;

import X.C13LZ;
import X.C16G0;
import X.InterfaceC1370650llv;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.SharePanelNewBehavior;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelNewBehavior extends BottomSheetBehavior<View> {
    public ViewConfiguration LIZ;
    public View.OnTouchListener LJ;
    public int LJIIJJI;
    public VelocityTracker LJIIL;
    public boolean LJIILIIL;
    public ValueAnimator LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public RecyclerView LJIJ;
    public int LJIJI;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public final Map<Integer, Float> LIZIZ = new LinkedHashMap();
    public final Map<Integer, Float> LIZJ = new LinkedHashMap();
    public final List<InterfaceC1370650llv> LIZLLL = new ArrayList();
    public int LJFF = -1;
    public int LJI = -1;
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public int LJIIJ = 4;
    public final boolean LJIJJ = true;

    public final boolean LIZIZ() {
        return this.LJIIJ == 4;
    }

    public final RecyclerView LIZ(View view) {
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                RecyclerView recyclerViewLIZ = LIZ(viewGroup.getChildAt(childCount));
                if (recyclerViewLIZ != null) {
                    return recyclerViewLIZ;
                }
            }
        }
        if ((view instanceof RecyclerView) && (recyclerView = (RecyclerView) view) != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.getOrientation() == 1 && recyclerView.getVisibility() == 0) {
                return recyclerView;
            }
        }
        return null;
    }

    public final void LIZJ(int i) {
        View view;
        float f;
        Reference reference = this.viewRef;
        if (reference == null || (view = (View) reference.get()) == null || !view.isAttachedToWindow() || this.LJIIIIZZ <= 0) {
            return;
        }
        float f2 = (i * 1.0f) / this.LJIIJJI;
        if (this.LJIJJ) {
            f = this.LJIJI * f2;
        } else {
            f = 0.0f;
        }
        Iterator<InterfaceC1370650llv> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(f2, ((int) f) + i);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final View findScrollingChild(View view) {
        return this.LJIJ;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final void setStateInternal(int i) {
        if (!this.LJIJJLI && i != 5) {
            super.setStateInternal(this.LJIIJ);
        } else {
            super.setStateInternal(i);
        }
    }

    public final void LIZLLL(int i, final int i2) {
        int i3;
        ValueAnimator valueAnimator = this.LJIILJJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i4 = this.LJIILL;
        if (i4 == i) {
            this.LJIIJ = i2;
            return;
        }
        int iAbs = Math.abs(i - i4);
        int i5 = this.LJIIJJI;
        if (i5 > 0) {
            i3 = iAbs / i5;
        } else {
            i3 = 0;
        }
        long jLJFF = C13LZ.LJFF((i3 * 200) + 150, 150L, 350L);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i4, i);
        valueAnimatorOfInt.setDuration(jLJFF);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0lmC
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.LL.LJIILL = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                SharePanelNewBehavior sharePanelNewBehavior = this.LL;
                sharePanelNewBehavior.LIZJ(sharePanelNewBehavior.LJIILL);
            }
        });
        valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.0llp
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                SharePanelNewBehavior sharePanelNewBehavior = this.LL;
                sharePanelNewBehavior.LJIIJ = i2;
                sharePanelNewBehavior.LJIILJJIL = null;
            }
        });
        valueAnimatorOfInt.start();
        this.LJIILJJIL = valueAnimatorOfInt;
    }

    public final void LJ(int i, boolean z) {
        int i2 = this.LJI;
        if (i2 == -1) {
            this.LJI = this.LJFF - i;
        } else {
            this.LJI = i2 - i;
        }
        if (!z) {
            int i3 = this.LJI;
            int i4 = this.LJII;
            if (i3 < i4) {
                this.LJI = i4;
            } else {
                int i5 = this.LJFF;
                if (i3 > i5) {
                    this.LJI = i5;
                }
            }
        }
        this.LJIIJJI = this.LJI - this.LJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.SharePanelNewBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, View view, int i) {
        if (this.LJIJ == null) {
            this.LJIJ = LIZ(c16g0.findViewById(R.id.i8y));
        }
        return super.onLayoutChild(c16g0, view, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C16G0 r13, android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.SharePanelNewBehavior.onTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, View view, View view2, int i, int i2, int[] iArr, int i3) {
        View view3 = this.LJIJ;
        if (view3 == null) {
            view3 = view2;
        }
        super.onNestedPreScroll(c16g0, view, view3, i, i2, iArr, i3);
    }
}
