package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_modeswitch_loop_count_setting")
public final class LiveCoHostModeSwitchLoopCountSetting {
    public static final int DEFAULT = 10;
    public static final LiveCoHostModeSwitchLoopCountSetting INSTANCE = new LiveCoHostModeSwitchLoopCountSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_modeswitch_loop_count_setting", DEFAULT);
    }
}
