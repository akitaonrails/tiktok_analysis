package com.ss.android.ugc.aweme.editSticker.text.view;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomTypefaceSpan extends TypefaceSpan {
    public final String fontType;
    public final Typeface newTypeface;

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(this.newTypeface);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(this.newTypeface);
    }
}
