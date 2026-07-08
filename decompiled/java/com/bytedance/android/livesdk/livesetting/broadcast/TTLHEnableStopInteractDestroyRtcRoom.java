package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_enable_stop_interact_destroy_rtc_room")
public final class TTLHEnableStopInteractDestroyRtcRoom {
    public static final int DEFAULT = 0;
    public static final TTLHEnableStopInteractDestroyRtcRoom INSTANCE = new TTLHEnableStopInteractDestroyRtcRoom();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_enable_stop_interact_destroy_rtc_room", DEFAULT) == 1;
    }
}
