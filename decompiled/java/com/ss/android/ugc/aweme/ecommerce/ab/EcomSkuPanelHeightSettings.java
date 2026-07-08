package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes4.dex */
public final class EcomSkuPanelHeightSettings {
    public static final Config LIZ = new Config(Float.valueOf(0.73f));

    public static final class Config {

        @C09CT("panel_height")
        public final Float panelHeight;

        public Config() {
            this(Float.valueOf(0.73f));
        }

        public Config(Float f) {
            this.panelHeight = f;
        }
    }

    public static float LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Config config = LIZ;
        Config config2 = (Config) c0c64LJIILLIIL.LJJII(Config.class, config, "ecom_pdp_sku_panel_height", true);
        if (config2 != null) {
            config = config2;
        }
        Float f = config.panelHeight;
        if (f != null) {
            return f.floatValue();
        }
        return 0.73f;
    }
}
