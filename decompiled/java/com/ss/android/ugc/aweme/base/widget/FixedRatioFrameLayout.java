package com.ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: loaded from: classes30.dex */
public class FixedRatioFrameLayout extends FrameLayout {
    public int LL;
    public float LLILLJJLI;

    public int getMode() {
        return this.LL;
    }

    public float getWhRatio() {
        return this.LLILLJJLI;
    }

    public FixedRatioFrameLayout(Context context) {
        this(context, null);
    }

    public void setMode(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("mode must be either FIXED_HEIGHT or FIXED_WIDTH");
        }
        if (this.LL != i) {
            this.LL = i;
            requestLayout();
        }
    }

    public void setWhRatio(float f) {
        if (f >= 0.0f) {
            if (this.LLILLJJLI != f) {
                this.LLILLJJLI = f;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("whRatio must be positive.");
    }

    public FixedRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FixedRatioFrameLayout, 0, 0);
        this.LL = typedArrayObtainStyledAttributes.getInteger(R$styleable.FixedRatioFrameLayout_frMode, 1);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getFloat(R$styleable.FixedRatioFrameLayout_whRatio, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingBottom()) - getPaddingTop();
        if (this.LL == 0) {
            int i3 = (int) ((size2 * this.LLILLJJLI) + 0.5f);
            if (i3 != size) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec((int) ((size / this.LLILLJJLI) + 0.5f), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
