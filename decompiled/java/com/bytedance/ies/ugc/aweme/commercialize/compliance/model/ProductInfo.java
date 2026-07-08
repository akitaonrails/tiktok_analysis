package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class ProductInfo implements Serializable {

    @C09CT("currency")
    public final String currency;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("price")
    public final Float price;

    @C09CT("price_point_id")
    public final String pricePointId;

    @C09CT("product_id")
    public final String productId;

    @C09CT("sku_id")
    public final String skuId;

    public ProductInfo() {
        this("", "", "", Float.valueOf(0.0f), "", null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductInfo(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", merchantId=");
        sbLIZ.append(this.merchantId);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", price=");
        sbLIZ.append(this.price);
        sbLIZ.append(", currency=");
        sbLIZ.append(this.currency);
        sbLIZ.append(", pricePointId=");
        sbLIZ.append(this.pricePointId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProductInfo(String str, String str2, String str3, Float f, String str4, String str5) {
        this.productId = str;
        this.merchantId = str2;
        this.skuId = str3;
        this.price = f;
        this.currency = str4;
        this.pricePointId = str5;
    }
}
