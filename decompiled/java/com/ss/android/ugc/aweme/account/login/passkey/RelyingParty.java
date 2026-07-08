package com.ss.android.ugc.aweme.account.login.passkey;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes4.dex */
public final class RelyingParty {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("name")
    public final String name;

    public RelyingParty() {
        this(null, null);
    }

    public RelyingParty(String str, String str2) {
        this.name = str;
        this.id = str2;
    }
}
