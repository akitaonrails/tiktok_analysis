package com.ss.android.ugc.aweme.feed.survey.layoutmanager;

import X.C21673319rv;
import X.C21673919s1;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C814420VxA;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes34.dex */
public final class SurveyFlexLayoutManager extends RecyclerView.LayoutManager {
    public final Paint LL = new Paint();

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
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getLayoutDirection() {
        return C444960Hcc.LIZIZ() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int decoratedMeasuredWidth;
        View viewLJI;
        int decoratedMeasuredWidth2;
        int decoratedMeasuredHeight;
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null) {
                detachView(childAt);
            }
        }
        int width = getWidth() / 2;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < getItemCount() && i3 < 4) {
            TextView textView = (TextView) c21673319rv.LJI(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            if (marginLayoutParams == null) {
                decoratedMeasuredWidth = 0;
            } else {
                measureChildWithMargins(textView, 0, 0);
                decoratedMeasuredWidth = getDecoratedMeasuredWidth(textView) + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
            }
            addView(textView);
            int i4 = i2 + 1;
            ViewGroup.LayoutParams layoutParams = null;
            if (i4 < getItemCount()) {
                viewLJI = c21673319rv.LJI(i4);
            } else {
                viewLJI = null;
            }
            TextView textView2 = (TextView) viewLJI;
            if (textView2 != null) {
                layoutParams = textView2.getLayoutParams();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            if (textView2 != null && marginLayoutParams2 != null) {
                measureChildWithMargins(textView2, 0, 0);
                decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(textView2) + marginLayoutParams2.getMarginStart() + marginLayoutParams2.getMarginEnd();
            } else {
                decoratedMeasuredWidth2 = 0;
                if (textView2 != null) {
                }
                decoratedMeasuredHeight = getDecoratedMeasuredHeight(textView) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (decoratedMeasuredWidth2 == 0 && textView2 != null && marginLayoutParams2 != null) {
                    if (decoratedMeasuredWidth <= width && decoratedMeasuredWidth2 <= width) {
                        marginLayoutParams.width = (width - marginLayoutParams.getMarginEnd()) - marginLayoutParams.getMarginStart();
                        marginLayoutParams2.width = (width - marginLayoutParams2.getMarginEnd()) - marginLayoutParams2.getMarginStart();
                        measureChildWithMargins(textView, 0, 0);
                        measureChildWithMargins(textView2, 0, 0);
                        int i5 = i + decoratedMeasuredHeight;
                        LJIIL(textView, 0, i, width, i5);
                        LJIIL(textView2, width, i, getWidth(), i5);
                    } else if (decoratedMeasuredWidth2 + decoratedMeasuredWidth <= getWidth()) {
                        marginLayoutParams.width = (decoratedMeasuredWidth - marginLayoutParams.getMarginEnd()) - marginLayoutParams.getMarginStart();
                        marginLayoutParams2.width = ((getWidth() - decoratedMeasuredWidth) - marginLayoutParams2.getMarginEnd()) - marginLayoutParams2.getMarginStart();
                        measureChildWithMargins(textView, 0, 0);
                        measureChildWithMargins(textView2, 0, 0);
                        int i6 = i + decoratedMeasuredHeight;
                        LJIIL(textView, 0, i, decoratedMeasuredWidth, i6);
                        LJIIL(textView2, decoratedMeasuredWidth, i, getWidth(), i6);
                    } else {
                        measureChildWithMargins(textView, 0, 0);
                        measureChildWithMargins(textView2, 0, 0);
                        this.LL.set(textView.getPaint());
                        this.LL.setTextSize(11.0f);
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.LL.measureText(textView.getText().toString())))) + textView.getPaddingStart() + textView.getPaddingEnd() + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
                        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.LL.measureText(textView2.getText().toString())))) + textView2.getPaddingStart() + textView2.getPaddingEnd() + marginLayoutParams2.getMarginStart() + marginLayoutParams2.getMarginEnd();
                        int i7 = iLIZIZ + iLIZIZ2;
                        if (i7 > getWidth()) {
                            marginLayoutParams.width = (getWidth() - marginLayoutParams.getMarginEnd()) - marginLayoutParams.getMarginStart();
                            measureChildWithMargins(textView, 0, 0);
                            int i8 = i + decoratedMeasuredHeight;
                            LJIIL(textView, 0, i, getWidth(), i8);
                            i3++;
                            i2 = i4;
                            i = i8;
                        } else {
                            int width2 = (getWidth() * iLIZIZ) / i7;
                            int width3 = (getWidth() * iLIZIZ2) / i7;
                            marginLayoutParams.width = (width2 - marginLayoutParams.getMarginEnd()) - marginLayoutParams.getMarginStart();
                            marginLayoutParams2.width = (width3 - marginLayoutParams2.getMarginEnd()) - marginLayoutParams2.getMarginStart();
                            measureChildWithMargins(textView, 0, 0);
                            measureChildWithMargins(textView2, 0, 0);
                            int i9 = i + decoratedMeasuredHeight;
                            LJIIL(textView, 0, i, width2, i9);
                            LJIIL(textView2, width2, i, getWidth(), i9);
                        }
                    }
                    i += decoratedMeasuredHeight;
                    i3++;
                    i2 += 2;
                } else {
                    marginLayoutParams.width = (getWidth() - marginLayoutParams.getMarginEnd()) - marginLayoutParams.getMarginStart();
                    measureChildWithMargins(textView, 0, 0);
                    LJIIL(textView, 0, i, getWidth(), i + decoratedMeasuredHeight);
                    i += decoratedMeasuredHeight;
                    i3++;
                    i2 += 2;
                }
            }
            addView(textView2);
            decoratedMeasuredHeight = getDecoratedMeasuredHeight(textView) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            if (decoratedMeasuredWidth2 == 0) {
            }
            marginLayoutParams.width = (getWidth() - marginLayoutParams.getMarginEnd()) - marginLayoutParams.getMarginStart();
            measureChildWithMargins(textView, 0, 0);
            LJIIL(textView, 0, i, getWidth(), i + decoratedMeasuredHeight);
            i += decoratedMeasuredHeight;
            i3++;
            i2 += 2;
        }
    }

    public final void LJIIL(View view, int i, int i2, int i3, int i4) {
        if (C444960Hcc.LIZIZ()) {
            layoutDecoratedWithMargins(view, getWidth() - i3, i2, getWidth() - i, i4);
        } else {
            layoutDecoratedWithMargins(view, i, i2, i3, i4);
        }
    }
}
