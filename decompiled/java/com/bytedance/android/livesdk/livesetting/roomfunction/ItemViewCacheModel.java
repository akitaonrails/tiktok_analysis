package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class ItemViewCacheModel {
    public static final TypeAdapter ADAPTER;

    @C09CT("cache_clean_delay")
    public long cacheCleanDelay;

    @C09CT("cache_count")
    public int cacheCount;

    static {
        NormalGson.singleton();
        ADAPTER = new ItemViewCacheModel_OptTypeAdapter();
    }

    public ItemViewCacheModel() {
        this(1, 0L);
    }

    public ItemViewCacheModel(int i, long j) {
        this.cacheCount = i;
        this.cacheCleanDelay = j;
    }
}
