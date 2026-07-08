package com.ss.android.ugc.aweme.commercialize.chatagent.common.ui.markdown.typewriter;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: loaded from: classes7.dex */
public final class ForegroundAlphaSpan extends ForegroundColorSpan {
    public static final int $stable = 8;
    public final int alpha;

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha(this.alpha);
    }

    public ForegroundAlphaSpan(int i, int i2) {
        super(i);
        this.alpha = i2;
    }
}
