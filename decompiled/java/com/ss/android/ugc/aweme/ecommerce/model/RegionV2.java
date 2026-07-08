package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class RegionV2 {

    @C09CT("code")
    public final String code;

    @C09CT("district_key")
    public final String districtKey;

    @C09CT("geoname_id")
    public final String geoNameId;

    @C09CT("name")
    public final String name;

    public RegionV2() {
        this(null, null, null, null);
    }

    public RegionV2(String str, String str2, String str3, String str4) {
        this.name = str;
        this.geoNameId = str2;
        this.code = str3;
        this.districtKey = str4;
    }
}
