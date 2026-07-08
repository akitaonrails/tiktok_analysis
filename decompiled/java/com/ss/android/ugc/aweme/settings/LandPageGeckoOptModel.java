package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class LandPageGeckoOptModel {

    @C09CT("enable_gecko_lru_opt_v2")
    public final boolean enableGeckoLRUOptimization;

    @C09CT("gecko_lru_cache_count")
    public final int geckoLRUCacheCount;

    public LandPageGeckoOptModel() {
        this(true, 3);
    }

    public LandPageGeckoOptModel(boolean z, int i) {
        this.enableGeckoLRUOptimization = z;
        this.geckoLRUCacheCount = i;
    }
}
