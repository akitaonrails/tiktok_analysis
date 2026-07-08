package com.ss.android.ugc.aweme.checkout.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class TokenPayload implements Serializable {
    public static final int $stable = 8;

    @C09CT("issued_at")
    public Long expireAtTimeStamp;

    @C09CT("jwt")
    public String jwtToken;

    public TokenPayload() {
        this(null, null);
    }

    public final void setExpireAtTimeStamp(Long l) {
        this.expireAtTimeStamp = l;
    }

    public final void setJwtToken(String str) {
        this.jwtToken = str;
    }

    public TokenPayload(String str, Long l) {
        this.jwtToken = str;
        this.expireAtTimeStamp = l;
    }
}
