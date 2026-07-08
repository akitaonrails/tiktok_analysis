package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_bottom_bar_slide_guide_delay_time")
public final class GameLiveBottomBarSlideGuideDelayTimeSetting {
    public static final int DEFAULT = 2;
    public static final GameLiveBottomBarSlideGuideDelayTimeSetting INSTANCE = new GameLiveBottomBarSlideGuideDelayTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_live_bottom_bar_slide_guide_delay_time", DEFAULT);
    }
}
