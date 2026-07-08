package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ACPCheckoutResponse extends BaseResponse {

    @C09CT("data")
    public final ACPCheckoutData data;

    public ACPCheckoutResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ACPCheckoutResponse) && Intrinsics.LJFF(this.data, ((ACPCheckoutResponse) obj).data);
    }

    public final int hashCode() {
        ACPCheckoutData aCPCheckoutData = this.data;
        if (aCPCheckoutData == null) {
            return 0;
        }
        return aCPCheckoutData.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACPCheckoutResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ACPCheckoutResponse(ACPCheckoutData aCPCheckoutData) {
        super(null, null);
        this.data = aCPCheckoutData;
    }
}
