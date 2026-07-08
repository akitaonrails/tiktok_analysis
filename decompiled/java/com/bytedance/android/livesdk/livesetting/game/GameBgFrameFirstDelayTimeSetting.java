package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "game_bg_frame_first_delay_time")
public final class GameBgFrameFirstDelayTimeSetting {
    public static final long DEFAULT = 0;
    public static final GameBgFrameFirstDelayTimeSetting INSTANCE = new GameBgFrameFirstDelayTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("game_bg_frame_first_delay_time", DEFAULT);
    }
}
