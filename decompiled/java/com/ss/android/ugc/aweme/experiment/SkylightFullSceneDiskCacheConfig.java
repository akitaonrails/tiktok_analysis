package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class SkylightFullSceneDiskCacheConfig {

    @C09CT("enable_inbox")
    public final boolean enableInbox;

    @C09CT("fyp_cache_count")
    public final int fypCacheCount;

    @C09CT("enable")
    public final boolean isEnabled;

    @C09CT("live_cache_duration")
    public final long liveCacheDuration;

    @C09CT("enable_live_cache")
    public final boolean liveCacheEnable;

    @C09CT("live_store_hash_lru_size")
    public final int liveStoreHashLruSize;

    @C09CT("non_fyp_cache_count")
    public final int nonFypCacheCount;

    @C09CT("paged_read_page_count")
    public final int pagedReadPageCount;

    @C09CT("story_cache_duration")
    public final long storyCacheDuration;

    @C09CT("enable_story_cache")
    public final boolean storyCacheEnable;

    @C09CT("story_store_hash_lru_size")
    public final int storyStoreHashLruSize;

    public SkylightFullSceneDiskCacheConfig() {
        this(false, 900L, 86400L, false, false, 100, 150, 5, 8, 4, false);
    }

    public SkylightFullSceneDiskCacheConfig(boolean z, long j, long j2, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, boolean z4) {
        this.isEnabled = z;
        this.liveCacheDuration = j;
        this.storyCacheDuration = j2;
        this.storyCacheEnable = z2;
        this.liveCacheEnable = z3;
        this.storyStoreHashLruSize = i;
        this.liveStoreHashLruSize = i2;
        this.fypCacheCount = i3;
        this.nonFypCacheCount = i4;
        this.pagedReadPageCount = i5;
        this.enableInbox = z4;
    }
}
