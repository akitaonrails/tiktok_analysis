package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_preload_reuse_cashier_22_webview")
public final class LiveWalletCashierForcePreloadEnabledFor22Setting {
    public static final LiveWalletCashierForcePreloadEnabledFor22Setting INSTANCE = new LiveWalletCashierForcePreloadEnabledFor22Setting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_preload_reuse_cashier_22_webview", DEFAULT);
    }
}
