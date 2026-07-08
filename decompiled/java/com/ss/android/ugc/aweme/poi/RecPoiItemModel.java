package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class RecPoiItemModel implements Serializable {

    @C09CT("city_code")
    public final String cityCode;

    @C09CT("city_name")
    public final String cityName;

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("country_code")
    public final String countryCode;

    @C09CT("formatted_address")
    public final String formattedAddress;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("poi_info_source")
    public final String poiInfoSource;

    @C09CT("poi_name")
    public final String poiName;

    public RecPoiItemModel() {
        this("", "", "", "", "", "", "", "");
    }

    public final String getCityCode() {
        return this.cityCode;
    }

    public final String getCityName() {
        return this.cityName;
    }

    public final String getCollectInfo() {
        return this.collectInfo;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    public final String getPoiInfoSource() {
        return this.poiInfoSource;
    }

    public final String getPoiName() {
        return this.poiName;
    }

    public RecPoiItemModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.poiId = str;
        this.poiName = str2;
        this.collectInfo = str3;
        this.cityName = str4;
        this.formattedAddress = str5;
        this.cityCode = str6;
        this.countryCode = str7;
        this.poiInfoSource = str8;
    }
}
