package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PriceInfo implements Serializable {

    @C09CT("price_level")
    public final PriceLevel priceLevel;

    @C09CT("price_num")
    public final String priceNum;

    @C09CT("price_range")
    public final String priceRange;

    public PriceInfo() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceInfo)) {
            return false;
        }
        PriceInfo priceInfo = (PriceInfo) obj;
        return Intrinsics.LJFF(this.priceRange, priceInfo.priceRange) && Intrinsics.LJFF(this.priceNum, priceInfo.priceNum) && Intrinsics.LJFF(this.priceLevel, priceInfo.priceLevel);
    }

    public int hashCode() {
        String str = this.priceRange;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.priceNum;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PriceLevel priceLevel = this.priceLevel;
        return iHashCode2 + (priceLevel != null ? priceLevel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriceInfo(priceRange=");
        sbLIZ.append(this.priceRange);
        sbLIZ.append(", priceNum=");
        sbLIZ.append(this.priceNum);
        sbLIZ.append(", priceLevel=");
        sbLIZ.append(this.priceLevel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PriceInfo(String str, String str2, PriceLevel priceLevel) {
        this.priceRange = str;
        this.priceNum = str2;
        this.priceLevel = priceLevel;
    }
}
