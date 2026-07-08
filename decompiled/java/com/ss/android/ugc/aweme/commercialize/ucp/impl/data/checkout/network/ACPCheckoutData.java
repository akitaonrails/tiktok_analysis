package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ACPCheckoutData {

    @C09CT("checkout_session")
    public final ACPCheckoutSessionPayload checkoutSession;

    @C09CT("session_extra")
    public final ACPCheckoutSessionExtra sessionExtra;

    @C09CT("tiktok_order_id")
    public final Long tiktokOrderId;

    public ACPCheckoutData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ACPCheckoutData)) {
            return false;
        }
        ACPCheckoutData aCPCheckoutData = (ACPCheckoutData) obj;
        return Intrinsics.LJFF(this.tiktokOrderId, aCPCheckoutData.tiktokOrderId) && Intrinsics.LJFF(this.sessionExtra, aCPCheckoutData.sessionExtra) && Intrinsics.LJFF(this.checkoutSession, aCPCheckoutData.checkoutSession);
    }

    public final int hashCode() {
        Long l = this.tiktokOrderId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        ACPCheckoutSessionExtra aCPCheckoutSessionExtra = this.sessionExtra;
        int iHashCode2 = (iHashCode + (aCPCheckoutSessionExtra == null ? 0 : aCPCheckoutSessionExtra.hashCode())) * 31;
        ACPCheckoutSessionPayload aCPCheckoutSessionPayload = this.checkoutSession;
        return iHashCode2 + (aCPCheckoutSessionPayload != null ? aCPCheckoutSessionPayload.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACPCheckoutData(tiktokOrderId=");
        sbLIZ.append(this.tiktokOrderId);
        sbLIZ.append(", sessionExtra=");
        sbLIZ.append(this.sessionExtra);
        sbLIZ.append(", checkoutSession=");
        sbLIZ.append(this.checkoutSession);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ACPCheckoutData(Long l, ACPCheckoutSessionExtra aCPCheckoutSessionExtra, ACPCheckoutSessionPayload aCPCheckoutSessionPayload) {
        this.tiktokOrderId = l;
        this.sessionExtra = aCPCheckoutSessionExtra;
        this.checkoutSession = aCPCheckoutSessionPayload;
    }
}
