package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_revenue_msg_qps_hot_clear_buffer")
public final class LiveRevenueHighTrafficExitThresholdScale {
    public static final LiveRevenueHighTrafficExitThresholdScale INSTANCE = new LiveRevenueHighTrafficExitThresholdScale();
    public static final float DEFAULT = 0.8f;

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("live_revenue_msg_qps_hot_clear_buffer", DEFAULT);
    }

    public final float getDEFAULT() {
        return DEFAULT;
    }
}
