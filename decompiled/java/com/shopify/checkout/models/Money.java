package com.shopify.checkout.models;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class Money {

    @C09CT("amount")
    public final float amount;

    @C09CT("currencyCode")
    public final String currencyCode;

    public Money(float f, String str) {
        this.amount = f;
        this.currencyCode = str;
    }
}
