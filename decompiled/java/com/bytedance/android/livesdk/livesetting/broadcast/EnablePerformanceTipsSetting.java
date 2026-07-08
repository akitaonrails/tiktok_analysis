package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "enable_performance_tips")
public final class EnablePerformanceTipsSetting {
    public static final int DEFAULT = 0;
    public static final EnablePerformanceTipsSetting INSTANCE = new EnablePerformanceTipsSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enable_performance_tips", DEFAULT);
    }

    public final boolean isEnableHighTemperatureTips() {
        return ((getValue() >> 3) & 1) == 1;
    }

    public final boolean isEnableLowBattery() {
        return ((getValue() >> 1) & 1) == 1;
    }

    public final boolean isEnableLowDevices() {
        return ((getValue() >> 0) & 1) == 1;
    }

    public final boolean isEnableSaveMode() {
        return ((getValue() >> 2) & 1) == 1;
    }
}
