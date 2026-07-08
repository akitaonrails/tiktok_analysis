package com.ss.android.ugc.aweme.poi.videopublish.rcmdcell;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPublishUiOptExperiment {
    public static final Config LIZ;
    public static final Config LIZIZ;

    public static final class Config {

        @C09CT("poi_publish_animation_opt")
        public final Boolean poiPublishAnimationOpt;

        @C09CT("poi_publish_font_opt")
        public final Boolean poiPublishFontOpt;

        public Config() {
            this(Boolean.FALSE, Boolean.FALSE);
        }

        public Config(Boolean bool, Boolean bool2) {
            this.poiPublishFontOpt = bool;
            this.poiPublishAnimationOpt = bool2;
        }
    }

    static {
        Config config = new Config(Boolean.FALSE, Boolean.FALSE);
        Config config2 = (Config) C0C64.LJIILLIIL().LJJII(Config.class, LIZIZ, "poi_publish_ui_opt", false);
        if (config2 == null) {
            config2 = config;
        }
        LIZ = config2;
        LIZIZ = config;
    }
}
