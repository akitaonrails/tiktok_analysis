package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class GoldenCacheConfig implements Serializable {

    @C09CT("golden_cache_duration")
    public long duration;

    public GoldenCacheConfig() {
        this(0L);
    }

    public GoldenCacheConfig(long j) {
        this.duration = j;
    }
}
