package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_room_info_guide_native_animation_play_time")
public final class LiveFansClubRoomInfoGuideNativeAnimationPlayTimeSetting {
    public static final int DEFAULT = 6640;
    public static final LiveFansClubRoomInfoGuideNativeAnimationPlayTimeSetting INSTANCE = new LiveFansClubRoomInfoGuideNativeAnimationPlayTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_fans_club_room_info_guide_native_animation_play_time", DEFAULT);
    }
}
