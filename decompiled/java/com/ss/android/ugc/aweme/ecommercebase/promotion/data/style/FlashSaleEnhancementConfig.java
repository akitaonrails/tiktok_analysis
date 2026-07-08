package com.ss.android.ugc.aweme.ecommercebase.promotion.data.style;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class FlashSaleEnhancementConfig {

    @C09CT("curve_price_ui_config")
    public final PriceConfig curvePriceUiConfig;

    @C09CT("curve_text_ui_config")
    public final PriceTextConfig curveTextUiConfig;

    @C09CT("curve_ui_config")
    public final FlashSaleEnhancementCurveUiConfig curveUiConfig;

    @C09CT("tag_progress_ui_config")
    public final FlashSaleEnhancementTagProgressUiConfig tagProgressUiConfig;

    @C09CT("tag_text_ui_config")
    public final PriceTextConfig tagTextUiConfig;

    public FlashSaleEnhancementConfig() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashSaleEnhancementConfig)) {
            return false;
        }
        FlashSaleEnhancementConfig flashSaleEnhancementConfig = (FlashSaleEnhancementConfig) obj;
        return Intrinsics.LJFF(this.curvePriceUiConfig, flashSaleEnhancementConfig.curvePriceUiConfig) && Intrinsics.LJFF(this.curveTextUiConfig, flashSaleEnhancementConfig.curveTextUiConfig) && Intrinsics.LJFF(this.curveUiConfig, flashSaleEnhancementConfig.curveUiConfig) && Intrinsics.LJFF(this.tagTextUiConfig, flashSaleEnhancementConfig.tagTextUiConfig) && Intrinsics.LJFF(this.tagProgressUiConfig, flashSaleEnhancementConfig.tagProgressUiConfig);
    }

    public final int hashCode() {
        PriceConfig priceConfig = this.curvePriceUiConfig;
        int iHashCode = (priceConfig == null ? 0 : priceConfig.hashCode()) * 31;
        PriceTextConfig priceTextConfig = this.curveTextUiConfig;
        int iHashCode2 = (iHashCode + (priceTextConfig == null ? 0 : priceTextConfig.hashCode())) * 31;
        FlashSaleEnhancementCurveUiConfig flashSaleEnhancementCurveUiConfig = this.curveUiConfig;
        int iHashCode3 = (iHashCode2 + (flashSaleEnhancementCurveUiConfig == null ? 0 : flashSaleEnhancementCurveUiConfig.hashCode())) * 31;
        PriceTextConfig priceTextConfig2 = this.tagTextUiConfig;
        int iHashCode4 = (iHashCode3 + (priceTextConfig2 == null ? 0 : priceTextConfig2.hashCode())) * 31;
        FlashSaleEnhancementTagProgressUiConfig flashSaleEnhancementTagProgressUiConfig = this.tagProgressUiConfig;
        return iHashCode4 + (flashSaleEnhancementTagProgressUiConfig != null ? flashSaleEnhancementTagProgressUiConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashSaleEnhancementConfig(curvePriceUiConfig=");
        sbLIZ.append(this.curvePriceUiConfig);
        sbLIZ.append(", curveTextUiConfig=");
        sbLIZ.append(this.curveTextUiConfig);
        sbLIZ.append(", curveUiConfig=");
        sbLIZ.append(this.curveUiConfig);
        sbLIZ.append(", tagTextUiConfig=");
        sbLIZ.append(this.tagTextUiConfig);
        sbLIZ.append(", tagProgressUiConfig=");
        sbLIZ.append(this.tagProgressUiConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FlashSaleEnhancementConfig(PriceConfig priceConfig, PriceTextConfig priceTextConfig, FlashSaleEnhancementCurveUiConfig flashSaleEnhancementCurveUiConfig, PriceTextConfig priceTextConfig2, FlashSaleEnhancementTagProgressUiConfig flashSaleEnhancementTagProgressUiConfig) {
        this.curvePriceUiConfig = priceConfig;
        this.curveTextUiConfig = priceTextConfig;
        this.curveUiConfig = flashSaleEnhancementCurveUiConfig;
        this.tagTextUiConfig = priceTextConfig2;
        this.tagProgressUiConfig = flashSaleEnhancementTagProgressUiConfig;
    }
}
