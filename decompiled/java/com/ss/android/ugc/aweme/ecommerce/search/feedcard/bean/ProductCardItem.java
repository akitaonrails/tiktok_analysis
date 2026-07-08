package com.ss.android.ugc.aweme.ecommerce.search.feedcard.bean;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductCardItem implements Serializable {

    @C09CT("need_filter")
    public final Integer needFilter;

    @C09CT("position")
    public final Integer position;

    @C09CT("product_id")
    public final String productId;

    public ProductCardItem(String str, Integer num, Integer num2) {
        this.productId = str;
        this.position = num;
        this.needFilter = num2;
    }
}
