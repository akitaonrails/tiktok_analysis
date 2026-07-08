package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_wallet_balance_cache_enabled")
public final class LiveWalletBalanceCacheEnabledSetting {
    public static final boolean DEFAULT = false;
    public static final LiveWalletBalanceCacheEnabledSetting INSTANCE = new LiveWalletBalanceCacheEnabledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_balance_cache_enabled", DEFAULT);
    }
}
