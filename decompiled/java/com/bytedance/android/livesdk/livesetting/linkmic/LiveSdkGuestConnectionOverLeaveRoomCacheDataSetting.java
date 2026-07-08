package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_guest_connection_over_leave_room_cache_data_setting")
public final class LiveSdkGuestConnectionOverLeaveRoomCacheDataSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkGuestConnectionOverLeaveRoomCacheDataSetting INSTANCE = new LiveSdkGuestConnectionOverLeaveRoomCacheDataSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_guest_connection_over_leave_room_cache_data_setting", DEFAULT);
    }
}
