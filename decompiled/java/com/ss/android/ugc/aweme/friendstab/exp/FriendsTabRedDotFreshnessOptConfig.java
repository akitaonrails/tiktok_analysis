package com.ss.android.ugc.aweme.friendstab.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class FriendsTabRedDotFreshnessOptConfig {

    @C09CT("avatar_freshness_threshold")
    public final int avatarFreshnessThreshold;

    @C09CT("show_red_dot_count")
    public final int showRedDotCount;

    public FriendsTabRedDotFreshnessOptConfig() {
        this(0, 1);
    }

    public FriendsTabRedDotFreshnessOptConfig(int i, int i2) {
        this.avatarFreshnessThreshold = i;
        this.showRedDotCount = i2;
    }
}
