package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class Icon {

    @C09CT("dark_url")
    public final String darkUrl;

    @C09CT("height")
    public final Integer height;

    @C09CT("light_url")
    public final String lightUrl;

    @C09CT("rtl")
    public final boolean rtl;

    @C09CT("width")
    public final Integer width;

    public Icon() {
        this(null, null, null, null, false);
    }

    public Icon(String str, String str2, Integer num, Integer num2, boolean z) {
        this.lightUrl = str;
        this.darkUrl = str2;
        this.height = num;
        this.width = num2;
        this.rtl = z;
    }
}
