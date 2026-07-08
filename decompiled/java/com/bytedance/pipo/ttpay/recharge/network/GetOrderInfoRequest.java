package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class GetOrderInfoRequest implements Serializable {

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("order_id")
    public final String orderId;

    @C09CT("pipo_error_code_params")
    public final String pipoErrorCodeParams;

    @C09CT("trade_type")
    public final String tradeType;

    public GetOrderInfoRequest(String str, String str2, String str3, String str4, String str5) {
        this.orderId = str;
        this.merchantId = str2;
        this.merchantUserId = str3;
        this.tradeType = str4;
        this.pipoErrorCodeParams = str5;
    }
}
