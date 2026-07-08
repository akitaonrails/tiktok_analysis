package com.bytedance.android.livesdk.chatroom.slide.v1;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_slide_guide_for_follow_sky")
public final class LiveCustomizedSlideGuideEnterFromFollowSkySetting {
    public static final int DEFAULT = 0;
    public static final LiveCustomizedSlideGuideEnterFromFollowSkySetting INSTANCE = new LiveCustomizedSlideGuideEnterFromFollowSkySetting();
    public static final int ONLINE = 0;
    public static final int VERSION_1 = 1;
    public static final int VERSION_2 = 2;
    public static final int VERSION_3 = 3;
    public static final int VERSION_4 = 4;
    public static final int VERSION_5 = 5;
    public static final int VERSION_6 = 6;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_slide_guide_for_follow_sky", DEFAULT);
    }
}
