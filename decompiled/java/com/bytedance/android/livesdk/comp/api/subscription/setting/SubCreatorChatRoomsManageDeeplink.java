package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "sub_creator_chat_rooms_manage_deeplink")
public final class SubCreatorChatRoomsManageDeeplink {
    public static final String DEFAULT = "aweme://lynxview?bdhm_bid=tiktok_creator_subscription_lynx&bdhm_pid=creator_chat_room_settings&enable_prefetch=1&hide_nav_bar=1&hide_status_bar=0&trans_status_bar=1&use_forest=1&use_spark=1&url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2F10%2Fgecko%2Fresource%2Ftiktok_creator_subscription_lynx%2FCreatorChatRoomSettings%2Ftemplate.js";
    public static final SubCreatorChatRoomsManageDeeplink INSTANCE = new SubCreatorChatRoomsManageDeeplink();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("sub_creator_chat_rooms_manage_deeplink", DEFAULT);
    }
}
