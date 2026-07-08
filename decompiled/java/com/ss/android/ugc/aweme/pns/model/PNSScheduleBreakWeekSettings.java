package com.ss.android.ugc.aweme.pns.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class PNSScheduleBreakWeekSettings implements Serializable {

    @C09CT("end_hour")
    public final int endHour;

    @C09CT("end_min")
    public final int endMinute;

    @C09CT("start_hour")
    public final int startHour;

    @C09CT("start_min")
    public final int startMinute;

    @C09CT("screen_down_time_status_day")
    public final int status;

    @C09CT("day")
    public final int weekDay;

    public PNSScheduleBreakWeekSettings() {
        this(0, 0, 0, 0, 0, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSScheduleBreakWeekSettings)) {
            return false;
        }
        PNSScheduleBreakWeekSettings pNSScheduleBreakWeekSettings = (PNSScheduleBreakWeekSettings) obj;
        return this.weekDay == pNSScheduleBreakWeekSettings.weekDay && this.startHour == pNSScheduleBreakWeekSettings.startHour && this.startMinute == pNSScheduleBreakWeekSettings.startMinute && this.endHour == pNSScheduleBreakWeekSettings.endHour && this.endMinute == pNSScheduleBreakWeekSettings.endMinute && this.status == pNSScheduleBreakWeekSettings.status;
    }

    public int hashCode() {
        return (((((((((this.weekDay * 31) + this.startHour) * 31) + this.startMinute) * 31) + this.endHour) * 31) + this.endMinute) * 31) + this.status;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSScheduleBreakWeekSettings(weekDay=");
        sbLIZ.append(this.weekDay);
        sbLIZ.append(", startHour=");
        sbLIZ.append(this.startHour);
        sbLIZ.append(", startMinute=");
        sbLIZ.append(this.startMinute);
        sbLIZ.append(", endHour=");
        sbLIZ.append(this.endHour);
        sbLIZ.append(", endMinute=");
        sbLIZ.append(this.endMinute);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PNSScheduleBreakWeekSettings(int i, int i2, int i3, int i4, int i5, int i6) {
        this.weekDay = i;
        this.startHour = i2;
        this.startMinute = i3;
        this.endHour = i4;
        this.endMinute = i5;
        this.status = i6;
    }
}
