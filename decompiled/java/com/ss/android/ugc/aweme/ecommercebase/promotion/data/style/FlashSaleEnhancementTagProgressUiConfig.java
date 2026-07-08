package com.ss.android.ugc.aweme.ecommercebase.promotion.data.style;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class FlashSaleEnhancementTagProgressUiConfig {

    @C09CT("gradient_colors")
    public final List<LabelColor> gradientColors;

    public FlashSaleEnhancementTagProgressUiConfig() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlashSaleEnhancementTagProgressUiConfig) && Intrinsics.LJFF(this.gradientColors, ((FlashSaleEnhancementTagProgressUiConfig) obj).gradientColors);
    }

    public final int hashCode() {
        List<LabelColor> list = this.gradientColors;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashSaleEnhancementTagProgressUiConfig(gradientColors=");
        sbLIZ.append(this.gradientColors);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FlashSaleEnhancementTagProgressUiConfig(List<LabelColor> list) {
        this.gradientColors = list;
    }
}
