package com.bytedance.android.livesdk.livesetting.broadcast.dynamic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_start_live_dynamic_strategy_settings")
public final class GameStartLiveDynamicStrategySetting {
    public static final String DEFAULT = "";
    public static final GameStartLiveDynamicStrategySetting INSTANCE = new GameStartLiveDynamicStrategySetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("ttlive_game_start_live_dynamic_strategy_settings", DEFAULT);
    }
}
