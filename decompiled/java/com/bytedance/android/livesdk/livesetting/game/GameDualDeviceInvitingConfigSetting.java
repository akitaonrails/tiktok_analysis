package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("dual_device_inviting_config_setting")
public final class GameDualDeviceInvitingConfigSetting {
    public static final GameDualDeviceInvitingConfigSetting INSTANCE = new GameDualDeviceInvitingConfigSetting();
    public static final GameDualDeviceInvitingConfig DEFAULT = new GameDualDeviceInvitingConfig(5, 30);

    public final GameDualDeviceInvitingConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameDualDeviceInvitingConfig gameDualDeviceInvitingConfig = DEFAULT;
        GameDualDeviceInvitingConfig gameDualDeviceInvitingConfig2 = (GameDualDeviceInvitingConfig) settingsManager.getValueSafely("dual_device_inviting_config_setting", gameDualDeviceInvitingConfig);
        return gameDualDeviceInvitingConfig2 != null ? gameDualDeviceInvitingConfig2 : gameDualDeviceInvitingConfig;
    }
}
