package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("game_live_esport_room_tab_name")
public final class GameLiveEsportRoomTabName {
    public static final String DEFAULT = "schedule";
    public static final GameLiveEsportRoomTabName INSTANCE = new GameLiveEsportRoomTabName();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("game_live_esport_room_tab_name", DEFAULT);
    }
}
