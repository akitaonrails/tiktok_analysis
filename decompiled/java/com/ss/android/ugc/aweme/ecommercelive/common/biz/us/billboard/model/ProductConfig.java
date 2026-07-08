package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ProductConfig {

    @C09CT("product_image_url")
    public final String imageUrl;

    @C09CT("shop_bag_index")
    public final Long index;

    @C09CT("product_price")
    public final Price price;

    @C09CT("product_id")
    public final Long productId;

    public ProductConfig() {
        this(null, null, null, null);
    }

    public final int hashCode() {
        Long l = this.productId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.index;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Price price = this.price;
        return iHashCode3 + (price != null ? price.hashCode() : 0);
    }

    public ProductConfig(Long l, String str, Long l2, Price price) {
        this.productId = l;
        this.imageUrl = str;
        this.index = l2;
        this.price = price;
    }
}
