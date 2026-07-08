package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DiscountAmount implements Serializable {

    @C09CT("amount")
    public final String amount;

    @C09CT("currency")
    public final String currency;

    @C09CT("symbol")
    public final String symbol;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountAmount)) {
            return false;
        }
        DiscountAmount discountAmount = (DiscountAmount) obj;
        return Intrinsics.LJFF(this.amount, discountAmount.amount) && Intrinsics.LJFF(this.currency, discountAmount.currency) && Intrinsics.LJFF(this.symbol, discountAmount.symbol);
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbol;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public DiscountAmount(String str, String str2, String str3) {
        this.amount = str;
        this.currency = str2;
        this.symbol = str3;
    }
}
