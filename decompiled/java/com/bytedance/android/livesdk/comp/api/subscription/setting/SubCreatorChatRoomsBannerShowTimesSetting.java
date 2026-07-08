package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "sub_creator_chat_rooms_banner_show_times")
public final class SubCreatorChatRoomsBannerShowTimesSetting {
    public static final int DEFAULT = 3;
    public static final SubCreatorChatRoomsBannerShowTimesSetting INSTANCE = new SubCreatorChatRoomsBannerShowTimesSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("sub_creator_chat_rooms_banner_show_times", DEFAULT);
    }
}
