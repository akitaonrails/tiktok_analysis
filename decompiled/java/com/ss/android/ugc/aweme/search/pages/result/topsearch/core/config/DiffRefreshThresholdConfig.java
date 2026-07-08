package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class DiffRefreshThresholdConfig {

    @C09CT("fully_hit_threshold")
    public final int fullyHitThreshold;

    @C09CT("reorder_match_threshold")
    public final int reorderMatchThreshold;

    public DiffRefreshThresholdConfig() {
        this(0, 0);
    }

    public DiffRefreshThresholdConfig(int i, int i2) {
        this.reorderMatchThreshold = i;
        this.fullyHitThreshold = i2;
    }
}
