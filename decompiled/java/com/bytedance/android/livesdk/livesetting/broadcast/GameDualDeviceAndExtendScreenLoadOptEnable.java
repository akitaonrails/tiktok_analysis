package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "game_broadcast_dual_device_extend_widget_load_opt")
public final class GameDualDeviceAndExtendScreenLoadOptEnable {
    public static final int DEFAULT = 0;
    public static final int GROUP_EXPERIMENT_V1 = 1;
    public static final int GROUP_EXPERIMENT_V2 = 2;
    public static final int GROUP_EXPERIMENT_V3 = 3;
    public static final GameDualDeviceAndExtendScreenLoadOptEnable INSTANCE = new GameDualDeviceAndExtendScreenLoadOptEnable();

    public final boolean enableDualDeviceLoadOp() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int i = DEFAULT;
        return settingsManager.getIntValue("game_broadcast_dual_device_extend_widget_load_opt", i) == 1 || settingsManager.getIntValue("game_broadcast_dual_device_extend_widget_load_opt", i) == 3;
    }

    public final boolean enableExtendScreenLoadOp() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int i = DEFAULT;
        return settingsManager.getIntValue("game_broadcast_dual_device_extend_widget_load_opt", i) == 2 || settingsManager.getIntValue("game_broadcast_dual_device_extend_widget_load_opt", i) == 3;
    }
}
