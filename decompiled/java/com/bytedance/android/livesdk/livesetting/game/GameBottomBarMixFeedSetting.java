package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "game_bottom_bar_mix_feed")
public final class GameBottomBarMixFeedSetting {
    public static final int DEFAULT = 0;
    public static final GameBottomBarMixFeedSetting INSTANCE = new GameBottomBarMixFeedSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_bottom_bar_mix_feed", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() > 0;
    }
}
