package com.bytedance.iap.service.mp.model;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class CreateOrderResponse {

    @C09CT("data")
    public Data data;

    @C09CT("status_code")
    public Integer statusCode;

    public static final class Data {

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
}
