package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class UserInfo implements Serializable {

    @C09CT("user_avatar")
    public final String userAvatar;

    @C09CT("username")
    public final String username;

    public UserInfo() {
        this(null, null);
    }

    public UserInfo(String str, String str2) {
        this.username = str;
        this.userAvatar = str2;
    }
}
