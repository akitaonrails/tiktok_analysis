package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_try_mode_launch_broadcast_opt")
public final class LiveTryModeLaunchBroadcastOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveTryModeLaunchBroadcastOptSetting INSTANCE = new LiveTryModeLaunchBroadcastOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_try_mode_launch_broadcast_opt", DEFAULT);
    }

    public final boolean disable() {
        return !enable();
    }
}
