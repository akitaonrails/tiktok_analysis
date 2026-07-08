package com.ss.android.ugc.aweme.nuf.cache;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class SilentMsgRefreshFeedCacheConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("fetch_interval_hour")
    public final int fetchIntervalHour;

    public SilentMsgRefreshFeedCacheConfig() {
        this(false, 24);
    }

    public SilentMsgRefreshFeedCacheConfig(boolean z, int i) {
        this.enable = z;
        this.fetchIntervalHour = i;
    }
}
