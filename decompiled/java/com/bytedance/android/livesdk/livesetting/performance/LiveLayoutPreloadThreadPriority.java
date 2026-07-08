package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_layout_preload_thread_priority")
public final class LiveLayoutPreloadThreadPriority {
    public static final int DEFAULT = Integer.MIN_VALUE;
    public static final LiveLayoutPreloadThreadPriority INSTANCE = new LiveLayoutPreloadThreadPriority();

    public final int getPriority() {
        return SettingsManager.INSTANCE.getIntValue("live_layout_preload_thread_priority", DEFAULT);
    }
}
