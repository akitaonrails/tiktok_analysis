package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_speed_test_auto_end_time")
public final class TtliveGameSpeedTestAutoEndTimeSetting {
    public static final int DEFAULT = 20;
    public static final TtliveGameSpeedTestAutoEndTimeSetting INSTANCE = new TtliveGameSpeedTestAutoEndTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_speed_test_auto_end_time", DEFAULT);
    }
}
