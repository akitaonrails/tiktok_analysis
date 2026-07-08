package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.specs.bigimage.group;

import X.C21673319rv;
import X.C21673919s1;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes34.dex */
public final class TwoRowHorizontalLayoutManager extends RecyclerView.LayoutManager {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final void LJIIL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof RecyclerView.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width, false), View.MeasureSpec.makeMeasureSpec(i, 1073741824));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int i;
        detachAndScrapAttachedViews(c21673319rv);
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return;
        }
        int iMin = Math.min(itemCount, 3);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i2 = 0;
        if (iMin > 0) {
            int i3 = 0;
            do {
                View viewLJI = c21673319rv.LJI(i3);
                addView(viewLJI);
                LJIIL(this.LL, viewLJI);
                int decoratedMeasuredWidth = paddingLeft + getDecoratedMeasuredWidth(viewLJI);
                layoutDecorated(viewLJI, paddingLeft, paddingTop, decoratedMeasuredWidth, paddingTop + this.LL);
                paddingLeft = decoratedMeasuredWidth + this.LLILZ;
                i3++;
            } while (i3 < iMin);
        }
        if (itemCount > 3) {
            i = itemCount - 3;
        } else {
            i = 0;
        }
        int paddingLeft2 = getPaddingLeft();
        int paddingTop2 = getPaddingTop() + this.LL + this.LLILLL;
        if (i > 0) {
            do {
                int i4 = i2 + 3;
                if (i4 <= itemCount - 1) {
                    View viewLJI2 = c21673319rv.LJI(i4);
                    addView(viewLJI2);
                    LJIIL(this.LLILLJJLI, viewLJI2);
                    int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewLJI2) + paddingLeft2;
                    layoutDecorated(viewLJI2, paddingLeft2, paddingTop2, decoratedMeasuredWidth2, paddingTop2 + this.LLILLJJLI);
                    paddingLeft2 = decoratedMeasuredWidth2 + this.LLILZ;
                    i2++;
                } else {
                    return;
                }
            } while (i2 < i);
        }
    }

    public TwoRowHorizontalLayoutManager(int i, int i2, int i3, int i4) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
    }
}
