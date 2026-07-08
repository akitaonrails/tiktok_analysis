package com.ss.android.ugc.aweme.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class HighStoreUserLocalVideoCacheConfig {

    @C09CT("is_open")
    public final boolean isOpen;

    @C09CT("low_storage_threshold_mb")
    public final long lowStorageThreshold;

    @C09CT("lru_cache_days")
    public final int lruCacheDays;

    @C09CT("lru_cache_threshold_mb")
    public final long lruCacheThresholdMB;

    public HighStoreUserLocalVideoCacheConfig() {
        this(false, 400L, 7, 300L);
    }

    public HighStoreUserLocalVideoCacheConfig(boolean z, long j, int i, long j2) {
        this.isOpen = z;
        this.lowStorageThreshold = j;
        this.lruCacheDays = i;
        this.lruCacheThresholdMB = j2;
    }
}
