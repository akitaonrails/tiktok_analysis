package com.ss.android.ugc.aweme.story.experiment.viewlist;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class ViewerListDiskCacheExpData {

    @C09CT("viewer_list_cache_ttl_in_ms")
    public final long cacheTtlInMs;

    @C09CT("viewer_list_disk_cache_ttl_in_ms")
    public final long diskCacheTtlInMs;

    @C09CT("viewer_list_disk_cache_enabled")
    public final boolean enabled;

    @C09CT("viewer_list_preload_story_count")
    public final int preloadStoryCount;

    @C09CT("viewer_list_simple_user_cache_enabled")
    public final boolean simpleUserCacheEnabled;

    public ViewerListDiskCacheExpData() {
        this(false, 1800000L, 43200000L, 3, false);
    }

    public ViewerListDiskCacheExpData(boolean z, long j, long j2, int i, boolean z2) {
        this.enabled = z;
        this.cacheTtlInMs = j;
        this.diskCacheTtlInMs = j2;
        this.preloadStoryCount = i;
        this.simpleUserCacheEnabled = z2;
    }
}
