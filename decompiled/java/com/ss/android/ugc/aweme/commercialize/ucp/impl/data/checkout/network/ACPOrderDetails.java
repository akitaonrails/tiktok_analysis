package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ACPOrderDetails {

    @C09CT("checkout_intent")
    public final CheckoutIntent checkoutIntent;

    @C09CT("checkout_request")
    public final ACPCheckoutRequest checkoutRequest;

    public ACPOrderDetails() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ACPOrderDetails)) {
            return false;
        }
        ACPOrderDetails aCPOrderDetails = (ACPOrderDetails) obj;
        return Intrinsics.LJFF(this.checkoutIntent, aCPOrderDetails.checkoutIntent) && Intrinsics.LJFF(this.checkoutRequest, aCPOrderDetails.checkoutRequest);
    }

    public final int hashCode() {
        CheckoutIntent checkoutIntent = this.checkoutIntent;
        int iHashCode = (checkoutIntent == null ? 0 : checkoutIntent.hashCode()) * 31;
        ACPCheckoutRequest aCPCheckoutRequest = this.checkoutRequest;
        return iHashCode + (aCPCheckoutRequest != null ? aCPCheckoutRequest.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACPOrderDetails(checkoutIntent=");
        sbLIZ.append(this.checkoutIntent);
        sbLIZ.append(", checkoutRequest=");
        sbLIZ.append(this.checkoutRequest);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ACPOrderDetails(CheckoutIntent checkoutIntent, ACPCheckoutRequest aCPCheckoutRequest) {
        this.checkoutIntent = checkoutIntent;
        this.checkoutRequest = aCPCheckoutRequest;
    }
}
