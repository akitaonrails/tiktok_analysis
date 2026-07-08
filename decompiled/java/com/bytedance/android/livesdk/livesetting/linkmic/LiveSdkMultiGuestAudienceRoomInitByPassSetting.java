package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_audience_room_init_bypass")
public final class LiveSdkMultiGuestAudienceRoomInitByPassSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkMultiGuestAudienceRoomInitByPassSetting INSTANCE = new LiveSdkMultiGuestAudienceRoomInitByPassSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_audience_room_init_bypass", DEFAULT);
    }
}
