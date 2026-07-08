package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_category_config")
public final class TtliveGameCategoryConfigSetting {
    public static final TtliveGameCategoryConfigSetting INSTANCE = new TtliveGameCategoryConfigSetting();
    public static final GameCategoryConfig DEFAULT = new GameCategoryConfig();

    public final GameCategoryConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameCategoryConfig gameCategoryConfig = DEFAULT;
        GameCategoryConfig gameCategoryConfig2 = (GameCategoryConfig) settingsManager.getValueSafely("ttlive_game_category_config", gameCategoryConfig);
        return gameCategoryConfig2 != null ? gameCategoryConfig2 : gameCategoryConfig;
    }
}
