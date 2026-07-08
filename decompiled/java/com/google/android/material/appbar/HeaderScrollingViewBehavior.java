package com.google.android.material.appbar;

import X.C16G0;
import X.C16G1;
import X.C16GU;
import X.C20246014Ju;
import X.C419990GdR;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public abstract class HeaderScrollingViewBehavior extends C16GU<View> {
    public final Rect LIZ;
    public final Rect LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public abstract View LIZ(List<View> list);

    public float LIZIZ(View view) {
        return 1.0f;
    }

    public HeaderScrollingViewBehavior() {
        this.LIZ = new Rect();
        this.LIZIZ = new Rect();
        this.LIZJ = 0;
    }

    public int LIZJ(View view) {
        return view.getMeasuredHeight();
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = new Rect();
        this.LIZIZ = new Rect();
        this.LIZJ = 0;
    }

    @Override // X.C16GU
    public final void layoutChild(C16G0 c16g0, View view, int i) {
        View viewLIZ = LIZ(c16g0.LJFF(view));
        int iLIZIZ = 0;
        if (viewLIZ != null) {
            C16G1 c16g1 = (C16G1) view.getLayoutParams();
            Rect rect = this.LIZ;
            rect.set(c16g0.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c16g1).leftMargin, viewLIZ.getBottom() + ((ViewGroup.MarginLayoutParams) c16g1).topMargin, (c16g0.getWidth() - c16g0.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c16g1).rightMargin, ((c16g0.getHeight() + viewLIZ.getBottom()) - c16g0.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c16g1).bottomMargin);
            C20246014Ju lastWindowInsets = c16g0.getLastWindowInsets();
            if (lastWindowInsets != null && c16g0.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left += lastWindowInsets.LIZLLL();
                rect.right -= lastWindowInsets.LJ();
            }
            Rect rect2 = this.LIZIZ;
            int i2 = c16g1.LIZJ;
            if (i2 == 0) {
                i2 = 8388659;
            }
            Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            if (this.LIZLLL != 0) {
                float fLIZIZ = LIZIZ(viewLIZ);
                int i3 = this.LIZLLL;
                iLIZIZ = C419990GdR.LIZIZ((int) (fLIZIZ * i3), 0, i3);
            }
            view.layout(rect2.left, rect2.top - iLIZIZ, rect2.right, rect2.bottom - iLIZIZ);
            this.LIZJ = rect2.top - viewLIZ.getBottom();
            return;
        }
        super.layoutChild(c16g0, view, i);
        this.LIZJ = 0;
    }

    @Override // X.C16BC
    public boolean onMeasureChild(C16G0 c16g0, View view, int i, int i2, int i3, int i4) {
        View viewLIZ;
        int i5;
        C20246014Ju lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 == -1 || i6 == -2) && (viewLIZ = LIZ(c16g0.LJFF(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (viewLIZ.getFitsSystemWindows() && (lastWindowInsets = c16g0.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.LJFF() + lastWindowInsets.LIZJ();
                }
            } else {
                size = c16g0.getHeight();
            }
            int iLIZJ = (size + LIZJ(viewLIZ)) - viewLIZ.getMeasuredHeight();
            if (i6 == -1) {
                i5 = 1073741824;
            } else {
                i5 = Integer.MIN_VALUE;
            }
            c16g0.LJIILIIL(view, i, i2, View.MeasureSpec.makeMeasureSpec(iLIZJ, i5), i4);
            return true;
        }
        return false;
    }
}
