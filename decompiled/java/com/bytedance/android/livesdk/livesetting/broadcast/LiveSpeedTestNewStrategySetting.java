package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_go_live_bandwidth_test_new_strategy")
public final class LiveSpeedTestNewStrategySetting {
    public static final int DEFAULT = 0;
    public static final LiveSpeedTestNewStrategySetting INSTANCE = new LiveSpeedTestNewStrategySetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_go_live_bandwidth_test_new_strategy", DEFAULT) == 1;
    }
}
