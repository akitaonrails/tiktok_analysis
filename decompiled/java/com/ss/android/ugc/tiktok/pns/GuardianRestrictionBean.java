package com.ss.android.ugc.tiktok.pns;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class GuardianRestrictionBean {
    public final PnSDoNotDisturbSettings pnSDoNotDisturbSettings;
    public final Integer restrictMode;
    public final PnSScheduleBreakSettings screenDownTimeSettings;
    public final Integer screenDurationType;
    public final Integer screenTimeBreaks;
    public final Integer screenTimeManagement;
    public final int screenTimeManagementRepeatType;
    public final Integer screenTimeManagementStatus;
    public final Integer screenTimeManagementType;
    public final List<PnSScreenTimeManagementDaySetting> screenTimeManagementWeekSettings;
    public final Integer searchRestriction;
    public final boolean shouldShowScreenBreak;

    public GuardianRestrictionBean() {
        this(0, 0, 0, new PnSDoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), 0, 0, 0, 0, 0, new ArrayList(), false, new PnSScheduleBreakSettings(false, 0, 0, new ArrayList(), 0));
    }

    public GuardianRestrictionBean(Integer num, Integer num2, Integer num3, PnSDoNotDisturbSettings pnSDoNotDisturbSettings, Integer num4, Integer num5, Integer num6, Integer num7, int i, List<PnSScreenTimeManagementDaySetting> list, boolean z, PnSScheduleBreakSettings pnSScheduleBreakSettings) {
        this.screenTimeManagement = num;
        this.restrictMode = num2;
        this.searchRestriction = num3;
        this.pnSDoNotDisturbSettings = pnSDoNotDisturbSettings;
        this.screenTimeBreaks = num4;
        this.screenDurationType = num5;
        this.screenTimeManagementStatus = num6;
        this.screenTimeManagementType = num7;
        this.screenTimeManagementRepeatType = i;
        this.screenTimeManagementWeekSettings = list;
        this.shouldShowScreenBreak = z;
        this.screenDownTimeSettings = pnSScheduleBreakSettings;
    }
}
