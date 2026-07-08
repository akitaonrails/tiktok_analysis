package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "game_bg_frame_interval")
public final class GameBgFrameIntervalSetting {
    public static final long DEFAULT = 0;
    public static final GameBgFrameIntervalSetting INSTANCE = new GameBgFrameIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("game_bg_frame_interval", DEFAULT);
    }
}
