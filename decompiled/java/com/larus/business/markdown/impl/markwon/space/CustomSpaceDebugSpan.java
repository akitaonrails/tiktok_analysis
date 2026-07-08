package com.larus.business.markdown.impl.markwon.space;

import X.C01GW;
import X.C2188811AlT;
import X.C452501pT;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CustomSpaceDebugSpan extends LineBackgroundSpan.Standard {
    public final String debugInfo;
    public final C01GW textPaint$delegate;

    public CustomSpaceDebugSpan(int i, String str) {
        super(i);
        this.debugInfo = str;
        this.textPaint$delegate = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(95));
    }

    @Override // android.text.style.LineBackgroundSpan.Standard, android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        super.drawBackground(canvas, paint, i, i2, i3, i4, i5, charSequence, i6, i7, i8);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f = i;
        float f2 = fontMetricsInt.top + i4;
        float f3 = i2;
        canvas.drawLine(f, f2, f3, f2, (Paint) this.textPaint$delegate.getValue());
        float f4 = fontMetricsInt.ascent + i4;
        canvas.drawLine(f, f4, f3, f4, (Paint) this.textPaint$delegate.getValue());
        float f5 = fontMetricsInt.descent + i4;
        canvas.drawLine(f, f5, f3, f5, (Paint) this.textPaint$delegate.getValue());
        float f6 = fontMetricsInt.bottom + i4;
        canvas.drawLine(f, f6, f3, f6, (Paint) this.textPaint$delegate.getValue());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("top:");
        sbLIZ.append(fontMetricsInt.top);
        sbLIZ.append(", ascent:");
        sbLIZ.append(fontMetricsInt.ascent);
        sbLIZ.append(", baseline:");
        sbLIZ.append(i4);
        sbLIZ.append(", descent:");
        sbLIZ.append(fontMetricsInt.descent);
        sbLIZ.append(", bottom:");
        sbLIZ.append(fontMetricsInt.bottom);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.debugInfo);
        sbLIZ2.append(strLIZIZ);
        canvas.drawText(C2188811AlT.LIZIZ(sbLIZ2), f, i5, (Paint) this.textPaint$delegate.getValue());
    }
}
