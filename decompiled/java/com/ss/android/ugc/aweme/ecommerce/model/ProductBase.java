package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class ProductBase implements Serializable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("price")
    public final ProductPrice price;

    @C09CT("sold_count")
    public final Integer soldCount;

    @C09CT("sold_text_info")
    public final ShowTextInfo soldTextInfo;

    public ProductBase() {
        this(null, null, null, null);
    }

    public ProductBase(ProductPrice productPrice, Integer num, ShowTextInfo showTextInfo, String str) {
        this.price = productPrice;
        this.soldCount = num;
        this.soldTextInfo = showTextInfo;
        this.daInfo = str;
    }
}
