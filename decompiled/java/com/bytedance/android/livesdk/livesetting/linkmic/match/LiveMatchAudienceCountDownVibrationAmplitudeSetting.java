package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_audience_count_down_vibration_amplitude")
public final class LiveMatchAudienceCountDownVibrationAmplitudeSetting {
    public static final int DEFAULT = 100;
    public static final LiveMatchAudienceCountDownVibrationAmplitudeSetting INSTANCE = new LiveMatchAudienceCountDownVibrationAmplitudeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMatchAudienceCountDownVibrationAmplitudeSetting.class);
    }
}
