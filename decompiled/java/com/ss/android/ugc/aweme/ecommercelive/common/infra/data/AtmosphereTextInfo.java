package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class AtmosphereTextInfo {

    @C09CT("is_italic")
    public final boolean isItalic;

    @C09CT("text")
    public final String text;

    @C09CT("client_text_color")
    public final String textColor;

    @C09CT("text_font")
    public final Integer textFont;

    public AtmosphereTextInfo() {
        this("", null, false, null);
    }

    public AtmosphereTextInfo(String str, Integer num, boolean z, String str2) {
        this.text = str;
        this.textFont = num;
        this.isItalic = z;
        this.textColor = str2;
    }
}
