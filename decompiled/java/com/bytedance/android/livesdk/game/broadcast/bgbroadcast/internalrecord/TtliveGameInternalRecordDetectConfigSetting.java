package com.bytedance.android.livesdk.game.broadcast.bgbroadcast.internalrecord;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlive_game_internal_record_detect_config")
public final class TtliveGameInternalRecordDetectConfigSetting {
    public static final TtliveGameInternalRecordDetectConfigSetting INSTANCE = new TtliveGameInternalRecordDetectConfigSetting();
    public static final GameInternalRecordDetectConfig DEFAULT = new GameInternalRecordDetectConfig(30000, new long[]{60000, 120000, 180000, 240000, 300000}, new String[]{""});
    public static final int $stable = 8;

    public final GameInternalRecordDetectConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameInternalRecordDetectConfig gameInternalRecordDetectConfig = DEFAULT;
        GameInternalRecordDetectConfig gameInternalRecordDetectConfig2 = (GameInternalRecordDetectConfig) settingsManager.getValueSafely("ttlive_game_internal_record_detect_config", gameInternalRecordDetectConfig);
        return gameInternalRecordDetectConfig2 != null ? gameInternalRecordDetectConfig2 : gameInternalRecordDetectConfig;
    }
}
