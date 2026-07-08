package com.shopify.checkout.models;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class Address {

    @C09CT("address1")
    public final String address1;

    @C09CT("address2")
    public final String address2;

    @C09CT("city")
    public final String city;

    @C09CT("countryCode")
    public final String countryCode;

    @C09CT("firstName")
    public final String firstName;

    @C09CT("lastName")
    public final String lastName;

    @C09CT("name")
    public final String name;

    @C09CT("phone")
    public final String phone;

    @C09CT("postalCode")
    public final String postalCode;

    @C09CT("referenceId")
    public final String referenceId;

    @C09CT("zoneCode")
    public final String zoneCode;

    public Address() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.referenceId = str;
        this.name = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.postalCode = str5;
        this.address1 = str6;
        this.address2 = str7;
        this.city = str8;
        this.countryCode = str9;
        this.zoneCode = str10;
        this.phone = str11;
    }
}
