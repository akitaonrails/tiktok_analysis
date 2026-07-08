package com.ss.android.ugc.aweme.perf;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingMemoryOptimizeConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("leave_count")
    public final int leaveCount;

    public FollowingMemoryOptimizeConfig() {
        this(false, 10);
    }

    public FollowingMemoryOptimizeConfig(boolean z, int i) {
        this.enable = z;
        this.leaveCount = i;
    }
}
