package com.ss.android.ugc.aweme.checkout.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShopifyCheckoutTokenResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("expire_at")
    public Long expireAtTimeStamp;

    @C09CT("expire_in")
    public Long expireTime;

    @C09CT("offsite_payload")
    public TokenPayload offSiteTokenPayload;

    @C09CT("onsite_payload")
    public TokenPayload onSiteTokenPayload;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    public ShopifyCheckoutTokenResponse() {
        this(-1, null, null, null, null, null);
    }

    public final void setExpireAtTimeStamp(Long l) {
        this.expireAtTimeStamp = l;
    }

    public final void setExpireTime(Long l) {
        this.expireTime = l;
    }

    public final void setOffSiteTokenPayload(TokenPayload tokenPayload) {
        this.offSiteTokenPayload = tokenPayload;
    }

    public final void setOnSiteTokenPayload(TokenPayload tokenPayload) {
        this.onSiteTokenPayload = tokenPayload;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public ShopifyCheckoutTokenResponse(int i, String str, Long l, Long l2, TokenPayload tokenPayload, TokenPayload tokenPayload2) {
        this.statusCode = i;
        this.statusMsg = str;
        this.expireAtTimeStamp = l;
        this.expireTime = l2;
        this.onSiteTokenPayload = tokenPayload;
        this.offSiteTokenPayload = tokenPayload2;
    }
}
