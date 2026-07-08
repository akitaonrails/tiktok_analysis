package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileCommonInfo implements Serializable {

    @C09CT("friend_count")
    public Integer friendCount;

    @C09CT("mode")
    public String mode;

    @C09CT("user_account_info")
    public UserAccountInfo userAccountInfo;

    @C09CT("user_profile_info")
    public UserProfileInfo userProfileInfo;

    @C09CT("user_relation_info")
    public UserRelationInfo userRelationInfo;

    @C09CT("user_statics_info")
    public UserStaticsInfo userStaticsInfo;

    public final Integer getFriendCount() {
        return this.friendCount;
    }

    public final String getMode() {
        return this.mode;
    }

    public final UserAccountInfo getUserAccountInfo() {
        return this.userAccountInfo;
    }

    public final UserProfileInfo getUserProfileInfo() {
        return this.userProfileInfo;
    }

    public final UserRelationInfo getUserRelationInfo() {
        return this.userRelationInfo;
    }

    public final UserStaticsInfo getUserStaticsInfo() {
        return this.userStaticsInfo;
    }

    public final void setFriendCount(Integer num) {
        this.friendCount = num;
    }

    public final void setMode(String str) {
        this.mode = str;
    }

    public final void setUserAccountInfo(UserAccountInfo userAccountInfo) {
        this.userAccountInfo = userAccountInfo;
    }

    public final void setUserProfileInfo(UserProfileInfo userProfileInfo) {
        this.userProfileInfo = userProfileInfo;
    }

    public final void setUserRelationInfo(UserRelationInfo userRelationInfo) {
        this.userRelationInfo = userRelationInfo;
    }

    public final void setUserStaticsInfo(UserStaticsInfo userStaticsInfo) {
        this.userStaticsInfo = userStaticsInfo;
    }
}
