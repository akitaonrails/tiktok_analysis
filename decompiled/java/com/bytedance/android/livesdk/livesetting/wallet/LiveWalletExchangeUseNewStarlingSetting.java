package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_wallet_exchange_use_new_starling")
public final class LiveWalletExchangeUseNewStarlingSetting {
    public static final LiveWalletExchangeUseNewStarlingSetting INSTANCE = new LiveWalletExchangeUseNewStarlingSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_exchange_use_new_starling", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
