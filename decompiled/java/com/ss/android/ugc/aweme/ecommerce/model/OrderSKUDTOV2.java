package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class OrderSKUDTOV2 {

    @C09CT("aggregation_count")
    public final Integer aggregationCount;

    @C09CT("aggregation_key")
    public final String aggregationKey;

    @C09CT("biz_type")
    public final Integer bizType;

    @C09CT("bundle_id")
    public final String bundleId;

    @C09CT("cart_item_id")
    public final String cartItemId;

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("channel_reserve_key")
    public final String channelReserveKey;

    @C09CT("currency")
    public final String currency;

    @C09CT("entrance_info")
    public final String entranceInfo;

    @C09CT("kol_id")
    public String kolId;

    @C09CT("logistics_service_id")
    public String logisticsServiceId;

    @C09CT("price_val")
    public final String priceVal;

    @C09CT("product_id")
    public final String productId;

    @C09CT("quantity")
    public final Integer quantity;

    @C09CT("sku_card_style")
    public final SkuCardStyleInfoV2 skuCardStyleInfo;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("source")
    public final Integer source;

    @C09CT("source_info")
    public final String sourceInfo;

    @C09CT("warehouse_id")
    public final String warehouseId;

    public OrderSKUDTOV2(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num3, SkuCardStyleInfoV2 skuCardStyleInfoV2, Integer num4, String str14) {
        this.productId = str;
        this.skuId = str2;
        this.quantity = num;
        this.cartItemId = str3;
        this.source = num2;
        this.sourceInfo = str4;
        this.entranceInfo = str5;
        this.chainKey = str6;
        this.kolId = str7;
        this.logisticsServiceId = str8;
        this.priceVal = str9;
        this.currency = str10;
        this.warehouseId = str11;
        this.bundleId = str12;
        this.aggregationKey = str13;
        this.aggregationCount = num3;
        this.skuCardStyleInfo = skuCardStyleInfoV2;
        this.bizType = num4;
        this.channelReserveKey = str14;
    }
}
