package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_room_function_update_interval")
public final class LiveRoomFunctionUpdateIntervalSetting {
    public static final long DEFAULT = 60000;
    public static final LiveRoomFunctionUpdateIntervalSetting INSTANCE = new LiveRoomFunctionUpdateIntervalSetting();

    public final long getInterval() {
        return SettingsManager.INSTANCE.getLongValue("live_room_function_update_interval", DEFAULT);
    }
}
