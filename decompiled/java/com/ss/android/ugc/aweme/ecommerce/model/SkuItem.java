package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class SkuItem implements Serializable {

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("sku_supply")
    public final SkuSupply skuSupply;

    public SkuItem(String str, SkuSupply skuSupply) {
        this.skuId = str;
        this.skuSupply = skuSupply;
    }
}
