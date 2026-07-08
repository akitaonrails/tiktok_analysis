package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiVideoSummary {

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("latitude")
    public final Double latitude;

    @C09CT("longitude")
    public final Double longitude;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("poi_name")
    public final String poiName;

    @C09CT("thumbnail")
    public final String thumbnail;

    public PoiVideoSummary(String str, String str2, Double d, Double d2, String str3, String str4) {
        this.poiName = str;
        this.poiId = str2;
        this.latitude = d;
        this.longitude = d2;
        this.thumbnail = str3;
        this.collectInfo = str4;
    }
}
