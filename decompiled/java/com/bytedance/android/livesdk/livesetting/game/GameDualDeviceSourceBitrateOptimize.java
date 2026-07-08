package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_dual_device_source_bitrate_optimize")
public final class GameDualDeviceSourceBitrateOptimize {
    public static final GameDualDeviceSourceBitrateOptimize INSTANCE = new GameDualDeviceSourceBitrateOptimize();
    public static final int DEFAULT = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_dual_device_source_bitrate_optimize", DEFAULT);
    }

    public final boolean isDefault() {
        return getValue() == DEFAULT;
    }
}
