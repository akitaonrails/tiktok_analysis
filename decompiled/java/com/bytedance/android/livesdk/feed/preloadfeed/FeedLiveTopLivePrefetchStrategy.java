package com.bytedance.android.livesdk.feed.preloadfeed;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class FeedLiveTopLivePrefetchStrategy {

    @C09CT("expire_interval")
    public final long expireInterval;

    @C09CT("expire_interval_skylight")
    public final long expireIntervalSkylight;

    @C09CT("refresh_interval")
    public final long refreshInterval;

    @C09CT("total_duration")
    public final long totalDuration;

    public FeedLiveTopLivePrefetchStrategy() {
        this(0L, 0L, 0L, -1L);
    }

    public FeedLiveTopLivePrefetchStrategy(long j, long j2, long j3, long j4) {
        this.totalDuration = j;
        this.refreshInterval = j2;
        this.expireInterval = j3;
        this.expireIntervalSkylight = j4;
    }
}
