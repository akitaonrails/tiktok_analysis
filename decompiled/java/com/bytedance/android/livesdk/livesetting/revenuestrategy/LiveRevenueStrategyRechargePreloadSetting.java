package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_revenue_strategy_recharge_preload_v2")
public final class LiveRevenueStrategyRechargePreloadSetting {
    public static final int DEFAULT = 0;
    public static final LiveRevenueStrategyRechargePreloadSetting INSTANCE = new LiveRevenueStrategyRechargePreloadSetting();

    public final boolean isGroupV1() {
        return SettingsManager.INSTANCE.getIntValue("live_revenue_strategy_recharge_preload_v2", DEFAULT) == 1;
    }

    public final boolean isGroupV2() {
        return SettingsManager.INSTANCE.getIntValue("live_revenue_strategy_recharge_preload_v2", DEFAULT) == 2;
    }

    public final boolean isGroupV3() {
        return SettingsManager.INSTANCE.getIntValue("live_revenue_strategy_recharge_preload_v2", DEFAULT) == 3;
    }

    public final boolean isGroupV4() {
        return SettingsManager.INSTANCE.getIntValue("live_revenue_strategy_recharge_preload_v2", DEFAULT) == 4;
    }

    public final boolean isOptGroup() {
        return SettingsManager.INSTANCE.getIntValue("live_revenue_strategy_recharge_preload_v2", DEFAULT) != 0;
    }

    public final boolean isGiftTriggerPreloadGroup() {
        return isGroupV2() || isGroupV3() || isGroupV4();
    }
}
