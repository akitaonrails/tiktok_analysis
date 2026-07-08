package com.ss.android.ugc.aweme.minis.exp;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisH5ResourceCacheConfig implements Serializable {

    @C09CT("cold_start_clean_interval")
    public final int coldStartCleanInterval;

    @C09CT("enable_clean_when_cold_start")
    public final boolean enableCleanWhenColdStart;

    @C09CT("max_clean_concurrency_count")
    public final int maxCleanTaskConcurrencyCount;

    @C09CT("max_clean_task_count")
    public final int maxCleanTaskCount;

    @C09CT("lru_cache_max_size")
    public final int maxLruCacheSize;

    public MinisH5ResourceCacheConfig() {
        this(10, true, 72, 1, 20);
    }

    public MinisH5ResourceCacheConfig(int i, boolean z, int i2, int i3, int i4) {
        this.maxLruCacheSize = i;
        this.enableCleanWhenColdStart = z;
        this.coldStartCleanInterval = i2;
        this.maxCleanTaskConcurrencyCount = i3;
        this.maxCleanTaskCount = i4;
    }
}
