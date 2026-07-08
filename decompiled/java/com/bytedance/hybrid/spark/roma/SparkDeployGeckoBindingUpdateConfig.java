package com.bytedance.hybrid.spark.roma;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class SparkDeployGeckoBindingUpdateConfig {
    public static final SparkDeployGeckoBindingUpdateConfig LIZ = new SparkDeployGeckoBindingUpdateConfig(false, C2097608Jq.LJ());

    @C09CT("bindings")
    public final Map<String, String> bindings;

    @C09CT("enable")
    public final boolean enable;

    public SparkDeployGeckoBindingUpdateConfig() {
        this(false, C2097608Jq.LJ());
    }

    public SparkDeployGeckoBindingUpdateConfig(boolean z, Map<String, String> map) {
        this.enable = z;
        this.bindings = map;
    }
}
