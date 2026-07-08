package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class PriceRangeDto implements Serializable {

    @C09CT("max")
    public final PriceAmountDto max;

    @C09CT("max_origin")
    public final PriceAmountDto maxOrigin;

    @C09CT("min")
    public final PriceAmountDto min;

    public PriceRangeDto() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceRangeDto)) {
            return false;
        }
        PriceRangeDto priceRangeDto = (PriceRangeDto) obj;
        return Intrinsics.LJFF(this.min, priceRangeDto.min) && Intrinsics.LJFF(this.max, priceRangeDto.max) && Intrinsics.LJFF(this.maxOrigin, priceRangeDto.maxOrigin);
    }

    public int hashCode() {
        PriceAmountDto priceAmountDto = this.min;
        int iHashCode = (priceAmountDto == null ? 0 : priceAmountDto.hashCode()) * 31;
        PriceAmountDto priceAmountDto2 = this.max;
        int iHashCode2 = (iHashCode + (priceAmountDto2 == null ? 0 : priceAmountDto2.hashCode())) * 31;
        PriceAmountDto priceAmountDto3 = this.maxOrigin;
        return iHashCode2 + (priceAmountDto3 != null ? priceAmountDto3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriceRangeDto(min=");
        sbLIZ.append(this.min);
        sbLIZ.append(", max=");
        sbLIZ.append(this.max);
        sbLIZ.append(", maxOrigin=");
        sbLIZ.append(this.maxOrigin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PriceRangeDto(PriceAmountDto priceAmountDto, PriceAmountDto priceAmountDto2, PriceAmountDto priceAmountDto3) {
        this.min = priceAmountDto;
        this.max = priceAmountDto2;
        this.maxOrigin = priceAmountDto3;
    }
}
