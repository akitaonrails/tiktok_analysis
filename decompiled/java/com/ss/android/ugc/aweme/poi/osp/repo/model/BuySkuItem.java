package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class BuySkuItem implements Serializable {

    @C09CT("product_id")
    public final String productId;

    @C09CT("num")
    public final Integer quantity;

    @C09CT("sku_id")
    public final String skuId;

    public BuySkuItem() {
        this(null, null, null);
    }

    public final BuySkuItem copy(String str, Integer num, String str2) {
        return new BuySkuItem(str, num, str2);
    }

    public BuySkuItem(String str, Integer num, String str2) {
        this.skuId = str;
        this.quantity = num;
        this.productId = str2;
    }
}
