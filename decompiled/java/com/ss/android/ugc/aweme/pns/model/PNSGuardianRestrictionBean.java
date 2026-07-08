package com.ss.android.ugc.aweme.pns.model;

import X.C09CT;
import X.C786410Ut5;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PNSGuardianRestrictionBean {

    @C09CT("do_not_disturb_settings")
    public final PNSDoNotDisturbSettings doNotDisturbSettings;

    @C09CT("engagement_count_settings")
    public final PNSEngagementCountSettings engagementCountSettings;

    @C09CT("restrict_mode")
    public final Integer restrictMode;

    @C09CT("screen_down_time_settings")
    public final PNSScheduleBreakSettings screenDownTimeSettings;

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

    public PNSGuardianRestrictionBean() {
        this(0, 0, 0, new PNSDoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), 0, 0, 0, 0, 0, new ArrayList(), false, new PNSScheduleBreakSettings(false, 0, 0, new ArrayList(), 0), null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSGuardianRestrictionBean)) {
            return false;
        }
        PNSGuardianRestrictionBean pNSGuardianRestrictionBean = (PNSGuardianRestrictionBean) obj;
        return Intrinsics.LJFF(this.screenTimeManagement, pNSGuardianRestrictionBean.screenTimeManagement) && Intrinsics.LJFF(this.restrictMode, pNSGuardianRestrictionBean.restrictMode) && Intrinsics.LJFF(this.searchRestriction, pNSGuardianRestrictionBean.searchRestriction) && Intrinsics.LJFF(this.doNotDisturbSettings, pNSGuardianRestrictionBean.doNotDisturbSettings) && Intrinsics.LJFF(this.screenTimeBreaks, pNSGuardianRestrictionBean.screenTimeBreaks) && Intrinsics.LJFF(this.screenDurationType, pNSGuardianRestrictionBean.screenDurationType) && Intrinsics.LJFF(this.screenTimeManagementStatus, pNSGuardianRestrictionBean.screenTimeManagementStatus) && Intrinsics.LJFF(this.screenTimeManagementType, pNSGuardianRestrictionBean.screenTimeManagementType) && this.screenTimeManagementRepeatType == pNSGuardianRestrictionBean.screenTimeManagementRepeatType && Intrinsics.LJFF(this.screenTimeManagementWeekSettings, pNSGuardianRestrictionBean.screenTimeManagementWeekSettings) && this.shouldShowScreenBreak == pNSGuardianRestrictionBean.shouldShowScreenBreak && Intrinsics.LJFF(this.screenDownTimeSettings, pNSGuardianRestrictionBean.screenDownTimeSettings) && Intrinsics.LJFF(this.engagementCountSettings, pNSGuardianRestrictionBean.engagementCountSettings) && Intrinsics.LJFF(this.screenTimeManagementBlockType, pNSGuardianRestrictionBean.screenTimeManagementBlockType);
    }

    public final int hashCode() {
        Integer num = this.screenTimeManagement;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.restrictMode;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.searchRestriction;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        PNSDoNotDisturbSettings pNSDoNotDisturbSettings = this.doNotDisturbSettings;
        int iHashCode4 = (iHashCode3 + (pNSDoNotDisturbSettings == null ? 0 : pNSDoNotDisturbSettings.hashCode())) * 31;
        Integer num4 = this.screenTimeBreaks;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.screenDurationType;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.screenTimeManagementStatus;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.screenTimeManagementType;
        int iHashCode8 = (((iHashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31) + this.screenTimeManagementRepeatType) * 31;
        List<ScreenTimeManagementDaySetting> list = this.screenTimeManagementWeekSettings;
        int iHashCode9 = (((iHashCode8 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.shouldShowScreenBreak)) * 31;
        PNSScheduleBreakSettings pNSScheduleBreakSettings = this.screenDownTimeSettings;
        int iHashCode10 = (iHashCode9 + (pNSScheduleBreakSettings == null ? 0 : pNSScheduleBreakSettings.hashCode())) * 31;
        PNSEngagementCountSettings pNSEngagementCountSettings = this.engagementCountSettings;
        int iHashCode11 = (iHashCode10 + (pNSEngagementCountSettings == null ? 0 : pNSEngagementCountSettings.hashCode())) * 31;
        Integer num8 = this.screenTimeManagementBlockType;
        return iHashCode11 + (num8 != null ? num8.hashCode() : 0);
    }

    public final String toString() {
        return "PNSGuardianRestrictionBean(screenTimeManagement=" + this.screenTimeManagement + ", restrictMode=" + this.restrictMode + ", searchRestriction=" + this.searchRestriction + ", doNotDisturbSettings=" + this.doNotDisturbSettings + ", screenTimeBreaks=" + this.screenTimeBreaks + ", screenDurationType=" + this.screenDurationType + ", screenTimeManagementStatus=" + this.screenTimeManagementStatus + ", screenTimeManagementType=" + this.screenTimeManagementType + ", screenTimeManagementRepeatType=" + this.screenTimeManagementRepeatType + ", screenTimeManagementWeekSettings=" + this.screenTimeManagementWeekSettings + ", shouldShowScreenBreak=" + this.shouldShowScreenBreak + ", screenDownTimeSettings=" + this.screenDownTimeSettings + ", engagementCountSettings=" + this.engagementCountSettings + ", screenTimeManagementBlockType=" + this.screenTimeManagementBlockType + ')';
    }

    public PNSGuardianRestrictionBean(Integer num, Integer num2, Integer num3, PNSDoNotDisturbSettings pNSDoNotDisturbSettings, Integer num4, Integer num5, Integer num6, Integer num7, int i, List<ScreenTimeManagementDaySetting> list, boolean z, PNSScheduleBreakSettings pNSScheduleBreakSettings, PNSEngagementCountSettings pNSEngagementCountSettings, Integer num8) {
        this.screenTimeManagement = num;
        this.restrictMode = num2;
        this.searchRestriction = num3;
        this.doNotDisturbSettings = pNSDoNotDisturbSettings;
        this.screenTimeBreaks = num4;
        this.screenDurationType = num5;
        this.screenTimeManagementStatus = num6;
        this.screenTimeManagementType = num7;
        this.screenTimeManagementRepeatType = i;
        this.screenTimeManagementWeekSettings = list;
        this.shouldShowScreenBreak = z;
        this.screenDownTimeSettings = pNSScheduleBreakSettings;
        this.engagementCountSettings = pNSEngagementCountSettings;
        this.screenTimeManagementBlockType = num8;
    }
}
