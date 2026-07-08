package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;

/* JADX INFO: loaded from: classes35.dex */
public final class MAFIMUser extends IMUser {
    public int LL;

    @C09CT("friend_type_str")
    public String friendTypeStr;

    @C09CT("is_private_account")
    public boolean isPrivateAccount;

    @C09CT("mutual_relation")
    public MutualStruct mMutualStruct;

    @C09CT("rid")
    public String requestId;

    @C09CT("social_info")
    public String socialInfo;

    @Override // com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
    public int getShareStatusDefault() {
        return 2;
    }

    public final String getFriendTypeStr() {
        return this.friendTypeStr;
    }

    public final MutualStruct getMMutualStruct() {
        return this.mMutualStruct;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSocialInfo() {
        return this.socialInfo;
    }

    public final int getSortIndex() {
        return this.LL;
    }

    public final boolean isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public final void setFriendTypeStr(String str) {
        this.friendTypeStr = str;
    }

    public final void setMMutualStruct(MutualStruct mutualStruct) {
        this.mMutualStruct = mutualStruct;
    }

    public final void setPrivateAccount(boolean z) {
        this.isPrivateAccount = z;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setSocialInfo(String str) {
        this.socialInfo = str;
    }

    public final void setSortIndex(int i) {
        this.LL = i;
    }
}
