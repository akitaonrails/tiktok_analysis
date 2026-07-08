package com.ss.android.ugc.aweme.ad.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Product implements Serializable {
    public static final int $stable = 0;

    @C09CT("product_id")
    public final String productId;

    public Product() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Product) && Intrinsics.LJFF(this.productId, ((Product) obj).productId);
    }

    public int hashCode() {
        String str = this.productId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Product(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Product(String str) {
        this.productId = str;
    }
}
