package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchEnterBackgroundReleasePlayer {

    @C09CT("enable_release")
    public final boolean enableRelease;

    @C09CT("enter_background_time")
    public final long enterBackgroundTime;

    public SearchEnterBackgroundReleasePlayer() {
        this(false, 0L);
    }

    public SearchEnterBackgroundReleasePlayer(boolean z, long j) {
        this.enableRelease = z;
        this.enterBackgroundTime = j;
    }
}
