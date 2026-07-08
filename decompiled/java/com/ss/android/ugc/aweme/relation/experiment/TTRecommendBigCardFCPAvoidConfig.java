package com.ss.android.ugc.aweme.relation.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class TTRecommendBigCardFCPAvoidConfig {

    @C09CT("ads_count")
    public final Integer adsCount;

    @C09CT("ads")
    public final Boolean enableAdsAvoid;

    @C09CT("maf_video")
    public final Boolean enableMafVideoAvoid;

    public TTRecommendBigCardFCPAvoidConfig() {
        this(Boolean.TRUE, 2, Boolean.TRUE);
    }

    public TTRecommendBigCardFCPAvoidConfig(Boolean bool, Integer num, Boolean bool2) {
        this.enableAdsAvoid = bool;
        this.adsCount = num;
        this.enableMafVideoAvoid = bool2;
    }
}
