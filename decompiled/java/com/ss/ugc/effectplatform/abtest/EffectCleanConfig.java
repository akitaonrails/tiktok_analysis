package com.ss.ugc.effectplatform.abtest;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class EffectCleanConfig {

    @C09CT("cache_after_clean_bit")
    public final long cacheAfterCleanMb;

    @C09CT("cache_threshold_bit")
    public final long cacheThresholdMb;

    @C09CT("is_open")
    public final boolean isOpen;

    public EffectCleanConfig() {
        this(false, 2500L, 2000L);
    }

    public EffectCleanConfig(boolean z, long j, long j2) {
        this.isOpen = z;
        this.cacheThresholdMb = j;
        this.cacheAfterCleanMb = j2;
    }
}
