package com.bytedance.iap.service.mp.model;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MoneyV1NextAvailableSKUsResponse {

    @C09CT("data")
    public Data data;

    @C09CT("status_code")
    public Integer statusCode;

    public static final class Data {

        @C09CT("next_available_skus")
        public Map<String, SKUInfo> nextAvailableSkus = new LinkedHashMap();
    }
}
