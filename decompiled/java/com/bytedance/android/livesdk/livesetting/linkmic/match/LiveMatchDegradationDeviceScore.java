package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_degradation_device_score")
public final class LiveMatchDegradationDeviceScore {
    public static final float DEFAULT = 8.0f;
    public static final LiveMatchDegradationDeviceScore INSTANCE = new LiveMatchDegradationDeviceScore();

    public final float getHighEndDeviceLowestScore() {
        return SettingsManager.INSTANCE.getFloatValue("live_match_degradation_device_score", DEFAULT);
    }
}
