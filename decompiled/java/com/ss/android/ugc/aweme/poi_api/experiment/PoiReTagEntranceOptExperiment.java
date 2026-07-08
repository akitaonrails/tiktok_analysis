package com.ss.android.ugc.aweme.poi_api.experiment;

import X.C09CT;
import X.C0C64;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReTagEntranceOptExperiment {
    public static final PoiReTagEntranceOptExperiment LIZ = new PoiReTagEntranceOptExperiment();
    public static final Config LIZIZ = new Config(null, null);

    public static Config LIZ() {
        return (Config) C0C64.LJIILLIIL().LJJII(Config.class, LIZIZ, "poi_retag_entrance_opt", false);
    }

    public static boolean LIZIZ() {
        Config configLIZ = LIZ();
        return (configLIZ == null || configLIZ.frequency == null) ? false : true;
    }

    public static final class Config implements Serializable {

        @C09CT("entrance_display_frequency")
        public final EntranceFrequency frequency;

        @C09CT("entrance_text_opt")
        public final Boolean isEntranceTextOpt;

        public Config() {
            this(null, null);
        }

        public final Boolean isEntranceTextOpt() {
            return this.isEntranceTextOpt;
        }

        public Config(EntranceFrequency entranceFrequency, Boolean bool) {
            this.frequency = entranceFrequency;
            this.isEntranceTextOpt = bool;
        }
    }

    public static final class EntranceFrequency implements Serializable {

        @C09CT("close_times")
        public final Integer closeTimes;

        @C09CT("frequency_days")
        public final Integer frequencyDays;

        @C09CT("not_click_times")
        public final Integer notClickTimes;

        public EntranceFrequency() {
            this(null, null, null);
        }

        public EntranceFrequency(Integer num, Integer num2, Integer num3) {
            this.frequencyDays = num;
            this.closeTimes = num2;
            this.notClickTimes = num3;
        }
    }
}
