package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes36.dex */
public final class PoiReviewsTightenFreqExp {
    public static final Config LIZ = new Config(null, null);

    public static Config LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Config config = LIZ;
        Config config2 = (Config) c0c64LJIILLIIL.LJJII(Config.class, config, "poi_review_optimize_frequency_control", true);
        return config2 != null ? config2 : config;
    }

    public static final class Config {

        @C09CT("friend_page")
        public final PageConfig friendPageConfig;

        @C09CT("profile_page")
        public final PageConfig profilePageConfig;

        public Config() {
            this(null, null);
        }

        public Config(PageConfig pageConfig, PageConfig pageConfig2) {
            this.friendPageConfig = pageConfig;
            this.profilePageConfig = pageConfig2;
        }
    }

    public static final class PageConfig {

        @C09CT("daily")
        public final TimeConfig dailyConfig;

        @C09CT("weekly")
        public final TimeConfig weeklyConfig;

        public PageConfig() {
            this(null, null);
        }

        public PageConfig(TimeConfig timeConfig, TimeConfig timeConfig2) {
            this.weeklyConfig = timeConfig;
            this.dailyConfig = timeConfig2;
        }
    }

    public static final class TimeConfig {

        @C09CT("frequency_day")
        public final Integer freqDay;

        @C09CT("frequency_times")
        public final Integer freqTime;

        public TimeConfig() {
            this(null, null);
        }

        public TimeConfig(Integer num, Integer num2) {
            this.freqDay = num;
            this.freqTime = num2;
        }
    }
}
