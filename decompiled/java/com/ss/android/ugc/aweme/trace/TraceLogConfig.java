package com.ss.android.ugc.aweme.trace;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class TraceLogConfig {

    @C09CT("api_log_blacklist")
    public final List<String> apiLogBlacklist;

    @C09CT("api_log_trace_expire_ts")
    public final Long apiLogTraceExpireTs;

    @C09CT("api_log_whitelist")
    public final List<String> apiLogWhitelist;

    @C09CT("app_log_to_apm_event")
    public final Boolean appLogToApmEvent;

    @C09CT("btm_page_event_auto_trace_whitelist")
    public final List<String> btmPageEventAutoTraceWhitelist;

    @C09CT("is_check_and_report_log")
    public final Boolean checkAndReportLog;

    @C09CT("global_enable")
    public final Boolean globalEnable;

    @C09CT("log_event_blacklist")
    public final List<String> logEventBlacklist;

    @C09CT("log_feat_enable_flag")
    public final Integer logFeatEnableFlag;

    @C09CT("log_force_trace_enable")
    public final Boolean logForceTraceEnable;

    @C09CT("log_max_span_count")
    public final Integer logMaxSpanCount;

    @C09CT("log_pref_opt_flag")
    public final Integer logPrefOptFlag;

    @C09CT("log_reset_check_point_ts")
    public final Long logResetCheckPointTs;

    @C09CT("log_trace_delay_ts")
    public final Long logTraceDelayTs;

    @C09CT("unsampled_max_disk_cache_size")
    public final Integer unsampledMaxDiskCacheSize;

    @C09CT("unsampled_max_log_size")
    public final Integer unsampledMaxLogSize;

    @C09CT("unsampled_once_span_count")
    public final Integer unsampledOnceSpanCount;

    @C09CT("unsampled_per_size")
    public final Integer unsampledPerSize;

    @C09CT("unsampled_single_param_max_size")
    public final Integer unsampledSingleParamMaxSize;

    @C09CT("unsampled_time_gap")
    public final Long unsampledTimeGap;

    @C09CT("unsampled_trace_control_flag")
    public final Integer unsampledTraceControlFlag;

    public TraceLogConfig() {
        this(Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public TraceLogConfig(Boolean bool, Boolean bool2, Long l, List<String> list, Integer num, Long l2, Integer num2, Integer num3, List<String> list2, List<String> list3, Long l3, Boolean bool3, Boolean bool4, List<String> list4, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Long l4, Integer num9) {
        this.globalEnable = bool;
        this.logForceTraceEnable = bool2;
        this.logTraceDelayTs = l;
        this.logEventBlacklist = list;
        this.logMaxSpanCount = num;
        this.logResetCheckPointTs = l2;
        this.logPrefOptFlag = num2;
        this.logFeatEnableFlag = num3;
        this.apiLogWhitelist = list2;
        this.apiLogBlacklist = list3;
        this.apiLogTraceExpireTs = l3;
        this.appLogToApmEvent = bool3;
        this.checkAndReportLog = bool4;
        this.btmPageEventAutoTraceWhitelist = list4;
        this.unsampledTraceControlFlag = num4;
        this.unsampledMaxLogSize = num5;
        this.unsampledPerSize = num6;
        this.unsampledMaxDiskCacheSize = num7;
        this.unsampledOnceSpanCount = num8;
        this.unsampledTimeGap = l4;
        this.unsampledSingleParamMaxSize = num9;
    }
}
