package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class FlashSaleEnhancementPriceCurveInfo {

    @C09CT("change_rate")
    public final double changeRate;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlashSaleEnhancementPriceCurveInfo) && Double.compare(this.changeRate, ((FlashSaleEnhancementPriceCurveInfo) obj).changeRate) == 0;
    }

    public final int hashCode() {
        return C786410Ut5.X2(this.changeRate);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashSaleEnhancementPriceCurveInfo(changeRate=");
        sbLIZ.append(this.changeRate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FlashSaleEnhancementPriceCurveInfo() {
        this(0.05d);
    }

    public FlashSaleEnhancementPriceCurveInfo(double d) {
        this.changeRate = d;
    }
}
