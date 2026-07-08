package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_level_render_effect_config")
public final class LiveLevelRenderEffectConfigSetting {
    public static final LiveLevelRenderEffectConfigSetting INSTANCE = new LiveLevelRenderEffectConfigSetting();
    public static final LevelRenderEffectConfig DEFAULT = new LevelRenderEffectConfig(3, 2, new ArrayList());

    public final LevelRenderEffectConfig getLevelSystemResConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LevelRenderEffectConfig levelRenderEffectConfig = DEFAULT;
        LevelRenderEffectConfig levelRenderEffectConfig2 = (LevelRenderEffectConfig) settingsManager.getValueSafely("live_level_render_effect_config", levelRenderEffectConfig);
        return levelRenderEffectConfig2 != null ? levelRenderEffectConfig2 : levelRenderEffectConfig;
    }
}
