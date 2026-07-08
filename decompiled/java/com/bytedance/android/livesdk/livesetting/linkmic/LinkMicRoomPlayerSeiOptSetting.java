package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("link_mic_room_player_sei_opt")
public final class LinkMicRoomPlayerSeiOptSetting {
    public static final int DEFAULT = 0;
    public static final LinkMicRoomPlayerSeiOptSetting INSTANCE = new LinkMicRoomPlayerSeiOptSetting();
    public static final int OPT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("link_mic_room_player_sei_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
