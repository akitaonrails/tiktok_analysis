package com.ss.android.ugc.aweme.ad.feed.model;

import X.C09CT;
import X.C2188811AlT;
import X.C2354409Kk;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class OleDeliveryInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("product_intents")
    public final C2354409Kk<ProductIntent> productIntents;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OleDeliveryInfo) && Intrinsics.LJFF(this.productIntents, ((OleDeliveryInfo) obj).productIntents);
    }

    public int hashCode() {
        C2354409Kk<ProductIntent> c2354409Kk = this.productIntents;
        if (c2354409Kk == null) {
            return 0;
        }
        return c2354409Kk.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OleDeliveryInfo(productIntents=");
        sbLIZ.append(this.productIntents);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OleDeliveryInfo() {
        this(new C2354409Kk());
    }

    public OleDeliveryInfo(C2354409Kk<ProductIntent> c2354409Kk) {
        this.productIntents = c2354409Kk;
    }
}
