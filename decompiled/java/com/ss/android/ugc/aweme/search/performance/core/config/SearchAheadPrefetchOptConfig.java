package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAheadPrefetchOptConfig {

    @C09CT("clear_cache_delay_time")
    public final long clearCacheDelayTime;

    @C09CT("enable_ahead_prefetch")
    public final boolean enableAheadPrefetch;

    @C09CT("enable_clear_cache")
    public final boolean enableClearCache;

    @C09CT("prefetch_delay_time")
    public final long prefetchDelayTime;

    @C09CT("real_request_delay_time")
    public final long realRequestDelayTime;

    public SearchAheadPrefetchOptConfig() {
        this(false, 0L, true, 13000L, 0L);
    }

    public SearchAheadPrefetchOptConfig(boolean z, long j, boolean z2, long j2, long j3) {
        this.enableAheadPrefetch = z;
        this.prefetchDelayTime = j;
        this.enableClearCache = z2;
        this.clearCacheDelayTime = j2;
        this.realRequestDelayTime = j3;
    }
}
