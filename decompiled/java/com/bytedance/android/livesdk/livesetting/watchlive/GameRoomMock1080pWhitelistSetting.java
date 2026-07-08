package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "game_room_mock_1080p_whitelist")
public final class GameRoomMock1080pWhitelistSetting {
    public static final boolean DEFAULT = false;
    public static final GameRoomMock1080pWhitelistSetting INSTANCE = new GameRoomMock1080pWhitelistSetting();
    public static final boolean MOCK = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("game_room_mock_1080p_whitelist", DEFAULT);
    }
}
