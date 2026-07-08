package com.ss.android.ugc.aweme.pns.model;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PNSDigitalWellbeingBean {

    @C09CT("algo_refresh_status")
    public final Boolean algoRefreshStatus;

    @C09CT("dw_infra_usage_time_upload_frequency")
    public final Integer digitalWellbeingInfraUsageTimeUploadFrequency;

    @C09CT("do_not_disturb_settings")
    public final PNSDoNotDisturbSettings doNotDisturbSettings;

    @C09CT("dw_all_new_feature_release_highlight")
    public final Boolean dwAllNewFeatureHighlight;

    @C09CT("dw_missions_status")
    public final PNSDigitalWellbeingMissionStatus dwMissionsStatus;

    @C09CT("dw_new_feature_release_highlight")
    public final Boolean dwNewFeatureReleaseHighlight;

    @C09CT("non_login_screen_time_enable")
    public final Boolean nonLoginScreenTimeEnable;

    @C09CT("restrict_mode")
    public final Integer restrictMode;

    @C09CT("restrict_mode_has_password")
    public final Boolean restrictModeHasPassword;

    @C09CT("session_duration_type")
    public final Integer screenDurationType;

    @C09CT("session_duration_reminder")
    public final Integer screenTimeBreaks;

    @C09CT("screen_time_management")
    public final Integer screenTimeManagement;

    @C09CT("screen_time_management_eligible")
    public final Integer screenTimeManagementEligible;

    @C09CT("screen_time_management_status")
    public final int screenTimeManagementEnabled;

    @C09CT("screen_time_management_repeat_type")
    public final Integer screenTimeManagementRepeatType;

    @C09CT("screen_time_management_type")
    public final Integer screenTimeManagementType;

    @C09CT("screen_time_management_week_settings")
    public final List<ScreenTimeManagementDaySetting> screenTimeManagementWeekSettings;

    @C09CT("sleep_hours_additional_settings")
    public final PNSSleepHoursAdditionalSettings sleepHoursAdditionalSettings;

    @C09CT("sleep_time_settings")
    public final PNSUserNightScreenTimeSettings sleepTimeSettings;

    @C09CT("system_mute_settings")
    public final PNSDoNotDisturbSettings systemMuteSettings;

    @C09CT("screen_time_update")
    public final Integer weeklyUpdate;

    public PNSDigitalWellbeingBean() {
        this(0, 0, 0, 0, 0, 0, 0, 0, Boolean.FALSE, null, new PNSDoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), new PNSDoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), 0, new ArrayList(), new PNSSleepHoursAdditionalSettings(0L, 0L, 0, 0, ""), Boolean.FALSE, Boolean.FALSE, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), Boolean.FALSE, Boolean.FALSE, new PNSDigitalWellbeingMissionStatus(new PNSSleepStreakStatus(0, Boolean.FALSE, Boolean.FALSE), Boolean.FALSE));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSDigitalWellbeingBean)) {
            return false;
        }
        PNSDigitalWellbeingBean pNSDigitalWellbeingBean = (PNSDigitalWellbeingBean) obj;
        return Intrinsics.LJFF(this.screenTimeManagement, pNSDigitalWellbeingBean.screenTimeManagement) && this.screenTimeManagementEnabled == pNSDigitalWellbeingBean.screenTimeManagementEnabled && Intrinsics.LJFF(this.screenTimeManagementType, pNSDigitalWellbeingBean.screenTimeManagementType) && Intrinsics.LJFF(this.screenTimeManagementEligible, pNSDigitalWellbeingBean.screenTimeManagementEligible) && Intrinsics.LJFF(this.restrictMode, pNSDigitalWellbeingBean.restrictMode) && Intrinsics.LJFF(this.weeklyUpdate, pNSDigitalWellbeingBean.weeklyUpdate) && Intrinsics.LJFF(this.screenTimeBreaks, pNSDigitalWellbeingBean.screenTimeBreaks) && Intrinsics.LJFF(this.screenDurationType, pNSDigitalWellbeingBean.screenDurationType) && Intrinsics.LJFF(this.algoRefreshStatus, pNSDigitalWellbeingBean.algoRefreshStatus) && Intrinsics.LJFF(this.sleepTimeSettings, pNSDigitalWellbeingBean.sleepTimeSettings) && Intrinsics.LJFF(this.doNotDisturbSettings, pNSDigitalWellbeingBean.doNotDisturbSettings) && Intrinsics.LJFF(this.systemMuteSettings, pNSDigitalWellbeingBean.systemMuteSettings) && Intrinsics.LJFF(this.screenTimeManagementRepeatType, pNSDigitalWellbeingBean.screenTimeManagementRepeatType) && Intrinsics.LJFF(this.screenTimeManagementWeekSettings, pNSDigitalWellbeingBean.screenTimeManagementWeekSettings) && Intrinsics.LJFF(this.sleepHoursAdditionalSettings, pNSDigitalWellbeingBean.sleepHoursAdditionalSettings) && Intrinsics.LJFF(this.restrictModeHasPassword, pNSDigitalWellbeingBean.restrictModeHasPassword) && Intrinsics.LJFF(this.nonLoginScreenTimeEnable, pNSDigitalWellbeingBean.nonLoginScreenTimeEnable) && Intrinsics.LJFF(this.digitalWellbeingInfraUsageTimeUploadFrequency, pNSDigitalWellbeingBean.digitalWellbeingInfraUsageTimeUploadFrequency) && Intrinsics.LJFF(this.dwNewFeatureReleaseHighlight, pNSDigitalWellbeingBean.dwNewFeatureReleaseHighlight) && Intrinsics.LJFF(this.dwAllNewFeatureHighlight, pNSDigitalWellbeingBean.dwAllNewFeatureHighlight) && Intrinsics.LJFF(this.dwMissionsStatus, pNSDigitalWellbeingBean.dwMissionsStatus);
    }

    public final int hashCode() {
        Integer num = this.screenTimeManagement;
        int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.screenTimeManagementEnabled) * 31;
        Integer num2 = this.screenTimeManagementType;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.screenTimeManagementEligible;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.restrictMode;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.weeklyUpdate;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.screenTimeBreaks;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.screenDurationType;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool = this.algoRefreshStatus;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        PNSUserNightScreenTimeSettings pNSUserNightScreenTimeSettings = this.sleepTimeSettings;
        int iHashCode9 = (iHashCode8 + (pNSUserNightScreenTimeSettings == null ? 0 : pNSUserNightScreenTimeSettings.hashCode())) * 31;
        PNSDoNotDisturbSettings pNSDoNotDisturbSettings = this.doNotDisturbSettings;
        int iHashCode10 = (iHashCode9 + (pNSDoNotDisturbSettings == null ? 0 : pNSDoNotDisturbSettings.hashCode())) * 31;
        PNSDoNotDisturbSettings pNSDoNotDisturbSettings2 = this.systemMuteSettings;
        int iHashCode11 = (iHashCode10 + (pNSDoNotDisturbSettings2 == null ? 0 : pNSDoNotDisturbSettings2.hashCode())) * 31;
        Integer num8 = this.screenTimeManagementRepeatType;
        int iHashCode12 = (iHashCode11 + (num8 == null ? 0 : num8.hashCode())) * 31;
        List<ScreenTimeManagementDaySetting> list = this.screenTimeManagementWeekSettings;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        PNSSleepHoursAdditionalSettings pNSSleepHoursAdditionalSettings = this.sleepHoursAdditionalSettings;
        int iHashCode14 = (iHashCode13 + (pNSSleepHoursAdditionalSettings == null ? 0 : pNSSleepHoursAdditionalSettings.hashCode())) * 31;
        Boolean bool2 = this.restrictModeHasPassword;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.nonLoginScreenTimeEnable;
        int iHashCode16 = (iHashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num9 = this.digitalWellbeingInfraUsageTimeUploadFrequency;
        int iHashCode17 = (iHashCode16 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Boolean bool4 = this.dwNewFeatureReleaseHighlight;
        int iHashCode18 = (iHashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.dwAllNewFeatureHighlight;
        int iHashCode19 = (iHashCode18 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        PNSDigitalWellbeingMissionStatus pNSDigitalWellbeingMissionStatus = this.dwMissionsStatus;
        return iHashCode19 + (pNSDigitalWellbeingMissionStatus != null ? pNSDigitalWellbeingMissionStatus.hashCode() : 0);
    }

    public final String toString() {
        return "PNSDigitalWellbeingBean(screenTimeManagement=" + this.screenTimeManagement + ", screenTimeManagementEnabled=" + this.screenTimeManagementEnabled + ", screenTimeManagementType=" + this.screenTimeManagementType + ", screenTimeManagementEligible=" + this.screenTimeManagementEligible + ", restrictMode=" + this.restrictMode + ", weeklyUpdate=" + this.weeklyUpdate + ", screenTimeBreaks=" + this.screenTimeBreaks + ", screenDurationType=" + this.screenDurationType + ", algoRefreshStatus=" + this.algoRefreshStatus + ", sleepTimeSettings=" + this.sleepTimeSettings + ", doNotDisturbSettings=" + this.doNotDisturbSettings + ", systemMuteSettings=" + this.systemMuteSettings + ", screenTimeManagementRepeatType=" + this.screenTimeManagementRepeatType + ", screenTimeManagementWeekSettings=" + this.screenTimeManagementWeekSettings + ", sleepHoursAdditionalSettings=" + this.sleepHoursAdditionalSettings + ", restrictModeHasPassword=" + this.restrictModeHasPassword + ", nonLoginScreenTimeEnable=" + this.nonLoginScreenTimeEnable + ", digitalWellbeingInfraUsageTimeUploadFrequency=" + this.digitalWellbeingInfraUsageTimeUploadFrequency + ", dwNewFeatureReleaseHighlight=" + this.dwNewFeatureReleaseHighlight + ", dwAllNewFeatureHighlight=" + this.dwAllNewFeatureHighlight + ", dwMissionsStatus=" + this.dwMissionsStatus + ')';
    }

    public PNSDigitalWellbeingBean(Integer num, int i, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, PNSUserNightScreenTimeSettings pNSUserNightScreenTimeSettings, PNSDoNotDisturbSettings pNSDoNotDisturbSettings, PNSDoNotDisturbSettings pNSDoNotDisturbSettings2, Integer num8, List<ScreenTimeManagementDaySetting> list, PNSSleepHoursAdditionalSettings pNSSleepHoursAdditionalSettings, Boolean bool2, Boolean bool3, Integer num9, Boolean bool4, Boolean bool5, PNSDigitalWellbeingMissionStatus pNSDigitalWellbeingMissionStatus) {
        this.screenTimeManagement = num;
        this.screenTimeManagementEnabled = i;
        this.screenTimeManagementType = num2;
        this.screenTimeManagementEligible = num3;
        this.restrictMode = num4;
        this.weeklyUpdate = num5;
        this.screenTimeBreaks = num6;
        this.screenDurationType = num7;
        this.algoRefreshStatus = bool;
        this.sleepTimeSettings = pNSUserNightScreenTimeSettings;
        this.doNotDisturbSettings = pNSDoNotDisturbSettings;
        this.systemMuteSettings = pNSDoNotDisturbSettings2;
        this.screenTimeManagementRepeatType = num8;
        this.screenTimeManagementWeekSettings = list;
        this.sleepHoursAdditionalSettings = pNSSleepHoursAdditionalSettings;
        this.restrictModeHasPassword = bool2;
        this.nonLoginScreenTimeEnable = bool3;
        this.digitalWellbeingInfraUsageTimeUploadFrequency = num9;
        this.dwNewFeatureReleaseHighlight = bool4;
        this.dwAllNewFeatureHighlight = bool5;
        this.dwMissionsStatus = pNSDigitalWellbeingMissionStatus;
    }
}
