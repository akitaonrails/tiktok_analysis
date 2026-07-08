package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_wallet_new_recharge_latency_tracking_enabled")
public final class LiveWalletNewRechargeLatencyTrackingEnabledSetting {
    public static final LiveWalletNewRechargeLatencyTrackingEnabledSetting INSTANCE = new LiveWalletNewRechargeLatencyTrackingEnabledSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_new_recharge_latency_tracking_enabled", DEFAULT);
    }
}
