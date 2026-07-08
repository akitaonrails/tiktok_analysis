package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class GuardianRestrictionBean {

    @C09CT("do_not_disturb_settings")
    public final DoNotDisturbSettings doNotDisturbSettings;

    @C09CT("engagement_count_settings")
    public final EngagementCountSettings engagementCountSettings;

    @C09CT("restrict_mode")
    public final Integer restrictMode;

    @C09CT("screen_down_time_settings")
    public final ScheduleBreakSettings screenDownTimeSettings;

    @C09CT("session_duration_type")
    public final Integer screenDurationType;

    @C09CT("session_duration_reminder")
    public final Integer screenTimeBreaks;

    @C09CT("screen_time_management")
    public final Integer screenTimeManagement;

    @C09CT("screen_time_management_block_type")
    public final Integer screenTimeManagementBlockType;

    @C09CT("screen_time_management_repeat_type")
    public final int screenTimeManagementRepeatType;

    @C09CT("screen_time_management_status")
    public final Integer screenTimeManagementStatus;

    @C09CT("screen_time_management_type")
    public final Integer screenTimeManagementType;

    @C09CT("screen_time_management_week_settings")
    public final List<ScreenTimeManagementDaySetting> screenTimeManagementWeekSettings;

    @C09CT("search_restriction")
    public final Integer searchRestriction;

    @C09CT("show_stm_break")
    public final boolean shouldShowScreenBreak;

    public GuardianRestrictionBean() {
        this(0, 0, 0, new DoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), 0, 0, 0, 0, 0, new ArrayList(), false, new ScheduleBreakSettings(false, 0, 0, new ArrayList(), 0), null, 0);
    }

    public static GuardianRestrictionBean LIZ(GuardianRestrictionBean guardianRestrictionBean, Integer num) {
        return new GuardianRestrictionBean(guardianRestrictionBean.screenTimeManagement, guardianRestrictionBean.restrictMode, guardianRestrictionBean.searchRestriction, guardianRestrictionBean.doNotDisturbSettings, guardianRestrictionBean.screenTimeBreaks, guardianRestrictionBean.screenDurationType, guardianRestrictionBean.screenTimeManagementStatus, guardianRestrictionBean.screenTimeManagementType, guardianRestrictionBean.screenTimeManagementRepeatType, guardianRestrictionBean.screenTimeManagementWeekSettings, guardianRestrictionBean.shouldShowScreenBreak, guardianRestrictionBean.screenDownTimeSettings, guardianRestrictionBean.engagementCountSettings, num);
    }

    public GuardianRestrictionBean(Integer num, Integer num2, Integer num3, DoNotDisturbSettings doNotDisturbSettings, Integer num4, Integer num5, Integer num6, Integer num7, int i, List<ScreenTimeManagementDaySetting> list, boolean z, ScheduleBreakSettings scheduleBreakSettings, EngagementCountSettings engagementCountSettings, Integer num8) {
        this.screenTimeManagement = num;
        this.restrictMode = num2;
        this.searchRestriction = num3;
        this.doNotDisturbSettings = doNotDisturbSettings;
        this.screenTimeBreaks = num4;
        this.screenDurationType = num5;
        this.screenTimeManagementStatus = num6;
        this.screenTimeManagementType = num7;
        this.screenTimeManagementRepeatType = i;
        this.screenTimeManagementWeekSettings = list;
        this.shouldShowScreenBreak = z;
        this.screenDownTimeSettings = scheduleBreakSettings;
        this.engagementCountSettings = engagementCountSettings;
        this.screenTimeManagementBlockType = num8;
    }
}
