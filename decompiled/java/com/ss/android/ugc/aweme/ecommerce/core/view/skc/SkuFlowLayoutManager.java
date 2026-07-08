package com.ss.android.ugc.aweme.ecommerce.core.view.skc;

import X.AbstractC21673619ry;
import X.C1744760vVK;
import X.C21673319rv;
import X.C21673919s1;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes34.dex */
public class SkuFlowLayoutManager extends RecyclerView.LayoutManager {
    public int LL;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public void LJIIL(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        ViewGroup.MarginLayoutParams layoutParams;
        int decoratedMeasuredHeight;
        ViewGroup.MarginLayoutParams layoutParams2;
        int paddingStart;
        int decoratedMeasuredHeight2;
        int width = getWidth() - getPaddingEnd();
        if (C1744760vVK.LIZ()) {
            int paddingStart2 = width - getPaddingStart();
            int paddingTop = getPaddingTop();
            if (width > 0) {
                for (int i = 0; i >= 0 && i < c21673919s1.LIZIZ(); i++) {
                    View viewLJI = c21673319rv.LJI(i);
                    ViewGroup.LayoutParams layoutParams3 = viewLJI.getLayoutParams();
                    if (!(layoutParams3 instanceof RecyclerView.LayoutParams) || (layoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) == null) {
                        layoutParams2 = new RecyclerView.LayoutParams(0, 0);
                    }
                    addView(viewLJI);
                    measureChildWithMargins(viewLJI, 0, 0);
                    int decoratedMeasuredWidth = (paddingStart2 - getDecoratedMeasuredWidth(viewLJI)) - layoutParams2.getMarginStart();
                    int decoratedMeasuredHeight3 = getDecoratedMeasuredHeight(viewLJI) + paddingTop + layoutParams2.topMargin + layoutParams2.bottomMargin;
                    if (decoratedMeasuredWidth < 0) {
                        paddingStart = width - getPaddingStart();
                        decoratedMeasuredWidth = (paddingStart - getDecoratedMeasuredWidth(viewLJI)) - layoutParams2.getMarginStart();
                        int i2 = decoratedMeasuredHeight3 + this.LL;
                        decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewLJI) + i2 + layoutParams2.topMargin + layoutParams2.bottomMargin;
                        paddingTop = i2;
                    } else {
                        paddingStart = paddingStart2;
                        decoratedMeasuredHeight2 = decoratedMeasuredHeight3;
                    }
                    paddingStart2 = decoratedMeasuredWidth - layoutParams2.getMarginEnd();
                    layoutDecoratedWithMargins(viewLJI, paddingStart2, paddingTop, paddingStart, decoratedMeasuredHeight2);
                }
                return;
            }
            return;
        }
        int paddingStart3 = getPaddingStart();
        int paddingTop2 = getPaddingTop();
        if (width > 0) {
            for (int i3 = 0; i3 >= 0 && i3 < c21673919s1.LIZIZ(); i3++) {
                View viewLJI2 = c21673319rv.LJI(i3);
                ViewGroup.LayoutParams layoutParams4 = viewLJI2.getLayoutParams();
                if (!(layoutParams4 instanceof RecyclerView.LayoutParams) || (layoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) == null) {
                    layoutParams = new RecyclerView.LayoutParams(0, 0);
                }
                addView(viewLJI2);
                measureChildWithMargins(viewLJI2, 0, 0);
                int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewLJI2) + paddingStart3 + layoutParams.getMarginStart();
                int decoratedMeasuredHeight4 = getDecoratedMeasuredHeight(viewLJI2) + paddingTop2 + layoutParams.topMargin + layoutParams.bottomMargin;
                if (decoratedMeasuredWidth2 > width) {
                    paddingStart3 = getPaddingStart();
                    decoratedMeasuredWidth2 = layoutParams.getMarginStart() + getDecoratedMeasuredWidth(viewLJI2) + paddingStart3;
                    int i4 = decoratedMeasuredHeight4 + this.LL;
                    decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewLJI2) + i4 + layoutParams.topMargin + layoutParams.bottomMargin;
                    paddingTop2 = i4;
                } else {
                    decoratedMeasuredHeight = decoratedMeasuredHeight4;
                }
                int i5 = paddingStart3;
                paddingStart3 = layoutParams.getMarginEnd() + decoratedMeasuredWidth2;
                layoutDecoratedWithMargins(viewLJI2, i5, paddingTop2, paddingStart3, decoratedMeasuredHeight);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(AbstractC21673619ry<?> abstractC21673619ry, AbstractC21673619ry<?> abstractC21673619ry2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (c21673919s1.LIZIZ() == 0) {
            removeAndRecycleAllViews(c21673319rv);
        } else {
            detachAndScrapAttachedViews(c21673319rv);
            LJIIL(c21673319rv, c21673919s1);
        }
    }
}
