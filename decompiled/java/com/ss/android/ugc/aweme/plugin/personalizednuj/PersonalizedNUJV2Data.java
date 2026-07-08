package com.ss.android.ugc.aweme.plugin.personalizednuj;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PersonalizedNUJV2Data {

    @C09CT("unlogin_app_usage_time_limit_min")
    public final Integer appUsageUnloginTimeLimitMin;

    @C09CT("enable_unlogin_app_usage_time_limit")
    public final Boolean enableAppUsageUnloginTimeLimit;

    @C09CT("enable_second_chance_enter_pnuj")
    public final Boolean enableSecondChanceEnterPnuj;

    @C09CT("enable_unlogin_time_limit")
    public final Boolean enableUnloginTimeLimit;

    @C09CT("feed_login_config")
    public final FeedLoginConfig feedLoginConfig;

    @C09CT("is_algo_driven_snuj")
    public final Boolean isAlgoDrivenSNUJ;

    @C09CT("is_force_login")
    public final Boolean isForceLogin;

    @C09CT("login_time_limit_min")
    public final Integer loginTimeLimitMin;

    @C09CT("model_reason")
    public final String modelReason;

    @C09CT("need_nuj_in_age_gate_flow")
    public final Boolean needNUJInAgeGateFlow;

    @C09CT("need_nuj_quick_login_flow")
    public final Boolean needNUJInQuickLoginFlow;

    @C09CT("personalized_nuj_label")
    public final int personalizedNUJLabel;

    @C09CT("pre_login_config")
    public final PreLoginConfig preLoginConfig;

    @C09CT("should_row_force_login")
    public final Boolean shouldRowForceLogin;

    @C09CT("should_try_age_gate")
    public final Boolean shouldTryAgeGate;

    @C09CT("should_try_push_popup")
    public final Boolean shouldTryPushPopup;

    @C09CT("should_try_smart_lock")
    public final Boolean shouldTrySmartLock;

    @C09CT("smart_login_type")
    public final int smartLoginType;

    public PersonalizedNUJV2Data() {
        this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, 0, Boolean.FALSE, 0, Boolean.FALSE, 0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, 0, "", Boolean.FALSE, null, null);
    }

    public PersonalizedNUJV2Data(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, Boolean bool6, Integer num, Boolean bool7, Integer num2, Boolean bool8, Boolean bool9, Boolean bool10, int i2, String str, Boolean bool11, PreLoginConfig preLoginConfig, FeedLoginConfig feedLoginConfig) {
        this.shouldTrySmartLock = bool;
        this.shouldTryAgeGate = bool2;
        this.shouldTryPushPopup = bool3;
        this.needNUJInAgeGateFlow = bool4;
        this.needNUJInQuickLoginFlow = bool5;
        this.personalizedNUJLabel = i;
        this.enableUnloginTimeLimit = bool6;
        this.loginTimeLimitMin = num;
        this.enableAppUsageUnloginTimeLimit = bool7;
        this.appUsageUnloginTimeLimitMin = num2;
        this.enableSecondChanceEnterPnuj = bool8;
        this.shouldRowForceLogin = bool9;
        this.isForceLogin = bool10;
        this.smartLoginType = i2;
        this.modelReason = str;
        this.isAlgoDrivenSNUJ = bool11;
        this.preLoginConfig = preLoginConfig;
        this.feedLoginConfig = feedLoginConfig;
    }
}
