package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryAnalytics implements Serializable {
    public static final int $stable = 0;

    @C09CT("num_accounts_reached")
    public final long accountReached;

    @C09CT("num_followers_reached")
    public final long followersReached;

    public StoryAnalytics(long j, long j2) {
        this.accountReached = j;
        this.followersReached = j2;
    }
}
