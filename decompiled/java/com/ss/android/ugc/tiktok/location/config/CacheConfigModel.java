package com.ss.android.ugc.tiktok.location.config;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class CacheConfigModel {

    @C09CT("max")
    public long maxCacheTime;

    @C09CT("min")
    public long minCacheTime;

    public CacheConfigModel() {
        this(60L, 300L);
    }

    public CacheConfigModel(long j, long j2) {
        this.minCacheTime = j;
        this.maxCacheTime = j2;
    }
}
