package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_wallet_iap_loading_indicator_message")
public final class LiveWalletLoadingIndicatorSetting {
    public static final boolean DEFAULT = false;
    public static final LiveWalletLoadingIndicatorSetting INSTANCE = new LiveWalletLoadingIndicatorSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_iap_loading_indicator_message", DEFAULT);
    }
}
