package com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.style;

import X.C1744760vVK;
import X.C21673319rv;
import X.C21673919s1;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes34.dex */
public final class CombinedSkuGridLayoutManager extends GridLayoutManager {
    public int LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    public CombinedSkuGridLayoutManager(Context context) {
        super(2, 0, context, false);
        this.LLJI = true;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        ViewGroup.MarginLayoutParams layoutParams;
        boolean z;
        ViewGroup.MarginLayoutParams layoutParams2;
        int decoratedMeasuredHeight;
        ViewGroup.MarginLayoutParams layoutParams3;
        int paddingStart;
        int decoratedMeasuredHeight2;
        if (c21673319rv != null && c21673919s1 != null && c21673919s1.LIZIZ() != 0) {
            if (c21673919s1.LIZIZ() == 0) {
                removeAndRecycleAllViews(c21673319rv);
                return;
            }
            if (this.LLJIJIL) {
                z = this.LLJI;
            } else {
                int width = (getWidth() - getPaddingEnd()) - getPaddingStart();
                View viewLJI = c21673319rv.LJI(0);
                ViewGroup.LayoutParams layoutParams4 = viewLJI.getLayoutParams();
                if (!(layoutParams4 instanceof RecyclerView.LayoutParams) || (layoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) == null) {
                    layoutParams = new RecyclerView.LayoutParams(0, 0);
                }
                addView(viewLJI);
                measureChildWithMargins(viewLJI, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewLJI) + layoutParams.getMarginEnd();
                removeAndRecycleView(viewLJI, c21673319rv);
                if (getItemCount() <= (width / decoratedMeasuredWidth) * 2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            this.LLJI = z;
            this.LLJIJIL = true;
            if (z) {
                detachAndScrapAttachedViews(c21673319rv);
                int width2 = getWidth() - getPaddingEnd();
                if (C1744760vVK.LIZ()) {
                    int paddingStart2 = width2 - getPaddingStart();
                    int paddingTop = getPaddingTop();
                    if (width2 > 0) {
                        for (int i = 0; i >= 0 && i < c21673919s1.LIZIZ(); i++) {
                            View viewLJI2 = c21673319rv.LJI(i);
                            ViewGroup.LayoutParams layoutParams5 = viewLJI2.getLayoutParams();
                            if (!(layoutParams5 instanceof RecyclerView.LayoutParams) || (layoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5) == null) {
                                layoutParams3 = new RecyclerView.LayoutParams(0, 0);
                            }
                            addView(viewLJI2);
                            measureChildWithMargins(viewLJI2, 0, 0);
                            int decoratedMeasuredWidth2 = (paddingStart2 - getDecoratedMeasuredWidth(viewLJI2)) - layoutParams3.getMarginStart();
                            int decoratedMeasuredHeight3 = getDecoratedMeasuredHeight(viewLJI2) + paddingTop + layoutParams3.topMargin + layoutParams3.bottomMargin;
                            if (decoratedMeasuredWidth2 < 0) {
                                paddingStart = width2 - getPaddingStart();
                                decoratedMeasuredWidth2 = (paddingStart - getDecoratedMeasuredWidth(viewLJI2)) - layoutParams3.getMarginStart();
                                int i2 = decoratedMeasuredHeight3 + this.LLJ;
                                decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewLJI2) + i2 + layoutParams3.topMargin + layoutParams3.bottomMargin;
                                paddingTop = i2;
                            } else {
                                paddingStart = paddingStart2;
                                decoratedMeasuredHeight2 = decoratedMeasuredHeight3;
                            }
                            paddingStart2 = decoratedMeasuredWidth2 - layoutParams3.getMarginEnd();
                            layoutDecoratedWithMargins(viewLJI2, paddingStart2, paddingTop, paddingStart, decoratedMeasuredHeight2);
                        }
                        return;
                    }
                    return;
                }
                int paddingStart3 = getPaddingStart();
                int paddingTop2 = getPaddingTop();
                if (width2 > 0) {
                    for (int i3 = 0; i3 >= 0 && i3 < c21673919s1.LIZIZ(); i3++) {
                        View viewLJI3 = c21673319rv.LJI(i3);
                        ViewGroup.LayoutParams layoutParams6 = viewLJI3.getLayoutParams();
                        if (!(layoutParams6 instanceof RecyclerView.LayoutParams) || (layoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams6) == null) {
                            layoutParams2 = new RecyclerView.LayoutParams(0, 0);
                        }
                        addView(viewLJI3);
                        measureChildWithMargins(viewLJI3, 0, 0);
                        int decoratedMeasuredWidth3 = getDecoratedMeasuredWidth(viewLJI3) + paddingStart3 + layoutParams2.getMarginStart();
                        int decoratedMeasuredHeight4 = getDecoratedMeasuredHeight(viewLJI3) + paddingTop2 + layoutParams2.topMargin + layoutParams2.bottomMargin;
                        if (decoratedMeasuredWidth3 > width2) {
                            paddingStart3 = getPaddingStart();
                            decoratedMeasuredWidth3 = layoutParams2.getMarginStart() + getDecoratedMeasuredWidth(viewLJI3) + paddingStart3;
                            int i4 = decoratedMeasuredHeight4 + this.LLJ;
                            decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewLJI3) + i4 + layoutParams2.topMargin + layoutParams2.bottomMargin;
                            paddingTop2 = i4;
                        } else {
                            decoratedMeasuredHeight = decoratedMeasuredHeight4;
                        }
                        int i5 = paddingStart3;
                        paddingStart3 = layoutParams2.getMarginEnd() + decoratedMeasuredWidth3;
                        layoutDecoratedWithMargins(viewLJI3, i5, paddingTop2, paddingStart3, decoratedMeasuredHeight);
                    }
                    return;
                }
                return;
            }
            super.onLayoutChildren(c21673319rv, c21673919s1);
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        if (this.LLJI) {
            setMeasuredDimension(RecyclerView.LayoutManager.chooseSize(i, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), RecyclerView.LayoutManager.chooseSize(i2, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
            return;
        }
        super.setMeasuredDimension(rect, i, i2);
    }
}
