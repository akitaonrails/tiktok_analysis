package com.bytedance.iap.service.mp.model;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class CreateOrderRequest {

    @C09CT("biz_id")
    public final String bizId;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("order_id")
    public final String orderId;

    @C09CT("payment_method")
    public final int paymentMethod;

    public CreateOrderRequest() {
        this("", "", 0, C2097608Jq.LJ());
    }

    public CreateOrderRequest(String str, String str2, int i, Map<String, String> map) {
        this.bizId = str;
        this.orderId = str2;
        this.paymentMethod = i;
        this.extra = map;
    }
}
