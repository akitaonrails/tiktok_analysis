package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_game_live_mute")
public final class GameLivePlayerMuteSetting {
    public static final GameLivePlayerMuteSetting INSTANCE = new GameLivePlayerMuteSetting();
    public static final boolean DEFAULT = true;

    public final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_live_mute", DEFAULT);
    }
}
