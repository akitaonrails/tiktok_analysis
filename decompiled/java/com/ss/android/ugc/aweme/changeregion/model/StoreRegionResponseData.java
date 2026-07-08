package com.ss.android.ugc.aweme.changeregion.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class StoreRegionResponseData {

    @C09CT("localized_country_name")
    public final String countryName;

    @C09CT("enabled_region_option")
    public final boolean enabledRegionOption;

    @C09CT("store_region")
    public final String storeRegion;

    public StoreRegionResponseData() {
        this(null, null, true);
    }

    public StoreRegionResponseData(String str, String str2, boolean z) {
        this.storeRegion = str;
        this.countryName = str2;
        this.enabledRegionOption = z;
    }
}
