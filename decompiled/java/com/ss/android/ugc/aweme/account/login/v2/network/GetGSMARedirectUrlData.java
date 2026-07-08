package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class GetGSMARedirectUrlData implements Serializable {
    public static final int $stable = 0;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("gsma_available")
    public final Boolean gsmaAvailable;

    @C09CT("has_account")
    public final Boolean hasAccount;

    @C09CT("redirect_url")
    public final String redirectUrl;

    public GetGSMARedirectUrlData(Boolean bool, String str, Boolean bool2, Integer num) {
        this.hasAccount = bool;
        this.redirectUrl = str;
        this.gsmaAvailable = bool2;
        this.errorCode = num;
    }
}
