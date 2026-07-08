package com.ss.android.ugc.aweme.ecommerce.core.view.skc;

import X.C0C64;
import X.C1744760vVK;
import X.C1AF0;
import X.C21673319rv;
import X.C21673919s1;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public final class SkuExpandableFlowLayoutManager extends SkuFlowLayoutManager {
    public View LLILLL;
    public int LLILZ;
    public RecyclerView.LayoutParams LLILZIL;
    public boolean LLILLJJLI = true;
    public final boolean LLILZLL = C0C64.LJIILLIIL().LJIIIZ(31744, "sku_perf_opt_v1_fix", true, false);

    public final void LJIILIIL(View view) {
        try {
            addView(view);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            removeView(view);
            addView(view);
            C1AF0.LJFF(e, "addViewSafe");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuFlowLayoutManager
    public final void LJIIL(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        RecyclerView.LayoutParams layoutParams;
        int iLIZIZ;
        ViewGroup.MarginLayoutParams layoutParams2;
        int i;
        int decoratedMeasuredHeight;
        View childAt;
        ViewGroup.MarginLayoutParams layoutParams3;
        int iLIZIZ2;
        ViewGroup.MarginLayoutParams layoutParams4;
        int decoratedMeasuredHeight2;
        View childAt2;
        ViewGroup.MarginLayoutParams layoutParams5;
        View view;
        if (this.LLILZLL && (view = this.LLILLL) != null) {
            removeAndRecycleView(view, c21673319rv);
        }
        View viewLJI = c21673319rv.LJI(c21673919s1.LIZIZ() - 1);
        this.LLILLL = viewLJI;
        boolean z = this.LLILZLL;
        int i2 = 0;
        if ((!z || this.LLILZIL == null) && viewLJI != null) {
            LJIILIIL(viewLJI);
            measureChildWithMargins(viewLJI, 0, 0);
            this.LLILZ = getDecoratedMeasuredWidth(viewLJI);
            ViewGroup.LayoutParams layoutParams6 = viewLJI.getLayoutParams();
            if (!(layoutParams6 instanceof RecyclerView.LayoutParams) || (layoutParams = (RecyclerView.LayoutParams) layoutParams6) == null) {
                layoutParams = new RecyclerView.LayoutParams(0, 0);
            }
            this.LLILZIL = layoutParams;
            if (z) {
                removeAndRecycleView(viewLJI, c21673319rv);
            } else {
                removeView(viewLJI);
            }
        }
        View view2 = this.LLILLL;
        RecyclerView.LayoutParams layoutParams7 = this.LLILZIL;
        if (view2 != null && layoutParams7 != null) {
            int width = getWidth() - getPaddingEnd();
            if (C1744760vVK.LIZ()) {
                int paddingStart = width - getPaddingStart();
                int paddingTop = getPaddingTop();
                if (this.LLILLJJLI) {
                    iLIZIZ2 = c21673919s1.LIZIZ() - 1;
                } else {
                    iLIZIZ2 = c21673919s1.LIZIZ();
                }
                int i3 = 0;
                int i4 = 0;
                if (width > 0) {
                    while (i4 >= 0 && i4 < iLIZIZ2) {
                        View viewLJI2 = c21673319rv.LJI(i4);
                        ViewGroup.LayoutParams layoutParams8 = viewLJI2.getLayoutParams();
                        if (!(layoutParams8 instanceof RecyclerView.LayoutParams) || (layoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams8) == null) {
                            layoutParams4 = new RecyclerView.LayoutParams(i2, i2);
                        }
                        LJIILIIL(viewLJI2);
                        measureChildWithMargins(viewLJI2, i2, i2);
                        int decoratedMeasuredWidth = (paddingStart - getDecoratedMeasuredWidth(viewLJI2)) - layoutParams4.getMarginStart();
                        int decoratedMeasuredHeight3 = paddingTop + getDecoratedMeasuredHeight(viewLJI2) + layoutParams4.topMargin + layoutParams4.bottomMargin;
                        if (decoratedMeasuredWidth < 0) {
                            if (i3 == 1 && this.LLILLJJLI) {
                                removeAndRecycleView(viewLJI2, c21673319rv);
                                LJIILIIL(view2);
                                measureChildWithMargins(view2, i2, i2);
                                layoutDecoratedWithMargins(view2, ((paddingStart - getDecoratedMeasuredWidth(view2)) - layoutParams7.getMarginStart()) - layoutParams7.getMarginEnd(), paddingTop, paddingStart, decoratedMeasuredHeight3);
                                return;
                            }
                            paddingStart = width - getPaddingStart();
                            decoratedMeasuredWidth = (paddingStart - getDecoratedMeasuredWidth(viewLJI2)) - layoutParams4.getMarginStart();
                            int i5 = decoratedMeasuredHeight3 + this.LL;
                            decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewLJI2) + i5 + layoutParams4.topMargin + layoutParams4.bottomMargin;
                            i3++;
                            paddingTop = i5;
                        } else {
                            decoratedMeasuredHeight2 = decoratedMeasuredHeight3;
                        }
                        int marginEnd = decoratedMeasuredWidth - layoutParams4.getMarginEnd();
                        layoutDecoratedWithMargins(viewLJI2, marginEnd, paddingTop, paddingStart, decoratedMeasuredHeight2);
                        if (this.LLILLJJLI && i3 == 1 && i4 < iLIZIZ2 - 1) {
                            paddingStart = marginEnd;
                            boolean z2 = false;
                            while ((paddingStart - this.LLILZ) - layoutParams7.getMarginStart() < 0 && (childAt2 = getChildAt(getChildCount() - 1)) != null) {
                                ViewGroup.LayoutParams layoutParams9 = childAt2.getLayoutParams();
                                if (!(layoutParams9 instanceof RecyclerView.LayoutParams) || (layoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams9) == null) {
                                    layoutParams5 = new RecyclerView.LayoutParams(0, 0);
                                }
                                removeAndRecycleView(childAt2, c21673319rv);
                                paddingStart = paddingStart + getDecoratedMeasuredWidth(childAt2) + layoutParams5.getMarginStart() + layoutParams5.getMarginEnd();
                                z2 = true;
                            }
                            if (z2) {
                                LJIILIIL(view2);
                                measureChildWithMargins(view2, 0, 0);
                                layoutDecoratedWithMargins(view2, ((paddingStart - getDecoratedMeasuredWidth(view2)) - layoutParams7.getMarginStart()) - layoutParams7.getMarginEnd(), paddingTop, paddingStart, decoratedMeasuredHeight2);
                                return;
                            }
                        } else {
                            paddingStart = marginEnd;
                        }
                        i4++;
                        i2 = 0;
                    }
                    return;
                }
                return;
            }
            int paddingStart2 = getPaddingStart();
            int paddingTop2 = getPaddingTop();
            if (this.LLILLJJLI) {
                iLIZIZ = c21673919s1.LIZIZ() - 1;
            } else {
                iLIZIZ = c21673919s1.LIZIZ();
            }
            int i6 = 0;
            if (width <= 0) {
                return;
            }
            while (i2 >= 0 && i2 < iLIZIZ) {
                View viewLJI3 = c21673319rv.LJI(i2);
                ViewGroup.LayoutParams layoutParams10 = viewLJI3.getLayoutParams();
                if ((layoutParams10 instanceof RecyclerView.LayoutParams) && (layoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams10) != null) {
                    i = 0;
                } else {
                    i = 0;
                    layoutParams2 = new RecyclerView.LayoutParams(0, 0);
                }
                LJIILIIL(viewLJI3);
                measureChildWithMargins(viewLJI3, i, i);
                int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewLJI3) + paddingStart2 + layoutParams2.getMarginStart();
                int decoratedMeasuredHeight4 = getDecoratedMeasuredHeight(viewLJI3) + paddingTop2 + layoutParams2.topMargin + layoutParams2.bottomMargin;
                if (decoratedMeasuredWidth2 > width) {
                    if (i6 == 1 && this.LLILLJJLI) {
                        removeAndRecycleView(viewLJI3, c21673319rv);
                        LJIILIIL(view2);
                        measureChildWithMargins(view2, 0, 0);
                        layoutDecoratedWithMargins(view2, paddingStart2, paddingTop2, getDecoratedMeasuredWidth(view2) + paddingStart2 + layoutParams7.getMarginStart() + layoutParams7.getMarginEnd(), decoratedMeasuredHeight4);
                        return;
                    }
                    paddingStart2 = getPaddingStart();
                    decoratedMeasuredWidth2 = layoutParams2.getMarginStart() + getDecoratedMeasuredWidth(viewLJI3) + paddingStart2;
                    int i7 = decoratedMeasuredHeight4 + this.LL;
                    decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewLJI3) + i7 + layoutParams2.topMargin + layoutParams2.bottomMargin;
                    i6++;
                    paddingTop2 = i7;
                } else {
                    decoratedMeasuredHeight = decoratedMeasuredHeight4;
                }
                int marginEnd2 = decoratedMeasuredWidth2 + layoutParams2.getMarginEnd();
                layoutDecoratedWithMargins(viewLJI3, paddingStart2, paddingTop2, marginEnd2, decoratedMeasuredHeight);
                if (this.LLILLJJLI && i6 == 1 && i2 < iLIZIZ - 1) {
                    paddingStart2 = marginEnd2;
                    boolean z3 = false;
                    while (this.LLILZ + paddingStart2 + layoutParams7.getMarginStart() > width && (childAt = getChildAt(getChildCount() - 1)) != null) {
                        ViewGroup.LayoutParams layoutParams11 = childAt.getLayoutParams();
                        if (!(layoutParams11 instanceof RecyclerView.LayoutParams) || (layoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams11) == null) {
                            layoutParams3 = new RecyclerView.LayoutParams(0, 0);
                        }
                        removeAndRecycleView(childAt, c21673319rv);
                        paddingStart2 = ((paddingStart2 - getDecoratedMeasuredWidth(childAt)) - layoutParams3.getMarginStart()) - layoutParams3.getMarginEnd();
                        z3 = true;
                    }
                    if (z3) {
                        LJIILIIL(view2);
                        measureChildWithMargins(view2, 0, 0);
                        layoutDecoratedWithMargins(view2, paddingStart2, paddingTop2, getDecoratedMeasuredWidth(view2) + paddingStart2 + layoutParams7.getMarginStart() + layoutParams7.getMarginEnd(), decoratedMeasuredHeight);
                        return;
                    }
                } else {
                    paddingStart2 = marginEnd2;
                }
                i2++;
            }
        }
    }
}
