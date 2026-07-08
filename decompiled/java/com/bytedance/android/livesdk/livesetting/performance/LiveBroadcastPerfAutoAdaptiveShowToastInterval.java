package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_auto_adaptive_toast_interval")
public final class LiveBroadcastPerfAutoAdaptiveShowToastInterval {
    public static final LiveBroadcastPerfAutoAdaptiveShowToastInterval INSTANCE = new LiveBroadcastPerfAutoAdaptiveShowToastInterval();
    public static final long DEFAULT = 1000;
    public static final long value = SettingsManager.INSTANCE.getLongValue("live_broadcast_auto_adaptive_toast_interval", 1000);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final long getValue() {
        return value;
    }
}
