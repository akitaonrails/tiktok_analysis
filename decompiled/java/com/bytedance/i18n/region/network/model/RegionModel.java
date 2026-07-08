package com.bytedance.i18n.region.network.model;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class RegionModel {

    @C09CT("Country")
    public final CountryModel country;

    @C09CT("LocateMethod")
    public final String locateMethod;

    public RegionModel(CountryModel countryModel, String str) {
        this.country = countryModel;
        this.locateMethod = str;
    }
}
