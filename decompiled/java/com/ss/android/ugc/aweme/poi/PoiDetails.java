package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetails implements Serializable {

    @C09CT("city_code")
    public final String cityCode;

    @C09CT("city_level")
    public final String cityLevel;

    @C09CT("city_name")
    public final String cityName;

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("country_code")
    public final String countryCode;

    @C09CT("geo_name_ids")
    public final String geoNameIds;

    @C09CT("is_locality")
    public final String isLocality;

    @C09CT("locality_level")
    public final String localityLevel;

    @C09CT("poi_mapkit_collect")
    public final String poiMapkitCollect;

    @C09CT("province_code")
    public final String provinceCode;

    @C09CT("tt_type_code")
    public final String ttTypeCode;

    @C09CT("tt_type_name_medium")
    public final String ttTypeNameMedium;

    @C09CT("tt_type_name_super")
    public final String ttTypeNameSuper;

    @C09CT("tt_type_name_tiny")
    public final String ttTypeNameTiny;

    @C09CT("type")
    public final String type;

    @C09CT("type_code")
    public final String typeCode;

    @C09CT("type_level")
    public final String typeLevel;

    public PoiDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public String toString() {
        return "PoiDetails(cityCode=" + this.cityCode + ", cityLevel=" + this.cityLevel + ", cityName=" + this.cityName + ", collectInfo=" + this.collectInfo + ", countryCode=" + this.countryCode + ", isLocality=" + this.isLocality + ", localityLevel=" + this.localityLevel + ", poiMapkitCollect=" + this.poiMapkitCollect + ", provinceCode=" + this.provinceCode + ", type=" + this.type + ", typeCode=" + this.typeCode + ", typeLevel=" + this.typeLevel + ", ttTypeCode=" + this.ttTypeCode + ", geoNameIds=" + this.geoNameIds + ", ttTypeNameSuper=" + this.ttTypeNameSuper + ", ttTypeNameMedium=" + this.ttTypeNameMedium + ", ttTypeNameTiny=" + this.ttTypeNameTiny + ')';
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String poiTypeName() {
        String str = this.typeLevel;
        if (str == null) {
            return "";
        }
        switch (str.hashCode()) {
            case 49:
                return str.equals("1") ? "regional" : "";
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return str.equals("2") ? "store" : "";
            case 51:
                return str.equals("3") ? "independent" : "";
            default:
                return "";
        }
    }

    public final String isLocality() {
        return this.isLocality;
    }

    public PoiDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.cityCode = str;
        this.cityLevel = str2;
        this.cityName = str3;
        this.collectInfo = str4;
        this.countryCode = str5;
        this.isLocality = str6;
        this.localityLevel = str7;
        this.poiMapkitCollect = str8;
        this.provinceCode = str9;
        this.type = str10;
        this.typeCode = str11;
        this.typeLevel = str12;
        this.ttTypeCode = str13;
        this.geoNameIds = str14;
        this.ttTypeNameSuper = str15;
        this.ttTypeNameMedium = str16;
        this.ttTypeNameTiny = str17;
    }
}
