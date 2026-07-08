package com.bytedance.im.core.client.configs;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class ConvKvCacheConfig {

    @C09CT("cache_hit_sampling_rate")
    public final float cacheHitSamplingRate;

    @C09CT("enable_conv_kv_cache")
    public final boolean enableConvKvCache;

    @C09CT("max_size")
    public final int maxSize;

    @C09CT("report_cache_hit")
    public final boolean reportCacheHit;

    public ConvKvCacheConfig() {
        this(false, 100, false, 0.001f);
    }

    public ConvKvCacheConfig(boolean z, int i, boolean z2, float f) {
        this.enableConvKvCache = z;
        this.maxSize = i;
        this.reportCacheHit = z2;
        this.cacheHitSamplingRate = f;
    }
}
