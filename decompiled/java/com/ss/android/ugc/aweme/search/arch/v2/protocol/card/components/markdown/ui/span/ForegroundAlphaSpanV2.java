package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.ui.span;

import X.C13LZ;
import X.InterfaceC445170Hcx;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: loaded from: classes7.dex */
public final class ForegroundAlphaSpanV2 extends ForegroundColorSpan implements InterfaceC445170Hcx {
    public static final int $stable = 8;
    public int mutableAlpha;

    @Override // X.InterfaceC445170Hcx
    public final int LIZ() {
        return this.mutableAlpha;
    }

    public ForegroundAlphaSpanV2(int i) {
        super(-16777216);
        this.mutableAlpha = i;
    }

    public final void LIZIZ(int i) {
        this.mutableAlpha = C13LZ.LJ(i, 0, 255);
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha(this.mutableAlpha);
    }
}
