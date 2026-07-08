package com.ss.android.ugc.aweme.foundation.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class CurrencyFormat implements Serializable {

    @C09CT("code")
    public final String code;

    @C09CT("decimal")
    public final String decimal;

    @C09CT("fraction")
    public final Integer fraction;

    @C09CT("grapheme")
    public final String grapheme;

    @C09CT("template")
    public final String template;

    @C09CT("thousand")
    public final String thousand;

    public CurrencyFormat(String str, String str2, String str3, Integer num, String str4, String str5) {
        this.decimal = str;
        this.thousand = str2;
        this.code = str3;
        this.fraction = num;
        this.grapheme = str4;
        this.template = str5;
    }
}
