package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_white_list_set_cover_enable")
public final class GameLiveWhiteListSetCoverEnableSetting {
    public static final int DEFAULT = 0;
    public static final GameLiveWhiteListSetCoverEnableSetting INSTANCE = new GameLiveWhiteListSetCoverEnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_live_white_list_set_cover_enable", DEFAULT);
    }
}
