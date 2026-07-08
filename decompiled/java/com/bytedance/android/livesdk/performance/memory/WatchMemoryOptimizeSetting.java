package com.bytedance.android.livesdk.performance.memory;

import X.C13LP;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("memory_size_opt_setting")
public final class WatchMemoryOptimizeSetting {
    public static final WatchMemoryOptimizeSetting INSTANCE = new WatchMemoryOptimizeSetting();
    public static final MemoryCleanConfig DEFAULT = new MemoryCleanConfig(false, null, 0, false, false, 31, null);

    public static final boolean doExitClear() {
        return INSTANCE.getConfig().getDoExitClear();
    }

    private final MemoryCleanConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MemoryCleanConfig memoryCleanConfig = DEFAULT;
        MemoryCleanConfig memoryCleanConfig2 = (MemoryCleanConfig) settingsManager.getValueSafely("memory_size_opt_setting", memoryCleanConfig);
        return memoryCleanConfig2 != null ? memoryCleanConfig2 : memoryCleanConfig;
    }

    public static final long getPollInterval() {
        return INSTANCE.getConfig().getInterval();
    }

    public static final boolean isEnable() {
        return INSTANCE.getConfig().isEnabled();
    }

    public static final boolean needToYield() {
        return INSTANCE.getConfig().isNeedYield();
    }

    public static final Integer getConfigThreshold(long j) {
        Map<String, Integer> thresholds = INSTANCE.getConfig().getThresholds();
        if (thresholds != null) {
            for (String str : C13LP.LJLLJ(thresholds.keySet())) {
                if (CastFloatProtector.parseFloat(str) * 1073741824 >= j) {
                    return thresholds.get(str);
                }
            }
        }
        return 1800;
    }
}
