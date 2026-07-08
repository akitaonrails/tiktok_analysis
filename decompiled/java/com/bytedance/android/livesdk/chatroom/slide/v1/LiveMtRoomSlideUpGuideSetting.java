package com.bytedance.android.livesdk.chatroom.slide.v1;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_mt_room_slide_up_guide")
public final class LiveMtRoomSlideUpGuideSetting {
    public static final LiveMtRoomSlideUpGuideSetting INSTANCE = new LiveMtRoomSlideUpGuideSetting();
    public static final RoomSlideUpGuide DEFAULT = RoomSlideUpGuide.defaultInstance();

    public final RoomSlideUpGuide getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RoomSlideUpGuide roomSlideUpGuide = DEFAULT;
        RoomSlideUpGuide roomSlideUpGuide2 = (RoomSlideUpGuide) settingsManager.getValueSafely("live_mt_room_slide_up_guide", roomSlideUpGuide);
        return roomSlideUpGuide2 != null ? roomSlideUpGuide2 : roomSlideUpGuide;
    }

    public final RoomSlideUpGuide getDEFAULT() {
        return DEFAULT;
    }
}
