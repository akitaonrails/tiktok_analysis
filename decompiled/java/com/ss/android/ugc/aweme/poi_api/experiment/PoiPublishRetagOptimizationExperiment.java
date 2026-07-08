package com.ss.android.ugc.aweme.poi_api.experiment;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class PoiPublishRetagOptimizationExperiment {
    public static final PoiPublishRetagOptimizationExperiment LIZ = new PoiPublishRetagOptimizationExperiment();
    public static final Config LIZIZ;

    public static final class Config {

        @C09CT("retag_add_location_change_color")
        public final Boolean bannerUseNewColor;

        @C09CT("edit_post_add_location_new_text")
        public final Boolean editPostAddLocationNewText;

        @C09CT("edit_post_prompt_change")
        public final Boolean editPostPromptChange;

        @C09CT("retag_education_panel")
        public final Boolean retagEducationPanel;

        @C09CT("retag_profile_banner_new_text")
        public final Boolean retagProfileBannerNewText;

        public Config() {
            this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
        }

        public Config(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
            this.editPostPromptChange = bool;
            this.retagEducationPanel = bool2;
            this.retagProfileBannerNewText = bool3;
            this.editPostAddLocationNewText = bool4;
            this.bannerUseNewColor = bool5;
        }
    }

    static {
        Config config = new Config(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
        Config config2 = (Config) C0C64.LJIILLIIL().LJJII(Config.class, config, "poi_retag_optimization", true);
        if (config2 != null) {
            config = config2;
        }
        LIZIZ = config;
    }
}
