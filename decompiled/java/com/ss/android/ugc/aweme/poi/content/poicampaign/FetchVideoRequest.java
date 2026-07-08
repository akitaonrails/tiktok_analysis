package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class FetchVideoRequest {

    @C09CT("campaign_id")
    public final Integer campaignId;

    @C09CT("page_size")
    public final Integer pageSize;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("start_cursor")
    public final String startItemId;

    public FetchVideoRequest(Integer num, String str, String str2, Integer num2) {
        this.campaignId = num;
        this.poiId = str;
        this.startItemId = str2;
        this.pageSize = num2;
    }
}
