package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderData {

    @C09CT("order_id")
    public final String orderId;

    @C09CT("order_type")
    public final Integer orderType;

    public OrderData(Integer num, String str) {
        this.orderType = num;
        this.orderId = str;
    }
}
