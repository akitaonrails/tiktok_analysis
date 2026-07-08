package com.ss.android.ugc.aweme.ecommerce.base.combinepayment.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class RiskContextRequest {

    @C09CT("biz_content")
    public final String bizContent;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("request_time")
    public final String requestTime;

    @C09CT("sign")
    public final String sign;

    public RiskContextRequest(String str, String str2, String str3, String str4) {
        this.bizContent = str;
        this.merchantId = str2;
        this.requestTime = str3;
        this.sign = str4;
    }
}
