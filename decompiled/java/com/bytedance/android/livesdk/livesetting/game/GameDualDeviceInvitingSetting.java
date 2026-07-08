package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("dual_device_enable_connection_optimize_libra")
public final class GameDualDeviceInvitingSetting {
    public static final int DEFAULT = 0;
    public static final GameDualDeviceInvitingSetting INSTANCE = new GameDualDeviceInvitingSetting();
    public static final int ENABLE = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("dual_device_enable_connection_optimize_libra", DEFAULT);
    }

    public final boolean isExperiment() {
        return getValue() == ENABLE;
    }
}
