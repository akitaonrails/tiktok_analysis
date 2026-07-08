package io.noties.markwon.core.spans;

import X.C448860Hiu;
import X.InterfaceC328600CuQ;
import X.InterfaceC431020GvE;
import X.InterfaceC445270Hd7;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class CustomLinkSpan extends LinkSpan implements InterfaceC431020GvE {
    public final boolean needUnderLine;
    public InterfaceC328600CuQ onSpanClickListener;
    public CharSequence title;
    public final Typeface typeface;
    public final int underlineColor;

    @Override // X.InterfaceC431020GvE
    public final void LIZJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJFF(InterfaceC328600CuQ interfaceC328600CuQ) {
        this.onSpanClickListener = interfaceC328600CuQ;
    }

    @Override // io.noties.markwon.core.spans.LinkSpan, android.text.style.URLSpan, android.text.style.ClickableSpan, X.InterfaceC431020GvE
    public final void onClick(View view) {
        InterfaceC328600CuQ interfaceC328600CuQ = this.onSpanClickListener;
        if (interfaceC328600CuQ != null) {
            interfaceC328600CuQ.LIZ(view, this, this.link, this.title);
        }
        super.onClick(view);
    }

    @Override // io.noties.markwon.core.spans.LinkSpan, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Typeface typeface = this.typeface;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }

    public CustomLinkSpan(C448860Hiu c448860Hiu, String str, InterfaceC445270Hd7 interfaceC445270Hd7, int i, boolean z, Typeface typeface) {
        super(c448860Hiu, str, null, interfaceC445270Hd7);
        this.underlineColor = i;
        this.needUnderLine = z;
        this.typeface = typeface;
    }
}
