package com.ss.android.ugc.aweme.search.pages.result.entitycard.config;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class CacheConfig {

    @C09CT("cache_expire_time")
    public final long cacheExpireTime;

    @C09CT("cache_size")
    public final int cacheSize;

    @C09CT("enable_cache")
    public final boolean enableCache;

    public CacheConfig() {
        this(2, 600000L, true);
    }

    public CacheConfig(int i, long j, boolean z) {
        this.cacheSize = i;
        this.cacheExpireTime = j;
        this.enableCache = z;
    }
}
