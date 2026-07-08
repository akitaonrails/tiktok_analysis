package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_level_system_resource")
public final class LiveLevelSystemResourceSetting {
    public static final LiveLevelSystemResourceSetting INSTANCE = new LiveLevelSystemResourceSetting();
    public static final LevelSystemResourceConfig DEFAULT = new LevelSystemResourceConfig(0, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), null);

    public final LevelSystemResourceConfig getLevelSystemResConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LevelSystemResourceConfig levelSystemResourceConfig = DEFAULT;
        LevelSystemResourceConfig levelSystemResourceConfig2 = (LevelSystemResourceConfig) settingsManager.getValueSafely("live_level_system_resource", levelSystemResourceConfig);
        return levelSystemResourceConfig2 != null ? levelSystemResourceConfig2 : levelSystemResourceConfig;
    }
}
