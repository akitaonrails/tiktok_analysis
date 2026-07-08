package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class FriendsV3ByPassPreloadConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("size")
    public final int size;

    public FriendsV3ByPassPreloadConfig() {
        this(true, 400);
    }

    public FriendsV3ByPassPreloadConfig(boolean z, int i) {
        this.enable = z;
        this.size = i;
    }
}
