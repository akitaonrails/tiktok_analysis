package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_sub_payment_time_cost_optimization")
public final class LiveSubscriptionPaymentTimeCostOptimization {
    public static final int DEFAULT = 0;
    public static final LiveSubscriptionPaymentTimeCostOptimization INSTANCE = new LiveSubscriptionPaymentTimeCostOptimization();

    public static final boolean enablePaymentTimeCostOptimization() {
        return INSTANCE.getValue() == 1;
    }

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSubscriptionPaymentTimeCostOptimization.class);
    }
}
