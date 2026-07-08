package com.bytedance.globalpayment.iap.common.ability.model.api.entity.createpayorder;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class IapV1PayRequest {

    @C09CT("biz_id")
    public final String bizId;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("order_id")
    public final String orderId;

    @C09CT("payment_method")
    public final int paymentMethod;

    public IapV1PayRequest(String str, String str2, int i, Map<String, String> map) {
        this.bizId = str;
        this.orderId = str2;
        this.paymentMethod = i;
        this.extra = map;
    }
}
