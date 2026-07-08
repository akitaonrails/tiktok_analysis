package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostGenPolicyConfig {
    public static final Config LIZ;

    public static final class Config {

        @C09CT("show_more_info_icon")
        public final Boolean showMoreInfoIcon;

        @C09CT("show_rule_banner")
        public final Boolean showRuleBanner;

        public Config() {
            this(Boolean.FALSE, Boolean.FALSE);
        }

        public Config(Boolean bool, Boolean bool2) {
            this.showMoreInfoIcon = bool;
            this.showRuleBanner = bool2;
        }
    }

    static {
        Config config = new Config(Boolean.FALSE, Boolean.FALSE);
        Config config2 = (Config) C0C64.LJIILLIIL().LJJII(Config.class, config, "poi_post_gne_policy_config", true);
        if (config2 != null) {
            config = config2;
        }
        LIZ = config;
    }

    public static boolean LIZ() {
        Boolean bool = LIZ.showMoreInfoIcon;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
