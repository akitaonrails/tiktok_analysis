package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class PriceAmount {

    @C09CT("amount_val")
    public final String amount;

    @C09CT("currency")
    public final String currency;

    public PriceAmount() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceAmount)) {
            return false;
        }
        PriceAmount priceAmount = (PriceAmount) obj;
        return Intrinsics.LJFF(this.amount, priceAmount.amount) && Intrinsics.LJFF(this.currency, priceAmount.currency);
    }

    public final int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriceAmount(amount=");
        sbLIZ.append(this.amount);
        sbLIZ.append(", currency=");
        sbLIZ.append(this.currency);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PriceAmount(String str, String str2) {
        this.amount = str;
        this.currency = str2;
    }
}
