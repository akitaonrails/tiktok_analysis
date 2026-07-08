package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_audience_count_down_vibration_type")
public final class LiveMatchAudienceCountDownVibrationTypeSetting {
    public static final int DEFAULT = 1;
    public static final LiveMatchAudienceCountDownVibrationTypeSetting INSTANCE = new LiveMatchAudienceCountDownVibrationTypeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_match_audience_count_down_vibration_type", DEFAULT);
    }
}
