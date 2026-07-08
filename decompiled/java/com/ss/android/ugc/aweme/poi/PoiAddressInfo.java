package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAddressInfo implements Serializable {

    @C09CT("address")
    public String address;

    @C09CT("city_code")
    public String cityCode;

    @C09CT("city_name")
    public String cityName;

    @C09CT("geohash")
    public String geohash;

    @C09CT("lat")
    public String lat;

    @C09CT("lng")
    public String lng;

    @C09CT("region_code")
    public String regionCode;

    public PoiAddressInfo() {
        this(null, null, null, null, null, null, null);
    }

    public int hashCode() {
        String str = this.cityName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cityCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.regionCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lng;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lat;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.geohash;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.address;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAddressInfo(cityName=");
        sbLIZ.append(this.cityName);
        sbLIZ.append(", cityCode=");
        sbLIZ.append(this.cityCode);
        sbLIZ.append(", regionCode=");
        sbLIZ.append(this.regionCode);
        sbLIZ.append(", lng=");
        sbLIZ.append(this.lng);
        sbLIZ.append(", lat=");
        sbLIZ.append(this.lat);
        sbLIZ.append(", geohash=");
        sbLIZ.append(this.geohash);
        sbLIZ.append(", address=");
        sbLIZ.append(this.address);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiAddressInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.cityName = str;
        this.cityCode = str2;
        this.regionCode = str3;
        this.lng = str4;
        this.lat = str5;
        this.geohash = str6;
        this.address = str7;
    }
}
