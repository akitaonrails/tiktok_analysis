package com.ss.android.ugc.aweme.cache;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingCacheConfigModel {

    @C09CT("check_status_in_cold")
    public final boolean checkStatusInCold;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("expired_time")
    public final long expiredTime;

    @C09CT("feed_ready_delay")
    public final long feedReadyDelay;

    public FollowingCacheConfigModel() {
        this(false, 2L, 86400L, false);
    }

    public FollowingCacheConfigModel(boolean z, long j, long j2, boolean z2) {
        this.enable = z;
        this.feedReadyDelay = j;
        this.expiredTime = j2;
        this.checkStatusInCold = z2;
    }
}
