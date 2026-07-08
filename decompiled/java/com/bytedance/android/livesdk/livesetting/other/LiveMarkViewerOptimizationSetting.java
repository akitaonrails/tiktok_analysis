package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_mark_viewer_optimization")
public final class LiveMarkViewerOptimizationSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMarkViewerOptimizationSetting INSTANCE = new LiveMarkViewerOptimizationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_mark_viewer_optimization", DEFAULT);
    }
}
