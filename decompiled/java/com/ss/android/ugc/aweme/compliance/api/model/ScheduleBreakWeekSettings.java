package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class ScheduleBreakWeekSettings implements Serializable {
    public static final int $stable = 0;

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

    public ScheduleBreakWeekSettings() {
        this(0, 0, 0, 0, 0, 0);
    }

    public ScheduleBreakWeekSettings(int i, int i2, int i3, int i4, int i5, int i6) {
        this.weekDay = i;
        this.startHour = i2;
        this.startMinute = i3;
        this.endHour = i4;
        this.endMinute = i5;
        this.status = i6;
    }
}
