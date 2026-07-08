package com.ss.android.ugc.aweme.giftcard.checkout;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class QueryDigitalGoodsOrderRespData {

    @C09CT("order_id")
    public final String orderId;

    @C09CT("order_status")
    public final String orderStatus;

    public QueryDigitalGoodsOrderRespData() {
        this(null, null);
    }

    public QueryDigitalGoodsOrderRespData(String str, String str2) {
        this.orderId = str;
        this.orderStatus = str2;
    }
}
