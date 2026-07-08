package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class ECSugServerCacheConfig {

    @C09CT("cache_scene_type")
    public final int cacheSceneType;

    @C09CT("request_cache_delay_time")
    public final long requestDelayTime;

    @C09CT("show_cache_min_size")
    public final int showCacheMinSize;

    @C09CT("sug_cache_expire_time_minute")
    public final int sugCacheExpireTime;

    @C09CT("sug_cache_word_count")
    public final int sugCacheWordCount;

    public ECSugServerCacheConfig() {
        this(0, 2000L, 4, 60, 2000);
    }

    public ECSugServerCacheConfig(int i, long j, int i2, int i3, int i4) {
        this.cacheSceneType = i;
        this.requestDelayTime = j;
        this.showCacheMinSize = i2;
        this.sugCacheExpireTime = i3;
        this.sugCacheWordCount = i4;
    }
}
