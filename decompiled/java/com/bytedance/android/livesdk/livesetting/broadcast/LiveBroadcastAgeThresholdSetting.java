package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_broadcast_age_threshold")
public final class LiveBroadcastAgeThresholdSetting {
    public static final int DEFAULT = 18;
    public static final LiveBroadcastAgeThresholdSetting INSTANCE = new LiveBroadcastAgeThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_age_threshold", DEFAULT);
    }
}
