package com.ss.android.ugc.aweme.ecommercebase.promotion.data.style;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class FlashSaleEnhancementCurveUiConfig {

    @C09CT("background_gradient_colors")
    public final List<LabelColor> backgroundGradientColors;

    @C09CT("line_gradient_colors")
    public final List<LabelColor> lineGradientColors;

    public FlashSaleEnhancementCurveUiConfig() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashSaleEnhancementCurveUiConfig)) {
            return false;
        }
        FlashSaleEnhancementCurveUiConfig flashSaleEnhancementCurveUiConfig = (FlashSaleEnhancementCurveUiConfig) obj;
        return Intrinsics.LJFF(this.backgroundGradientColors, flashSaleEnhancementCurveUiConfig.backgroundGradientColors) && Intrinsics.LJFF(this.lineGradientColors, flashSaleEnhancementCurveUiConfig.lineGradientColors);
    }

    public final int hashCode() {
        List<LabelColor> list = this.backgroundGradientColors;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<LabelColor> list2 = this.lineGradientColors;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashSaleEnhancementCurveUiConfig(backgroundGradientColors=");
        sbLIZ.append(this.backgroundGradientColors);
        sbLIZ.append(", lineGradientColors=");
        sbLIZ.append(this.lineGradientColors);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FlashSaleEnhancementCurveUiConfig(List<LabelColor> list, List<LabelColor> list2) {
        this.backgroundGradientColors = list;
        this.lineGradientColors = list2;
    }
}
