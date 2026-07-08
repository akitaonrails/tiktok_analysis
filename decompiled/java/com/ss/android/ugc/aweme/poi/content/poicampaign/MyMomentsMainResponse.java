package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class MyMomentsMainResponse {

    @C09CT("data")
    public final MyMomentsData data;

    @C09CT("status_code")
    public final Integer statusCode;

    public MyMomentsMainResponse(Integer num, MyMomentsData myMomentsData) {
        this.statusCode = num;
        this.data = myMomentsData;
    }
}
