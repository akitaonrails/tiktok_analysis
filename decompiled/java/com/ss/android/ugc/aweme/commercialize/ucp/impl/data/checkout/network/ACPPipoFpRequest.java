package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ACPPipoFpRequest {

    @C09CT("idempotency_id")
    public final String idempotencyId;

    @C09CT("jwt_token")
    public final String jwtToken;

    @C09CT("referrer")
    public final String referrer;

    public ACPPipoFpRequest() {
        this(null, null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ACPPipoFpRequest)) {
            return false;
        }
        ACPPipoFpRequest aCPPipoFpRequest = (ACPPipoFpRequest) obj;
        return Intrinsics.LJFF(this.idempotencyId, aCPPipoFpRequest.idempotencyId) && Intrinsics.LJFF(this.jwtToken, aCPPipoFpRequest.jwtToken) && Intrinsics.LJFF(this.referrer, aCPPipoFpRequest.referrer);
    }

    public final int hashCode() {
        String str = this.idempotencyId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.jwtToken;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.referrer.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACPPipoFpRequest(idempotencyId=");
        sbLIZ.append(this.idempotencyId);
        sbLIZ.append(", jwtToken=");
        sbLIZ.append(this.jwtToken);
        sbLIZ.append(", referrer=");
        sbLIZ.append(this.referrer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ACPPipoFpRequest(String str, String str2, String str3) {
        this.idempotencyId = str;
        this.jwtToken = str2;
        this.referrer = str3;
    }
}
