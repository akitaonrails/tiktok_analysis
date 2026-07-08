package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class HighLightAheadPrefetchConfig {

    @C09CT("enable_ahead_prefetch")
    public final int enableSmartPrefetch;

    @C09CT("prefetch_count")
    public final int prefetchCount;

    @C09CT("prefetch_delay_time")
    public final long prefetchDelayTime;

    public HighLightAheadPrefetchConfig() {
        this(0, 0L, 0);
    }

    public HighLightAheadPrefetchConfig(int i, long j, int i2) {
        this.enableSmartPrefetch = i;
        this.prefetchDelayTime = j;
        this.prefetchCount = i2;
    }
}
