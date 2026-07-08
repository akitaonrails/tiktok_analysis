package com.bytedance.iap.service.mp.model;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class MoneyV1ActiveContractResponse {

    @C09CT("data")
    public Data data;

    @C09CT("status_code")
    public Integer statusCode;

    public static final class Data {

        @C09CT("contract")
        public MoneyV1ActiveContract contract;

        @C09CT("message")
        public String message = "";

        @C09CT("use_common_sku")
        public boolean useCommonSku;
    }
}
