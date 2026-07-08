package com.bytedance.android.livesdk.livesetting.game.moment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_moment_detection_enabled")
public final class LiveGameMomentDetectionEnabledSetting {
    public static final int DEFAULT = 1;
    public static final LiveGameMomentDetectionEnabledSetting INSTANCE = new LiveGameMomentDetectionEnabledSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_game_moment_detection_enabled", DEFAULT);
    }
}
