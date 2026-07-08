package com.bytedance.android.livesdk.livesetting.game.moment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_moment_anchor_enabled")
public final class LiveGameMomentAnchorEnabledSetting {
    public static final int DEFAULT = 1;
    public static final LiveGameMomentAnchorEnabledSetting INSTANCE = new LiveGameMomentAnchorEnabledSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_game_moment_anchor_enabled", DEFAULT);
    }

    public final boolean enableAnchorGameMoment() {
        return getValue() == 1;
    }
}
