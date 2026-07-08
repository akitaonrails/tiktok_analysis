package com.ss.android.ugc.aweme.inbox.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class Configuration {
    public static final int $stable = 0;

    @C09CT("activity_page_max_load_time")
    public final long activityPageMaxLoadTime;

    @C09CT("follower_page_max_load_time")
    public final long followerPageMaxLoadTime;

    @C09CT("inbox_page_max_load_time")
    public final long inboxPageMaxLoadTime;

    public Configuration() {
        this(4000L, 2200L, 1700L);
    }

    public Configuration(long j, long j2, long j3) {
        this.inboxPageMaxLoadTime = j;
        this.activityPageMaxLoadTime = j2;
        this.followerPageMaxLoadTime = j3;
    }
}
