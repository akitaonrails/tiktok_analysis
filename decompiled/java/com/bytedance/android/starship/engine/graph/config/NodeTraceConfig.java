package com.bytedance.android.starship.engine.graph.config;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class NodeTraceConfig {

    @C09CT("node_span_detail_sampling")
    public final SamplingConfig nodeSpanDetailSampling;

    public NodeTraceConfig() {
        this(null);
    }

    public NodeTraceConfig(SamplingConfig samplingConfig) {
        this.nodeSpanDetailSampling = samplingConfig;
    }
}
