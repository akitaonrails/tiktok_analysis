package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiListRequest {

    @C09CT("campaign_id")
    public final Integer campaignId;

    @C09CT("latitude_max")
    public final Double latitudeMax;

    @C09CT("latitude_min")
    public final Double latitudeMin;

    @C09CT("longitude_max")
    public final Double longitudeMax;

    @C09CT("longitude_min")
    public final Double longitudeMin;

    public PoiListRequest(Integer num, Double d, Double d2, Double d3, Double d4) {
        this.campaignId = num;
        this.latitudeMin = d;
        this.longitudeMin = d2;
        this.latitudeMax = d3;
        this.longitudeMax = d4;
    }
}
