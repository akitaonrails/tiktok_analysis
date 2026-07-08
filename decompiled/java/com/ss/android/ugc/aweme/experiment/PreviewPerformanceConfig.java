package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class PreviewPerformanceConfig {

    @C09CT("enable_play_fluency")
    public boolean enablePlayFluency;

    @C09CT("enable_select_performance")
    public boolean enableSelectPerformance;

    @C09CT("enable_slide_fluency")
    public boolean enableSlideFluency;

    @C09CT("enable_stay_performance")
    public boolean enableStayPerformance;

    @C09CT("fluency_sampling_rate")
    public float fluencySamplingRate;

    @C09CT("performance_sampling_rate")
    public float performanceSamplingRate;

    @C09CT("enable_gpu_use_old")
    public boolean enableGpuUsageOld = true;

    @C09CT("avoid_cold_boot")
    public boolean avoidColdBoot = true;
}
