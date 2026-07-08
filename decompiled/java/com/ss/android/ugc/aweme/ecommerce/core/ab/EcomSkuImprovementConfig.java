package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class EcomSkuImprovementConfig {
    public static final Config LIZ = new Config(0, 0);

    public static boolean LIZ() {
        Config config = (Config) C0C64.LJIILLIIL().LJJII(Config.class, LIZ, "ecom_sku_opt_ux", true);
        if (config == null) {
            config = new Config(0, 0);
        }
        Integer num = config.skuSelector;
        return num != null && num.intValue() == 1;
    }

    public static final class Config {

        @C09CT("show_lockup")
        public final Integer showLockup;

        @C09CT("new_sku_select")
        public final Integer skuSelector;

        public Config() {
            this(0, 0);
        }

        public Config(Integer num, Integer num2) {
            this.showLockup = num;
            this.skuSelector = num2;
        }
    }
}
