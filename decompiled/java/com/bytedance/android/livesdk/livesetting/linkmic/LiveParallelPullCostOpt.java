package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey("live_parallel_pull_cost_opt")
public final class LiveParallelPullCostOpt {
    public static final LiveParallelPullCostOpt INSTANCE = new LiveParallelPullCostOpt();
    public static final ParallelCostConfig DEFAULT = new ParallelCostConfig(0, -1, null, null, null, null, null, null);

    private final ParallelCostConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ParallelCostConfig parallelCostConfig = DEFAULT;
        ParallelCostConfig parallelCostConfig2 = (ParallelCostConfig) settingsManager.getValueSafely("live_parallel_pull_cost_opt", parallelCostConfig);
        return parallelCostConfig2 != null ? parallelCostConfig2 : parallelCostConfig;
    }

    public final boolean enable() {
        return getValue().getEnable() == 1;
    }

    public final PullSceneConfig getDefaultConfig() {
        return getValue().getDefault();
    }

    public final int p95StrategyFailOpt() {
        return getValue().getP95StrategyFailOpt();
    }

    public final PullSceneConfig getMultidimensionalConfig(PullSceneConfig pullSceneConfig, String str) {
        Map<String, PullSceneConfig> dimensions = pullSceneConfig.getDimensions();
        if (dimensions != null) {
            return dimensions.get(str);
        }
        return null;
    }

    public final PullSceneConfig getPullSceneConfig(boolean z, int i, String str) {
        ParallelCostConfig value = getValue();
        if (z) {
            if (a0.LJJIIZI(str, "low", false)) {
                return value.getP95Low();
            }
            if (!a0.LJJIIZI(str, "high", false)) {
                return null;
            }
            if (i == 2) {
                return value.getP95HighPossible();
            }
            return value.getP95High();
        }
        if (a0.LJJIIZI(str, "low", false)) {
            return value.getNotP95Low();
        }
        if (!a0.LJJIIZI(str, "high", false)) {
            return null;
        }
        return value.getNotP95High();
    }
}
