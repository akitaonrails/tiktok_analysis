package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3RecConfig {

    @C09CT("count_when_fast_scroll")
    public final int countWhenFastScroll;

    @C09CT("count_when_fling")
    public final int countWhenFling;

    @C09CT("loadmore_count")
    public final int loadMoreCount;

    public FriendsV3RecConfig() {
        this(6, 5, 5);
    }

    public FriendsV3RecConfig(int i, int i2, int i3) {
        this.loadMoreCount = i;
        this.countWhenFastScroll = i2;
        this.countWhenFling = i3;
    }
}
