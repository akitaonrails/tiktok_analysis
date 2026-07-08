package com.ss.android.ugc.aweme.coldcache.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class PlayerColdCacheFetchConfig {

    @C09CT("adaptive_cache_count")
    public final boolean adaptiveCacheCount;

    @C09CT("cache_count")
    public final int cacheCount;

    @C09CT("cache_duration_limit")
    public final long cacheDurationLimit;

    @C09CT("cache_duration_limit_by_step")
    public final int cacheDurationLimitByStep;

    @C09CT("enable_count_strategy")
    public final boolean enableCountStrategy;

    @C09CT("enable_duration_strategy")
    public final boolean enableDurationStrategy;

    @C09CT("enable_strategy")
    public final boolean enableStrategy;

    @C09CT("extra_cache_count")
    public final int extraCacheCount;

    public PlayerColdCacheFetchConfig() {
        this(false, false, false, false, 0, 6, 30000L, 0);
    }

    public PlayerColdCacheFetchConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, long j, int i3) {
        this.enableStrategy = z;
        this.enableCountStrategy = z2;
        this.enableDurationStrategy = z3;
        this.adaptiveCacheCount = z4;
        this.extraCacheCount = i;
        this.cacheCount = i2;
        this.cacheDurationLimit = j;
        this.cacheDurationLimitByStep = i3;
    }
}
