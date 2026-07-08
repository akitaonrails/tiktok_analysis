package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsTightenCloseFreqExp {
    public static final Config LIZ = new Config(null, null);

    public static final class Config {

        @C09CT("frequency_day")
        public final Integer freqDay;

        @C09CT("frequency_times")
        public final Integer freqTime;

        public Config() {
            this(null, null);
        }

        public Config(Integer num, Integer num2) {
            this.freqDay = num;
            this.freqTime = num2;
        }
    }
}
