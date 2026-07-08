package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes30.dex */
public class FriendTabStruct {

    @C09CT("default_follow_tab")
    public Boolean defaultFollowTab;

    @C09CT("friend_tab_desc")
    public String friendTabDesc;

    public Boolean getDefaultFollowTab() throws C316660CbA {
        Boolean bool = this.defaultFollowTab;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public String getFriendTabDesc() throws C316660CbA {
        String str = this.friendTabDesc;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }
}
