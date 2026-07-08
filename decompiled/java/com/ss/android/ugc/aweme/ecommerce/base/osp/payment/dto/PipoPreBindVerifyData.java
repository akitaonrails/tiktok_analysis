package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoPreBindVerifyData {
    public String LIZ;

    @C09CT("appeal_info")
    public final AppealEntranceInfo appealInfo;

    @C09CT("decision")
    public final String decision;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("order_id")
    public final String orderId;

    @C09CT("risk_verify_info")
    public final String riskVerifyInfo;

    public PipoPreBindVerifyData() {
        this(null, null, null, null, null, null);
    }

    public PipoPreBindVerifyData(String str, String str2, String str3, String str4, String str5, AppealEntranceInfo appealEntranceInfo) {
        this.decision = str;
        this.riskVerifyInfo = str2;
        this.orderId = str3;
        this.errorCode = str4;
        this.errorMsg = str5;
        this.appealInfo = appealEntranceInfo;
    }
}
