package com.ss.android.ugc.aweme.views;

import X.C16GH;
import X.C462630ICf;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes32.dex */
public class RoundingCornerLayoutLL extends LinearLayout {
    public final C16GH LL;

    public RoundingCornerLayoutLL(Context context) {
        this(context, null, 6);
    }

    public RoundingCornerLayoutLL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final float[] getCornerRadius() {
        return this.LL.LIZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.LL.LIZIZ);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.clipPath(this.LL.LIZIZ);
        super.onDraw(canvas);
    }

    public final void setCornerRadius(float[] fArr) {
        this.LL.LIZ = fArr;
    }

    public void setRoundingParams(C462630ICf c462630ICf) {
        this.LL.LIZ(c462630ICf, getWidth(), getHeight());
        invalidate();
    }

    public RoundingCornerLayoutLL(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = new C16GH();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LL.LIZIZ(getWidth(), getHeight());
        invalidate();
    }
}
