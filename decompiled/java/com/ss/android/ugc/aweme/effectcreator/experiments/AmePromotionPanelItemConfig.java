package com.ss.android.ugc.aweme.effectcreator.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class AmePromotionPanelItemConfig {

    @C09CT("ame_promotion_panel_order_config")
    public final String amePromotionPageOrder;

    @C09CT("ame_promotion_display_count_threshold")
    public final int templateDisplayCountThreshold;

    public AmePromotionPanelItemConfig() {
        this("FeaturedTemplates,Banner,LatestHits", 100);
    }

    public AmePromotionPanelItemConfig(String str, int i) {
        this.amePromotionPageOrder = str;
        this.templateDisplayCountThreshold = i;
    }
}
