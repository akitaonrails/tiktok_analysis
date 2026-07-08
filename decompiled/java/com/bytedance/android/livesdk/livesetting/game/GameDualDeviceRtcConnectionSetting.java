package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("game_dual_device_rtc_connection_setting")
public final class GameDualDeviceRtcConnectionSetting {
    public static final int ENABLE = 0;
    public static final GameDualDeviceRtcConnectionSetting INSTANCE = new GameDualDeviceRtcConnectionSetting();
    public static final int DEFAULT = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_dual_device_rtc_connection_setting", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == DEFAULT;
    }
}
