package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_create_room_request_opt_setting_v1")
public final class LiveCreateRoomRequestOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveCreateRoomRequestOptSetting INSTANCE = new LiveCreateRoomRequestOptSetting();
    public static final int V1 = 1;
    public static final int V2 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_create_room_request_opt_setting_v1", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() != 0;
    }
}
