package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price;

import X.AbstractC1066304Ez;
import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPriceBffVO extends AbstractC1066304Ez {

    @C09CT("product_price")
    public final PDPSeaBffPrice productPrice;

    @C09CT("schema")
    public final String schema;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("sku_prices")
    public final Map<String, PDPSeaBffPrice> skuPrices;

    public SeaPriceBffVO() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPriceBffVO)) {
            return false;
        }
        SeaPriceBffVO seaPriceBffVO = (SeaPriceBffVO) obj;
        return Intrinsics.LJFF(this.productPrice, seaPriceBffVO.productPrice) && Intrinsics.LJFF(this.skuPrices, seaPriceBffVO.skuPrices) && Intrinsics.LJFF(this.schema, seaPriceBffVO.schema) && Intrinsics.LJFF(this.skuId, seaPriceBffVO.skuId);
    }

    public final int hashCode() {
        PDPSeaBffPrice pDPSeaBffPrice = this.productPrice;
        int iHashCode = (pDPSeaBffPrice == null ? 0 : pDPSeaBffPrice.hashCode()) * 31;
        Map<String, PDPSeaBffPrice> map = this.skuPrices;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.schema;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.skuId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPriceBffVO(productPrice=");
        sbLIZ.append(this.productPrice);
        sbLIZ.append(", skuPrices=");
        sbLIZ.append(this.skuPrices);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPriceBffVO(PDPSeaBffPrice pDPSeaBffPrice, Map<String, PDPSeaBffPrice> map, String str, String str2) {
        this.productPrice = pDPSeaBffPrice;
        this.skuPrices = map;
        this.schema = str;
        this.skuId = str2;
    }
}
