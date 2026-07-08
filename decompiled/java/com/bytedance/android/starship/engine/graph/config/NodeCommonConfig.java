package com.bytedance.android.starship.engine.graph.config;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class NodeCommonConfig {

    @C09CT("trace_config")
    public final NodeTraceConfig traceConfig;

    public NodeCommonConfig() {
        this(null);
    }

    public NodeCommonConfig(NodeTraceConfig nodeTraceConfig) {
        this.traceConfig = nodeTraceConfig;
    }
}
