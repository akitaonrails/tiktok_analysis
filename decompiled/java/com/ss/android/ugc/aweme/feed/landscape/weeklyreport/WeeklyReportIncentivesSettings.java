package com.ss.android.ugc.aweme.feed.landscape.weeklyreport;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class WeeklyReportIncentivesSettings {
    public static final WeeklyReportProfileConfig LIZ = new WeeklyReportProfileConfig(Boolean.FALSE, null, null, null, null, null, null, null, null);

    public static final class WeeklyReportProfileConfig {

        @C09CT("date")
        public final String date;

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

        public WeeklyReportProfileConfig() {
            this(null, null, null, null, null, null, null, null, null);
        }

        public WeeklyReportProfileConfig(Boolean bool, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, String str3, String str4) {
            this.eligible = bool;
            this.h5Url = str;
            this.date = str2;
            this.maxShowTimes = num;
            this.maxEnterTimes = num2;
            this.maxCloseTimes = num3;
            this.timeIntervalForAutoDismiss = num4;
            this.text = str3;
            this.highlightText = str4;
        }
    }
}
