package com.ss.android.ugc.tiktok.pns;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class PnSUserNightScreenTimeSettings implements Serializable {
    public final Boolean skipSleepHours;
    public final Boolean sleepReminderEnabled;
    public final Boolean sleepTimeABTest;
    public final Integer sleepTimeEndHour;
    public final Integer sleepTimeEndMinute;
    public final String sleepTimeOriginalValue;
    public final Integer sleepTimeStartHour;
    public final Integer sleepTimeStartMinute;
    public final Integer sleepTimeType;

    public PnSUserNightScreenTimeSettings() {
        this(0, 0, 0, 0, Boolean.FALSE, Boolean.FALSE, "", 0, Boolean.FALSE);
    }

    public PnSUserNightScreenTimeSettings(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, String str, Integer num5, Boolean bool3) {
        this.sleepTimeStartHour = num;
        this.sleepTimeStartMinute = num2;
        this.sleepTimeEndHour = num3;
        this.sleepTimeEndMinute = num4;
        this.sleepReminderEnabled = bool;
        this.sleepTimeABTest = bool2;
        this.sleepTimeOriginalValue = str;
        this.sleepTimeType = num5;
        this.skipSleepHours = bool3;
    }
}
