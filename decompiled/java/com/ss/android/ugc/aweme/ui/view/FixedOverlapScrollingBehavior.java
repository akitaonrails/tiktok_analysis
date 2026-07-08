package com.ss.android.ugc.aweme.ui.view;

import X.C16G0;
import X.C16GX;
import X.C418440Gaw;
import X.C814420VxA;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;

/* JADX INFO: loaded from: classes32.dex */
public final class FixedOverlapScrollingBehavior extends AppBarLayout$ScrollingViewBehavior {
    public final int LJ;
    public C16GX LJFF;

    public FixedOverlapScrollingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
    }

    public final void LIZLLL(C16G0 c16g0, View view) {
        C16GX c16gx = this.LJFF;
        if (c16gx == null) {
            int childCount = c16g0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = c16g0.getChildAt(i);
                if (childAt instanceof C16GX) {
                    c16gx = (C16GX) childAt;
                    this.LJFF = c16gx;
                    if (c16gx == null) {
                        return;
                    }
                }
            }
            return;
        }
        int bottom = (c16gx.getBottom() - this.LJ) - view.getTop();
        if (bottom != 0) {
            view.offsetTopAndBottom(bottom);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, X.C16BC
    public final boolean onDependentViewChanged(C16G0 c16g0, View view, View view2) {
        super.onDependentViewChanged(c16g0, view, view2);
        if (view2 instanceof C16GX) {
            this.LJFF = (C16GX) view2;
            LIZLLL(c16g0, view);
            return false;
        }
        return false;
    }

    @Override // X.C16GU, X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, View view, int i) {
        boolean zOnLayoutChild = super.onLayoutChild(c16g0, view, i);
        LIZLLL(c16g0, view);
        return zOnLayoutChild;
    }

    @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, X.C16BC
    public final boolean onMeasureChild(C16G0 c16g0, View view, int i, int i2, int i3, int i4) {
        return super.onMeasureChild(c16g0, view, i, i2, i3, i4 - this.LJ);
    }
}
