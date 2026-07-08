package com.ss.android.ugc.aweme.account.security;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class SecurityCheckUpInfoApiResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public final SecurityCheckUpInfoData data;

    @C09CT("message")
    public final String message;

    public SecurityCheckUpInfoApiResponse() {
        this("", null);
    }

    public SecurityCheckUpInfoApiResponse(String str, SecurityCheckUpInfoData securityCheckUpInfoData) {
        this.message = str;
        this.data = securityCheckUpInfoData;
    }
}
