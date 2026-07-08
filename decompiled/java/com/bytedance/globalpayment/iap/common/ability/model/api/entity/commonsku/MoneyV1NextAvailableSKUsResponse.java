package com.bytedance.globalpayment.iap.common.ability.model.api.entity.commonsku;

import X.C09CT;
import com.bytedance.globalpayment.iap.model.SKUInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MoneyV1NextAvailableSKUsResponse {

    @C09CT("next_available_skus")
    public Map<String, SKUInfo> nextAvailableSkus = new LinkedHashMap();
}
