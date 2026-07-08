package com.ss.android.ugc.aweme.setting.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes25.dex */
public final class TabCleanConfig {

    @C09CT("advanced")
    public final AdvancedConfig advanced;

    @C09CT("cleanup")
    public final CleanupConfig cleanup;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_assem")
    public final boolean enableAssem;

    @C09CT("target")
    public final TargetConfig target;

    @C09CT("trigger")
    public final TriggerConfig trigger;

    public TabCleanConfig() {
        this(false, false, new TargetConfig(null, null, 0, 7, null), new TriggerConfig(new MemoryTriggerConfig(false, 1, 20000L, 4000L, 0.55f, 0.9f, 3, 0, 0.2d, 0.5d, Mp4ScreenVideoLoadTimeout.CONTROL), new IdleTriggerConfig(false, 60000L, 2, true)), new CleanupConfig(false, false), new AdvancedConfig(false, false, false, 30000L, 10000L));
    }

    public TabCleanConfig(boolean z, boolean z2, TargetConfig targetConfig, TriggerConfig triggerConfig, CleanupConfig cleanupConfig, AdvancedConfig advancedConfig) {
        this.enable = z;
        this.enableAssem = z2;
        this.target = targetConfig;
        this.trigger = triggerConfig;
        this.cleanup = cleanupConfig;
        this.advanced = advancedConfig;
    }
}
