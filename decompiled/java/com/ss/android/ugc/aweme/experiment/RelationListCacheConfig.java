package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class RelationListCacheConfig {

    @C09CT("cache_expire_time")
    public final long cacheExpireTime;

    @C09CT("follower_cache_number")
    public final int followerCacheNum;

    public RelationListCacheConfig() {
        this(5, 300000L);
    }

    public RelationListCacheConfig(int i, long j) {
        this.followerCacheNum = i;
        this.cacheExpireTime = j;
    }
}
