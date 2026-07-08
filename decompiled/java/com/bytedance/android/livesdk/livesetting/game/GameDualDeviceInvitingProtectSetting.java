package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("dual_device_enable_connection_optimize_optimize_protect_setting")
public final class GameDualDeviceInvitingProtectSetting {
    public static final int DEFAULT = 0;
    public static final GameDualDeviceInvitingProtectSetting INSTANCE = new GameDualDeviceInvitingProtectSetting();
    public static final int ENABLE = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("dual_device_enable_connection_optimize_optimize_protect_setting", DEFAULT);
    }

    public final boolean isDefault() {
        return getValue() == DEFAULT;
    }
}
