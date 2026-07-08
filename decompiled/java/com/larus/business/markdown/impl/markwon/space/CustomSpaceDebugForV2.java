package com.larus.business.markdown.impl.markwon.space;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;

/* JADX INFO: loaded from: classes32.dex */
public final class CustomSpaceDebugForV2 extends LineBackgroundSpan.Standard {
    public final int level;

    public CustomSpaceDebugForV2(int i, int i2) {
        super(i);
        this.level = i2;
    }

    @Override // android.text.style.LineBackgroundSpan.Standard, android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        super.drawBackground(canvas, paint, i, i2, i3, i4, i5, charSequence, i6, i7, i8);
    }
}
