package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_storage_monitor_frequency_time")
public final class LiveBroadcastStorageMonitorFrequencyDayTime {
    public static final LiveBroadcastStorageMonitorFrequencyDayTime INSTANCE = new LiveBroadcastStorageMonitorFrequencyDayTime();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_broadcast_storage_monitor_frequency_time", DEFAULT);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final int getValue() {
        return value;
    }
}
