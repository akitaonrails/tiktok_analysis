package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPhotoPrefetchOptConfig {

    @C09CT("group")
    public final int group;

    @C09CT("photo_card_ratio_threshold")
    public final float photoCardRatioThreshold;

    @C09CT("throttle_interval_ms")
    public final long throttleIntervalMs;

    @C09CT("viewport_jump_threshold")
    public final int viewportJumpThreshold;

    public SearchPhotoPrefetchOptConfig() {
        this(0, 0.5f, 200L, 4);
    }

    public SearchPhotoPrefetchOptConfig(int i, float f, long j, int i2) {
        this.group = i;
        this.photoCardRatioThreshold = f;
        this.throttleIntervalMs = j;
        this.viewportJumpThreshold = i2;
    }
}
