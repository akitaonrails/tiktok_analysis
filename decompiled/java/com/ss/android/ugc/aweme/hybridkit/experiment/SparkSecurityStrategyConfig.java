package com.ss.android.ugc.aweme.hybridkit.experiment;

import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class SparkSecurityStrategyConfig {
    public final Map<String, SparkSecurityStrategy> enableAspects;
    public final boolean enabled;

    public SparkSecurityStrategyConfig() {
        this(false, null);
    }

    public SparkSecurityStrategyConfig(boolean z, Map<String, SparkSecurityStrategy> map) {
        this.enabled = z;
        this.enableAspects = map;
    }
}
