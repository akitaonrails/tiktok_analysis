package com.ss.android.ugc.aweme.views;

import X.C421140GfI;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: loaded from: classes7.dex */
public class RoundedFrameLayout extends FrameLayout {
    public int LL;
    public boolean LLILLJJLI;

    public RoundedFrameLayout() {
        throw null;
    }

    public void setBorderRadius(int i) {
        setRadius(i);
    }

    public void setRadius(int i) {
        this.LL = i;
        LIZ(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setRoundAsCircle(boolean z) {
        this.LLILLJJLI = z;
        LIZ(getMeasuredWidth(), getMeasuredHeight());
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZ(int i, int i2) {
        if (this.LLILLJJLI) {
            setClipToOutline(true);
            setOutlineProvider(new ViewOutlineProvider() { // from class: X.0GfJ
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    int iMin = Math.min(view.getWidth(), view.getHeight());
                    outline.setOval(0, 0, iMin, iMin);
                }
            });
        } else if (this.LL > 0) {
            setClipToOutline(true);
            setOutlineProvider(new C421140GfI(this.LL, i, i2));
        } else {
            setClipToOutline(false);
            setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        }
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.RoundedView, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.RoundedView_rounded_radius)) {
            this.LL = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RoundedView_rounded_radius, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZ(i, i2);
    }
}
