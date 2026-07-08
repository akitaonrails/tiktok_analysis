package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiListResponse {

    @C09CT("latitude_central")
    public final Double latitudeCentral;

    @C09CT("longitude_central")
    public final Double longitudeCentral;

    @C09CT("poi_video_summary_list")
    public final List<PoiVideoSummary> poiListSummary;

    public PoiListResponse() {
        this(null, null, null);
    }

    public PoiListResponse(Double d, Double d2, List<PoiVideoSummary> list) {
        this.latitudeCentral = d;
        this.longitudeCentral = d2;
        this.poiListSummary = list;
    }
}
