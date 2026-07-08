package com.ss.android.ugc.aweme.tako.ccl.model.request;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class TakoLocation {

    @C09CT("city_asci_name")
    public final String cityASCIName;

    @C09CT("country_asci_name")
    public final String countryASCIName;

    @C09CT("district_asci_name")
    public final String districtASCIName;

    public TakoLocation() {
        this(null, null, null);
    }

    public TakoLocation(String str, String str2, String str3) {
        this.countryASCIName = str;
        this.cityASCIName = str2;
        this.districtASCIName = str3;
    }
}
