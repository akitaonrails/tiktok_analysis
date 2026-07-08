package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class DigitalWellbeingBean {

    @C09CT("algo_refresh_status")
    public final Boolean algoRefreshStatus;

    @C09CT("dw_infra_usage_time_upload_frequency")
    public final Integer digitalWellbeingInfraUsageTimeUploadFrequency;

    @C09CT("do_not_disturb_settings")
    public final DoNotDisturbSettings doNotDisturbSettings;

    @C09CT("dw_all_new_feature_release_highlight")
    public final Boolean dwAllNewFeatureHighlight;

    @C09CT("dw_missions_status")
    public final DigitalWellbeingMissionStatus dwMissionsStatus;

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
    public final SleepHoursAdditionalSettings sleepHoursAdditionalSettings;

    @C09CT("sleep_time_settings")
    public final SleepHourConfigSettings sleepTimeSettings;

    @C09CT("system_mute_settings")
    public final DoNotDisturbSettings systemMuteSettings;

    @C09CT("screen_time_update")
    public final Integer weeklyUpdate;

    public DigitalWellbeingBean() {
        this(0, 0, 0, 0, 0, 0, 0, 0, Boolean.FALSE, null, new DoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), new DoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), 0, new ArrayList(), new SleepHoursAdditionalSettings(0L, 0L, 0, 0, ""), Boolean.FALSE, Boolean.FALSE, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), Boolean.FALSE, Boolean.FALSE, new DigitalWellbeingMissionStatus(new SleepStreakStatus(0, Boolean.FALSE, Boolean.FALSE), Boolean.FALSE));
    }

    public DigitalWellbeingBean(Integer num, int i, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, SleepHourConfigSettings sleepHourConfigSettings, DoNotDisturbSettings doNotDisturbSettings, DoNotDisturbSettings doNotDisturbSettings2, Integer num8, List<ScreenTimeManagementDaySetting> list, SleepHoursAdditionalSettings sleepHoursAdditionalSettings, Boolean bool2, Boolean bool3, Integer num9, Boolean bool4, Boolean bool5, DigitalWellbeingMissionStatus digitalWellbeingMissionStatus) {
        this.screenTimeManagement = num;
        this.screenTimeManagementEnabled = i;
        this.screenTimeManagementType = num2;
        this.screenTimeManagementEligible = num3;
        this.restrictMode = num4;
        this.weeklyUpdate = num5;
        this.screenTimeBreaks = num6;
        this.screenDurationType = num7;
        this.algoRefreshStatus = bool;
        this.sleepTimeSettings = sleepHourConfigSettings;
        this.doNotDisturbSettings = doNotDisturbSettings;
        this.systemMuteSettings = doNotDisturbSettings2;
        this.screenTimeManagementRepeatType = num8;
        this.screenTimeManagementWeekSettings = list;
        this.sleepHoursAdditionalSettings = sleepHoursAdditionalSettings;
        this.restrictModeHasPassword = bool2;
        this.nonLoginScreenTimeEnable = bool3;
        this.digitalWellbeingInfraUsageTimeUploadFrequency = num9;
        this.dwNewFeatureReleaseHighlight = bool4;
        this.dwAllNewFeatureHighlight = bool5;
        this.dwMissionsStatus = digitalWellbeingMissionStatus;
    }
}
