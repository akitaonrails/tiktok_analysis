package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class SubmitPaymentResponse implements Serializable {

    @C09CT("order_detail")
    public final OrderDetail orderDetail;

    @C09CT("result_code")
    public final String resultCode;

    public SubmitPaymentResponse() {
        this(null, null);
    }

    public SubmitPaymentResponse(String str, OrderDetail orderDetail) {
        this.resultCode = str;
        this.orderDetail = orderDetail;
    }
}
