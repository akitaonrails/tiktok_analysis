package com.bytedance.pumbaa.utility.method_id;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class MethodIDConfig {

    @C09CT("downgrade_rate")
    public final double downgradeRate;

    @C09CT("dynamic_sample_time_window")
    public final long dynamicSampleTimeWindow;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_collect_config_info")
    public final boolean enableCollectConfigInfo;

    @C09CT("enable_collect_runtime_info")
    public final boolean enableCollectRuntimeInfo;

    @C09CT("enable_dynamic_sample_rate")
    public final boolean enableDynamicSampleRate;

    @C09CT("enable_extra_sample_fetcher")
    public final boolean enableExtraSampleFetcher;

    @C09CT("extra_sample_rate")
    public final double extraSampleRate;

    @C09CT("global_sample_rate")
    public final double globalSampleRate;

    @C09CT("min_dynamic_sample_rate")
    public final double minDynamicSampleRate;

    @C09CT("optimize_mode")
    public final int optimizeMode;

    @C09CT("source")
    public final String source;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MethodIDConfig)) {
            return false;
        }
        MethodIDConfig methodIDConfig = (MethodIDConfig) obj;
        return this.enable == methodIDConfig.enable && this.optimizeMode == methodIDConfig.optimizeMode && this.enableCollectRuntimeInfo == methodIDConfig.enableCollectRuntimeInfo && Intrinsics.LJFF(this.source, methodIDConfig.source) && Double.compare(this.globalSampleRate, methodIDConfig.globalSampleRate) == 0 && Double.compare(this.extraSampleRate, methodIDConfig.extraSampleRate) == 0 && this.enableExtraSampleFetcher == methodIDConfig.enableExtraSampleFetcher && this.enableDynamicSampleRate == methodIDConfig.enableDynamicSampleRate && Double.compare(this.downgradeRate, methodIDConfig.downgradeRate) == 0 && Double.compare(this.minDynamicSampleRate, methodIDConfig.minDynamicSampleRate) == 0 && this.dynamicSampleTimeWindow == methodIDConfig.dynamicSampleTimeWindow && this.enableCollectConfigInfo == methodIDConfig.enableCollectConfigInfo;
    }

    public MethodIDConfig() {
        this(false, 0, false, "", 0.0d, 0.0d, false, false, 0.0d, 0.0d, 5L, false);
    }

    public MethodIDConfig(boolean z, int i, boolean z2, String str, double d, double d2, boolean z3, boolean z4, double d3, double d4, long j, boolean z5) {
        this.enable = z;
        this.optimizeMode = i;
        this.enableCollectRuntimeInfo = z2;
        this.source = str;
        this.globalSampleRate = d;
        this.extraSampleRate = d2;
        this.enableExtraSampleFetcher = z3;
        this.enableDynamicSampleRate = z4;
        this.downgradeRate = d3;
        this.minDynamicSampleRate = d4;
        this.dynamicSampleTimeWindow = j;
        this.enableCollectConfigInfo = z5;
    }
}
