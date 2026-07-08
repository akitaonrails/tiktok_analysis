package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "pre_finish_pop_optimization")
public final class PreFinishPopOptimizationSetting {
    public static final boolean DEFAULT = false;
    public static final PreFinishPopOptimizationSetting INSTANCE = new PreFinishPopOptimizationSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("pre_finish_pop_optimization", DEFAULT);
    }
}
