package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_dual_device_testing_setting")
public final class GameDualDeviceRtcTestingSetting {
    public static final int DEFAULT = 0;
    public static final GameDualDeviceRtcTestingSetting INSTANCE = new GameDualDeviceRtcTestingSetting();
    public static final int ENABLE = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_dual_device_testing_setting", DEFAULT);
    }

    public final boolean isDefault() {
        return getValue() == DEFAULT;
    }
}
