package com.ss.android.ugc.aweme.tako.common.ui.markdown.style;

import android.text.ParcelableSpan;
import android.text.TextPaint;
import android.text.style.StyleSpan;

/* JADX INFO: loaded from: classes5.dex */
public class FontSpan extends StyleSpan implements ParcelableSpan {
    public final int color;
    public final float size;

    @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        updateMeasureState(textPaint);
        textPaint.setColor(this.color);
    }

    @Override // android.text.style.StyleSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        textPaint.setTextSize(textPaint.getTextSize() * this.size);
    }
}
