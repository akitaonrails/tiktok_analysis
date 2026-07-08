package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckoutPayment implements Serializable {

    @C09CT("instruments")
    public final List<Object> instruments;

    public CheckoutPayment() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutPayment) && Intrinsics.LJFF(this.instruments, ((CheckoutPayment) obj).instruments);
    }

    public int hashCode() {
        List<Object> list = this.instruments;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutPayment(instruments=");
        sbLIZ.append(this.instruments);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutPayment(List<Object> list) {
        this.instruments = list;
    }
}
