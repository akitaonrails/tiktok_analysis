package com.ss.android.ugc.aweme.compliance.protection.jsb;

import X.C1051660dTQ;
import X.C15Y6;
import X.C15Y7;
import X.C15YD;
import X.C20536115Xj;
import X.C297270Bkz;
import X.EnumC20537615Xy;
import X.InterfaceC1019840ce6;
import X.InterfaceC20537915Yb;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.ScheduleBreakSettings;
import com.ss.android.ugc.aweme.compliance.api.model.ScheduleBreakWeekSettings;
import com.ss.android.ugc.aweme.compliance.api.model.ScreenTimeManagementDaySetting;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourConfigSettings;
import com.ss.android.ugc.aweme.compliance.api.model.UserDetailsInfoBean;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManagerV2;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class GetDigitalWellbeingStatusMethod extends BaseBridgeMethod {
    public static final int $stable = 8;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final JSONObject getSleepHourConfigSettingJson() throws JSONException {
        Boolean bool;
        JSONObject jSONObject = new JSONObject();
        C20536115Xj.LIZ.getClass();
        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL = C20536115Xj.LIZLLL();
        jSONObject.put("sleep_time_start_hour", sleepHourConfigSettingsLIZLLL != null ? sleepHourConfigSettingsLIZLLL.sleepTimeStartHour : null);
        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL2 = C20536115Xj.LIZLLL();
        jSONObject.put("sleep_time_start_minute", sleepHourConfigSettingsLIZLLL2 != null ? sleepHourConfigSettingsLIZLLL2.sleepTimeStartMinute : null);
        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL3 = C20536115Xj.LIZLLL();
        jSONObject.put("sleep_time_end_hour", sleepHourConfigSettingsLIZLLL3 != null ? sleepHourConfigSettingsLIZLLL3.sleepTimeEndHour : null);
        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL4 = C20536115Xj.LIZLLL();
        jSONObject.put("sleep_time_end_minute", sleepHourConfigSettingsLIZLLL4 != null ? sleepHourConfigSettingsLIZLLL4.sleepTimeEndMinute : null);
        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL5 = C20536115Xj.LIZLLL();
        jSONObject.put("sleep_reminder_enabled", sleepHourConfigSettingsLIZLLL5 != null ? sleepHourConfigSettingsLIZLLL5.sleepHourEnabled : null);
        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL6 = C20536115Xj.LIZLLL();
        jSONObject.put("skip_for_today", (sleepHourConfigSettingsLIZLLL6 == null || (bool = sleepHourConfigSettingsLIZLLL6.skipSleepHours) == null) ? false : bool.booleanValue());
        return jSONObject;
    }

    private final JSONObject getUserDetailJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C20536115Xj.LIZ.getClass();
        UserDetailsInfoBean userDetailsInfoBeanLJII = C20536115Xj.LJII();
        jSONObject.put("is_minor", userDetailsInfoBeanLJII != null ? userDetailsInfoBeanLJII.isMinor : null);
        return jSONObject;
    }

    private final InterfaceC20537915Yb getDigitalWellbeingManager() {
        return C297270Bkz.LIZ() ? C15Y6.LL : C15Y7.LL;
    }

    private final C15YD getFamilyParingManager() {
        return C297270Bkz.LIZ() ? FamilyPairingManagerV2.LIZ : FamilyPairingManager.LIZ;
    }

    private final JSONObject getScheduleDowntimeSettingJson() throws JSONException {
        List<ScheduleBreakWeekSettings> list;
        ScheduleBreakSettings scheduleBreakSettingsLIZ = getFamilyParingManager().LIZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("show_stm_down_time", scheduleBreakSettingsLIZ != null ? Boolean.valueOf(scheduleBreakSettingsLIZ.shouldShowDownTime) : null);
        jSONObject.put("screen_down_time_status", scheduleBreakSettingsLIZ != null ? Integer.valueOf(scheduleBreakSettingsLIZ.downTimeStatus) : null);
        jSONObject.put("screen_down_time_type", scheduleBreakSettingsLIZ != null ? Integer.valueOf(scheduleBreakSettingsLIZ.type) : null);
        jSONObject.put("permission_review_status", scheduleBreakSettingsLIZ != null ? Integer.valueOf(scheduleBreakSettingsLIZ.skipDownTimeStatus) : null);
        JSONArray jSONArray = new JSONArray();
        if (scheduleBreakSettingsLIZ != null && (list = scheduleBreakSettingsLIZ.weekSettings) != null) {
            for (ScheduleBreakWeekSettings scheduleBreakWeekSettings : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("day", scheduleBreakWeekSettings.weekDay);
                jSONObject2.put("start_hour", scheduleBreakWeekSettings.startHour);
                jSONObject2.put("start_min", scheduleBreakWeekSettings.startMinute);
                jSONObject2.put("end_hour", scheduleBreakWeekSettings.endHour);
                jSONObject2.put("end_min", scheduleBreakWeekSettings.endMinute);
                jSONObject2.put("screen_down_time_status_day", scheduleBreakWeekSettings.status);
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("screen_down_time_day_setting", jSONArray);
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    private final JSONArray getScreenTimeWeekSettings(List<ScreenTimeManagementDaySetting> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (ScreenTimeManagementDaySetting screenTimeManagementDaySetting : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("day", screenTimeManagementDaySetting.dayOfWeek);
                jSONObject.put("screen_time_limit", screenTimeManagementDaySetting.screenTimeLimitForWeek);
                jSONObject.put("screen_time_setting_type", screenTimeManagementDaySetting.screenTimeSettingTypeForWeek);
                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, screenTimeManagementDaySetting.screenTimeStatusForWeek);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public final void getDigitalWellbeingStatus(JSONObject jSONObject) throws JSONException {
        Integer numValueOf;
        jSONObject.put("self_timelock", getDigitalWellbeingManager().LJIILIIL());
        jSONObject.put("self_restricted_mode", getDigitalWellbeingManager().LJIIL() ? 1 : 0);
        jSONObject.put("self_weekly_update", getDigitalWellbeingManager().LJIJJ() ? 1 : 0);
        jSONObject.put("max_use_duration_in_minutes", getDigitalWellbeingManager().LJJI());
        jSONObject.put("self_timelock_type", getDigitalWellbeingManager().LIZ());
        EnumC20537615Xy enumC20537615XyLIZIZ = ComplianceServiceProvider.LJIIJJI().LIZIZ();
        if (enumC20537615XyLIZIZ != null) {
            numValueOf = Integer.valueOf(enumC20537615XyLIZIZ.getValue());
        } else {
            numValueOf = null;
        }
        jSONObject.put("family_role", numValueOf);
        jSONObject.put("family_restricted_mode", getFamilyParingManager().LJIL() ? 1 : 0);
        jSONObject.put("family_timelock", getFamilyParingManager().LJIIIIZZ() ? 1 : 0);
        jSONObject.put("session_duration_reminder", getDigitalWellbeingManager().LJIIIZ());
        jSONObject.put("session_duration_type", getDigitalWellbeingManager().LJIIIIZZ());
        jSONObject.put("sleep_time_settings", getSleepHourConfigSettingJson());
        jSONObject.put("user_details", getUserDetailJson());
        jSONObject.put("self_timelock_repeat_type", getDigitalWellbeingManager().LJJ());
        C20536115Xj.LIZ.getClass();
        jSONObject.put("self_timelock_week_settings", getScreenTimeWeekSettings(C20536115Xj.LIZJ()));
        jSONObject.put("family_timelock_repeat_type", getFamilyParingManager().LJIJ());
        jSONObject.put("family_max_use_duration_in_minutes", getFamilyParingManager().LJ());
        jSONObject.put("family_timelock_type", getFamilyParingManager().LIZJ());
        jSONObject.put("family_timelock_week_settings", getScreenTimeWeekSettings(getFamilyParingManager().LIZLLL()));
        jSONObject.put("family_session_duration_reminder", getFamilyParingManager().LJII());
        jSONObject.put("family_session_duration_type", getFamilyParingManager().LJIIJ());
        jSONObject.put("family_show_stm_break", getFamilyParingManager().LJFF());
        jSONObject.put("family_screen_down_time_settings", getScheduleDowntimeSettingJson());
        jSONObject.put("restrict_mode_has_password", getDigitalWellbeingManager().LJIIZILJ() ? 1 : 0);
        jSONObject.put("self_timelock_block_type", getFamilyParingManager().LJIILIIL());
    }

    public GetDigitalWellbeingStatusMethod(C1051660dTQ c1051660dTQ, String str) {
        super(c1051660dTQ);
        this.name = str;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            getDigitalWellbeingStatus(jSONObject2);
            interfaceC1019840ce6.onSuccess(jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1019840ce6.LIZ(-1, e.getMessage());
        }
    }
}
