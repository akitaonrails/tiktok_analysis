package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_enter_room_more_config_opt")
public final class LiveSdkMultiEnterRoomMoreConfigOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiEnterRoomMoreConfigOptSetting INSTANCE = new LiveSdkMultiEnterRoomMoreConfigOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_enter_room_more_config_opt", DEFAULT);
    }
}
