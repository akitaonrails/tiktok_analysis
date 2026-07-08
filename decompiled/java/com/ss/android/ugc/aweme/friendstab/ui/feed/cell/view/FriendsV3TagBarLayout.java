package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class FriendsV3TagBarLayout extends LinearLayout {
    public int LL;

    public FriendsV3TagBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int getMaxBarWidth() {
        return this.LL;
    }

    public final void setMaxBarWidth(int i) {
        if (this.LL != i) {
            this.LL = i;
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin;
        int marginEnd;
        int marginEnd2;
        if (this.LL > 0 && getChildCount() != 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 0) {
                iMin = this.LL;
            } else {
                iMin = Math.min(size, this.LL);
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
            int childCount = getChildCount();
            int iMax = 0;
            boolean z = false;
            int measuredWidth = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != 0) {
                    View childAt = getChildAt(i3);
                    if (childAt.getVisibility() != 8) {
                        measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i2, 0);
                        if (childAt.getMeasuredWidth() != 0) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                            measuredWidth += childAt.getMeasuredWidth() + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
                            iMax = Math.max(iMax, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                            z = true;
                        }
                    }
                }
            }
            View childAt2 = getChildAt(0);
            if (childAt2 != null && childAt2.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
                if (z) {
                    marginEnd2 = marginLayoutParams2.getMarginEnd();
                } else {
                    marginEnd2 = 0;
                }
                int paddingStart = ((((iMin - getPaddingStart()) - getPaddingEnd()) - measuredWidth) - marginLayoutParams2.getMarginStart()) - marginEnd2;
                if (paddingStart < 0) {
                    paddingStart = 0;
                }
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(paddingStart, Integer.MIN_VALUE), LinearLayout.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin, marginLayoutParams2.height));
                iMax = Math.max(iMax, childAt2.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
            }
            int paddingStart2 = getPaddingStart() + getPaddingEnd();
            int childCount2 = getChildCount();
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt3 = getChildAt(i4);
                if (childAt3.getVisibility() != 8 && (i4 == 0 || childAt3.getMeasuredWidth() != 0)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) childAt3.getLayoutParams();
                    if (i4 == 0 && !z) {
                        marginEnd = 0;
                    } else {
                        marginEnd = marginLayoutParams3.getMarginEnd();
                    }
                    paddingStart2 += childAt3.getMeasuredWidth() + marginLayoutParams3.getMarginStart() + marginEnd;
                }
            }
            if (mode != 1073741824) {
                size = Math.min(paddingStart2, iMin);
            }
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 1073741824) {
                    size2 = iMax + getPaddingTop() + getPaddingBottom();
                }
            } else {
                size2 = Math.min(iMax + getPaddingTop() + getPaddingBottom(), size2);
            }
            setMeasuredDimension(size, size2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public FriendsV3TagBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setOrientation(0);
        setGravity(16);
        this.LL = -1;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean z2;
        int paddingStart;
        int marginEnd;
        int measuredWidth;
        if (getChildCount() == 0) {
            return;
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            i5 = 8;
            if (i6 < childCount) {
                if (i6 != 0) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && childAt.getMeasuredWidth() > 0) {
                        z2 = true;
                        break;
                    }
                }
                i6++;
            } else {
                z2 = false;
                break;
            }
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = ((i4 - i2) - getPaddingBottom()) - paddingTop;
        if (getLayoutDirection() == 1) {
            paddingStart = getWidth() - getPaddingEnd();
        } else {
            paddingStart = getPaddingStart();
        }
        int childCount2 = getChildCount();
        int i7 = 0;
        int i8 = 0;
        while (i7 < childCount2) {
            View childAt2 = getChildAt(i7);
            if (childAt2.getVisibility() != i5 && (i7 == 0 || childAt2.getMeasuredWidth() != 0)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
                if (i7 == 0 && !z2) {
                    marginEnd = 0;
                } else {
                    marginEnd = marginLayoutParams.getMarginEnd();
                }
                int measuredHeight = childAt2.getMeasuredHeight();
                int i9 = marginLayoutParams.topMargin;
                int i10 = ((((paddingBottom - measuredHeight) - i9) - marginLayoutParams.bottomMargin) / 2) + paddingTop + i9;
                int i11 = measuredHeight + i10;
                if (getLayoutDirection() == 1) {
                    int marginStart = paddingStart - (i8 + marginLayoutParams.getMarginStart());
                    measuredWidth = marginStart - childAt2.getMeasuredWidth();
                    childAt2.layout(measuredWidth, i10, marginStart, i11);
                } else {
                    int marginStart2 = paddingStart + i8 + marginLayoutParams.getMarginStart();
                    measuredWidth = childAt2.getMeasuredWidth() + marginStart2;
                    childAt2.layout(marginStart2, i10, measuredWidth, i11);
                }
                paddingStart = measuredWidth;
                i8 = marginEnd;
            }
            i7++;
            i5 = 8;
        }
    }
}
