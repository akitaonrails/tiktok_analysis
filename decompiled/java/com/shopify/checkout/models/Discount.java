package com.shopify.checkout.models;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class Discount {

    @C09CT("amount")
    public final Money amount;

    @C09CT("applicationType")
    public final String applicationType;

    @C09CT("title")
    public final String title;

    @C09CT("value")
    public final Float value;

    @C09CT("valueType")
    public final String valueType;

    public Discount(String str, Money money, String str2, String str3, Float f) {
        this.title = str;
        this.amount = money;
        this.applicationType = str2;
        this.valueType = str3;
        this.value = f;
    }
}
