package com.bytedance.android.livesdk.livesetting.game.moment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_clientai_moment_enabled")
public final class LiveGameClientaiMomentEnabledSetting {
    public static final int DEFAULT = 1;
    public static final LiveGameClientaiMomentEnabledSetting INSTANCE = new LiveGameClientaiMomentEnabledSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_game_clientai_moment_enabled", DEFAULT);
    }
}
