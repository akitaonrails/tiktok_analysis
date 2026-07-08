package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C0C64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomSkuPromotionAndScreenEfficiencyConfig {
    public static final Config LIZ = new Config(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);

    public static final class Config {

        @C09CT("sku_enable_promotion_label_click")
        public final Boolean enableLabelClick;

        @C09CT("sku_new_spacing")
        public final Boolean newSpacing;

        @C09CT("sku_show_promotion_label")
        public final Boolean showPromotionLabel;

        public Config() {
            this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
        }

        public Config(Boolean bool, Boolean bool2, Boolean bool3) {
            this.newSpacing = bool;
            this.showPromotionLabel = bool2;
            this.enableLabelClick = bool3;
        }
    }

    public static boolean LIZ() {
        return Intrinsics.LJFF(LIZIZ().newSpacing, Boolean.TRUE);
    }

    public static final Config LIZIZ() {
        Config config = (Config) C0C64.LJIILLIIL().LJJII(Config.class, LIZ, "ecom_sku_promotion_screen_efficiency", true);
        return config == null ? new Config(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE) : config;
    }
}
