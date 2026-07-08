package com.ss.android.ugc.aweme.vision.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class ProductCard implements Serializable {

    @C09CT("product_id")
    public final String productId;

    @C09CT("cover_image")
    public final String url;

    public ProductCard() {
        this(null, null);
    }

    public ProductCard(String str, String str2) {
        this.productId = str;
        this.url = str2;
    }
}
