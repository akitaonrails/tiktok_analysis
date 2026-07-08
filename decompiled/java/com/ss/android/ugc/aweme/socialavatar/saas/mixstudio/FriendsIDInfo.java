package com.ss.android.ugc.aweme.socialavatar.saas.mixstudio;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class FriendsIDInfo implements Serializable {

    @C09CT("chat_type")
    public final String chatType;

    @C09CT("default_friend_uid")
    public final String defaultFriendUid;

    @C09CT("friend_uid_list")
    public final List<String> friendUidList;

    public FriendsIDInfo() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsIDInfo)) {
            return false;
        }
        FriendsIDInfo friendsIDInfo = (FriendsIDInfo) obj;
        return Intrinsics.LJFF(this.friendUidList, friendsIDInfo.friendUidList) && Intrinsics.LJFF(this.defaultFriendUid, friendsIDInfo.defaultFriendUid) && Intrinsics.LJFF(this.chatType, friendsIDInfo.chatType);
    }

    public FriendsIDInfo(List<String> list, String str, String str2) {
        this.friendUidList = list;
        this.defaultFriendUid = str;
        this.chatType = str2;
    }
}
