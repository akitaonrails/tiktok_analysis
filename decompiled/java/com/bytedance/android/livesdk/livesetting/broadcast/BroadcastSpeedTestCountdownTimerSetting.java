package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_go_live_bandwidth_test_countdown")
public final class BroadcastSpeedTestCountdownTimerSetting {
    public static final int DEFAULT = 0;
    public static final BroadcastSpeedTestCountdownTimerSetting INSTANCE = new BroadcastSpeedTestCountdownTimerSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_go_live_bandwidth_test_countdown", DEFAULT) == 1;
    }
}
