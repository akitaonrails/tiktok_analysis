package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes19.dex */
public final class AddLocationGpsAuthGuideExperiment {
    public static final AddLocationGpsAuthGuideExperiment LIZ = new AddLocationGpsAuthGuideExperiment();
    public static final LsAddLocationGpsAuthGuideConfig LIZIZ;

    static {
        LsAddLocationGpsAuthGuideConfig lsAddLocationGpsAuthGuideConfig = new LsAddLocationGpsAuthGuideConfig(null, null, null);
        LsAddLocationGpsAuthGuideConfig lsAddLocationGpsAuthGuideConfig2 = (LsAddLocationGpsAuthGuideConfig) C0C64.LJIILLIIL().LJJII(LsAddLocationGpsAuthGuideConfig.class, lsAddLocationGpsAuthGuideConfig, "ls_add_location_gps_auth_guide_config", true);
        if (lsAddLocationGpsAuthGuideConfig2 != null) {
            lsAddLocationGpsAuthGuideConfig = lsAddLocationGpsAuthGuideConfig2;
        }
        LIZIZ = lsAddLocationGpsAuthGuideConfig;
    }

    public static final class LsAddLocationGpsAuthGuideConfig {

        @C09CT("add_find_nearby_places_in_post_page")
        public final Boolean addFindNearbyPlacesInPostPage;

        @C09CT("add_find_nearby_places_show_times")
        public final Integer addFindNearbyPlacesShowTimes;

        @C09CT("find_nearby_places_jump_to_search")
        public final Boolean findNearbyPlacesJumpToSearch;

        public LsAddLocationGpsAuthGuideConfig() {
            this(null, null, null);
        }

        public LsAddLocationGpsAuthGuideConfig(Boolean bool, Integer num, Boolean bool2) {
            this.addFindNearbyPlacesInPostPage = bool;
            this.addFindNearbyPlacesShowTimes = num;
            this.findNearbyPlacesJumpToSearch = bool2;
        }
    }
}
