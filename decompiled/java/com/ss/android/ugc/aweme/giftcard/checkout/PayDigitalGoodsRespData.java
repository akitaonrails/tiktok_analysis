package com.ss.android.ugc.aweme.giftcard.checkout;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PayDigitalGoodsRespData {

    @C09CT("authorization_response_str")
    public final String authorizationResponseStr;

    @C09CT("order_id")
    public final String orderId;

    @C09CT("order_status")
    public final String orderStatus;

    public PayDigitalGoodsRespData() {
        this(null, null, null);
    }

    public PayDigitalGoodsRespData(String str, String str2, String str3) {
        this.orderId = str;
        this.orderStatus = str2;
        this.authorizationResponseStr = str3;
    }
}
