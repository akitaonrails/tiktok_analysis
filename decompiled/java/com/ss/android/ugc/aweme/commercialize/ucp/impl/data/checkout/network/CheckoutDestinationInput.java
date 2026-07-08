package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutDestinationInput {

    @C09CT("address_country")
    public final String addressCountry;

    @C09CT("address_locality")
    public final String addressLocality;

    @C09CT("address_region")
    public final String addressRegion;

    @C09CT("email")
    public final String email;

    @C09CT("extended_address")
    public final String extendedAddress;

    @C09CT("first_name")
    public final String firstName;

    @C09CT("last_name")
    public final String lastName;

    @C09CT("phone_number")
    public final String phoneNumber;

    @C09CT("postal_code")
    public final String postalCode;

    @C09CT("street_address")
    public final String streetAddress;

    public CheckoutDestinationInput(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.firstName = str;
        this.lastName = str2;
        this.phoneNumber = str3;
        this.streetAddress = str4;
        this.extendedAddress = str5;
        this.addressLocality = str6;
        this.addressRegion = str7;
        this.postalCode = str8;
        this.addressCountry = str9;
        this.email = str10;
    }
}
