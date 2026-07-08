package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.backroom.BackRoomListSettingConfig;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("back_room_list_setting_config")
public final class BackRoomListSettingConfigSetting {
    public static final BackRoomListSettingConfigSetting INSTANCE = new BackRoomListSettingConfigSetting();
    public static final BackRoomListSettingConfig DEFAULT = new BackRoomListSettingConfig(null, null, null);

    public final BackRoomListSettingConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BackRoomListSettingConfig backRoomListSettingConfig = DEFAULT;
        BackRoomListSettingConfig backRoomListSettingConfig2 = (BackRoomListSettingConfig) settingsManager.getValueSafely("back_room_list_setting_config", backRoomListSettingConfig);
        return backRoomListSettingConfig2 != null ? backRoomListSettingConfig2 : backRoomListSettingConfig;
    }

    public final BackRoomListSettingConfig getDEFAULT() {
        return DEFAULT;
    }
}
