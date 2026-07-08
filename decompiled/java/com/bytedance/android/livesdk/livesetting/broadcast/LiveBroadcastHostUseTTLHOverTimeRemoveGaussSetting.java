package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_host_use_ttlh_over_time_remove_gauss")
public final class LiveBroadcastHostUseTTLHOverTimeRemoveGaussSetting {
    public static final int DEFAULT = 2;
    public static final LiveBroadcastHostUseTTLHOverTimeRemoveGaussSetting INSTANCE = new LiveBroadcastHostUseTTLHOverTimeRemoveGaussSetting();

    public final int getTime() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_host_use_ttlh_over_time_remove_gauss", DEFAULT);
    }
}
