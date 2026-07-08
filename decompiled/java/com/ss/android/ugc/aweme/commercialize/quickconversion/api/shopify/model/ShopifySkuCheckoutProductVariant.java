package com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class ShopifySkuCheckoutProductVariant implements Serializable {

    @C09CT("available")
    public final Boolean available;

    @C09CT("currency")
    public final String currency;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("price")
    public final String price;

    @C09CT("title")
    public final String title;

    @C09CT("variant_id")
    public final String variantId;

    public final Boolean getAvailable() {
        return this.available;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVariantId() {
        return this.variantId;
    }

    public ShopifySkuCheckoutProductVariant(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this.variantId = str;
        this.title = str2;
        this.price = str3;
        this.currency = str4;
        this.imageUrl = str5;
        this.available = bool;
    }
}
