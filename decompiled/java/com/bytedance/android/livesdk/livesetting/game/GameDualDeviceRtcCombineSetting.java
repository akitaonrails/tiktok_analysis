package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("Loggame_dual_device_rtc_combine_enable")
public final class GameDualDeviceRtcCombineSetting {
    public static final int DEFAULT = 0;
    public static final GameDualDeviceRtcCombineSetting INSTANCE = new GameDualDeviceRtcCombineSetting();
    public static final int ENABLE = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("Loggame_dual_device_rtc_combine_enable", DEFAULT);
    }

    public final boolean isDefault() {
        return getValue() == DEFAULT;
    }
}
