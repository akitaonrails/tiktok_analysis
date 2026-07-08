package com.ss.android.ugc.aweme.minis.model.payment;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisGetRecommendTierInfoResponse extends BaseResponse {

    @C09CT("recommended_tier")
    public final RecommendedTierInfo recommendedTier = new RecommendedTierInfo(new MinisTierInfo("", "", 0, "", "", "", "", "", "", "", ""));

    static {
        new MinisGetRecommendTierInfoResponse();
    }
}
