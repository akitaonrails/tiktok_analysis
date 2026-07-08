package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_sdk_multiguest_pause_timeout_interval")
public final class LiveSdkMultiguestPauseTimeoutIntervalSetting {
    public static final int DEFAULT = 300;
    public static final LiveSdkMultiguestPauseTimeoutIntervalSetting INSTANCE = new LiveSdkMultiguestPauseTimeoutIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_multiguest_pause_timeout_interval", DEFAULT);
    }
}
