package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class UserRelationInfo implements Serializable {

    @C09CT("follow_status")
    public Integer followStatus;

    @C09CT("follower_status")
    public Integer followerStatus;

    @C09CT("family_pairing_blocking_by_type")
    public Integer fpBlockByType;

    @C09CT("friend_count")
    public Integer friendCount;

    @C09CT("is_blocked")
    public Boolean isBlocked;

    @C09CT("is_blocking")
    public Boolean isBlocking;

    @C09CT("is_geo_blocked_profile")
    public Boolean isGeoBlocked;

    @C09CT("family_pairing_is_pending_unblock_request")
    public Boolean isPendingUnblockRequest;

    public final Integer getFollowStatus() {
        return this.followStatus;
    }

    public final Integer getFollowerStatus() {
        return this.followerStatus;
    }

    public final Integer getFpBlockByType() {
        return this.fpBlockByType;
    }

    public final Integer getFriendCount() {
        return this.friendCount;
    }

    public final Boolean isBlocked() {
        return this.isBlocked;
    }

    public final Boolean isBlocking() {
        return this.isBlocking;
    }

    public final Boolean isGeoBlocked() {
        return this.isGeoBlocked;
    }

    public final Boolean isPendingUnblockRequest() {
        return this.isPendingUnblockRequest;
    }

    public final void setBlocked(Boolean bool) {
        this.isBlocked = bool;
    }

    public final void setBlocking(Boolean bool) {
        this.isBlocking = bool;
    }

    public final void setFollowStatus(Integer num) {
        this.followStatus = num;
    }

    public final void setFollowerStatus(Integer num) {
        this.followerStatus = num;
    }

    public final void setFpBlockByType(Integer num) {
        this.fpBlockByType = num;
    }

    public final void setFriendCount(Integer num) {
        this.friendCount = num;
    }

    public final void setGeoBlocked(Boolean bool) {
        this.isGeoBlocked = bool;
    }

    public final void setPendingUnblockRequest(Boolean bool) {
        this.isPendingUnblockRequest = bool;
    }
}
