package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class TempCachePreloadConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("preload_count")
    public final int preloadCount;

    public TempCachePreloadConfig() {
        this(false, 0);
    }

    public TempCachePreloadConfig(boolean z, int i) {
        this.enable = z;
        this.preloadCount = i;
    }
}
