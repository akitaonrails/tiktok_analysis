package com.ss.android.ugc.aweme.coldcache.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class PlayerColdCachePoolConfig {

    @C09CT("cache_fcp_protocol")
    public final boolean cacheFcpProtocol;

    @C09CT("consume_cache_num")
    public final int consumeCacheNum;

    @C09CT("correspond")
    public final boolean correspond;

    @C09CT("enable_strategy")
    public final boolean enableStrategy;

    @C09CT("max_pool_size")
    public final int maxPoolSize;

    @C09CT("produce_cache_num_b")
    public final int produceCacheNumBackground;

    @C09CT("produce_cache_num_f")
    public final int produceCacheNumForeground;

    @C09CT("simplify")
    public final boolean simplify;

    @C09CT("supplement_cache_steps")
    public final int supplementCacheSteps;

    public PlayerColdCachePoolConfig() {
        this(false, 6, -1, 1, -1, -1, false, false, false);
    }

    public PlayerColdCachePoolConfig(boolean z, int i, int i2, int i3, int i4, int i5, boolean z2, boolean z3, boolean z4) {
        this.enableStrategy = z;
        this.maxPoolSize = i;
        this.supplementCacheSteps = i2;
        this.consumeCacheNum = i3;
        this.produceCacheNumForeground = i4;
        this.produceCacheNumBackground = i5;
        this.simplify = z2;
        this.cacheFcpProtocol = z3;
        this.correspond = z4;
    }
}
