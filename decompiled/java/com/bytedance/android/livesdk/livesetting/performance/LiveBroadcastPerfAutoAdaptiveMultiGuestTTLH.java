package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_perf_auto_adaptive_multiguest_ttlh")
public final class LiveBroadcastPerfAutoAdaptiveMultiGuestTTLH {
    public static final LiveBroadcastPerfAutoAdaptiveMultiGuestTTLH INSTANCE = new LiveBroadcastPerfAutoAdaptiveMultiGuestTTLH();
    public static final boolean DEFAULT = false;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_broadcast_perf_auto_adaptive_multiguest_ttlh", DEFAULT);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return enable;
    }
}
