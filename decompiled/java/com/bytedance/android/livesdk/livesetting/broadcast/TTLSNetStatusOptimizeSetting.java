package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttls_net_status_optimize")
public final class TTLSNetStatusOptimizeSetting {
    public static final int DEFAULT = 0;
    public static final TTLSNetStatusOptimizeSetting INSTANCE = new TTLSNetStatusOptimizeSetting();

    public final boolean enableNetStatusOptimize() {
        return SettingsManager.INSTANCE.getIntValue("ttls_net_status_optimize", DEFAULT) == 1;
    }
}
