package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxSkylightStoryCacheConfig {

    @C09CT("local_cache_expire_time")
    public final long cacheExpireTime;

    @C09CT("preload_delay_time")
    public final long delayTime;

    @C09CT("init_inbox_story_disk_cache")
    public final boolean inboxStoryDiskCache;

    @C09CT("preload_server_data")
    public final boolean preloadServerData;

    @C09CT("waiting_disk_cache")
    public final boolean waitingDiskCache;

    public InboxSkylightStoryCacheConfig() {
        this(true, false, true, 86400L, 10L);
    }

    public InboxSkylightStoryCacheConfig(boolean z, boolean z2, boolean z3, long j, long j2) {
        this.inboxStoryDiskCache = z;
        this.preloadServerData = z2;
        this.waitingDiskCache = z3;
        this.cacheExpireTime = j;
        this.delayTime = j2;
    }
}
