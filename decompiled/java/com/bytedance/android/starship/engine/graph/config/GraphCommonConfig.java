package com.bytedance.android.starship.engine.graph.config;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class GraphCommonConfig {

    @C09CT("end_node")
    public final String endNode;

    @C09CT("reload_type")
    public final int reloadType;

    @C09CT("start_node")
    public final String startNode;

    @C09CT("topological_ordered")
    public final boolean topologicalOrdered;

    @C09CT("trace_config")
    public final GraphTraceConfig traceConfig;

    public GraphCommonConfig() {
        this(null, null, 0, null, false);
    }

    public GraphCommonConfig(String str, String str2, int i, GraphTraceConfig graphTraceConfig, boolean z) {
        this.startNode = str;
        this.endNode = str2;
        this.reloadType = i;
        this.traceConfig = graphTraceConfig;
        this.topologicalOrdered = z;
    }
}
