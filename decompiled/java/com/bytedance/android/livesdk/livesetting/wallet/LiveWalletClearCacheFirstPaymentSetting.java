package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_wallet_clear_cache_first_payment_enabled")
public final class LiveWalletClearCacheFirstPaymentSetting {
    public static final LiveWalletClearCacheFirstPaymentSetting INSTANCE = new LiveWalletClearCacheFirstPaymentSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_clear_cache_first_payment_enabled", DEFAULT);
    }
}
