package com.ss.android.ugc.aweme.plugin.journey;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class TrendingCreatorStruct {

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("bio")
    public final String bio;

    @C09CT("blue_v")
    public final Boolean blueV;

    @C09CT("follow_status")
    public final FollowStatus followStatus;

    @C09CT("follower_count")
    public final Integer followerCount;

    @C09CT("is_private")
    public final Boolean isPrivate;

    @C09CT("name")
    public final String name;

    @C09CT("user_id")
    public final String userId;

    public TrendingCreatorStruct(String str, String str2, String str3, String str4, Boolean bool, Integer num, Boolean bool2, FollowStatus followStatus) {
        this.userId = str;
        this.avatarUrl = str2;
        this.name = str3;
        this.bio = str4;
        this.blueV = bool;
        this.followerCount = num;
        this.isPrivate = bool2;
        this.followStatus = followStatus;
    }
}
