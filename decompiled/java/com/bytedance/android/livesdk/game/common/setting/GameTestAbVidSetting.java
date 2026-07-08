package com.bytedance.android.livesdk.game.common.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "game_test_ab_vid")
public final class GameTestAbVidSetting {
    public static final int $stable = 0;
    public static final int DEFAULT = 0;
    public static final GameTestAbVidSetting INSTANCE = new GameTestAbVidSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_test_ab_vid", DEFAULT);
    }
}
