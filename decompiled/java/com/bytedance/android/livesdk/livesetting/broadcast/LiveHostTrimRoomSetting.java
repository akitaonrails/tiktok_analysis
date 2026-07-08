package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_trim_room_setting")
public final class LiveHostTrimRoomSetting {
    public static final boolean DEFAULT = false;
    public static final LiveHostTrimRoomSetting INSTANCE = new LiveHostTrimRoomSetting();

    private final boolean getSetting() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_trim_room_setting", DEFAULT);
    }

    public final boolean enable() {
        return getSetting();
    }
}
