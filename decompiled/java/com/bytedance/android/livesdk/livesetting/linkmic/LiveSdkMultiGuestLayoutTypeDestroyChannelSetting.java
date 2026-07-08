package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_layout_type_destroy_channel")
public final class LiveSdkMultiGuestLayoutTypeDestroyChannelSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiGuestLayoutTypeDestroyChannelSetting INSTANCE = new LiveSdkMultiGuestLayoutTypeDestroyChannelSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_layout_type_destroy_channel", DEFAULT);
    }
}
