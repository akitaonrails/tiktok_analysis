package com.ss.android.ugc.aweme.poi.detail.cells;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class FeedProductInfo implements Serializable {

    @C09CT("product_id")
    public final Long productId;

    @C09CT("product_name")
    public final String productName;

    @C09CT("product_price_info")
    public final ProductPriceInfo productPriceInfo;

    public FeedProductInfo() {
        this(null, null, null);
    }

    public int hashCode() {
        String str = this.productName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.productId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        ProductPriceInfo productPriceInfo = this.productPriceInfo;
        return iHashCode2 + (productPriceInfo != null ? productPriceInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedProductInfo(productName=");
        sbLIZ.append(this.productName);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", productPriceInfo=");
        sbLIZ.append(this.productPriceInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedProductInfo(String str, Long l, ProductPriceInfo productPriceInfo) {
        this.productName = str;
        this.productId = l;
        this.productPriceInfo = productPriceInfo;
    }
}
