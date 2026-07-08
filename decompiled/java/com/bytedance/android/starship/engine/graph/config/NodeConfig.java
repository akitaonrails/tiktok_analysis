package com.bytedance.android.starship.engine.graph.config;

import X.C09CS;
import X.C09CT;
import X.EnumC1307400k7u;

/* JADX INFO: loaded from: classes21.dex */
public final class NodeConfig {

    @C09CT("action_node_config")
    public final ActionNodeConfig actionNodeConfig;

    @C09CT("cloud_decision_config")
    public final CloudDecisionNodeConfig cloudDecisionConfig;

    @C09CT("config")
    public final NodeCommonConfig commonConfig;

    @C09CT("custom_node_config")
    public final CustomNodeConfig customNodeConfig;

    @C09CT("event_config")
    public final EventNodeConfig eventConfig;

    @C09CT("expression_config")
    public final ExpressionNodeConfig expressionConfig;

    @C09CT("fast_engine_config")
    public final FastEngineConfig fastEngineConfig;

    @C09CT("name")
    public final String name;

    @C09CT("noop_config")
    public final NoopNodeConfig noopConfig;

    @C09CT("package_exec_config")
    public final PackageExecutionConfig packageExecutionConfig;

    @C09CT("strategy_name")
    public final String strategyName;

    @C09CT("ttm_config")
    public final TTMNodeConfig ttmConfig;

    @C09CT("type")
    @C09CS(NodeTypeAdapter.class)
    public final EnumC1307400k7u type;

    public NodeConfig(String str, EnumC1307400k7u enumC1307400k7u, String str2, NodeCommonConfig nodeCommonConfig, NoopNodeConfig noopNodeConfig, ExpressionNodeConfig expressionNodeConfig, CloudDecisionNodeConfig cloudDecisionNodeConfig, EventNodeConfig eventNodeConfig, TTMNodeConfig tTMNodeConfig, PackageExecutionConfig packageExecutionConfig, CustomNodeConfig customNodeConfig, ActionNodeConfig actionNodeConfig, FastEngineConfig fastEngineConfig) {
        this.name = str;
        this.type = enumC1307400k7u;
        this.strategyName = str2;
        this.commonConfig = nodeCommonConfig;
        this.noopConfig = noopNodeConfig;
        this.expressionConfig = expressionNodeConfig;
        this.cloudDecisionConfig = cloudDecisionNodeConfig;
        this.eventConfig = eventNodeConfig;
        this.ttmConfig = tTMNodeConfig;
        this.packageExecutionConfig = packageExecutionConfig;
        this.customNodeConfig = customNodeConfig;
        this.actionNodeConfig = actionNodeConfig;
        this.fastEngineConfig = fastEngineConfig;
    }
}
