package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoFollowInfo {

    @C09CT("follow_status")
    public final int followStatus;

    @C09CT("follower_count")
    public final int followerCount;

    @C09CT("follower_status")
    public final int followerStatus;

    public TakoFollowInfo() {
        this(-1, -1, 0);
    }

    public final int hashCode() {
        return (((this.followStatus * 31) + this.followerStatus) * 31) + this.followerCount;
    }

    public TakoFollowInfo(int i, int i2, int i3) {
        this.followStatus = i;
        this.followerStatus = i2;
        this.followerCount = i3;
    }
}
