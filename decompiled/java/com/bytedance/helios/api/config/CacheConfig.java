package com.bytedance.helios.api.config;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class CacheConfig {

    @C09CT("max_store_interval")
    public final long maxStoreInterval;

    @C09CT("max_store_size")
    public final int maxStoreSize;

    public CacheConfig() {
        this(500, 30000L);
    }

    public CacheConfig(int i, long j) {
        this.maxStoreSize = i;
        this.maxStoreInterval = j;
    }
}
