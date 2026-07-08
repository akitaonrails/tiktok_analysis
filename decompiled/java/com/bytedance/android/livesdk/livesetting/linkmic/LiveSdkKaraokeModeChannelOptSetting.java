package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_karaoke_mode_channel_opt")
public final class LiveSdkKaraokeModeChannelOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkKaraokeModeChannelOptSetting INSTANCE = new LiveSdkKaraokeModeChannelOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_karaoke_mode_channel_opt", DEFAULT);
    }
}
