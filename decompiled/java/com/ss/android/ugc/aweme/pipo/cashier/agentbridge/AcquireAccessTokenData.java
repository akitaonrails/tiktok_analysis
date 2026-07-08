package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class AcquireAccessTokenData {

    @C09CT("expires_in")
    public final Integer expiresIn;

    @C09CT("jwt_token")
    public final String jwtToken;

    @C09CT("muid")
    public final String merchantUserId;

    @C09CT("session_id")
    public final String sessionId;

    public AcquireAccessTokenData() {
        this(null, null, null, null);
    }

    public AcquireAccessTokenData(String str, String str2, String str3, Integer num) {
        this.jwtToken = str;
        this.sessionId = str2;
        this.merchantUserId = str3;
        this.expiresIn = num;
    }
}
