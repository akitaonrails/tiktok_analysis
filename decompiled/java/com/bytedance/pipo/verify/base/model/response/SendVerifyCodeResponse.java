package com.bytedance.pipo.verify.base.model.response;

import X.C09CT;
import com.bytedance.pipo.verify.base.model.StatusReason;

/* JADX INFO: loaded from: classes27.dex */
public final class SendVerifyCodeResponse {

    @C09CT("is_send_success")
    public final Boolean isSendSuccess;

    @C09CT("send_id")
    public final String sendId;

    @C09CT("status_reason")
    public final StatusReason statusReason;

    public SendVerifyCodeResponse() {
        this(null, null, null);
    }

    public SendVerifyCodeResponse(Boolean bool, String str, StatusReason statusReason) {
        this.isSendSuccess = bool;
        this.sendId = str;
        this.statusReason = statusReason;
    }
}
