package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class LSContentSettings {
    public static final Config LIZ = new Config(null, null, null, null, null, null, null, null, null, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(88));

    public static Config LIZ() {
        return (Config) LIZIZ.getValue();
    }

    public static final class Config {

        @C09CT("fyp_alliance_banner_show_count")
        public final Integer allianceBannerShowCount;

        @C09CT("fyp_add_to_favorite_sensor_show_video_play_interval")
        public final Integer faSensorDelayTime;

        @C09CT("fyp_add_to_favorite_sensor_click_exit_count")
        public final Integer faSensorExitCount;

        @C09CT("fyp_add_to_favorite_sensor_click_exit_frequency_interval")
        public final Integer faSensorExitFrequency;

        @C09CT("fyp_add_to_favorite_sensor_show_favorite_count")
        public final Integer faSensorShowCount;

        @C09CT("fyp_add_to_favorite_sensor_show_favorite_frequency_interval")
        public final Integer faSensorShowFrequency;

        @C09CT("fyp_profile_alliance_shuanggao_banner_show_count")
        public final Integer profileAllianceShuanggaoBannerShowCount;

        @C09CT("fyp_similar_product_sensor_click_exit_count")
        public final Integer smSensorExitCount;

        @C09CT("fyp_similar_product_sensor_click_exit_frequency_interval")
        public final Long smSensorExitFrequency;

        @C09CT("fyp_similar_product_sensor_frequency_interval_for_track")
        public final Long smSensorFrequencyForTrack;

        @C09CT("fyp_favorite_want_to_go_click_exit_frequency_interval")
        public final Integer wantTogoCountExitFrequency;

        @C09CT("fyp_favorite_want_to_go_click_exit_count")
        public final Integer wantTogoExitCount;

        public Config() {
            this(null, null, null, null, null, null, null, null, null, null, null, null);
        }

        public Config(Integer num, Long l, Long l2, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10) {
            this.smSensorExitCount = num;
            this.smSensorExitFrequency = l;
            this.smSensorFrequencyForTrack = l2;
            this.wantTogoExitCount = num2;
            this.wantTogoCountExitFrequency = num3;
            this.faSensorShowCount = num4;
            this.faSensorShowFrequency = num5;
            this.faSensorDelayTime = num6;
            this.faSensorExitCount = num7;
            this.faSensorExitFrequency = num8;
            this.allianceBannerShowCount = num9;
            this.profileAllianceShuanggaoBannerShowCount = num10;
        }
    }
}
