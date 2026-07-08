package com.ss.android.ugc.aweme.explore.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreSearchRealTimeConfig {

    @C09CT("is_enable")
    public final boolean enable;

    @C09CT("expire_seconds")
    public final long expireSeconds;

    public ExploreSearchRealTimeConfig() {
        this(false, 3600L);
    }

    public ExploreSearchRealTimeConfig(boolean z, long j) {
        this.enable = z;
        this.expireSeconds = j;
    }
}
