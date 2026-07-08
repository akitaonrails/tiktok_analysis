package com.bytedance.android.livesdk.performance.memory;

import X.C13LP;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("anchor_memory_size_opt_setting")
public final class AnchorMemoryOptimizeSetting {
    public static final AnchorMemoryOptimizeSetting INSTANCE = new AnchorMemoryOptimizeSetting();
    public static final AnchorMemoryCleanConfig DEFAULT = new AnchorMemoryCleanConfig(false, null, 0, 7, null);

    private final AnchorMemoryCleanConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        AnchorMemoryCleanConfig anchorMemoryCleanConfig = DEFAULT;
        AnchorMemoryCleanConfig anchorMemoryCleanConfig2 = (AnchorMemoryCleanConfig) settingsManager.getValueSafely("anchor_memory_size_opt_setting", anchorMemoryCleanConfig);
        return anchorMemoryCleanConfig2 != null ? anchorMemoryCleanConfig2 : anchorMemoryCleanConfig;
    }

    public static final long getPollInterval() {
        return INSTANCE.getConfig().getInterval();
    }

    public static final boolean isEnable() {
        return INSTANCE.getConfig().isEnabled();
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
