package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_revenue_high_traffic_update_rate")
public final class LiveRevenueHighTrafficUpdateRate {
    public static final LiveRevenueHighTrafficUpdateRate INSTANCE = new LiveRevenueHighTrafficUpdateRate();
    public static final long DEFAULT = 1;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_revenue_high_traffic_update_rate", DEFAULT);
    }

    public final long getDEFAULT() {
        return DEFAULT;
    }
}
