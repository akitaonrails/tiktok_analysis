package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchImagePrefetchConfig {

    @C09CT("group")
    public final int group;

    @C09CT("prefetch_count")
    public final int prefetchCount;

    public SearchImagePrefetchConfig() {
        this(0, 0);
    }

    public SearchImagePrefetchConfig(int i, int i2) {
        this.group = i;
        this.prefetchCount = i2;
    }
}
