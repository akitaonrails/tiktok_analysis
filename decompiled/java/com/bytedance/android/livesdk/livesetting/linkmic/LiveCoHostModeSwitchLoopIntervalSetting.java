package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_modeswitch_loop_interval_setting")
public final class LiveCoHostModeSwitchLoopIntervalSetting {
    public static final long DEFAULT = 100;
    public static final LiveCoHostModeSwitchLoopIntervalSetting INSTANCE = new LiveCoHostModeSwitchLoopIntervalSetting();

    public static final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_cohost_modeswitch_loop_interval_setting", DEFAULT);
    }
}
