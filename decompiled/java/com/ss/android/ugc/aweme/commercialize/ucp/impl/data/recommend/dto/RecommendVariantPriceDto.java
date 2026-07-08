package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendVariantPriceDto implements Serializable {

    @C09CT("amount")
    public final String amount;

    @C09CT("currency_code")
    public final String currency;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendVariantPriceDto)) {
            return false;
        }
        RecommendVariantPriceDto recommendVariantPriceDto = (RecommendVariantPriceDto) obj;
        return Intrinsics.LJFF(this.amount, recommendVariantPriceDto.amount) && Intrinsics.LJFF(this.currency, recommendVariantPriceDto.currency);
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendVariantPriceDto(amount=");
        sbLIZ.append(this.amount);
        sbLIZ.append(", currency=");
        sbLIZ.append(this.currency);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RecommendVariantPriceDto(String str, String str2) {
        this.amount = str;
        this.currency = str2;
    }
}
