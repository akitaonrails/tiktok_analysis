package com.tiktok.geckox.ng.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class MetaSettings {

    @C09CT("circuit_breaker_failure_times")
    public final int circuitBreakerFailureTimes;

    @C09CT("optimization_enable_request_merge")
    public final boolean enableRequestMerge;
    public final boolean enabled;

    @C09CT("optimization_enable_circuit_breaker")
    public final boolean enabledCircuitBreaker;

    @C09CT("optimize_multi_trigger_check_update")
    public OptimizeMultiTriggerCheckUpdateSettings optimizeMultiTriggerCheckUpdateSettings;

    @C09CT("priority_strategies")
    public final Map<String, PriorityStrategy> priorityStrategies;
    public final int throttle;

    public final void setOptimizeMultiTriggerCheckUpdateSettings(OptimizeMultiTriggerCheckUpdateSettings optimizeMultiTriggerCheckUpdateSettings) {
        this.optimizeMultiTriggerCheckUpdateSettings = optimizeMultiTriggerCheckUpdateSettings;
    }

    public MetaSettings(boolean z, int i, Map<String, PriorityStrategy> map, boolean z2, int i2, boolean z3, OptimizeMultiTriggerCheckUpdateSettings optimizeMultiTriggerCheckUpdateSettings) {
        this.enabled = z;
        this.throttle = i;
        this.priorityStrategies = map;
        this.enabledCircuitBreaker = z2;
        this.circuitBreakerFailureTimes = i2;
        this.enableRequestMerge = z3;
        this.optimizeMultiTriggerCheckUpdateSettings = optimizeMultiTriggerCheckUpdateSettings;
    }
}
