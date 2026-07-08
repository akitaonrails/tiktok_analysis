package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_dual_device_adaptive_enable")
public final class GameDualDeviceAdaptiveSetting {
    public static final int DEFAULT = 0;
    public static final GameDualDeviceAdaptiveSetting INSTANCE = new GameDualDeviceAdaptiveSetting();
    public static final int ENABLE = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_dual_device_adaptive_enable", DEFAULT);
    }

    public final boolean isExperimentGroup() {
        return getValue() == ENABLE;
    }
}
