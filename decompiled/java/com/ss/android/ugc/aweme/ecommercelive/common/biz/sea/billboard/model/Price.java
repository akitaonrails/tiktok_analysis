package com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Price {

    @C09CT("original_price_with_currency")
    public final String originalPriceStr;

    @C09CT("promotion_price_with_currency")
    public final String promotionPriceStr;

    public Price() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return Intrinsics.LJFF(this.originalPriceStr, price.originalPriceStr) && Intrinsics.LJFF(this.promotionPriceStr, price.promotionPriceStr);
    }

    public final int hashCode() {
        String str = this.originalPriceStr;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.promotionPriceStr;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Price(originalPriceStr=");
        sbLIZ.append(this.originalPriceStr);
        sbLIZ.append(", promotionPriceStr=");
        sbLIZ.append(this.promotionPriceStr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Price(String str, String str2) {
        this.originalPriceStr = str;
        this.promotionPriceStr = str2;
    }
}
