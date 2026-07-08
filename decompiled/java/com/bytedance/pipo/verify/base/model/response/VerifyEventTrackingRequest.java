package com.bytedance.pipo.verify.base.model.response;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class VerifyEventTrackingRequest {

    @C09CT("event_name")
    public final String eventName;

    @C09CT("extra")
    public final String extra;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("platform")
    public final String platform;

    @C09CT("timestamp")
    public final Long timestamp;

    @C09CT("verify_id")
    public final String verifyId;

    @C09CT("verify_type")
    public final String verifyType;

    public VerifyEventTrackingRequest() {
        this(null, null, null, null, null, null, null, null);
    }

    public VerifyEventTrackingRequest(String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7) {
        this.verifyId = str;
        this.verifyType = str2;
        this.eventName = str3;
        this.merchantId = str4;
        this.merchantUserId = str5;
        this.timestamp = l;
        this.platform = str6;
        this.extra = str7;
    }
}
