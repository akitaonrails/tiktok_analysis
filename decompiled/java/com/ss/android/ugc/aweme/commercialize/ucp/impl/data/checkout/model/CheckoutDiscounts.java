package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckoutDiscounts implements Serializable {

    @C09CT("codes")
    public final List<String> codes;

    public CheckoutDiscounts() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutDiscounts) && Intrinsics.LJFF(this.codes, ((CheckoutDiscounts) obj).codes);
    }

    public int hashCode() {
        List<String> list = this.codes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutDiscounts(codes=");
        sbLIZ.append(this.codes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutDiscounts(List<String> list) {
        this.codes = list;
    }
}
