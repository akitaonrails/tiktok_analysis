package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_perf_auto_adaptive_interval_time")
public final class LiveBroadcastPerfAutoAdaptiveIntervalTime {
    public static final LiveBroadcastPerfAutoAdaptiveIntervalTime INSTANCE = new LiveBroadcastPerfAutoAdaptiveIntervalTime();
    public static final long DEFAULT = 15000;
    public static final long value = SettingsManager.INSTANCE.getLongValue("live_broadcast_perf_auto_adaptive_interval_time", 15000);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final long getValue() {
        return value;
    }
}
