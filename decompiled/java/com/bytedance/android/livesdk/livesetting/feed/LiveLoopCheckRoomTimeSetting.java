package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_loop_check_room_time")
public final class LiveLoopCheckRoomTimeSetting {
    public static final int DEFAULT = 30;
    public static final LiveLoopCheckRoomTimeSetting INSTANCE = new LiveLoopCheckRoomTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_loop_check_room_time", DEFAULT);
    }
}
