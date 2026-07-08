package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_measure_opt")
public final class LiveMeasureOpt {
    public static final LiveMeasureOpt INSTANCE = new LiveMeasureOpt();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_measure_opt", DEFAULT);
    }
}
