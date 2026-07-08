package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_dual_device_pad_mode_enable")
public final class GameDualDevicePadModeSetting {
    public static final int NOT_ENABLE = 0;
    public static final GameDualDevicePadModeSetting INSTANCE = new GameDualDevicePadModeSetting();
    public static final int DEFAULT = 1;
    public static final int ENABLE = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_dual_device_pad_mode_enable", DEFAULT);
    }

    public final boolean isEnabled() {
        return getValue() == ENABLE;
    }
}
