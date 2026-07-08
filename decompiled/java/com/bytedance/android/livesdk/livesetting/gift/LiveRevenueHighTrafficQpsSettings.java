package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_revenue_perf_msg_qps_hot_config")
public final class LiveRevenueHighTrafficQpsSettings {
    public static final LiveRevenueHighTrafficQpsSettings INSTANCE = new LiveRevenueHighTrafficQpsSettings();
    public static final QpsThresholds DEFAULT = new QpsThresholds();

    public final QpsThresholds getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        QpsThresholds qpsThresholds = DEFAULT;
        QpsThresholds qpsThresholds2 = (QpsThresholds) settingsManager.getValueSafely("live_revenue_perf_msg_qps_hot_config", qpsThresholds);
        return qpsThresholds2 != null ? qpsThresholds2 : qpsThresholds;
    }

    public final QpsThresholds getDEFAULT() {
        return DEFAULT;
    }
}
