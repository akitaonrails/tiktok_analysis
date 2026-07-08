package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SelectedSkuInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("sku_amount")
    public final String skuAmount;

    @C09CT("sku_currency")
    public final String skuCurrency;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("sku_price")
    public final String skuPrice;

    @C09CT("sku_quantity")
    public final Integer skuQuantity;

    @C09CT("symbol")
    public final String symbol;

    public SelectedSkuInfo() {
        this(null, null, null, null, null, null);
    }

    public SelectedSkuInfo(String str, String str2, String str3, String str4, Integer num, String str5) {
        this.skuId = str;
        this.skuPrice = str2;
        this.skuCurrency = str3;
        this.skuAmount = str4;
        this.skuQuantity = num;
        this.symbol = str5;
    }
}
