package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class MixRankCacheExpConfig {

    @C09CT("android_cache_init_delay_time")
    public final long cacheInitDelayTime;

    @C09CT("android_enable_disk")
    public final boolean enableDiskCache;

    @C09CT("android_enable_live_disk_cache")
    public final boolean enableLiveDiskCache;

    @C09CT("android_enable_server")
    public final boolean enablePreRequest;

    @C09CT("android_enable_story_disk_cache")
    public final boolean enableStoryDiskCache;

    @C09CT("android_request_delay_time")
    public final long requestDelayTime;

    @C09CT("android_request_except_live")
    public final boolean requestExceptLive;

    public MixRankCacheExpConfig() {
        this(true, false, 10L, 5L, false, true, true);
    }

    public MixRankCacheExpConfig(boolean z, boolean z2, long j, long j2, boolean z3, boolean z4, boolean z5) {
        this.enableDiskCache = z;
        this.enablePreRequest = z2;
        this.cacheInitDelayTime = j;
        this.requestDelayTime = j2;
        this.requestExceptLive = z3;
        this.enableLiveDiskCache = z4;
        this.enableStoryDiskCache = z5;
    }
}
