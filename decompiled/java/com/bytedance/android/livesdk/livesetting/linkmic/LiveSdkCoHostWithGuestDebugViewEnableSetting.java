package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_cohost_with_guest_debug_view_enable")
public final class LiveSdkCoHostWithGuestDebugViewEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkCoHostWithGuestDebugViewEnableSetting INSTANCE = new LiveSdkCoHostWithGuestDebugViewEnableSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_cohost_with_guest_debug_view_enable", DEFAULT);
    }
}
