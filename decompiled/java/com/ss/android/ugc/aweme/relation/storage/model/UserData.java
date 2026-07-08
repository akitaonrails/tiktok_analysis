package com.ss.android.ugc.aweme.relation.storage.model;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;

/* JADX INFO: loaded from: classes14.dex */
public final class UserData {
    public String LIZ;

    @C09CT("avatar_168x168")
    public final n avatar168;

    @C09CT("avatar_300x300")
    public final n avatar300;

    @C09CT("follow_status")
    public final Integer followStatus;

    @C09CT("follower_status")
    public final Integer followerStatus;

    @C09CT("is_block")
    public final Boolean isBlock;

    @C09CT("is_private_account")
    public final Boolean isPrivateAccount;

    @C09CT("secret")
    public final Integer isSecret;

    @C09CT("matched_friend")
    public final MatchedFriendStruct matchedFriendStruct;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("uid")
    public final String uid;

    public UserData() {
        this(null, null, null, null, Boolean.FALSE, Boolean.FALSE, null, null, null, null);
    }

    public UserData(String str, String str2, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, n nVar, n nVar2, MatchedFriendStruct matchedFriendStruct) {
        this.uid = str;
        this.nickname = str2;
        this.followStatus = num;
        this.followerStatus = num2;
        this.isBlock = bool;
        this.isPrivateAccount = bool2;
        this.isSecret = num3;
        this.avatar168 = nVar;
        this.avatar300 = nVar2;
        this.matchedFriendStruct = matchedFriendStruct;
    }
}
