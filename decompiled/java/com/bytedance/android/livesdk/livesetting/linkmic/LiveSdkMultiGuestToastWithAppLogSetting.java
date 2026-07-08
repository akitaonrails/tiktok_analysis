package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_toast_with_applog")
public final class LiveSdkMultiGuestToastWithAppLogSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiGuestToastWithAppLogSetting INSTANCE = new LiveSdkMultiGuestToastWithAppLogSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_toast_with_applog", DEFAULT);
    }
}
