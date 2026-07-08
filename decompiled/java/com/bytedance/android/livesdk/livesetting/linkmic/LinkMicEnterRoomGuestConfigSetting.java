package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_enter_room_guest_config")
public final class LinkMicEnterRoomGuestConfigSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicEnterRoomGuestConfigSetting INSTANCE = new LinkMicEnterRoomGuestConfigSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_enter_room_guest_config", DEFAULT);
    }
}
