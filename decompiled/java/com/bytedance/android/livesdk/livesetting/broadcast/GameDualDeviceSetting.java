package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_live_dual_device")
public final class GameDualDeviceSetting {
    public static final int DEFAULT = 0;
    public static final int GROUP_EXPERIMENT = 1;
    public static final GameDualDeviceSetting INSTANCE = new GameDualDeviceSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_live_dual_device", DEFAULT);
    }

    public final boolean isExperimentGroup() {
        return getValue() == 1;
    }
}
