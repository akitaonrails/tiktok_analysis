package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_exit_room_report")
public final class LiveExitRoomReportSetting {
    public static final LiveExitRoomReportSetting INSTANCE = new LiveExitRoomReportSetting();
    public static final double DEFAULT = 0.01d;

    public static final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_exit_room_report", DEFAULT);
    }
}
