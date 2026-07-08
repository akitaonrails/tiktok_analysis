package com.ss.android.ugc.aweme.commercialize.chatagent.common.ui.markdown.style;

import X.C0OBG;
import X.C426420Gno;
import X.InterfaceC418110GaP;
import X.InterfaceC418230Gab;
import X.InterfaceC431120GvO;
import android.text.style.UnderlineSpan;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class LinkUnderLineSpan extends UnderlineSpan implements InterfaceC431120GvO, InterfaceC418110GaP {
    public final Map<String, Object> extraInfo;
    public final InterfaceC418230Gab onSpanClick;
    public final CharSequence text;
    public final CharSequence url;
    public static final C426420Gno Companion = new Object() { // from class: X.0Gno
    };
    public static final int $stable = 8;

    @Override // X.InterfaceC431120GvO
    public final void LIZ() {
    }

    @Override // X.InterfaceC431120GvO
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC431120GvO
    public final void LIZJ() {
    }

    @Override // X.InterfaceC431120GvO
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC431120GvO
    public final void LJ() {
    }

    @Override // X.InterfaceC431120GvO
    public final void onClick(View view) {
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> map = this.extraInfo;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("origin_url", this.url);
        InterfaceC418230Gab interfaceC418230Gab = this.onSpanClick;
        if (interfaceC418230Gab != null) {
            interfaceC418230Gab.LIZIZ(this, this.text, linkedHashMap);
        }
    }

    public LinkUnderLineSpan(CharSequence charSequence, CharSequence charSequence2, InterfaceC418230Gab interfaceC418230Gab, Map<String, ? extends Object> map) {
        this.text = charSequence;
        this.url = charSequence2;
        this.onSpanClick = interfaceC418230Gab;
        this.extraInfo = map;
    }
}
