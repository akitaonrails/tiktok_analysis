package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class ScheduleBreakSettings implements Serializable {
    public static final int $stable = 8;

    @C09CT("screen_down_time_status")
    public final int downTimeStatus;

    @C09CT("show_stm_down_time")
    public final boolean shouldShowDownTime;

    @C09CT("permission_review_status")
    public final int skipDownTimeStatus;

    @C09CT("screen_down_time_type")
    public final int type;

    @C09CT("screen_down_time_day_setting")
    public final List<ScheduleBreakWeekSettings> weekSettings;

    public ScheduleBreakSettings() {
        this(false, 0, 0, new ArrayList(), 0);
    }

    public ScheduleBreakSettings(boolean z, int i, int i2, List<ScheduleBreakWeekSettings> list, int i3) {
        this.shouldShowDownTime = z;
        this.downTimeStatus = i;
        this.type = i2;
        this.weekSettings = list;
        this.skipDownTimeStatus = i3;
    }
}
