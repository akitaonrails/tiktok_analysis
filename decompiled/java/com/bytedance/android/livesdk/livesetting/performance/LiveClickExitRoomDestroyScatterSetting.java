package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_click_exit_room_destroy_scatter")
public final class LiveClickExitRoomDestroyScatterSetting {
    public static final LiveClickExitRoomDestroyScatterSetting INSTANCE = new LiveClickExitRoomDestroyScatterSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_click_exit_room_destroy_scatter", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
