package com.ss.android.ugc.aweme.pns.businessmodel;

import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class PnSScheduleBreakWeekSettings implements Serializable {
    public final int endHour;
    public final int endMinute;
    public final int startHour;
    public final int startMinute;
    public final int status;
    public final int weekDay;

    public PnSScheduleBreakWeekSettings() {
        this(0, 0, 0, 0, 0, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnSScheduleBreakWeekSettings)) {
            return false;
        }
        PnSScheduleBreakWeekSettings pnSScheduleBreakWeekSettings = (PnSScheduleBreakWeekSettings) obj;
        return this.weekDay == pnSScheduleBreakWeekSettings.weekDay && this.startHour == pnSScheduleBreakWeekSettings.startHour && this.startMinute == pnSScheduleBreakWeekSettings.startMinute && this.endHour == pnSScheduleBreakWeekSettings.endHour && this.endMinute == pnSScheduleBreakWeekSettings.endMinute && this.status == pnSScheduleBreakWeekSettings.status;
    }

    public int hashCode() {
        return (((((((((this.weekDay * 31) + this.startHour) * 31) + this.startMinute) * 31) + this.endHour) * 31) + this.endMinute) * 31) + this.status;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnSScheduleBreakWeekSettings(weekDay=");
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

    public PnSScheduleBreakWeekSettings(int i, int i2, int i3, int i4, int i5, int i6) {
        this.weekDay = i;
        this.startHour = i2;
        this.startMinute = i3;
        this.endHour = i4;
        this.endMinute = i5;
        this.status = i6;
    }
}
