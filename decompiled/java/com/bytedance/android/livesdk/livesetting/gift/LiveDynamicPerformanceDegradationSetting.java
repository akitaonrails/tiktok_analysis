package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_dynamic_performance_degradation")
public final class LiveDynamicPerformanceDegradationSetting {
    public static final int DEFAULT = 0;
    public static final LiveDynamicPerformanceDegradationSetting INSTANCE = new LiveDynamicPerformanceDegradationSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_dynamic_performance_degradation", DEFAULT);
    }
}
