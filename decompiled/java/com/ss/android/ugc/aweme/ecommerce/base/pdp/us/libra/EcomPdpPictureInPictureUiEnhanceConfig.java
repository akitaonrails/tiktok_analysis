package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomPdpPictureInPictureUiEnhanceConfig {
    public static final Config LIZ = new Config(0);

    public static int LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Config config = LIZ;
        Config config2 = (Config) c0c64LJIILLIIL.LJJII(Config.class, config, "ec_pdp_pip_ui_enhancement", true);
        if (config2 != null) {
            config = config2;
        }
        Integer num = config.safeBottomMargin;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final class Config {

        @C09CT("safe_area_bottom_margin")
        public final Integer safeBottomMargin;

        public Config() {
            this(0);
        }

        public Config(Integer num) {
            this.safeBottomMargin = num;
        }
    }
}
