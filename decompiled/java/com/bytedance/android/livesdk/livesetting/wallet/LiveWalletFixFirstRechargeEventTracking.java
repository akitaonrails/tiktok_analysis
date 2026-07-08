package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_wallet_fix_is_first_recharge_event_tracking")
public final class LiveWalletFixFirstRechargeEventTracking {
    public static final boolean DEFAULT = false;
    public static final LiveWalletFixFirstRechargeEventTracking INSTANCE = new LiveWalletFixFirstRechargeEventTracking();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_fix_is_first_recharge_event_tracking", DEFAULT);
    }
}
