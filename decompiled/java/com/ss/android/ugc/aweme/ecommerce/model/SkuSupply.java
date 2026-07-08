package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class SkuSupply implements Serializable {

    @C09CT("product_id")
    public final String productId;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("sku_id")
    public final String skuId;

    public SkuSupply(String str, String str2, String str3) {
        this.skuId = str;
        this.productId = str2;
        this.sellerId = str3;
    }
}
