package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPlayerReleaseConfig {

    @C09CT("enable_player_release_count")
    public final boolean enablePlayerReleaseCount;

    @C09CT("release_count")
    public final int releaseCount;

    public SearchPlayerReleaseConfig() {
        this(false, 0);
    }

    public SearchPlayerReleaseConfig(boolean z, int i) {
        this.enablePlayerReleaseCount = z;
        this.releaseCount = i;
    }
}
