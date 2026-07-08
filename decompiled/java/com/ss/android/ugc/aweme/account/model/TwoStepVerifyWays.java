package com.ss.android.ugc.aweme.account.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class TwoStepVerifyWays implements Serializable {

    @C09CT("email")
    public final String email;

    @C09CT("is_available")
    public final Boolean isAvailable;

    @C09CT("mobile")
    public final String mobile;

    @C09CT("password")
    public final String password;

    @C09CT("verify_way")
    public final String verify_way;

    public final Boolean isAvailable() {
        return this.isAvailable;
    }

    public TwoStepVerifyWays(String str, String str2, String str3, String str4, Boolean bool) {
        this.verify_way = str;
        this.mobile = str2;
        this.email = str3;
        this.password = str4;
        this.isAvailable = bool;
    }
}
