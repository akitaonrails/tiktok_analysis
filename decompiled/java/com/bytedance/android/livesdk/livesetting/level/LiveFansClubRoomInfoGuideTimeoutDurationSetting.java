package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_room_info_guide_timeout_duration")
public final class LiveFansClubRoomInfoGuideTimeoutDurationSetting {
    public static final int DEFAULT = 8300;
    public static final LiveFansClubRoomInfoGuideTimeoutDurationSetting INSTANCE = new LiveFansClubRoomInfoGuideTimeoutDurationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_fans_club_room_info_guide_timeout_duration", DEFAULT);
    }
}
