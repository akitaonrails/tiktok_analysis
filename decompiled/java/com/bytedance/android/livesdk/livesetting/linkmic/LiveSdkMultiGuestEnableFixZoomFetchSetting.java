package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_fix_zoom_fetch")
public final class LiveSdkMultiGuestEnableFixZoomFetchSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiGuestEnableFixZoomFetchSetting INSTANCE = new LiveSdkMultiGuestEnableFixZoomFetchSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_fix_zoom_fetch", DEFAULT);
    }
}
