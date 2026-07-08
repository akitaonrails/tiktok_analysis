package com.bytedance.i18n.region.network.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class DataModel {

    @C09CT("ASCIName")
    public final String asciiName;

    @C09CT("cache_time_sec")
    public final int cacheTimeSec;

    @C09CT("Code")
    public final String code;

    @C09CT("expire_time")
    public final long expireTime;

    @C09CT("GeoNameID")
    public final long geoNameID;

    @C09CT("Name")
    public final String name;

    @C09CT("region_header")
    public final Map<String, String> regionHeader;

    @C09CT("regions")
    public final Map<String, RegionModel> regions;

    @C09CT("source")
    public final String source;

    public DataModel(String str, long j, String str2, String str3, long j2, String str4, int i, Map<String, String> map, Map<String, RegionModel> map2) {
        this.code = str;
        this.geoNameID = j;
        this.asciiName = str2;
        this.name = str3;
        this.expireTime = j2;
        this.source = str4;
        this.cacheTimeSec = i;
        this.regionHeader = map;
        this.regions = map2;
    }
}
