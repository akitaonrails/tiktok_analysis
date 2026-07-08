package com.bytedance.pipo.verify.base.model.request;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class StatusReasonRequest {

    @C09CT("reason_code")
    public final Integer reasonCode;

    @C09CT("reason_msg")
    public final String reasonMsg;

    public StatusReasonRequest() {
        this(null, null);
    }

    public StatusReasonRequest(Integer num, String str) {
        this.reasonCode = num;
        this.reasonMsg = str;
    }
}
