package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class StackConfig {

    @C09CT("cache_config")
    public final CacheConfig cacheConfig;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("frequency_config")
    public final FrequencyConfig frequencyConfig;

    @C09CT("scene_configs")
    public final List<SceneConfig> sceneConfigs;

    public StackConfig() {
        this(false, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackConfig)) {
            return false;
        }
        StackConfig stackConfig = (StackConfig) obj;
        return this.enabled == stackConfig.enabled && Intrinsics.LJFF(this.sceneConfigs, stackConfig.sceneConfigs) && Intrinsics.LJFF(this.frequencyConfig, stackConfig.frequencyConfig) && Intrinsics.LJFF(this.cacheConfig, stackConfig.cacheConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((r0 * 31) + this.sceneConfigs.hashCode()) * 31) + this.frequencyConfig.hashCode()) * 31) + this.cacheConfig.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StackConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", sceneConfigs=");
        sbLIZ.append(this.sceneConfigs);
        sbLIZ.append(", frequencyConfig=");
        sbLIZ.append(this.frequencyConfig);
        sbLIZ.append(", cacheConfig=");
        sbLIZ.append(this.cacheConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StackConfig(boolean z, List<SceneConfig> list, FrequencyConfig frequencyConfig, CacheConfig cacheConfig) {
        this.enabled = z;
        this.sceneConfigs = list;
        this.frequencyConfig = frequencyConfig;
        this.cacheConfig = cacheConfig;
    }

    public StackConfig(boolean z, List list, FrequencyConfig frequencyConfig, CacheConfig cacheConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? new FrequencyConfig(20, TimeUnit.MINUTES.toMillis(1L), 50, "network_stack_frequency") : frequencyConfig, (i & 8) != 0 ? new CacheConfig(500, 30000L) : cacheConfig);
    }
}
