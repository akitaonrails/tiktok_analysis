package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionInfoData {

    @C09CT("products")
    public final List<ProductPackStruct> productionInfoPack;

    @C09CT("related_product_map")
    public final Map<String, RelateProduct> relatedProductMap;

    public PromotionInfoData(Map<String, RelateProduct> map, List<ProductPackStruct> list) {
        this.relatedProductMap = map;
        this.productionInfoPack = list;
    }
}
