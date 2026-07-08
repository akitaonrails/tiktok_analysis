package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PriceLevel implements Serializable {

    @C09CT("actual_level")
    public final int actualLevel;

    @C09CT("currency")
    public final String currencySymbol;

    @C09CT("total_level")
    public final int totalLevel;

    public PriceLevel() {
        this(0, 0, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceLevel)) {
            return false;
        }
        PriceLevel priceLevel = (PriceLevel) obj;
        return this.actualLevel == priceLevel.actualLevel && this.totalLevel == priceLevel.totalLevel && Intrinsics.LJFF(this.currencySymbol, priceLevel.currencySymbol);
    }

    public int hashCode() {
        int i = ((this.actualLevel * 31) + this.totalLevel) * 31;
        String str = this.currencySymbol;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriceLevel(actualLevel=");
        sbLIZ.append(this.actualLevel);
        sbLIZ.append(", totalLevel=");
        sbLIZ.append(this.totalLevel);
        sbLIZ.append(", currencySymbol=");
        sbLIZ.append(this.currencySymbol);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PriceLevel(int i, int i2, String str) {
        this.actualLevel = i;
        this.totalLevel = i2;
        this.currencySymbol = str;
    }
}
