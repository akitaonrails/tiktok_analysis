package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_pipo_monitor_host")
public final class LivePipoMonitorHostSetting {
    public static final String DEFAULT = "https://mon.tiktokv.com";
    public static final LivePipoMonitorHostSetting INSTANCE = new LivePipoMonitorHostSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_pipo_monitor_host", DEFAULT);
    }
}
