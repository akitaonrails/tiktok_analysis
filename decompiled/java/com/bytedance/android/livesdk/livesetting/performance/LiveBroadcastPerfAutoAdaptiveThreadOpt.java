package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_auto_adaptive_thread_opt")
public final class LiveBroadcastPerfAutoAdaptiveThreadOpt {
    public static final LiveBroadcastPerfAutoAdaptiveThreadOpt INSTANCE = new LiveBroadcastPerfAutoAdaptiveThreadOpt();
    public static final boolean DEFAULT = true;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_broadcast_auto_adaptive_thread_opt", true);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return enable;
    }
}
