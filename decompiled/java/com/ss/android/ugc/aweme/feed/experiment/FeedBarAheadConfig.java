package com.ss.android.ugc.aweme.feed.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class FeedBarAheadConfig {

    @C09CT("enable_ahead_prefetch")
    public final boolean enableAheadPrefetch;

    @C09CT("play_progress")
    public final int playProgress;

    @C09CT("prefetch_delay_time")
    public final long prefetchDelayTime;

    public FeedBarAheadConfig() {
        this(false, 0L, 0);
    }

    public FeedBarAheadConfig(boolean z, long j, int i) {
        this.enableAheadPrefetch = z;
        this.prefetchDelayTime = j;
        this.playProgress = i;
    }
}
