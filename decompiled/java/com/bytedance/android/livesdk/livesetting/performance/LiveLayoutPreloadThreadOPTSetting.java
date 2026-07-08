package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_layout_preload_thread_opt")
public final class LiveLayoutPreloadThreadOPTSetting {
    public static final boolean DEFAULT = false;
    public static final LiveLayoutPreloadThreadOPTSetting INSTANCE = new LiveLayoutPreloadThreadOPTSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_layout_preload_thread_opt", DEFAULT);
    }

    public static final boolean threadOptimize(boolean z) {
        if (INSTANCE.getValue() && z) {
            return true;
        }
        return false;
    }
}
