package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class PriceAmountDto implements Serializable {

    @C09CT("amount")
    public final Long amount;

    @C09CT("currency")
    public final String currency;

    @C09CT("origin_amount")
    public final Long originAmount;

    public PriceAmountDto() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceAmountDto)) {
            return false;
        }
        PriceAmountDto priceAmountDto = (PriceAmountDto) obj;
        return Intrinsics.LJFF(this.amount, priceAmountDto.amount) && Intrinsics.LJFF(this.originAmount, priceAmountDto.originAmount) && Intrinsics.LJFF(this.currency, priceAmountDto.currency);
    }

    public int hashCode() {
        Long l = this.amount;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.originAmount;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.currency;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriceAmountDto(amount=");
        sbLIZ.append(this.amount);
        sbLIZ.append(", originAmount=");
        sbLIZ.append(this.originAmount);
        sbLIZ.append(", currency=");
        sbLIZ.append(this.currency);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PriceAmountDto(Long l, Long l2, String str) {
        this.amount = l;
        this.originAmount = l2;
        this.currency = str;
    }
}
