package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_alog_and_monitor_degrade_switch")
public final class LiveALogAndMonitorDegradeSetting {
    public static final int DEFAULT = 0;
    public static final LiveALogAndMonitorDegradeSetting INSTANCE = new LiveALogAndMonitorDegradeSetting();
    public static final int v1 = 1;
    public static final int v2 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_alog_and_monitor_degrade_switch", DEFAULT);
    }
}
