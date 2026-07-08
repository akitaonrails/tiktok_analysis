package com.ss.android.ugc.aweme.sticker.view.internal.search;

import X.AbstractC21673619ry;
import X.C11VU;
import X.C21673319rv;
import X.C21673919s1;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes34.dex */
public final class SearchFlowLayoutManager extends RecyclerView.LayoutManager {
    public final SparseArray<View> LL = new SparseArray<>();
    public final SparseArray<Rect> LLILLJJLI = new SparseArray<>();
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(AbstractC21673619ry<?> abstractC21673619ry, AbstractC21673619ry<?> abstractC21673619ry2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            View view = this.LL.get(i);
            Rect rect = this.LLILLJJLI.get(i);
            layoutDecorated(view, rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int i2 = this.LLILZIL;
        int i3 = this.LLILZ;
        int i4 = 0;
        if (i2 - i3 <= 0) {
            return 0;
        }
        int i5 = this.LLILZLL;
        int i6 = i + i5;
        if (i6 >= 0) {
            if (i6 > i2 - i3) {
                i4 = i2 - i3;
            } else {
                i4 = i6;
            }
        }
        int i7 = i4 - i5;
        offsetChildrenVertical(-i7);
        this.LLILZLL = i4;
        return i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onMeasure(C21673319rv c21673319rv, C21673919s1 c21673919s1, int i, int i2) {
        super.onMeasure(c21673319rv, c21673919s1, i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iLIZ = (int) C11VU.LIZ(12.0f);
        removeAndRecycleAllViews(c21673319rv);
        c21673319rv.LIZLLL();
        this.LL.clear();
        this.LLILZIL = 0;
        this.LLILLL = (size - getPaddingRight()) - getPaddingLeft();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int itemCount = getItemCount();
        for (int i3 = 0; i3 < itemCount; i3++) {
            View viewLJI = c21673319rv.LJI(i3);
            addView(viewLJI);
            measureChildWithMargins(viewLJI, 0, 0);
            this.LL.put(i3, viewLJI);
        }
        int itemCount2 = getItemCount();
        int i4 = paddingTop;
        for (int i5 = 0; i5 < itemCount2; i5++) {
            View view = this.LL.get(i5);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(view);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(view);
            if (decoratedMeasuredWidth > this.LLILLL - paddingLeft) {
                paddingLeft = getPaddingLeft();
                i4 = paddingTop;
            }
            int i6 = decoratedMeasuredHeight + i4;
            this.LLILLJJLI.put(i5, new Rect(paddingLeft, i4, paddingLeft + decoratedMeasuredWidth, i6));
            paddingLeft += decoratedMeasuredWidth + iLIZ;
            if (i6 >= paddingTop) {
                paddingTop = i6 + iLIZ;
            }
        }
        int paddingTop2 = paddingTop - getPaddingTop();
        this.LLILZIL = paddingTop2;
        int paddingTop3 = paddingTop2 + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE ? paddingTop3 <= size2 : mode != 1073741824) {
            size2 = paddingTop3;
        }
        this.LLILZ = (size2 - getPaddingTop()) - getPaddingBottom();
        setMeasuredDimension(size, size2);
    }
}
