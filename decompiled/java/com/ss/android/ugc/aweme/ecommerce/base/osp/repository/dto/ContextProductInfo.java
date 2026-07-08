package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ContextProductInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("currency")
    public final String currency;

    @C09CT("price")
    public final String price;

    @C09CT("product_id")
    public final String productId;

    @C09CT("selected_sku_info")
    public final SelectedSkuInfo selectedSkuInfo;

    @C09CT("seller_id")
    public final String sellerId;

    public ContextProductInfo() {
        this(null, null, null, null, null);
    }

    public ContextProductInfo(String str, String str2, String str3, String str4, SelectedSkuInfo selectedSkuInfo) {
        this.productId = str;
        this.sellerId = str2;
        this.price = str3;
        this.currency = str4;
        this.selectedSkuInfo = selectedSkuInfo;
    }
}
