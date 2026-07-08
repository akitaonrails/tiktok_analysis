package com.bytedance.pipo.verify.base.model.response;

import X.C09CT;
import com.bytedance.pipo.verify.base.model.StatusReason;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes27.dex */
public final class DoVerifyResponse {

    @C09CT("alert_msg")
    public final AlertMsg alertMsg;

    @C09CT("next_verify_info")
    public final String nextVerifyInfo;

    @C09CT("request_id")
    public final String requestId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    @C09CT("status_reason")
    public final StatusReason statusReason;

    @C09CT("verify_detail")
    public final String verifyDetail;

    @C09CT("verify_result")
    public final String verifyResult;

    @C09CT("verify_type")
    public final String verifyType;

    public DoVerifyResponse() {
        this(null, null, null, null, null, null, null, null);
    }

    public DoVerifyResponse(String str, String str2, String str3, String str4, StatusReason statusReason, String str5, String str6, AlertMsg alertMsg) {
        this.status = str;
        this.verifyResult = str2;
        this.verifyType = str3;
        this.nextVerifyInfo = str4;
        this.statusReason = statusReason;
        this.requestId = str5;
        this.verifyDetail = str6;
        this.alertMsg = alertMsg;
    }
}
