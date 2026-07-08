package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_revenue_perf_msg_qps_time_window")
public final class LiveRevenueHighTrafficQpsTimeWindow {
    public static final LiveRevenueHighTrafficQpsTimeWindow INSTANCE = new LiveRevenueHighTrafficQpsTimeWindow();
    public static final int DEFAULT = 10;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_revenue_perf_msg_qps_time_window", DEFAULT);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
