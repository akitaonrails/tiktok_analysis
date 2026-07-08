package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_revenue_strategy_enable_incentive_task")
public final class LiveRevenueStrategyEnableIncentiveTaskSetting {
    public static final LiveRevenueStrategyEnableIncentiveTaskSetting INSTANCE = new LiveRevenueStrategyEnableIncentiveTaskSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_revenue_strategy_enable_incentive_task", DEFAULT);
    }
}
