package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("game_watch_display_opt")
public final class GameWatchLiveDisplayOptExp {
    public static final int DEFAULT = 3;
    public static final int DISPLAY_V1 = 1;
    public static final int DISPLAY_V2 = 2;
    public static final GameWatchLiveDisplayOptExp INSTANCE = new GameWatchLiveDisplayOptExp();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_watch_display_opt", DEFAULT);
    }
}
