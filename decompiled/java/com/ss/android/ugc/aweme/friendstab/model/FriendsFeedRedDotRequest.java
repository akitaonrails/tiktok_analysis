package com.ss.android.ugc.aweme.friendstab.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class FriendsFeedRedDotRequest extends SocialFeedRedDotRequest {

    @C09CT("not_entering_friend_tab_number")
    public Integer notEnterFriendsTabNum;

    public FriendsFeedRedDotRequest() {
        this(null);
    }

    public final FriendsFeedRedDotRequest copy(Integer num) {
        return new FriendsFeedRedDotRequest(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FriendsFeedRedDotRequest) && Intrinsics.LJFF(this.notEnterFriendsTabNum, ((FriendsFeedRedDotRequest) obj).notEnterFriendsTabNum);
    }

    public int hashCode() {
        Integer num = this.notEnterFriendsTabNum;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsFeedRedDotRequest(notEnterFriendsTabNum=");
        sbLIZ.append(this.notEnterFriendsTabNum);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getNotEnterFriendsTabNum() {
        return this.notEnterFriendsTabNum;
    }

    public FriendsFeedRedDotRequest(Integer num) {
        this.notEnterFriendsTabNum = num;
    }

    public final void setNotEnterFriendsTabNum(Integer num) {
        this.notEnterFriendsTabNum = num;
    }
}
