package com.bytedance.helios.api.config;

import X.C09CT;
import X.C13BV;
import com.bytedance.pumbaa.base.settings.FrequencyConfig;
import com.bytedance.pumbaa.base.settings.GuardRange;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
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

    public StackConfig(boolean z, List<SceneConfig> list, FrequencyConfig frequencyConfig, CacheConfig cacheConfig) {
        this.enabled = z;
        this.sceneConfigs = list;
        this.frequencyConfig = frequencyConfig;
        this.cacheConfig = cacheConfig;
    }

    public StackConfig(boolean z, List list, FrequencyConfig frequencyConfig, CacheConfig cacheConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? new FrequencyConfig(20, TimeUnit.MINUTES.toMillis(1L), 50, "network_stack_frequency", new GuardRange(null, null, null, 7, null)) : frequencyConfig, (i & 8) != 0 ? new CacheConfig(500, 30000L) : cacheConfig);
    }
}
