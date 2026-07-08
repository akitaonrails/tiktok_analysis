package com.bytedance.android.starship.strategy.repository;

import X.C09CT;
import com.bytedance.android.starship.engine.graph.config.GraphConfig;
import com.bytedance.android.starship.strategy.DecisionConfig;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class GraphList implements Serializable {

    @C09CT("decision_configs")
    public Map<String, DecisionConfig> decisionConfigs;

    @C09CT("graphs")
    public final Map<String, GraphConfig> graphs;

    public GraphList() {
        this(null, null);
    }

    public final GraphList copy(Map<String, GraphConfig> map, Map<String, DecisionConfig> map2) {
        return new GraphList(map, map2);
    }

    public final void setDecisionConfigs(Map<String, DecisionConfig> map) {
        this.decisionConfigs = map;
    }

    public GraphList(Map<String, GraphConfig> map, Map<String, DecisionConfig> map2) {
        this.graphs = map;
        this.decisionConfigs = map2;
    }
}
