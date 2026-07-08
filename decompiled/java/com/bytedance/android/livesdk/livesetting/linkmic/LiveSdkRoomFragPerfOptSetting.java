package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_room_fragment_performance_opt")
public final class LiveSdkRoomFragPerfOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkRoomFragPerfOptSetting INSTANCE = new LiveSdkRoomFragPerfOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_room_fragment_performance_opt", DEFAULT);
    }
}
