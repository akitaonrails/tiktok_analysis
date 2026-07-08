package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "hangout_backup_room_feed_loaded")
public final class HangoutBackupRoomFeedLoadedSetting {
    public static final int DEFAULT = 0;
    public static final HangoutBackupRoomFeedLoadedSetting INSTANCE = new HangoutBackupRoomFeedLoadedSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("hangout_backup_room_feed_loaded", DEFAULT);
    }

    public final boolean enable() {
        return getValue() == 1;
    }
}
