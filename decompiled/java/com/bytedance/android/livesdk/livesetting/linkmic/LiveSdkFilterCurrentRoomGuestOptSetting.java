package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_filter_current_room_guest_opt")
public final class LiveSdkFilterCurrentRoomGuestOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkFilterCurrentRoomGuestOptSetting INSTANCE = new LiveSdkFilterCurrentRoomGuestOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_filter_current_room_guest_opt", DEFAULT);
    }
}
