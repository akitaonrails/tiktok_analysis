package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class HistoryAheadPrefetchConfig {

    @C09CT("enable_smart_prefetch")
    public final int enableSmartPrefetch;

    @C09CT("prefetch_count")
    public final int prefetchCount;

    @C09CT("prefetch_delay_time")
    public final long prefetchDelayTime;

    public HistoryAheadPrefetchConfig() {
        this(0, 0L, 0);
    }

    public HistoryAheadPrefetchConfig(int i, long j, int i2) {
        this.enableSmartPrefetch = i;
        this.prefetchDelayTime = j;
        this.prefetchCount = i2;
    }
}
