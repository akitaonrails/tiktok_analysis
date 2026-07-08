package com.ss.android.ugc.aweme.pipo.cashier.common.risk;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class AuthenPreRiskResponse {

    @C09CT("decision")
    public final String decision;

    @C09CT("order_id")
    public final String orderId;

    @C09CT("risk_block_raw_msg")
    public final String riskBlockRawMsg;

    @C09CT("risk_verify_info")
    public final String riskVerifyInfo;

    public AuthenPreRiskResponse(String str, String str2, String str3, String str4) {
        this.orderId = str;
        this.decision = str2;
        this.riskVerifyInfo = str3;
        this.riskBlockRawMsg = str4;
    }
}
