package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ACPCheckoutSessionExtra {

    @C09CT("jwt_token")
    public final String jwtToken;

    public ACPCheckoutSessionExtra() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ACPCheckoutSessionExtra) && Intrinsics.LJFF(this.jwtToken, ((ACPCheckoutSessionExtra) obj).jwtToken);
    }

    public final int hashCode() {
        String str = this.jwtToken;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACPCheckoutSessionExtra(jwtToken=");
        sbLIZ.append(this.jwtToken);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ACPCheckoutSessionExtra(String str) {
        this.jwtToken = str;
    }
}
