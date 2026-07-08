package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "game_live_partnership_mix_layout_use_spark_lite")
public final class GameLivePartnershipMixLayoutUseSparkLiteOpt {
    public static final GameLivePartnershipMixLayoutUseSparkLiteOpt INSTANCE = new GameLivePartnershipMixLayoutUseSparkLiteOpt();
    public static final MixLayoutUseSparkLiteOptConfig DEFAULT = new MixLayoutUseSparkLiteOptConfig();

    public final MixLayoutUseSparkLiteOptConfig config() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MixLayoutUseSparkLiteOptConfig mixLayoutUseSparkLiteOptConfig = DEFAULT;
        MixLayoutUseSparkLiteOptConfig mixLayoutUseSparkLiteOptConfig2 = (MixLayoutUseSparkLiteOptConfig) settingsManager.getValueSafely("game_live_partnership_mix_layout_use_spark_lite", mixLayoutUseSparkLiteOptConfig);
        return mixLayoutUseSparkLiteOptConfig2 != null ? mixLayoutUseSparkLiteOptConfig2 : mixLayoutUseSparkLiteOptConfig;
    }
}
