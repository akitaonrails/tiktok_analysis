package io.noties.markwon.core.spans;

import X.C448860Hiu;
import X.InterfaceC445270Hd7;
import X.InterfaceC448850Hit;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class LinkSpan extends URLSpan {
    public final Map<String, String> extra;
    public final String link;
    public final InterfaceC445270Hd7 resolver;
    public final C448860Hiu theme;

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan, X.InterfaceC431020GvE
    public void onClick(View view) {
        InterfaceC445270Hd7 interfaceC445270Hd7 = this.resolver;
        if (interfaceC445270Hd7 instanceof InterfaceC448850Hit) {
            ((InterfaceC448850Hit) interfaceC445270Hd7).LIZIZ();
        } else {
            interfaceC445270Hd7.LIZ(view, this.link);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        C448860Hiu c448860Hiu = this.theme;
        textPaint.setUnderlineText(c448860Hiu.LIZIZ);
        int i = c448860Hiu.LIZ;
        if (i != 0) {
            textPaint.setColor(i);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public LinkSpan(C448860Hiu c448860Hiu, String str, Map<String, String> map, InterfaceC445270Hd7 interfaceC445270Hd7) {
        super(str);
        this.theme = c448860Hiu;
        this.link = str;
        this.extra = map == null ? Collections.emptyMap() : map;
        this.resolver = interfaceC445270Hd7;
    }
}
