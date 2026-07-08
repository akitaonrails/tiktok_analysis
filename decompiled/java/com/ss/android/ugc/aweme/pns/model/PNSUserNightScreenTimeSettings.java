package com.ss.android.ugc.aweme.pns.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PNSUserNightScreenTimeSettings implements Serializable {

    @C09CT("skip_sleep_hours")
    public Boolean skipSleepHours;

    @C09CT("sleep_reminder_enabled")
    public final Boolean sleepReminderEnabled;

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

    public PNSUserNightScreenTimeSettings() {
        this(0, 0, 0, 0, Boolean.FALSE, Boolean.FALSE, "", 0, Boolean.FALSE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSUserNightScreenTimeSettings)) {
            return false;
        }
        PNSUserNightScreenTimeSettings pNSUserNightScreenTimeSettings = (PNSUserNightScreenTimeSettings) obj;
        return Intrinsics.LJFF(this.sleepTimeStartHour, pNSUserNightScreenTimeSettings.sleepTimeStartHour) && Intrinsics.LJFF(this.sleepTimeStartMinute, pNSUserNightScreenTimeSettings.sleepTimeStartMinute) && Intrinsics.LJFF(this.sleepTimeEndHour, pNSUserNightScreenTimeSettings.sleepTimeEndHour) && Intrinsics.LJFF(this.sleepTimeEndMinute, pNSUserNightScreenTimeSettings.sleepTimeEndMinute) && Intrinsics.LJFF(this.sleepReminderEnabled, pNSUserNightScreenTimeSettings.sleepReminderEnabled) && Intrinsics.LJFF(this.sleepTimeABTest, pNSUserNightScreenTimeSettings.sleepTimeABTest) && Intrinsics.LJFF(this.sleepTimeOriginalValue, pNSUserNightScreenTimeSettings.sleepTimeOriginalValue) && Intrinsics.LJFF(this.sleepTimeType, pNSUserNightScreenTimeSettings.sleepTimeType) && Intrinsics.LJFF(this.skipSleepHours, pNSUserNightScreenTimeSettings.skipSleepHours);
    }

    public int hashCode() {
        Integer num = this.sleepTimeStartHour;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.sleepTimeStartMinute;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.sleepTimeEndHour;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.sleepTimeEndMinute;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.sleepReminderEnabled;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.sleepTimeABTest;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.sleepTimeOriginalValue;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.sleepTimeType;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool3 = this.skipSleepHours;
        return iHashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSUserNightScreenTimeSettings(sleepTimeStartHour=");
        sbLIZ.append(this.sleepTimeStartHour);
        sbLIZ.append(", sleepTimeStartMinute=");
        sbLIZ.append(this.sleepTimeStartMinute);
        sbLIZ.append(", sleepTimeEndHour=");
        sbLIZ.append(this.sleepTimeEndHour);
        sbLIZ.append(", sleepTimeEndMinute=");
        sbLIZ.append(this.sleepTimeEndMinute);
        sbLIZ.append(", sleepReminderEnabled=");
        sbLIZ.append(this.sleepReminderEnabled);
        sbLIZ.append(", sleepTimeABTest=");
        sbLIZ.append(this.sleepTimeABTest);
        sbLIZ.append(", sleepTimeOriginalValue=");
        sbLIZ.append(this.sleepTimeOriginalValue);
        sbLIZ.append(", sleepTimeType=");
        sbLIZ.append(this.sleepTimeType);
        sbLIZ.append(", skipSleepHours=");
        sbLIZ.append(this.skipSleepHours);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setSkipSleepHours(Boolean bool) {
        this.skipSleepHours = bool;
    }

    public PNSUserNightScreenTimeSettings(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, String str, Integer num5, Boolean bool3) {
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
