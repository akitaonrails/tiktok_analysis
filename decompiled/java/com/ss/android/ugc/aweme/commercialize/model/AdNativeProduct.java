package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class AdNativeProduct implements Serializable {

    @C09CT("image_url")
    public String imageUrl;

    @C09CT("product_id")
    public String productId;

    public AdNativeProduct() {
        this("", "");
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public AdNativeProduct(String str, String str2) {
        this.imageUrl = str;
        this.productId = str2;
    }
}
