package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("room_status_controller_v2_memeory_opt")
public final class RoomStatusControllerV2MemoryOptSetting {
    public static final boolean DEFAULT = true;
    public static final RoomStatusControllerV2MemoryOptSetting INSTANCE = new RoomStatusControllerV2MemoryOptSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("room_status_controller_v2_memeory_opt", DEFAULT);
    }
}
