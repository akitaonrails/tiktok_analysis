package com.ss.android.ugc.aweme.feed.landscape.trafficincentives;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class OneMinuteTrafficIncentivesSettings {
    public static final OneMinuteTrafficProfileConfig LIZ = new OneMinuteTrafficProfileConfig(Boolean.FALSE, null, null, null, null, null, null, null);

    public static final class OneMinuteTrafficProfileConfig {

        @C09CT("eligible")
        public final Boolean eligible;

        @C09CT(alternate = {"h5_url"}, value = "H5_url")
        public final String h5Url;

        @C09CT("highlight_text")
        public final String highlightText;

        @C09CT("max_close_times")
        public final Integer maxCloseTimes;

        @C09CT("max_enter_times")
        public final Integer maxEnterTimes;

        @C09CT("max_show_times")
        public final Integer maxShowTimes;

        @C09CT("text")
        public final String text;

        @C09CT("time_interval_for_auto_dismiss")
        public final Integer timeIntervalForAutoDismiss;

        public OneMinuteTrafficProfileConfig() {
            this(null, null, null, null, null, null, null, null);
        }

        public OneMinuteTrafficProfileConfig(Boolean bool, String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3) {
            this.eligible = bool;
            this.h5Url = str;
            this.maxShowTimes = num;
            this.maxEnterTimes = num2;
            this.maxCloseTimes = num3;
            this.timeIntervalForAutoDismiss = num4;
            this.text = str2;
            this.highlightText = str3;
        }
    }
}
