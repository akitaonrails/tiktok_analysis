package com.ss.android.ugc.aweme.ecommercebase.promotion.data.style;

import X.C09CT;
import java.util.HashMap;

/* JADX INFO: loaded from: classes33.dex */
public final class PromotionLabelConfig {

    @C09CT("configs")
    public final HashMap<String, PromotionLabelSingleConfig> configs;

    @C09CT("height")
    public final Integer height;

    @C09CT("separator")
    public final SeparatorConfig separator;

    public PromotionLabelConfig(Integer num, SeparatorConfig separatorConfig, HashMap<String, PromotionLabelSingleConfig> map) {
        this.height = num;
        this.separator = separatorConfig;
        this.configs = map;
    }
}
