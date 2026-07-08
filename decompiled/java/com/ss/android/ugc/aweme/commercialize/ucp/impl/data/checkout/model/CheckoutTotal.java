package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutTotal implements Serializable {

    @C09CT("amount")
    public final Integer amount;

    @C09CT("display_text")
    public final String displayText;

    @C09CT("type")
    public final String type;

    public CheckoutTotal() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutTotal)) {
            return false;
        }
        CheckoutTotal checkoutTotal = (CheckoutTotal) obj;
        return Intrinsics.LJFF(this.type, checkoutTotal.type) && Intrinsics.LJFF(this.amount, checkoutTotal.amount) && Intrinsics.LJFF(this.displayText, checkoutTotal.displayText);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.amount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.displayText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutTotal(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", amount=");
        sbLIZ.append(this.amount);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutTotal(String str, Integer num, String str2) {
        this.type = str;
        this.amount = num;
        this.displayText = str2;
    }
}
