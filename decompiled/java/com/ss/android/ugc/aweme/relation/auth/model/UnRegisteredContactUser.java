package com.ss.android.ugc.aweme.relation.auth.model;

import X.C09CT;
import X.C09DE;

/* JADX INFO: loaded from: classes31.dex */
public final class UnRegisteredContactUser {

    @C09CT("phone_number")
    @C09DE
    public final String hashNationalNumber;

    @C09CT("region_code")
    @C09DE
    public final String hashRegionCode;

    public UnRegisteredContactUser() {
        this(null, null);
    }

    public UnRegisteredContactUser(String str, String str2) {
        this.hashNationalNumber = str;
        this.hashRegionCode = str2;
    }
}
