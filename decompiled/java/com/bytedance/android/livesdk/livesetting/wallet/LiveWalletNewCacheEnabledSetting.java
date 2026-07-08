package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_wallet_new_cache_enabled")
public final class LiveWalletNewCacheEnabledSetting {
    public static final boolean DEFAULT = false;
    public static final LiveWalletNewCacheEnabledSetting INSTANCE = new LiveWalletNewCacheEnabledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_new_cache_enabled", DEFAULT);
    }
}
