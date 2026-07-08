package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_audience_control_mock_time")
public final class LiveGameAudienceControlMockTimeSetting {
    public static final long DEFAULT = 0;
    public static final LiveGameAudienceControlMockTimeSetting INSTANCE = new LiveGameAudienceControlMockTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_game_audience_control_mock_time", DEFAULT);
    }
}
