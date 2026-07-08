package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class RecommendProductConfig {

    @C09CT("request_delay_time")
    public final long requestDelayTime;

    @C09CT("retry_max_num")
    public final int retryMaxNumber;

    public RecommendProductConfig() {
        this(3000L, 3);
    }

    public RecommendProductConfig(long j, int i) {
        this.requestDelayTime = j;
        this.retryMaxNumber = i;
    }
}
