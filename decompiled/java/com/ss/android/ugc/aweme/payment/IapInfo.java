package com.ss.android.ugc.aweme.payment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class IapInfo {

    @C09CT("biz_id")
    public final String bizId;

    @C09CT("iap_order_id")
    public final String iapOrderId;

    @C09CT("iap_payload")
    public final String iapPayload;

    public IapInfo() {
        this("", "", "");
    }

    public IapInfo(String str, String str2, String str3) {
        this.bizId = str;
        this.iapOrderId = str2;
        this.iapPayload = str3;
    }
}
