package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_anchor_connection_over_leave_room_cache_data_setting")
public final class LiveSdkAnchorConnectionOverLeaveRoomCacheDataSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkAnchorConnectionOverLeaveRoomCacheDataSetting INSTANCE = new LiveSdkAnchorConnectionOverLeaveRoomCacheDataSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_anchor_connection_over_leave_room_cache_data_setting", DEFAULT);
    }
}
