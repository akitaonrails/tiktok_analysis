package com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfig)) {
            return false;
        }
        ProductConfig productConfig = (ProductConfig) obj;
        return Intrinsics.LJFF(this.productId, productConfig.productId) && Intrinsics.LJFF(this.imageUrl, productConfig.imageUrl) && Intrinsics.LJFF(this.index, productConfig.index) && Intrinsics.LJFF(this.price, productConfig.price);
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

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductConfig(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", price=");
        sbLIZ.append(this.price);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProductConfig(Long l, String str, Long l2, Price price) {
        this.productId = l;
        this.imageUrl = str;
        this.index = l2;
        this.price = price;
    }
}
