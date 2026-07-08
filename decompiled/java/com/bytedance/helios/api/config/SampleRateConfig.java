package com.bytedance.helios.api.config;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class SampleRateConfig {

    @C09CT("api_high_priority_configs")
    public final List<ApiSampleRateConfig> apiHighPriorityConfigs;

    @C09CT("app_exit_config")
    public final double appExitConfig;

    @C09CT("app_ops_config")
    public final double appOpsConfig;

    @C09CT("auto_start_config")
    public final double autoStartConfig;

    @C09CT("default_low_priority_config")
    public final DefaultSampleRateConfig defaultLowPriorityConfig;

    @C09CT("enable_monitor")
    public final boolean enableMonitor;

    @C09CT("exception_alog_config")
    public final double exceptionAlogConfig;

    @C09CT("exception_config")
    public final double exceptionConfig;

    @C09CT("local_apm_config")
    public final double localAPMConfig;

    @C09CT("resource_medium_priority_configs")
    public final List<ResourceSampleRateConfig> resourceMediumPriorityConfigs;

    @C09CT("strict_mode_config")
    public final double strictModeConfig;

    public SampleRateConfig() {
        this(false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 2047, null);
    }

    public SampleRateConfig(boolean z, double d, double d2, double d3, double d4, double d5, double d6, double d7, DefaultSampleRateConfig defaultSampleRateConfig, List<ResourceSampleRateConfig> list, List<ApiSampleRateConfig> list2) {
        this.enableMonitor = z;
        this.appOpsConfig = d;
        this.autoStartConfig = d2;
        this.appExitConfig = d3;
        this.exceptionConfig = d4;
        this.exceptionAlogConfig = d5;
        this.strictModeConfig = d6;
        this.localAPMConfig = d7;
        this.defaultLowPriorityConfig = defaultSampleRateConfig;
        this.resourceMediumPriorityConfigs = list;
        this.apiHighPriorityConfigs = list2;
    }

    public SampleRateConfig(boolean z, double d, double d2, double d3, double d4, double d5, double d6, double d7, DefaultSampleRateConfig defaultSampleRateConfig, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 1.0E-5d : d, (i & 4) != 0 ? 1.0E-4d : d2, (i & 8) != 0 ? 1.0E-4d : d3, (i & 16) != 0 ? 0.1d : d4, (i & 32) != 0 ? 0.1d : d5, (i & 64) == 0 ? d6 : 0.1d, (i & 128) == 0 ? d7 : 1.0E-4d, (i & 256) != 0 ? new DefaultSampleRateConfig(0.0d, 0.01d, 1.0d, 1.0d) : defaultSampleRateConfig, (i & 512) != 0 ? C13BV.INSTANCE : list, (i & 1024) != 0 ? C13BV.INSTANCE : list2);
    }
}
