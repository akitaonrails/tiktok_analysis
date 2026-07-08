package com.bytedance.android.starship.engine.graph.config;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class GlobalTraceConfig {

    @C09CT("initialization_trace_sampling")
    public final SamplingConfig initializationTraceSampling;

    @C09CT("strategy_update_trace_sampling")
    public final SamplingConfig strategyUpdateTraceSampling;

    public GlobalTraceConfig() {
        this(new SamplingConfig(0, 0.01d), new SamplingConfig(0, 0.01d));
    }

    public GlobalTraceConfig(SamplingConfig samplingConfig, SamplingConfig samplingConfig2) {
        this.initializationTraceSampling = samplingConfig;
        this.strategyUpdateTraceSampling = samplingConfig2;
    }
}
