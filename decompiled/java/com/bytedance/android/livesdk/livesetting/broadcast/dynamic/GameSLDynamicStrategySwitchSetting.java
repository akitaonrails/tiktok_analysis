package com.bytedance.android.livesdk.livesetting.broadcast.dynamic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_sl_dynamic_strategy_switch_settings")
public final class GameSLDynamicStrategySwitchSetting {
    public static final boolean DEFAULT = true;
    public static final GameSLDynamicStrategySwitchSetting INSTANCE = new GameSLDynamicStrategySwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_sl_dynamic_strategy_switch_settings", DEFAULT);
    }
}
