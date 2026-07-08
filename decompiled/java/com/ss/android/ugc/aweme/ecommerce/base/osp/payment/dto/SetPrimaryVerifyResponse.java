package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class SetPrimaryVerifyResponse {

    @C09CT("decision")
    public final String decision;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("pipo_error_action")
    public final String pipoErrorAction;

    @C09CT("risk_verify_info")
    public final String riskVerifyInfo;

    @C09CT("verify_id")
    public final String verifyId;

    public SetPrimaryVerifyResponse() {
        this(null, null, null, null, null, null);
    }

    public SetPrimaryVerifyResponse(String str, String str2, String str3, String str4, String str5, String str6) {
        this.decision = str;
        this.riskVerifyInfo = str2;
        this.verifyId = str3;
        this.errorCode = str4;
        this.errorMsg = str5;
        this.pipoErrorAction = str6;
    }
}
