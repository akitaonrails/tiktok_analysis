package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_sdk_multiguest_select_fixed_mic_count")
public final class LiveSdkMultiGuestSelectFixedMicCountSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkMultiGuestSelectFixedMicCountSetting INSTANCE = new LiveSdkMultiGuestSelectFixedMicCountSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multiguest_select_fixed_mic_count", DEFAULT);
    }

    public final boolean enable() {
        return getValue() && LiveSdkMultiguestExpandGuestCountVersionV2Setting.INSTANCE.getValue() >= 4;
    }
}
