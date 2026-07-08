package com.ss.android.ugc.aweme.feed.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class FeedBarSmartConfig {

    @C09CT("enable_clear_cache")
    public final boolean enableClearCache;

    @C09CT("enable_smart_prefetch")
    public final boolean enableSmartPrefetch;

    @C09CT("play_progress")
    public final int playProgress;

    @C09CT("prefetch_delay_time")
    public final long prefetchDelayTime;

    @C09CT("score_threshold")
    public final float scoreThreshold;

    @C09CT("strategy_name")
    public final String strategyName;

    public FeedBarSmartConfig() {
        this(false, 0L, true, "", 0, 1.0f);
    }

    public FeedBarSmartConfig(boolean z, long j, boolean z2, String str, int i, float f) {
        this.enableSmartPrefetch = z;
        this.prefetchDelayTime = j;
        this.enableClearCache = z2;
        this.strategyName = str;
        this.playProgress = i;
        this.scoreThreshold = f;
    }
}
