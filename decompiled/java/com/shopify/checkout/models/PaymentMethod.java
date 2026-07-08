package com.shopify.checkout.models;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class PaymentMethod {

    @C09CT("billingAddress")
    public final Address billingAddress;

    @C09CT("cardType")
    public final String cardType;

    @C09CT("expirationMonth")
    public final String expirationMonth;

    @C09CT("expirationYear")
    public final String expirationYear;

    @C09CT("lastFourDigits")
    public final String lastFourDigits;

    @C09CT("referenceId")
    public final String referenceId;

    public PaymentMethod(String str, String str2, String str3, String str4, String str5, Address address) {
        this.referenceId = str;
        this.cardType = str2;
        this.lastFourDigits = str3;
        this.expirationMonth = str4;
        this.expirationYear = str5;
        this.billingAddress = address;
    }
}
