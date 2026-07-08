package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import X.C0C64;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class PoiCoreConfig {
    public static final Config LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;

    static {
        Config config = new Config(null, null, null, null, null, null, Boolean.FALSE);
        Config config2 = (Config) C0C64.LJIILLIIL().LJJII(Config.class, config, "poi_core_config", true);
        if (config2 != null) {
            config = config2;
        }
        LIZ = config;
        String str = config.influencerTerms;
        if (str == null) {
            str = "";
        }
        LIZIZ = str;
        String str2 = config.influencerPrivacy;
        LIZJ = str2 != null ? str2 : "";
    }

    public static final class Config {

        @C09CT("influencer_privacy")
        public final String influencerPrivacy;

        @C09CT("influencer_terms")
        public final String influencerTerms;

        @C09CT("is_eligible_for_traffic_incentive_awareness")
        public final Boolean isEligibleForTrafficIncentiveAwareness;

        @C09CT("anchor_subtag_frequency_control_strategy")
        public final Map<String, String> poiAnchorSubTagFrequencyMap;

        @C09CT("poi_anchor_track_map")
        public final Map<String, String> poiAnchorTrackMap;

        @C09CT("poi_create_show_index")
        public final Integer poiCreateShowIndex;

        @C09CT("user_create_poi_enable")
        public final Boolean userCreatePoiEnable;

        public Config() {
            this(null, null, null, null, null, null, Boolean.FALSE);
        }

        public Config(Boolean bool, Integer num, Map<String, String> map, String str, String str2, Map<String, String> map2, Boolean bool2) {
            this.userCreatePoiEnable = bool;
            this.poiCreateShowIndex = num;
            this.poiAnchorTrackMap = map;
            this.influencerTerms = str;
            this.influencerPrivacy = str2;
            this.poiAnchorSubTagFrequencyMap = map2;
            this.isEligibleForTrafficIncentiveAwareness = bool2;
        }
    }
}
