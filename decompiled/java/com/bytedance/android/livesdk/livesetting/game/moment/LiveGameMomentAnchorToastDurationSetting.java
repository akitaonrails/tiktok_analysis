package com.bytedance.android.livesdk.livesetting.game.moment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_moment_anchor_toast_duration")
public final class LiveGameMomentAnchorToastDurationSetting {
    public static final int DEFAULT = 20;
    public static final LiveGameMomentAnchorToastDurationSetting INSTANCE = new LiveGameMomentAnchorToastDurationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_game_moment_anchor_toast_duration", DEFAULT);
    }

    public final long getValueMillis() {
        return ((long) (getValue() * 60)) * 1000;
    }
}
