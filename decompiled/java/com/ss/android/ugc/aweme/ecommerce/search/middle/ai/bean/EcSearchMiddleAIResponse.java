package com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchMiddleAIResponse {

    @C09CT("search_box_data")
    public final RecommendationResponse boxData;

    @C09CT("code")
    public final int code;

    @C09CT("impr_id")
    public final String imprId;

    @C09CT("message")
    public final String message;

    @C09CT("search_suggest_data")
    public final RecommendationResponse suggestData;

    public EcSearchMiddleAIResponse() {
        this(-1, null, null, null, null);
    }

    public EcSearchMiddleAIResponse(int i, String str, String str2, RecommendationResponse recommendationResponse, RecommendationResponse recommendationResponse2) {
        this.code = i;
        this.imprId = str;
        this.message = str2;
        this.boxData = recommendationResponse;
        this.suggestData = recommendationResponse2;
    }
}
