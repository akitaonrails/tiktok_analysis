package com.bytedance.pumbaa.pipeline.settings;

import X.AbstractC19994813Le;
import X.C093Y;
import X.C09CT;
import X.C13LQ;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C823280WRi;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class EventPipelineConfig {
    public static final AggregatedReportConfig LIZ = new AggregatedReportConfig(100);
    public static final AggregatedReportConfig LIZIZ = new AggregatedReportConfig(100);

    @C09CT("aggregated_report_configs")
    public final Map<String, AggregatedReportConfig> aggregatedReportConfigs;

    @C09CT("cache_configs")
    public final EventCacheConfig cacheConfigs;

    @C09CT("common_fields")
    public final Set<String> commonFields;

    @C09CT("default_performance_sample_rate")
    public final double defaultPerformanceSampleRate;

    @C09CT("enable_decision_trace_log")
    public boolean enableDecisionTraceLog;

    @C09CT("enable_logcat")
    public final boolean enableLogcat;

    @C09CT("enable_pipeline")
    public final boolean enablePipeline;

    @C09CT("exception_skip_filter")
    public final ExceptionSkipFilter exceptionSkipFilter;

    @C09CT("field_validate")
    public final boolean fieldValidate;

    @C09CT("merge_report_configs")
    public final Map<String, AggregatedReportConfig> mergeReportConfigs;

    @C09CT("performance_sample_rate")
    public final Map<String, Double> performanceSampleRate;

    @C09CT("preload_fields")
    public final Set<String> preloadFields;

    @C09CT("report_exception")
    public final boolean reportException;

    @C09CT("stash_cache_limit")
    public final int stashCacheLimit;

    @C09CT("throw_exception")
    public final boolean throwException;

    public EventPipelineConfig() {
        this(false, false, false, false, false, false, null, null, 0.0d, null, null, null, 0, null, null, 32767, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventPipelineConfig)) {
            return false;
        }
        EventPipelineConfig eventPipelineConfig = (EventPipelineConfig) obj;
        return this.enablePipeline == eventPipelineConfig.enablePipeline && this.enableLogcat == eventPipelineConfig.enableLogcat && this.enableDecisionTraceLog == eventPipelineConfig.enableDecisionTraceLog && this.reportException == eventPipelineConfig.reportException && this.throwException == eventPipelineConfig.throwException && this.fieldValidate == eventPipelineConfig.fieldValidate && Intrinsics.LJFF(this.preloadFields, eventPipelineConfig.preloadFields) && Intrinsics.LJFF(this.commonFields, eventPipelineConfig.commonFields) && Double.compare(this.defaultPerformanceSampleRate, eventPipelineConfig.defaultPerformanceSampleRate) == 0 && Intrinsics.LJFF(this.performanceSampleRate, eventPipelineConfig.performanceSampleRate) && Intrinsics.LJFF(this.aggregatedReportConfigs, eventPipelineConfig.aggregatedReportConfigs) && Intrinsics.LJFF(this.mergeReportConfigs, eventPipelineConfig.mergeReportConfigs) && this.stashCacheLimit == eventPipelineConfig.stashCacheLimit && Intrinsics.LJFF(this.exceptionSkipFilter, eventPipelineConfig.exceptionSkipFilter) && Intrinsics.LJFF(this.cacheConfigs, eventPipelineConfig.cacheConfigs);
    }

    public final boolean LIZ(String str) {
        double dDoubleValue;
        try {
            Double d = this.performanceSampleRate.get(str);
            if (d != null) {
                dDoubleValue = d.doubleValue();
            } else {
                dDoubleValue = this.defaultPerformanceSampleRate;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hitPerformanceSampleRate error, map class = ");
            sbLIZ.append(this.performanceSampleRate.getClass());
            C823280WRi.LIZJ(C2188811AlT.LIZIZ(sbLIZ), "ensure_not_reach_here", th);
            dDoubleValue = this.defaultPerformanceSampleRate;
        }
        if (dDoubleValue < 1.0d) {
            if (dDoubleValue > 0.0d && AbstractC19994813Le.Default.nextDouble(0.0d, 1.0d) <= dDoubleValue) {
                return true;
            }
            return false;
        }
        return true;
    }

    public EventPipelineConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Set<String> set, Set<String> set2, double d, Map<String, Double> map, Map<String, AggregatedReportConfig> map2, Map<String, AggregatedReportConfig> map3, int i, ExceptionSkipFilter exceptionSkipFilter, EventCacheConfig eventCacheConfig) {
        this.enablePipeline = z;
        this.enableLogcat = z2;
        this.enableDecisionTraceLog = z3;
        this.reportException = z4;
        this.throwException = z5;
        this.fieldValidate = z6;
        this.preloadFields = set;
        this.commonFields = set2;
        this.defaultPerformanceSampleRate = d;
        this.performanceSampleRate = map;
        this.aggregatedReportConfigs = map2;
        this.mergeReportConfigs = map3;
        this.stashCacheLimit = i;
        this.exceptionSkipFilter = exceptionSkipFilter;
        this.cacheConfigs = eventCacheConfig;
    }

    public EventPipelineConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Set set, Set set2, double d, Map map, Map map2, Map map3, int i, ExceptionSkipFilter exceptionSkipFilter, EventCacheConfig eventCacheConfig, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) == 0 ? z4 : true, (i2 & 16) != 0 ? false : z5, (i2 & 32) != 0 ? false : z6, (i2 & 64) != 0 ? C093Y.LIZJ("pumbaa_app_version", "pumbaa_version_code", "release_build", "sdk_version", "is_regression_test", "background_status", "store_region", "region_source", "priority_region", "is_before_init", "is_guest_mode", "is_login", "is_not_consent", "is_account_deleted", "is_kids_mode", "is_minor", "age", "store_region_src", "is_personalize_ad_enable") : set, (i2 & 128) != 0 ? C13LQ.LJLIIL(new String[]{"pumbaa_app_version", "pumbaa_version_code", "release_build", "sdk_version", "is_regression_test", "report_reason", "report_sample"}) : set2, (i2 & 256) != 0 ? 0.001d : d, (i2 & 512) != 0 ? C2097608Jq.LJ() : map, (i2 & 1024) != 0 ? C2097908Jt.LIZJ(new Pair("Network", new AggregatedReportConfig(100))) : map2, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C2097908Jt.LIZJ(new Pair("Network", new AggregatedReportConfig(100))) : map3, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 200 : i, (i2 & 8192) != 0 ? new ExceptionSkipFilter(null, null, 3, null) : exceptionSkipFilter, (i2 & 16384) != 0 ? new EventCacheConfig(false, 100) : eventCacheConfig);
    }
}
