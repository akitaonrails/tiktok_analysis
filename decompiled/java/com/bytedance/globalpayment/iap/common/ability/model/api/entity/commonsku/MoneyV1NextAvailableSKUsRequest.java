package com.bytedance.globalpayment.iap.common.ability.model.api.entity.commonsku;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class MoneyV1NextAvailableSKUsRequest {

    @C09CT("channel_sku_ids")
    public List<String> channelSkuIds;

    @C09CT("common_sku_ids")
    public List<String> commonSkuIds;

    @C09CT("mid")
    public String mid;

    @C09CT("price_region")
    public String priceRegion;

    public MoneyV1NextAvailableSKUsRequest() {
        this(null, null, null, null, 15, null);
    }

    public MoneyV1NextAvailableSKUsRequest(String str, List<String> list, List<String> list2, String str2) {
        this.mid = str;
        this.commonSkuIds = list;
        this.channelSkuIds = list2;
        this.priceRegion = str2;
    }

    public MoneyV1NextAvailableSKUsRequest(String str, List list, List list2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? "" : str2);
    }
}
