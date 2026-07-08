package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class VerifyWay implements Serializable {
    public static final int $stable = 0;

    @C09CT("is_available")
    public final Boolean is_available;

    @C09CT("verify_way")
    public final String verify_way;

    public final Boolean is_available() {
        return this.is_available;
    }

    public VerifyWay(String str, Boolean bool) {
        this.verify_way = str;
        this.is_available = bool;
    }
}
