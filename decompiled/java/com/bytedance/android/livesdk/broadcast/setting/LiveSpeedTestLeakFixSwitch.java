package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_speed_test_leak_fix_switch")
public final class LiveSpeedTestLeakFixSwitch {
    public static final boolean DEFAULT = true;
    public static final LiveSpeedTestLeakFixSwitch INSTANCE = new LiveSpeedTestLeakFixSwitch();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_speed_test_leak_fix_switch", DEFAULT);
    }
}
