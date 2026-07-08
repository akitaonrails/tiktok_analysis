package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class FavoriteInfo {

    @C09CT("catalog_id")
    public final String catalogId;

    @C09CT("track_extra_info")
    public final Map<String, Object> extraInfo;

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_type")
    public final int productType;

    @C09CT("sell_from")
    public final String sellFrom;

    @C09CT("sku_prices")
    public final List<FavoriteSkuPrice> skuPrices;

    public FavoriteInfo(String str, int i, String str2, List<FavoriteSkuPrice> list, String str3, Map<String, ? extends Object> map) {
        this.productId = str;
        this.productType = i;
        this.sellFrom = str2;
        this.skuPrices = list;
        this.catalogId = str3;
        this.extraInfo = map;
    }
}
