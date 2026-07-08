package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_mix_mode_reserve_fallback_enable_opt")
public final class LiveSdkMixModeReserveFallbackEnableOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMixModeReserveFallbackEnableOptSetting INSTANCE = new LiveSdkMixModeReserveFallbackEnableOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_mix_mode_reserve_fallback_enable_opt", DEFAULT);
    }
}
