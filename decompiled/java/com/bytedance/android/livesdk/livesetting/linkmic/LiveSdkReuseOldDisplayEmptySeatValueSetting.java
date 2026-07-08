package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_reuse_old_display_empty_seat_value")
public final class LiveSdkReuseOldDisplayEmptySeatValueSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkReuseOldDisplayEmptySeatValueSetting INSTANCE = new LiveSdkReuseOldDisplayEmptySeatValueSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_reuse_old_display_empty_seat_value", DEFAULT);
    }
}
