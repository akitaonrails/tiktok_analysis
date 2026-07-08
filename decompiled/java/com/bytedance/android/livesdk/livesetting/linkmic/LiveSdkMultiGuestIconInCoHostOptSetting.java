package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_icon_in_cohost_opt")
public final class LiveSdkMultiGuestIconInCoHostOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiGuestIconInCoHostOptSetting INSTANCE = new LiveSdkMultiGuestIconInCoHostOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_icon_in_cohost_opt", DEFAULT);
    }
}
