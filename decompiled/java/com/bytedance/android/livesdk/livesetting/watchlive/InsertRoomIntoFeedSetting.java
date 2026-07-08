package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("enable_insert_room_info_feed")
public final class InsertRoomIntoFeedSetting {
    public static final boolean DEFAULT = false;
    public static final InsertRoomIntoFeedSetting INSTANCE = new InsertRoomIntoFeedSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_insert_room_info_feed", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
