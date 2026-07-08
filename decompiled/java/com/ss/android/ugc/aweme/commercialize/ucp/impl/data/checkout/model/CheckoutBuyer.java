package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutBuyer implements Serializable {

    @C09CT("country_code")
    public final String countryCode;

    @C09CT("email")
    public final String email;

    public CheckoutBuyer() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutBuyer)) {
            return false;
        }
        CheckoutBuyer checkoutBuyer = (CheckoutBuyer) obj;
        return Intrinsics.LJFF(this.email, checkoutBuyer.email) && Intrinsics.LJFF(this.countryCode, checkoutBuyer.countryCode);
    }

    public int hashCode() {
        String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryCode;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutBuyer(email=");
        sbLIZ.append(this.email);
        sbLIZ.append(", countryCode=");
        sbLIZ.append(this.countryCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutBuyer(String str, String str2) {
        this.email = str;
        this.countryCode = str2;
    }
}
