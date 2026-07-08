package com.ss.android.ugc.aweme.ad.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class ProductIntent implements Serializable {
    public static final int $stable = 0;

    @C09CT("product")
    public final Product product;

    @C09CT("refer")
    public final String refer;

    @C09CT("timestamp")
    public final Long timestamp;

    public ProductIntent() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductIntent)) {
            return false;
        }
        ProductIntent productIntent = (ProductIntent) obj;
        return Intrinsics.LJFF(this.product, productIntent.product) && Intrinsics.LJFF(this.refer, productIntent.refer) && Intrinsics.LJFF(this.timestamp, productIntent.timestamp);
    }

    public int hashCode() {
        Product product = this.product;
        int iHashCode = (product == null ? 0 : product.hashCode()) * 31;
        String str = this.refer;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.timestamp;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductIntent(product=");
        sbLIZ.append(this.product);
        sbLIZ.append(", refer=");
        sbLIZ.append(this.refer);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProductIntent(Product product, String str, Long l) {
        this.product = product;
        this.refer = str;
        this.timestamp = l;
    }
}
