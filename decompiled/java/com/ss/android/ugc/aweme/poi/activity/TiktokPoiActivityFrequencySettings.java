package com.ss.android.ugc.aweme.poi.activity;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
public final class TiktokPoiActivityFrequencySettings {
    public static final PoiActivityFreqConfig LIZ = new PoiActivityFreqConfig(3, 3, 5, 5);

    public static final PoiActivityFreqConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PoiActivityFreqConfig poiActivityFreqConfig = LIZ;
        PoiActivityFreqConfig poiActivityFreqConfig2 = (PoiActivityFreqConfig) settingsManagerLIZLLL.LJIIIIZZ("poi_activity_freq_config", PoiActivityFreqConfig.class, poiActivityFreqConfig);
        return poiActivityFreqConfig2 != null ? poiActivityFreqConfig2 : poiActivityFreqConfig;
    }

    public static final class PoiActivityFreqConfig {

        @C09CT("poi_activity_frequency_by_position_max_click_times")
        public final int freqByPositionMaxClickTimes;

        @C09CT("poi_activity_frequency_by_position_max_see_times")
        public final int freqByPositionMaxSeeTimes;

        @C09CT("poi_activity_frequency_by_user_max_click_times")
        public final int freqByUserMaxClickTimes;

        @C09CT("poi_activity_frequency_by_user_max_see_times")
        public final int freqByUserMaxSeeTimes;

        public PoiActivityFreqConfig(int i, int i2, int i3, int i4) {
            this.freqByPositionMaxClickTimes = i;
            this.freqByPositionMaxSeeTimes = i2;
            this.freqByUserMaxClickTimes = i3;
            this.freqByUserMaxSeeTimes = i4;
        }
    }
}
