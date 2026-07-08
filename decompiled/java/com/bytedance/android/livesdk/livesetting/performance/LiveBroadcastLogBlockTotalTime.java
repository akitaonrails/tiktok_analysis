package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_broadcast_log_block_total_time")
public final class LiveBroadcastLogBlockTotalTime {
    public static final long DEFAULT = 10000;
    public static final LiveBroadcastLogBlockTotalTime INSTANCE = new LiveBroadcastLogBlockTotalTime();

    public static final long value() {
        return SettingsManager.INSTANCE.getLongValue("live_broadcast_log_block_total_time", DEFAULT);
    }
}
