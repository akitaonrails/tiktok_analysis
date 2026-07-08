package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class SleepHourConfigSettings implements Serializable {
    public static final int $stable = 8;

    @C09CT("skip_sleep_hours")
    public Boolean skipSleepHours;

    @C09CT("sleep_reminder_enabled")
    public final Boolean sleepHourEnabled;

    @C09CT("sleep_time_ab_test_started")
    public final Boolean sleepTimeABTest;

    @C09CT("sleep_time_end_hour")
    public final Integer sleepTimeEndHour;

    @C09CT("sleep_time_end_minute")
    public final Integer sleepTimeEndMinute;

    @C09CT("sleep_time_original_value")
    public final String sleepTimeOriginalValue;

    @C09CT("sleep_time_start_hour")
    public final Integer sleepTimeStartHour;

    @C09CT("sleep_time_start_minute")
    public final Integer sleepTimeStartMinute;

    @C09CT("sleep_time_type")
    public final Integer sleepTimeType;

    public SleepHourConfigSettings() {
        this(0, 0, 0, 0, Boolean.FALSE, Boolean.FALSE, "", 0, Boolean.FALSE);
    }

    public final SleepHourConfigSettings copy(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, String str, Integer num5, Boolean bool3) {
        return new SleepHourConfigSettings(num, num2, num3, num4, bool, bool2, str, num5, bool3);
    }

    public final void setSkipSleepHours(Boolean bool) {
        this.skipSleepHours = bool;
    }

    public SleepHourConfigSettings(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, String str, Integer num5, Boolean bool3) {
        this.sleepTimeStartHour = num;
        this.sleepTimeStartMinute = num2;
        this.sleepTimeEndHour = num3;
        this.sleepTimeEndMinute = num4;
        this.sleepHourEnabled = bool;
        this.sleepTimeABTest = bool2;
        this.sleepTimeOriginalValue = str;
        this.sleepTimeType = num5;
        this.skipSleepHours = bool3;
    }
}
