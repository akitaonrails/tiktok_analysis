package com.bytedance.android.livesdk.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("perf_fluency_optimize_setting")
public final class PerfFluencyOptimizeSetting {
    public static final PerfFluencyOptimizeSetting INSTANCE = new PerfFluencyOptimizeSetting();
    public static final boolean DEFAULT = false;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("perf_fluency_optimize_setting", DEFAULT);

    public final boolean getEnable() {
        return enable;
    }
}
