package com.ss.android.ugc.aweme.account.login.passkey;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes14.dex */
public final class UserData {

    @C09CT("displayName")
    public final String displayName;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("name")
    public final String name;

    public UserData() {
        this(null, null, null);
    }

    public UserData(String str, String str2, String str3) {
        this.id = str;
        this.name = str2;
        this.displayName = str3;
    }
}
