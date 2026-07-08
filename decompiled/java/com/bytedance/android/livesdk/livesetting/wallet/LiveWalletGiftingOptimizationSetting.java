package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_send_skip_balance_check_wallet_not_ready")
public final class LiveWalletGiftingOptimizationSetting {
    public static final boolean DEFAULT = false;
    public static final LiveWalletGiftingOptimizationSetting INSTANCE = new LiveWalletGiftingOptimizationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("gift_send_skip_balance_check_wallet_not_ready", DEFAULT);
    }
}
