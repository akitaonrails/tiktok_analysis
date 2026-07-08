package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public class FriendTabStruct {

    @C09CT("default_follow_tab")
    public boolean defaultFollowTab;

    @C09CT("friend_tab_desc")
    public String friendTabDesc;

    public String getFriendTabDesc() {
        return this.friendTabDesc;
    }

    public boolean isDefaultFollowTab() {
        return this.defaultFollowTab;
    }

    public FriendTabStruct setDefaultFollowTab(boolean z) {
        this.defaultFollowTab = z;
        return this;
    }

    public FriendTabStruct setFriendTabDesc(String str) {
        this.friendTabDesc = str;
        return this;
    }
}
