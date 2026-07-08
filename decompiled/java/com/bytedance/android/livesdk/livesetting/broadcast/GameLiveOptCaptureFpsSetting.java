package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_opt_capture_fps")
public final class GameLiveOptCaptureFpsSetting {
    public static final int DEFAULT = 0;
    public static final GameLiveOptCaptureFpsSetting INSTANCE = new GameLiveOptCaptureFpsSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_live_opt_capture_fps", DEFAULT);
    }
}
