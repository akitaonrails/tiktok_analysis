package com.bytedance.pipo.verify.base.model.request;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes27.dex */
public final class VerifyResultNotifyRequest {

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    @C09CT("status_reason")
    public final StatusReasonRequest statusReason;

    @C09CT("verify_id")
    public final String verifyId;

    @C09CT("verify_type")
    public final String verifyType;

    public VerifyResultNotifyRequest() {
        this(null, null, null, null, null);
    }

    public VerifyResultNotifyRequest(String str, String str2, String str3, StatusReasonRequest statusReasonRequest, String str4) {
        this.verifyId = str;
        this.verifyType = str2;
        this.status = str3;
        this.statusReason = statusReasonRequest;
        this.merchantId = str4;
    }
}
