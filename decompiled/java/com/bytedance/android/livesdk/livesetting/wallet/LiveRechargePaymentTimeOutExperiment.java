package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("enable_coin_recharge_payment_timeout_handling")
public final class LiveRechargePaymentTimeOutExperiment {
    public static final boolean DEFAULT = false;
    public static final LiveRechargePaymentTimeOutExperiment INSTANCE = new LiveRechargePaymentTimeOutExperiment();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_coin_recharge_payment_timeout_handling", DEFAULT);
    }
}
