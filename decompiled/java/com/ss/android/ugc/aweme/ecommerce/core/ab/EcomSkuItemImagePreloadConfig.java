package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes23.dex */
public final class EcomSkuItemImagePreloadConfig {
    public static final Config LIZ = new Config(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, 100);

    public static final class Config {

        @C09CT("preload_all_network_threshold")
        public final int preloadAllNetworkThreshold;

        @C09CT("preload_image_into_disk")
        public final Boolean preloadImageIntoDisk;

        @C09CT("preload_image_on_PDP")
        public final Boolean preloadImageOnPdp;

        @C09CT("preload_image_on_Sku")
        public final Boolean preloadImageOnSku;

        @C09CT("preload_when_data_ready")
        public final Boolean preloadWhenDataReady;

        @C09CT("preload_when_scroll_end")
        public final Boolean preloadWhenScrollEnd;

        @C09CT("preload_when_sku_touch")
        public final Boolean preloadWhenSkuTouch;

        public Config() {
            this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, 100);
        }

        public Config(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i) {
            this.preloadImageIntoDisk = bool;
            this.preloadImageOnPdp = bool2;
            this.preloadImageOnSku = bool3;
            this.preloadWhenDataReady = bool4;
            this.preloadWhenScrollEnd = bool5;
            this.preloadWhenSkuTouch = bool6;
            this.preloadAllNetworkThreshold = i;
        }
    }

    public static final Config LIZ() {
        Config config = (Config) C0C64.LJIILLIIL().LJJII(Config.class, LIZ, "ecom_sku_item_image_preload", true);
        return config == null ? new Config(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, 100) : config;
    }
}
