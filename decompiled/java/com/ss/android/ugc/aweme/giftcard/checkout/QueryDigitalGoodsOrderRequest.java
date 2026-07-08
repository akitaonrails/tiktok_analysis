package com.ss.android.ugc.aweme.giftcard.checkout;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class QueryDigitalGoodsOrderRequest {

    @C09CT("order_id")
    public final String orderId;

    @C09CT("risk_info")
    public final String riskInfo;

    public QueryDigitalGoodsOrderRequest() {
        this(null, null);
    }

    public QueryDigitalGoodsOrderRequest(String str, String str2) {
        this.orderId = str;
        this.riskInfo = str2;
    }
}
