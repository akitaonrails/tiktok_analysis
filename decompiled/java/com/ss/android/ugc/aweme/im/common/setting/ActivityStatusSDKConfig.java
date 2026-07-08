package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class ActivityStatusSDKConfig {

    @C09CT("activity_status_distinct_until_changed")
    public final boolean activityStatusDistinctUntilChanged;

    @C09CT("activity_status_external_cache_size")
    public final int activityStatusExternalCacheSize;

    @C09CT("align_inbox_skylight_data_update")
    public final boolean alignInboxSkylightDataUpdate;

    @C09CT("allow_batch_intercept_user")
    public final boolean allowBatchInterceptUser;

    @C09CT("allow_fetch_in_background")
    public final boolean allowFetchInBackground;

    @C09CT("disable_activate_auto_fetch")
    public final boolean disableActivateAutoFetch;

    @C09CT("imitate_live_data_in_share_scenario")
    public final boolean imitateLiveDataInShareScenario;

    @C09CT("is_debug_log_enable")
    public final boolean isDebugLogEnable;

    @C09CT("is_performance_analysis_enable")
    public final boolean isPerformanceAnalysisEnable;

    @C09CT("observe_user_update_strategy")
    public final int observeUserUpdateStrategy;

    @C09CT("only_observe_muf_change")
    public final boolean onlyObserveMUFChange;

    @C09CT("pre_check_prerequisite")
    public final boolean preCheckPrerequisite;

    @C09CT("preload_activity_status_module_in_pre_inbox_task")
    public final boolean preloadActivityStatusModuleInPreInboxTask;

    public ActivityStatusSDKConfig() {
        this(false, false, 250, false, false, false, false, false, false, true, false, 2, true);
    }

    public ActivityStatusSDKConfig(boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2, boolean z11) {
        this.isPerformanceAnalysisEnable = z;
        this.isDebugLogEnable = z2;
        this.activityStatusExternalCacheSize = i;
        this.disableActivateAutoFetch = z3;
        this.activityStatusDistinctUntilChanged = z4;
        this.alignInboxSkylightDataUpdate = z5;
        this.allowFetchInBackground = z6;
        this.onlyObserveMUFChange = z7;
        this.imitateLiveDataInShareScenario = z8;
        this.preloadActivityStatusModuleInPreInboxTask = z9;
        this.preCheckPrerequisite = z10;
        this.observeUserUpdateStrategy = i2;
        this.allowBatchInterceptUser = z11;
    }
}
