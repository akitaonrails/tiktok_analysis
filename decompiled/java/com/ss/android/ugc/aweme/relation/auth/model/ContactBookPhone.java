package com.ss.android.ugc.aweme.relation.auth.model;

import X.C09CT;
import X.C09DE;

/* JADX INFO: loaded from: classes31.dex */
public final class ContactBookPhone {

    @C09CT("region_source")
    @C09DE
    public final String countryCodeSource;

    @C09CT("hashed_phone_e164")
    @C09DE
    public final String hashE164PhoneNumber;

    @C09CT("hashed_phone")
    @C09DE
    public final String hashNationalNumber;

    @C09CT("region_code")
    @C09DE
    public final String hashRegionCode;

    public ContactBookPhone() {
        this(null, null, null, null);
    }

    public ContactBookPhone(String str, String str2, String str3, String str4) {
        this.hashNationalNumber = str;
        this.hashRegionCode = str2;
        this.hashE164PhoneNumber = str3;
        this.countryCodeSource = str4;
    }
}
