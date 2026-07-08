package com.ss.android.ugc.aweme.feed.adapter.widget.aisummary;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: loaded from: classes13.dex */
public final class AlphaSpan extends ForegroundColorSpan {
    public static final int $stable = 8;
    public int alpha;

    public AlphaSpan(int i) {
        super(-16777216);
        this.alpha = i;
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor((textPaint.getColor() & 16777215) | (this.alpha << 24));
    }
}
