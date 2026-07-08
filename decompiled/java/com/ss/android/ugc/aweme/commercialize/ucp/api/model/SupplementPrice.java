package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SupplementPrice implements Serializable {

    @C09CT("amount")
    public final String amount;

    @C09CT("currency_code")
    public final String currencyCode;

    public SupplementPrice() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupplementPrice)) {
            return false;
        }
        SupplementPrice supplementPrice = (SupplementPrice) obj;
        return Intrinsics.LJFF(this.amount, supplementPrice.amount) && Intrinsics.LJFF(this.currencyCode, supplementPrice.currencyCode);
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyCode;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SupplementPrice(amount=");
        sbLIZ.append(this.amount);
        sbLIZ.append(", currencyCode=");
        sbLIZ.append(this.currencyCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SupplementPrice(String str, String str2) {
        this.amount = str;
        this.currencyCode = str2;
    }
}
