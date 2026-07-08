package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckoutFulfillment implements Serializable {

    @C09CT("methods")
    public final List<Object> methods;

    public CheckoutFulfillment() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutFulfillment) && Intrinsics.LJFF(this.methods, ((CheckoutFulfillment) obj).methods);
    }

    public int hashCode() {
        List<Object> list = this.methods;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutFulfillment(methods=");
        sbLIZ.append(this.methods);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutFulfillment(List<Object> list) {
        this.methods = list;
    }
}
