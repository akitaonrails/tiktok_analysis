package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_list_enter_room_traffic_enabled")
public final class GiftListTrafficSettings {
    public static final boolean DEFAULT = false;
    public static final GiftListTrafficSettings INSTANCE = new GiftListTrafficSettings();

    public static final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_list_enter_room_traffic_enabled", DEFAULT);
    }
}
