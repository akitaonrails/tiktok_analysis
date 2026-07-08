package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes35.dex */
public final class PerformanceSample {
    public static final TypeAdapter ADAPTER = new PerformanceSample_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_performance_audience_cpu_sample_rate")
    public int audienceCpuSampleRate = 10;

    @C09CT("live_performance_audience_gpu_sample_rate")
    public int audienceGpuSampleRate = 10;

    @C09CT("live_performance_audience_mem_sample_rate")
    public int audienceMemSampleRate = 10;

    @C09CT("live_performance_host_cpu_sample_rate")
    public int hostCpuSampleRate = 10;

    @C09CT("live_performance_host_mem_sample_rate")
    public int hostMemSampleRate = 10;

    @C09CT("live_performance_auidence_opt_experiment")
    public boolean isAudienceExperiment;

    @C09CT("live_performance_host_opt_experiment")
    public boolean isHostExperiment;
}
