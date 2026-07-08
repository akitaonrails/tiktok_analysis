package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonProductInfo {

    @C09CT("product_id")
    public final String productId;

    @C09CT("sku_ids")
    public final List<String> skuIds;

    public AddonProductInfo() {
        this(null, null);
    }

    public AddonProductInfo(String str, List<String> list) {
        this.productId = str;
        this.skuIds = list;
    }
}
