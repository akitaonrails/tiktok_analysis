package com.bytedance.android.starship.engine.graph.config;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class GraphTraceConfig {

    @C09CT("tracer_sampling")
    public final SamplingConfig tracerSampling;

    public GraphTraceConfig() {
        this(null);
    }

    public GraphTraceConfig(SamplingConfig samplingConfig) {
        this.tracerSampling = samplingConfig;
    }
}
