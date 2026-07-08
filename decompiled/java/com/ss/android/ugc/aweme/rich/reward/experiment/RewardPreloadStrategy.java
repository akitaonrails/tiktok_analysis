package com.ss.android.ugc.aweme.rich.reward.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class RewardPreloadStrategy {

    @C09CT("concurrent_request_count")
    public final Integer concurrentRequestCount;

    @C09CT("preload_delay_time_after_show")
    public final Integer preloadDelayTimeAfterShow;

    @C09CT("request_interval")
    public final Integer requestInterval;

    @C09CT("strategy")
    public Integer strategy;

    public RewardPreloadStrategy(Integer num, Integer num2, Integer num3, Integer num4) {
        this.strategy = num;
        this.requestInterval = num2;
        this.concurrentRequestCount = num3;
        this.preloadDelayTimeAfterShow = num4;
    }
}
