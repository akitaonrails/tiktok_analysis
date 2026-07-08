package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_draw_pre_enter_room_interaction_interval")
public final class LiveDrawPreEnterRoomDelayTime {
    public static final int DEFAULT = 200;
    public static final LiveDrawPreEnterRoomDelayTime INSTANCE = new LiveDrawPreEnterRoomDelayTime();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_draw_pre_enter_room_interaction_interval", DEFAULT);
    }
}
