package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_status_monitor_unregister")
public final class LiveStatusMonitorUnRegister {
    public static final int DEFAULT = 0;
    public static final LiveStatusMonitorUnRegister INSTANCE = new LiveStatusMonitorUnRegister();
    public static final int V1 = 1;

    public final boolean unregister() {
        return SettingsManager.INSTANCE.getIntValue("live_status_monitor_unregister", DEFAULT) == 1;
    }
}
