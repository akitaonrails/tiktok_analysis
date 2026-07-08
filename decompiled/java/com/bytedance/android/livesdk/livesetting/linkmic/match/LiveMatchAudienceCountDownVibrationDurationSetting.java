package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_audience_count_down_vibration_duration")
public final class LiveMatchAudienceCountDownVibrationDurationSetting {
    public static final long DEFAULT = 350;
    public static final LiveMatchAudienceCountDownVibrationDurationSetting INSTANCE = new LiveMatchAudienceCountDownVibrationDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveMatchAudienceCountDownVibrationDurationSetting.class);
    }
}
