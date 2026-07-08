package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_pre_create_next_room_player")
public final class LivePreCreateNextRoomPlayer {
    public static final int DEFAULT = -1;
    public static final int ENABLE = 3000;
    public static final LivePreCreateNextRoomPlayer INSTANCE = new LivePreCreateNextRoomPlayer();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pre_create_next_room_player", DEFAULT);
    }
}
