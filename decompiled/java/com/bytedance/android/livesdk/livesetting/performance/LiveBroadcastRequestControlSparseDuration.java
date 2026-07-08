package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_broadcast_request_control_sparse_duration")
public final class LiveBroadcastRequestControlSparseDuration {
    public static final int DEFAULT = 0;
    public static final LiveBroadcastRequestControlSparseDuration INSTANCE = new LiveBroadcastRequestControlSparseDuration();

    private final int getSetting() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_request_control_sparse_duration", DEFAULT);
    }

    public final int getValue() {
        return getSetting();
    }
}
