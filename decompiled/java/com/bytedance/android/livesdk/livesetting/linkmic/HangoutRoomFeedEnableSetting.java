package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("hangout_room_feed_enable")
public final class HangoutRoomFeedEnableSetting {
    public static final boolean DEFAULT = false;
    public static final HangoutRoomFeedEnableSetting INSTANCE = new HangoutRoomFeedEnableSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("hangout_room_feed_enable", DEFAULT);
    }
}
