package com.ss.android.ugc.aweme.account.org.create;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes26.dex */
public final class OrgAccount implements Serializable {
    public static final int $stable = 0;

    @C09CT("avatar")
    public final String avatar;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("username")
    public final String username;

    public OrgAccount() {
        this("", "", "");
    }

    public OrgAccount(String str, String str2, String str3) {
        this.nickname = str;
        this.username = str2;
        this.avatar = str3;
    }
}
