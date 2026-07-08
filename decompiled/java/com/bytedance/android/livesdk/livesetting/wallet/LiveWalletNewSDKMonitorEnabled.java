package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_wallet_new_sdkmonitor")
public final class LiveWalletNewSDKMonitorEnabled {
    public static final boolean DEFAULT = false;
    public static final LiveWalletNewSDKMonitorEnabled INSTANCE = new LiveWalletNewSDKMonitorEnabled();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_new_sdkmonitor", DEFAULT);
    }
}
