package com.bytedance.i18n.location.api;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ReversedGeo {

    @C09CT("admin_area")
    public final String adminArea;

    @C09CT("city_name")
    public final String cityName;

    @C09CT("country_code")
    public final String countryCode;

    @C09CT("country_name")
    public final String countryName;

    @C09CT("district_name")
    public final String districtName;

    @C09CT("sub_admin_area")
    public final String subAdminArea;

    @C09CT("zip_code")
    public final String zipCode;

    public ReversedGeo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.countryName = str;
        this.adminArea = str2;
        this.subAdminArea = str3;
        this.cityName = str4;
        this.districtName = str5;
        this.countryCode = str6;
        this.zipCode = str7;
    }
}
