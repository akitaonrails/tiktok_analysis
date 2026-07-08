package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutOrderDetails implements Serializable {

    @C09CT("checkout_intent")
    public final CheckoutIntent checkoutIntent;

    @C09CT("checkout_session")
    public final CheckoutSession checkoutSession;

    public CheckoutOrderDetails() {
        this(null, null);
    }

    public final CheckoutOrderDetails copy(CheckoutSession checkoutSession, CheckoutIntent checkoutIntent) {
        return new CheckoutOrderDetails(checkoutSession, checkoutIntent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutOrderDetails)) {
            return false;
        }
        CheckoutOrderDetails checkoutOrderDetails = (CheckoutOrderDetails) obj;
        return Intrinsics.LJFF(this.checkoutSession, checkoutOrderDetails.checkoutSession) && Intrinsics.LJFF(this.checkoutIntent, checkoutOrderDetails.checkoutIntent);
    }

    public int hashCode() {
        CheckoutSession checkoutSession = this.checkoutSession;
        int iHashCode = (checkoutSession == null ? 0 : checkoutSession.hashCode()) * 31;
        CheckoutIntent checkoutIntent = this.checkoutIntent;
        return iHashCode + (checkoutIntent != null ? checkoutIntent.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutOrderDetails(checkoutSession=");
        sbLIZ.append(this.checkoutSession);
        sbLIZ.append(", checkoutIntent=");
        sbLIZ.append(this.checkoutIntent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutOrderDetails(CheckoutSession checkoutSession, CheckoutIntent checkoutIntent) {
        this.checkoutSession = checkoutSession;
        this.checkoutIntent = checkoutIntent;
    }
}
