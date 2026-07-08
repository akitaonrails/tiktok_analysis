package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_multi_device_interruption_optimize")
public final class GameMultiDeviceInterruptionOptimize {
    public static final int DEFAULT = 1;
    public static final GameMultiDeviceInterruptionOptimize INSTANCE = new GameMultiDeviceInterruptionOptimize();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_multi_device_interruption_optimize", DEFAULT);
    }

    public final boolean isDefault() {
        return getValue() == 1;
    }
}
