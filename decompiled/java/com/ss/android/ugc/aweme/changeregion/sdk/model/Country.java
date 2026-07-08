package com.ss.android.ugc.aweme.changeregion.sdk.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class Country {

    @C09CT("country_code")
    public final String code;

    @C09CT("localized_country_name")
    public final String name;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Country)) {
            return false;
        }
        Country country = (Country) obj;
        return Intrinsics.LJFF(this.code, country.code) && Intrinsics.LJFF(this.name, country.name);
    }

    public Country() {
        this("", "");
    }

    public Country(String str, String str2) {
        this.code = str;
        this.name = str2;
    }
}
