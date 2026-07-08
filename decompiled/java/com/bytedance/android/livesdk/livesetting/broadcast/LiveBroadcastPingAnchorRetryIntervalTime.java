package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_background_ping_anchor_retry_interval_time")
public final class LiveBroadcastPingAnchorRetryIntervalTime {
    public static final LiveBroadcastPingAnchorRetryIntervalTime INSTANCE = new LiveBroadcastPingAnchorRetryIntervalTime();
    public static final int DEFAULT = 500;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_background_ping_anchor_retry_interval_time", 500);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final int getValue() {
        return value;
    }
}
