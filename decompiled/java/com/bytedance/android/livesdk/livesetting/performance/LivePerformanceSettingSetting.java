package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.PerformanceSetting;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_performance_setting")
public final class LivePerformanceSettingSetting {
    public static final PerformanceSetting DEFAULT;
    public static final LivePerformanceSettingSetting INSTANCE = new LivePerformanceSettingSetting();

    static {
        PerformanceSetting performanceSetting = new PerformanceSetting();
        performanceSetting.enable = true;
        DEFAULT = performanceSetting;
    }

    public final PerformanceSetting getValue() {
        PerformanceSetting performanceSetting = (PerformanceSetting) SettingsManager.INSTANCE.getValueSafely(LivePerformanceSettingSetting.class);
        return performanceSetting == null ? DEFAULT : performanceSetting;
    }

    public final PerformanceSetting getDEFAULT() {
        return DEFAULT;
    }
}
