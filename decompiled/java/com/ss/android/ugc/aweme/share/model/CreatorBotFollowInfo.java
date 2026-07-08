package com.ss.android.ugc.aweme.share.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class CreatorBotFollowInfo {

    @C09CT("follow_status")
    public final Integer followStatus;

    @C09CT("follower_count")
    public final Integer followerCount;

    @C09CT("follower_status")
    public final Integer followerStatus;

    public CreatorBotFollowInfo(Integer num, Integer num2, Integer num3) {
        this.followStatus = num;
        this.followerStatus = num2;
        this.followerCount = num3;
    }
}
