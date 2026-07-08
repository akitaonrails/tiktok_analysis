package com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class RelationData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("follow_status")
    public Integer followStatus;

    @C09CT("follow_toast_type")
    public Integer followToastType;

    @C09CT("follower_count")
    public Integer followerCount;

    @C09CT("following_count")
    public Integer followingCount;

    @C09CT("following_visibility")
    public Integer followingVisibility;

    @C09CT("friend_count")
    public Integer friendCount;

    @C09CT("new_follower_count")
    public Integer newFollowerCount;

    @C09CT("formatted_number")
    public String number;

    @C09CT("like_count")
    public Long totalFavorite;

    public final Integer getFollowStatus() {
        return this.followStatus;
    }

    public final Integer getFollowToastType() {
        return this.followToastType;
    }

    public final Integer getFollowerCount() {
        return this.followerCount;
    }

    public final Integer getFollowingCount() {
        return this.followingCount;
    }

    public final Integer getFollowingVisibility() {
        return this.followingVisibility;
    }

    public final Integer getFriendCount() {
        return this.friendCount;
    }

    public final Integer getNewFollowerCount() {
        return this.newFollowerCount;
    }

    public final String getNumber() {
        return this.number;
    }

    public final Long getTotalFavorite() {
        return this.totalFavorite;
    }

    public final void setFollowStatus(Integer num) {
        this.followStatus = num;
    }

    public final void setFollowToastType(Integer num) {
        this.followToastType = num;
    }

    public final void setFollowerCount(Integer num) {
        this.followerCount = num;
    }

    public final void setFollowingCount(Integer num) {
        this.followingCount = num;
    }

    public final void setFollowingVisibility(Integer num) {
        this.followingVisibility = num;
    }

    public final void setFriendCount(Integer num) {
        this.friendCount = num;
    }

    public final void setNewFollowerCount(Integer num) {
        this.newFollowerCount = num;
    }

    public final void setNumber(String str) {
        this.number = str;
    }

    public final void setTotalFavorite(Long l) {
        this.totalFavorite = l;
    }
}
