package com.bytedance.android.starship.engine.graph.config;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public final class GraphConfig {

    @C09CT("config")
    public final GraphCommonConfig config;

    @C09CT("edges")
    public final List<EdgeConfig> edges;

    @C09CT("nodes")
    public final List<String> nodes;

    public GraphConfig() {
        this(null, null, null, 7, null);
    }

    public GraphConfig(GraphCommonConfig graphCommonConfig, List<String> list, List<EdgeConfig> list2) {
        this.config = graphCommonConfig;
        this.nodes = list;
        this.edges = list2;
    }

    public GraphConfig(GraphCommonConfig graphCommonConfig, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new GraphCommonConfig(null, null, 0, null, false) : graphCommonConfig, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
