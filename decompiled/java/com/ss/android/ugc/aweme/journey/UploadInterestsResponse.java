package com.ss.android.ugc.aweme.journey;

import X.C09CT;
import com.ss.android.ugc.aweme.plugin.journey.TrendingCreatorsPageStruct;

/* JADX INFO: loaded from: classes26.dex */
public final class UploadInterestsResponse {

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("trending_creators_page")
    public final TrendingCreatorsPageStruct trendingCreatorsPageStruct;

    public UploadInterestsResponse() {
        this(null, null);
    }

    public UploadInterestsResponse(Integer num, TrendingCreatorsPageStruct trendingCreatorsPageStruct) {
        this.statusCode = num;
        this.trendingCreatorsPageStruct = trendingCreatorsPageStruct;
    }
}
