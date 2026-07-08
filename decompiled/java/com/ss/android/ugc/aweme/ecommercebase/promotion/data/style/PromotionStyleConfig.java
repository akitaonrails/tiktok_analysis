package com.ss.android.ugc.aweme.ecommercebase.promotion.data.style;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class PromotionStyleConfig {

    @C09CT("flash_sale_enhancement")
    public final FlashSaleEnhancementConfig flashSaleEnhancement;

    @C09CT("price_ui_config")
    public final PriceUiConfig priceUiConfig;

    @C09CT("promotion_label_ui_config")
    public final PromotionLabelConfig promotionLabelConfig;

    public PromotionStyleConfig() {
        this(null, null, null);
    }

    public PromotionStyleConfig(PriceUiConfig priceUiConfig, PromotionLabelConfig promotionLabelConfig, FlashSaleEnhancementConfig flashSaleEnhancementConfig) {
        this.priceUiConfig = priceUiConfig;
        this.promotionLabelConfig = promotionLabelConfig;
        this.flashSaleEnhancement = flashSaleEnhancementConfig;
    }
}
