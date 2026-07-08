package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_preload_reuse_cashier_phase2_webview")
public final class LiveWalletCashierPreloadPhase2EnabledSetting {
    public static final boolean DEFAULT = false;
    public static final LiveWalletCashierPreloadPhase2EnabledSetting INSTANCE = new LiveWalletCashierPreloadPhase2EnabledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_preload_reuse_cashier_phase2_webview", DEFAULT);
    }
}
