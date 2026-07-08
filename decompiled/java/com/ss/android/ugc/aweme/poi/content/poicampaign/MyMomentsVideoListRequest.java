package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class MyMomentsVideoListRequest {

    @C09CT("campaign_id")
    public final Integer campaignId;

    @C09CT("page_size")
    public final Integer pageSize;

    @C09CT("start_cursor")
    public final String startItemId;

    public MyMomentsVideoListRequest(Integer num, String str, Integer num2) {
        this.campaignId = num;
        this.startItemId = str;
        this.pageSize = num2;
    }
}
