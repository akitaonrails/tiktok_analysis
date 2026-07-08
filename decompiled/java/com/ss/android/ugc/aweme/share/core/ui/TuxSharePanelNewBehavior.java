package com.ss.android.ugc.aweme.share.core.ui;

import X.C13LZ;
import X.C16G0;
import X.InterfaceC1370660llw;
import Y.AUListenerS270S0100000_21;
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
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.ss.android.ugc.aweme.share.core.ui.TuxSharePanelNewBehavior;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class TuxSharePanelNewBehavior extends TuxSheetBehavior<View> {
    public static final /* synthetic */ int LJJLIIIJILLIZJL = 0;
    public ViewConfiguration LJJIJLIJ;
    public View.OnTouchListener LJJJI;
    public int LJJJJL;
    public VelocityTracker LJJJJLI;
    public boolean LJJJJLL;
    public ValueAnimator LJJJJZ;
    public int LJJJJZI;
    public boolean LJJJLIIL;
    public boolean LJJJLL;
    public RecyclerView LJJJLZIJ;
    public int LJJJZ;
    public boolean LJJLI;
    public boolean LJJLIIIIJ;
    public boolean LJJLIIIJ;
    public final Map<Integer, Float> LJJIL = new LinkedHashMap();
    public final Map<Integer, Float> LJJIZ = new LinkedHashMap();
    public final List<InterfaceC1370660llw> LJJJ = new ArrayList();
    public int LJJJIL = -1;
    public int LJJJJ = -1;
    public int LJJJJI = -1;
    public int LJJJJIZL = -1;
    public int LJJJJJ = -1;
    public int LJJJJJL = 4;
    public final boolean LJJL = true;

    public final RecyclerView LJI(View view) {
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                RecyclerView recyclerViewLJI = LJI(viewGroup.getChildAt(childCount));
                if (recyclerViewLJI != null) {
                    return recyclerViewLJI;
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

    public final void LJII(int i) {
        View view;
        float f;
        Reference reference = this.LJJII;
        if (reference == null || (view = (View) reference.get()) == null || !view.isAttachedToWindow() || this.LJJJJIZL <= 0) {
            return;
        }
        float f2 = (i * 1.0f) / this.LJJJJL;
        if (this.LJJL) {
            f = this.LJJJZ * f2;
        } else {
            f = 0.0f;
        }
        Iterator<InterfaceC1370660llw> it2 = this.LJJJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(f2, ((int) f) + i);
        }
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior
    public final View findScrollingChild(View view) {
        return this.LJJJLZIJ;
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior
    public final void setStateInternal(int i) {
        if (!this.LJJLI && i != 5) {
            super.setStateInternal(this.LJJJJJL);
        } else {
            super.setStateInternal(i);
        }
    }

    public final void LJIIIIZZ(int i, final int i2) {
        int i3;
        ValueAnimator valueAnimator = this.LJJJJZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i4 = this.LJJJJZI;
        if (i4 == i) {
            this.LJJJJJL = i2;
            return;
        }
        int iAbs = Math.abs(i - i4);
        int i5 = this.LJJJJL;
        if (i5 > 0) {
            i3 = iAbs / i5;
        } else {
            i3 = 0;
        }
        long jLJFF = C13LZ.LJFF((i3 * 200) + 150, 150L, 350L);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i4, i);
        valueAnimatorOfInt.setDuration(jLJFF);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfInt.addUpdateListener(new AUListenerS270S0100000_21(this, 16));
        valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.0llq
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                TuxSharePanelNewBehavior tuxSharePanelNewBehavior = this.LL;
                tuxSharePanelNewBehavior.LJJJJJL = i2;
                tuxSharePanelNewBehavior.LJJJJZ = null;
            }
        });
        valueAnimatorOfInt.start();
        this.LJJJJZ = valueAnimatorOfInt;
    }

    public final void LJIIIZ(int i, boolean z) {
        int i2 = this.LJJJJ;
        if (i2 == -1) {
            this.LJJJJ = this.LJJJIL - i;
        } else {
            this.LJJJJ = i2 - i;
        }
        if (!z) {
            int i3 = this.LJJJJ;
            int i4 = this.LJJJJI;
            if (i3 < i4) {
                this.LJJJJ = i4;
            } else {
                int i5 = this.LJJJIL;
                if (i3 > i5) {
                    this.LJJJJ = i5;
                }
            }
        }
        this.LJJJJL = this.LJJJJ - this.LJJJJIZL;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.TuxSharePanelNewBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, View view, int i) {
        if (this.LJJJLZIJ == null) {
            this.LJJJLZIJ = LJI(c16g0.findViewById(R.id.i8y));
        }
        super.onLayoutChild(c16g0, view, i);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C16G0 r13, android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.TuxSharePanelNewBehavior.onTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, View view, View view2, int i, int i2, int[] iArr, int i3) {
        View view3 = this.LJJJLZIJ;
        if (view3 == null) {
            view3 = view2;
        }
        super.onNestedPreScroll(c16g0, view, view3, i, i2, iArr, i3);
    }
}
