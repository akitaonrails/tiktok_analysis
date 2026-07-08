package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PopupFiltersConfig implements Serializable {

    @C09CT("customized_frequency_control")
    public List<CustomizedFrequencyControl> customizedFreqCtrls;

    @C09CT("edm_consent_check")
    public boolean edmConsentCheck;

    @C09CT("edm_subscribe_check")
    public boolean edmSubscribeCheck;

    @C09CT("push_exp_frequency_control")
    public boolean enableUnifiedFreqCtrlSettings;

    @C09CT("check_enabled_sub_scenes")
    public List<String> enabledSubScenes;

    @C09CT("login_status_check")
    public int loginStatusCheck;

    @C09CT("check_user_installed_days")
    public NewUserFilters newUserFilter;

    @C09CT("push_inner_permission_checklist")
    public PushInnerPermissionChecklist pushInnerPermissionChecklist;

    @C09CT("push_system_permission_check")
    public int pushSysPermissionStatusCheck;

    @C09CT("push_show_interval_with_system_popup_in_min")
    public int showUpIntervalWithSystem;

    @C09CT("sms_consent_check")
    public boolean smsConsentCheck;

    public PopupFiltersConfig() {
        this(0, null, true, null, -1, null, -1, false, false, false, null);
    }

    public int hashCode() {
        int i = this.pushSysPermissionStatusCheck * 31;
        PushInnerPermissionChecklist pushInnerPermissionChecklist = this.pushInnerPermissionChecklist;
        int iHashCode = (((i + (pushInnerPermissionChecklist == null ? 0 : pushInnerPermissionChecklist.hashCode())) * 31) + C786410Ut5.Z2(this.enableUnifiedFreqCtrlSettings)) * 31;
        List<CustomizedFrequencyControl> list = this.customizedFreqCtrls;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.showUpIntervalWithSystem) * 31;
        NewUserFilters newUserFilters = this.newUserFilter;
        int iHashCode3 = (((((((((iHashCode2 + (newUserFilters == null ? 0 : newUserFilters.hashCode())) * 31) + this.loginStatusCheck) * 31) + C786410Ut5.Z2(this.smsConsentCheck)) * 31) + C786410Ut5.Z2(this.edmConsentCheck)) * 31) + C786410Ut5.Z2(this.edmSubscribeCheck)) * 31;
        List<String> list2 = this.enabledSubScenes;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "PopupFiltersConfig(pushSysPermissionStatusCheck=" + this.pushSysPermissionStatusCheck + ", pushInnerPermissionChecklist=" + this.pushInnerPermissionChecklist + ", enableUnifiedFreqCtrlSettings=" + this.enableUnifiedFreqCtrlSettings + ", customizedFreqCtrls=" + this.customizedFreqCtrls + ", showUpIntervalWithSystem=" + this.showUpIntervalWithSystem + ", newUserFilter=" + this.newUserFilter + ", loginStatusCheck=" + this.loginStatusCheck + ", smsConsentCheck=" + this.smsConsentCheck + ", edmConsentCheck=" + this.edmConsentCheck + ", edmSubscribeCheck=" + this.edmSubscribeCheck + ", enabledSubScenes=" + this.enabledSubScenes + ')';
    }

    public final void setCustomizedFreqCtrls(List<CustomizedFrequencyControl> list) {
        this.customizedFreqCtrls = list;
    }

    public final void setEdmConsentCheck(boolean z) {
        this.edmConsentCheck = z;
    }

    public final void setEdmSubscribeCheck(boolean z) {
        this.edmSubscribeCheck = z;
    }

    public final void setEnableUnifiedFreqCtrlSettings(boolean z) {
        this.enableUnifiedFreqCtrlSettings = z;
    }

    public final void setEnabledSubScenes(List<String> list) {
        this.enabledSubScenes = list;
    }

    public final void setLoginStatusCheck(int i) {
        this.loginStatusCheck = i;
    }

    public final void setNewUserFilter(NewUserFilters newUserFilters) {
        this.newUserFilter = newUserFilters;
    }

    public final void setPushInnerPermissionChecklist(PushInnerPermissionChecklist pushInnerPermissionChecklist) {
        this.pushInnerPermissionChecklist = pushInnerPermissionChecklist;
    }

    public final void setPushSysPermissionStatusCheck(int i) {
        this.pushSysPermissionStatusCheck = i;
    }

    public final void setShowUpIntervalWithSystem(int i) {
        this.showUpIntervalWithSystem = i;
    }

    public final void setSmsConsentCheck(boolean z) {
        this.smsConsentCheck = z;
    }

    public PopupFiltersConfig(int i, PushInnerPermissionChecklist pushInnerPermissionChecklist, boolean z, List<CustomizedFrequencyControl> list, int i2, NewUserFilters newUserFilters, int i3, boolean z2, boolean z3, boolean z4, List<String> list2) {
        this.pushSysPermissionStatusCheck = i;
        this.pushInnerPermissionChecklist = pushInnerPermissionChecklist;
        this.enableUnifiedFreqCtrlSettings = z;
        this.customizedFreqCtrls = list;
        this.showUpIntervalWithSystem = i2;
        this.newUserFilter = newUserFilters;
        this.loginStatusCheck = i3;
        this.smsConsentCheck = z2;
        this.edmConsentCheck = z3;
        this.edmSubscribeCheck = z4;
        this.enabledSubScenes = list2;
    }
}
