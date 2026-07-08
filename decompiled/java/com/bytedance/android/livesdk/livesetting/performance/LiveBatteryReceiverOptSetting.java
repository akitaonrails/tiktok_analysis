package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_battery_receiver_opt")
public final class LiveBatteryReceiverOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveBatteryReceiverOptSetting INSTANCE = new LiveBatteryReceiverOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_battery_receiver_opt", DEFAULT);
    }
}
