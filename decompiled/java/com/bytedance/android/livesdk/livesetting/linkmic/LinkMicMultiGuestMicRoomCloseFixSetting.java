package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("link_mic_multi_guest_mic_room_close_fix")
public final class LinkMicMultiGuestMicRoomCloseFixSetting {
    public static final int DEFAULT = 1;
    public static final LinkMicMultiGuestMicRoomCloseFixSetting INSTANCE = new LinkMicMultiGuestMicRoomCloseFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("link_mic_multi_guest_mic_room_close_fix", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
