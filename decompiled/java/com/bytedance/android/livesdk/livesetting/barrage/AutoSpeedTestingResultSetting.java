package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_apply_speed_testing_result")
public final class AutoSpeedTestingResultSetting {
    public static final int DEFAULT = 0;
    public static final AutoSpeedTestingResultSetting INSTANCE = new AutoSpeedTestingResultSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_apply_speed_testing_result", DEFAULT);
    }

    public final boolean enabled() {
        return getValue() == 1;
    }
}
