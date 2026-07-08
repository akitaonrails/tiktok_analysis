package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_guest_count_for_enter_room_opt")
public final class LiveSdkGuestCountForEnterRoomOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkGuestCountForEnterRoomOptSetting INSTANCE = new LiveSdkGuestCountForEnterRoomOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_guest_count_for_enter_room_opt", DEFAULT);
    }
}
