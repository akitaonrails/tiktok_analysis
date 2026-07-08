package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class EcomProductDescriptionImagePreloadConfig {
    public static final Config LIZ = new Config(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, 0);

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Config {

        @C09CT("preload_image_into_disk")
        public final Boolean preloadImageIntoDisk;

        @C09CT("preload_image_number")
        public final Integer preloadImageNumber;

        @C09CT("preload_image_on_PDP")
        public final Boolean preloadImageOnPdp;

        @C09CT("preload_image_on_Sku")
        public final Boolean preloadImageOnSku;

        @C09CT("preload_when_data_ready")
        public final Boolean preloadWhenDataReady;

        @C09CT("preload_when_scroll_end")
        public final Boolean preloadWhenScrollEnd;

        public Config() {
            this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, 0);
        }

        public Config(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num) {
            this.preloadImageIntoDisk = bool;
            this.preloadImageOnPdp = bool2;
            this.preloadImageOnSku = bool3;
            this.preloadWhenDataReady = bool4;
            this.preloadWhenScrollEnd = bool5;
            this.preloadImageNumber = num;
        }
    }

    public static final Config LIZ() {
        Config config = (Config) C0C64.LJIILLIIL().LJJII(Config.class, LIZ, "ecom_product_description_image_preload", true);
        return config == null ? new Config(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, 0) : config;
    }
}
