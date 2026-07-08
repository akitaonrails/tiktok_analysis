package com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.typewriter;

import X.InterfaceC445170Hcx;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: loaded from: classes7.dex */
public final class ForegroundAlphaSpan extends ForegroundColorSpan implements InterfaceC445170Hcx {
    public static final int $stable = 8;
    public final int alpha;

    @Override // X.InterfaceC445170Hcx
    public final int LIZ() {
        return this.alpha;
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha(this.alpha);
    }

    public ForegroundAlphaSpan(int i, int i2) {
        super(i);
        this.alpha = i2;
    }
}
