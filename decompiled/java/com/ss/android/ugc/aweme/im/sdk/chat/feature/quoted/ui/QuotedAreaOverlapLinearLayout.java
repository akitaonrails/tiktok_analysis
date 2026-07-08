package com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class QuotedAreaOverlapLinearLayout extends LinearLayout {
    public int LL;

    public QuotedAreaOverlapLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int getOverlap() {
        return this.LL;
    }

    public final void setOverlap(int i) {
        if (i < 0) {
            i = 0;
        }
        if (this.LL != i) {
            this.LL = i;
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LL > 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight() - this.LL;
            if (measuredHeight < 0) {
                measuredHeight = 0;
            }
            setMeasuredDimension(measuredWidth, measuredHeight);
        }
    }

    public QuotedAreaOverlapLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setClipChildren(false);
        setClipToPadding(false);
    }
}
