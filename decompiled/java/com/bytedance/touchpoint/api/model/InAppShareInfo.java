package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class InAppShareInfo {

    @C09CT("cash_number")
    public final Integer cashNumber;

    @C09CT("currency_symbol")
    public final String currencySymbol;

    @C09CT("image")
    public final String image;

    @C09CT("link")
    public final String link;

    public InAppShareInfo(String str, String str2, String str3, Integer num) {
        this.link = str;
        this.image = str2;
        this.currencySymbol = str3;
        this.cashNumber = num;
    }
}
