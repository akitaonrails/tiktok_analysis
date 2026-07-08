package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_click_exit_room_cohost_enable")
public final class LiveClickExitRoomCohostEnableSetting {
    public static final LiveClickExitRoomCohostEnableSetting INSTANCE = new LiveClickExitRoomCohostEnableSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_click_exit_room_cohost_enable", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
