package com.ss.android.ugc.aweme.ecommerce.common.model;

import X.C09CT;
import X.C2188811AlT;
import X.C757390TnN;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class ProductAddStatus implements Serializable {
    public static final C757390TnN Companion = new Object() { // from class: X.0TnN
    };

    @C09CT("add_status")
    public final Integer addStatus;

    @C09CT("product_id")
    public final String productId;

    public ProductAddStatus() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductAddStatus)) {
            return false;
        }
        ProductAddStatus productAddStatus = (ProductAddStatus) obj;
        return Intrinsics.LJFF(this.productId, productAddStatus.productId) && Intrinsics.LJFF(this.addStatus, productAddStatus.addStatus);
    }

    public int hashCode() {
        String str = this.productId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.addStatus;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductAddStatus(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", addStatus=");
        sbLIZ.append(this.addStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isSuccess() {
        Integer num = this.addStatus;
        return num != null && num.intValue() == 1;
    }

    public ProductAddStatus(String str, Integer num) {
        this.productId = str;
        this.addStatus = num;
    }
}
