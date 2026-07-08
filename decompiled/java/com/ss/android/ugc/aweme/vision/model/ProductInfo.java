package com.ss.android.ugc.aweme.vision.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class ProductInfo implements Serializable {

    @C09CT("product_id")
    public String productId;

    @C09CT("product_title")
    public String productTitle;

    public ProductInfo() {
        this(null, null);
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setProductTitle(String str) {
        this.productTitle = str;
    }

    public ProductInfo(String str, String str2) {
        this.productId = str;
        this.productTitle = str2;
    }
}
