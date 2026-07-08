package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_show_campaign_guide_in_room")
public final class LiveShowCampaignGuideInRoom {
    public static final int DEFAULT = 0;
    public static final LiveShowCampaignGuideInRoom INSTANCE = new LiveShowCampaignGuideInRoom();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_show_campaign_guide_in_room", DEFAULT);
    }
}
