package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "low_level_device_show_times")
public final class LowLevelDeviceShowTimesSetting {
    public static final int DEFAULT = 0;
    public static final LowLevelDeviceShowTimesSetting INSTANCE = new LowLevelDeviceShowTimesSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("low_level_device_show_times", DEFAULT);
    }
}
