package com.ss.android.ugc.aweme.im.common.widget.appbar;

import X.C16G0;
import X.C16G1;
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
public abstract class IMHeaderScrollingViewBehavior extends IMViewOffsetBehavior<View> {
    public final Rect LIZJ;
    public final Rect LIZLLL;
    public int LJ;
    public int LJFF;

    public abstract View LIZ(List<? extends View> list);

    public float LIZIZ(View view) {
        return 1.0f;
    }

    public IMHeaderScrollingViewBehavior() {
        this.LIZJ = new Rect();
        this.LIZLLL = new Rect();
    }

    public int LIZJ(View view) {
        return view.getMeasuredHeight();
    }

    public IMHeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZJ = new Rect();
        this.LIZLLL = new Rect();
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMViewOffsetBehavior
    public final void layoutChild(C16G0 c16g0, View view, int i) {
        View viewLIZ = LIZ(c16g0.LJFF(view));
        int iLIZIZ = 0;
        if (viewLIZ != null) {
            C16G1 c16g1 = (C16G1) view.getLayoutParams();
            Rect rect = this.LIZJ;
            rect.set(c16g0.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c16g1).leftMargin, viewLIZ.getBottom() + ((ViewGroup.MarginLayoutParams) c16g1).topMargin, (c16g0.getWidth() - c16g0.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c16g1).rightMargin, ((c16g0.getHeight() + viewLIZ.getBottom()) - c16g0.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c16g1).bottomMargin);
            C20246014Ju lastWindowInsets = c16g0.getLastWindowInsets();
            if (lastWindowInsets != null && c16g0.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left += lastWindowInsets.LIZLLL();
                rect.right -= lastWindowInsets.LJ();
            }
            Rect rect2 = this.LIZLLL;
            int i2 = c16g1.LIZJ;
            if (i2 == 0) {
                i2 = 8388659;
            }
            Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            if (this.LJFF != 0) {
                float fLIZIZ = LIZIZ(viewLIZ);
                int i3 = this.LJFF;
                iLIZIZ = C419990GdR.LIZIZ((int) (fLIZIZ * i3), 0, i3);
            }
            view.layout(rect2.left, rect2.top - iLIZIZ, rect2.right, rect2.bottom - iLIZIZ);
            this.LJ = rect2.top - viewLIZ.getBottom();
            return;
        }
        c16g0.LJIIL(i, view);
        this.LJ = 0;
    }

    @Override // X.C16BC
    public final boolean onMeasureChild(C16G0 c16g0, View view, int i, int i2, int i3, int i4) {
        View viewLIZ;
        int i5;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -2 && i6 != -1) || (viewLIZ = LIZ(c16g0.LJFF(view))) == null) {
            return false;
        }
        if (viewLIZ.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
            if (view.getFitsSystemWindows()) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = c16g0.getHeight();
        }
        int measuredHeight = (size - viewLIZ.getMeasuredHeight()) + LIZJ(viewLIZ);
        if (i6 == -1) {
            i5 = 1073741824;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        c16g0.LJIILIIL(view, i, i2, View.MeasureSpec.makeMeasureSpec(measuredHeight, i5), i4);
        return true;
    }
}
