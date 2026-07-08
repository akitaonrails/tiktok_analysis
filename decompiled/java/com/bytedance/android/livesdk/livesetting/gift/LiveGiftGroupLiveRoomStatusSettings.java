package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_group_live_room_after_linkmic_setting")
public final class LiveGiftGroupLiveRoomStatusSettings {
    public static final LiveGiftGroupLiveRoomStatusSettings INSTANCE = new LiveGiftGroupLiveRoomStatusSettings();
    public static final boolean DEFAULT = true;

    public final boolean isDisabled() {
        return !SettingsManager.INSTANCE.getBooleanValue("live_gift_group_live_room_after_linkmic_setting", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
