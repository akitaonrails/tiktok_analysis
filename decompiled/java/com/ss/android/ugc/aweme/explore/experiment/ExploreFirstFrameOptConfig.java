package com.ss.android.ugc.aweme.explore.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class ExploreFirstFrameOptConfig {

    @C09CT("avatar_load_delay_time_mills")
    public final long avatarLoadDelayTimeMills;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("max_cache_item_size")
    public final int maxCacheItemSize;

    @C09CT("max_preload_item_size")
    public final int maxPreloadItemSize;

    @C09CT("tab_change_delay_time_mills")
    public final long tabChangeDelayTimeMills;

    public ExploreFirstFrameOptConfig() {
        this(false, 0, 0, 0L, 0L);
    }

    public ExploreFirstFrameOptConfig(boolean z, int i, int i2, long j, long j2) {
        this.enable = z;
        this.maxCacheItemSize = i;
        this.maxPreloadItemSize = i2;
        this.avatarLoadDelayTimeMills = j;
        this.tabChangeDelayTimeMills = j2;
    }
}
