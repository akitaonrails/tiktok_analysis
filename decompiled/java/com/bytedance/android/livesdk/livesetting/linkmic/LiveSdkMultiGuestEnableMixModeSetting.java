package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_enable_mix_mode")
public final class LiveSdkMultiGuestEnableMixModeSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiGuestEnableMixModeSetting INSTANCE = new LiveSdkMultiGuestEnableMixModeSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_enable_mix_mode", DEFAULT);
    }
}
