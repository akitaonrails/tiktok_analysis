package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_recommend_room_list_ab")
public final class MultiGuestRecommendRoomAb {
    public static final int DEFAULT = 0;
    public static final MultiGuestRecommendRoomAb INSTANCE = new MultiGuestRecommendRoomAb();

    public final int getAbResult() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_recommend_room_list_ab", DEFAULT);
    }

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_recommend_room_list_ab", DEFAULT) != 0;
    }
}
