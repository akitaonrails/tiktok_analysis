package com.bytedance.iap.core.model;

import X.C09CT;
import X.EnumC1780720wRK;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class IAPQueryRequest {

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("product_ids")
    public final List<String> productIds;

    @C09CT("product_type")
    public final EnumC1780720wRK productType;

    public IAPQueryRequest(String str, List<String> list, EnumC1780720wRK enumC1780720wRK) {
        this.merchantId = str;
        this.productIds = list;
        this.productType = enumC1780720wRK;
    }
}
