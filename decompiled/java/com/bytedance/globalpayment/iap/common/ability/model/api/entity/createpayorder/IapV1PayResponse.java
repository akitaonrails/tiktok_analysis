package com.bytedance.globalpayment.iap.common.ability.model.api.entity.createpayorder;

import X.C09CT;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.BaseErrorData;

/* JADX INFO: loaded from: classes28.dex */
public final class IapV1PayResponse extends BaseErrorData {

    @C09CT("base_url")
    public String baseUrl;

    @C09CT("channel_order_id")
    public String channelOrderId;

    @C09CT("merchant_id")
    public String merchantId;

    @C09CT("iap_payload")
    public String payLoad;

    @C09CT("pay_order_id")
    public String payOrderId;

    @C09CT("product_id")
    public String productId;

    @C09CT("product_type")
    public String productType;
}
