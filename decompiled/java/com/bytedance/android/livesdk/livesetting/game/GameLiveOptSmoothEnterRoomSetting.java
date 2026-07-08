package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_opt_smooth_enter_room")
public final class GameLiveOptSmoothEnterRoomSetting {
    public static final int DEFAULT = 0;
    public static final GameLiveOptSmoothEnterRoomSetting INSTANCE = new GameLiveOptSmoothEnterRoomSetting();

    public final boolean isOptLandscape() {
        return true;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_live_opt_smooth_enter_room", DEFAULT);
    }

    public final boolean isOptPortrait() {
        return getValue() == 2 || getValue() == 3;
    }
}
