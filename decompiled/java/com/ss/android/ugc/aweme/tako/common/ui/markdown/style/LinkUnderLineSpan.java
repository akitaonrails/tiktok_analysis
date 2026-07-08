package com.ss.android.ugc.aweme.tako.common.ui.markdown.style;

import X.C0OBG;
import X.C418190GaX;
import X.C426410Gnn;
import X.InterfaceC418240Gac;
import X.InterfaceC418250Gad;
import X.InterfaceC430960Gv8;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class LinkUnderLineSpan extends UnderlineSpan implements InterfaceC430960Gv8, InterfaceC418250Gad {
    public final Map<String, Object> extraInfo;
    public final InterfaceC418240Gac onSpanClick;
    public final CharSequence text;
    public final CharSequence url;
    public static final C426410Gnn Companion = new Object() { // from class: X.0Gnn
    };
    public static final int $stable = 8;

    @Override // X.InterfaceC430960Gv8
    public final void LIZ() {
    }

    @Override // X.InterfaceC430960Gv8
    public final void LIZJ(TextView textView, Spanned spanned, int i) {
    }

    @Override // X.InterfaceC430960Gv8
    public final void LJ(TextView textView, Spanned spanned, int i) {
    }

    @Override // X.InterfaceC430960Gv8
    public final float LJFF(float f) {
        return 0.0f;
    }

    @Override // X.InterfaceC430960Gv8
    public final void LJII(TextView textView, Spanned spanned, int i) {
    }

    @Override // X.InterfaceC418250Gad
    public final int getType() {
        return 1004;
    }

    @Override // X.InterfaceC418250Gad
    public final boolean LJI() {
        return C418190GaX.LIZ(this);
    }

    @Override // X.InterfaceC418250Gad
    public final boolean LJIIIIZZ() {
        return C418190GaX.LIZIZ(this);
    }

    @Override // X.InterfaceC430960Gv8
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
        InterfaceC418240Gac interfaceC418240Gac = this.onSpanClick;
        if (interfaceC418240Gac != null) {
            interfaceC418240Gac.LIZJ(this, this.text, linkedHashMap);
        }
    }

    public LinkUnderLineSpan(CharSequence charSequence, CharSequence charSequence2, InterfaceC418240Gac interfaceC418240Gac, Map<String, ? extends Object> map) {
        this.text = charSequence;
        this.url = charSequence2;
        this.onSpanClick = interfaceC418240Gac;
        this.extraInfo = map;
    }
}
