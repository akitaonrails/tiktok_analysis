package com.ss.android.ugc.aweme.kids.common.response;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class KidsComplianceSettings {

    @C09CT("age_appeal_menu")
    public final AgeAppealMenu ageAppealMenu;

    @C09CT("settings_black_menu_list")
    public final List<String> blackSetting;

    @C09CT("bpea_limit_config")
    public final String bpeaLimitConfig;

    @C09CT("cmpl_enc")
    public final String complianceEncrypt;

    @C09CT("helios_settings")
    public final String heliosSettings;

    @C09CT("hide_discover_bottom_tab")
    public final Boolean hideDiscoverBottomTab;

    @C09CT("hide_like_button")
    public final Boolean hideLikeButton;

    @C09CT("hide_record_bottom_tab")
    public final Boolean hideRecordBottomTab;

    @C09CT("hide_report_button")
    public final Boolean hideReportButton;

    @C09CT("interface_control_settings")
    public final String interfaceControlSettingsString;

    @C09CT("kids_log_events")
    public final List<String> kidsEvents;

    @C09CT("km_report_reasons")
    public final String kmReportReasons;

    @C09CT("rule_engine_config_settings")
    public final String ruleEngineConfig;

    @C09CT("rule_engine_strategy_settings")
    public final String ruleEngineStrategy;

    @C09CT("screen_time_management_self")
    public Integer timeLockSelfInMin;

    @C09CT("screen_time_break_settings")
    public final KidsWellbeingSetting wellbeingSetting;

    public final void setTimeLockSelfInMin(Integer num) {
        this.timeLockSelfInMin = num;
    }

    public KidsComplianceSettings(List<String> list, String str, Integer num, List<String> list2, String str2, String str3, String str4, String str5, String str6, String str7, AgeAppealMenu ageAppealMenu, KidsWellbeingSetting kidsWellbeingSetting, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.blackSetting = list;
        this.complianceEncrypt = str;
        this.timeLockSelfInMin = num;
        this.kidsEvents = list2;
        this.interfaceControlSettingsString = str2;
        this.kmReportReasons = str3;
        this.heliosSettings = str4;
        this.ruleEngineConfig = str5;
        this.ruleEngineStrategy = str6;
        this.bpeaLimitConfig = str7;
        this.ageAppealMenu = ageAppealMenu;
        this.wellbeingSetting = kidsWellbeingSetting;
        this.hideDiscoverBottomTab = bool;
        this.hideRecordBottomTab = bool2;
        this.hideReportButton = bool3;
        this.hideLikeButton = bool4;
    }
}
