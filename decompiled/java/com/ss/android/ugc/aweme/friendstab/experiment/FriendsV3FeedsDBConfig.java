package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class FriendsV3FeedsDBConfig {

    @C09CT("enable_db")
    public final boolean enableDB;

    @C09CT("db_expired_time_mins")
    public final int expiredTimeMins;

    @C09CT("db_feeds_capacity")
    public final int feedsCapacity;

    public FriendsV3FeedsDBConfig() {
        this(true, 5, 14400);
    }

    public FriendsV3FeedsDBConfig(boolean z, int i, int i2) {
        this.enableDB = z;
        this.feedsCapacity = i;
        this.expiredTimeMins = i2;
    }
}
