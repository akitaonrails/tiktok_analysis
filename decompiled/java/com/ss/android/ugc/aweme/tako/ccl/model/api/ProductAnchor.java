package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductAnchor {

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_name")
    public final String productName;

    public ProductAnchor() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductAnchor)) {
            return false;
        }
        ProductAnchor productAnchor = (ProductAnchor) obj;
        return Intrinsics.LJFF(this.productName, productAnchor.productName) && Intrinsics.LJFF(this.productId, productAnchor.productId);
    }

    public final int hashCode() {
        String str = this.productName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductAnchor(productName=");
        sbLIZ.append(this.productName);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProductAnchor(String str, String str2) {
        this.productName = str;
        this.productId = str2;
    }
}
