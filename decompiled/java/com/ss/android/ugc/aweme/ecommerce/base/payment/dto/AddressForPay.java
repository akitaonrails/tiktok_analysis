package com.ss.android.ugc.aweme.ecommerce.base.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressForPay {

    @C09CT("billing_city")
    public final String city;

    @C09CT("billing_postal_code")
    public final String postalCode;

    @C09CT("billing_country_region")
    public final String region;

    @C09CT("billing_state")
    public final String state;

    @C09CT("billing_street")
    public final String street;

    public AddressForPay(String str, String str2, String str3, String str4, String str5) {
        this.region = str;
        this.state = str2;
        this.city = str3;
        this.street = str4;
        this.postalCode = str5;
    }
}
