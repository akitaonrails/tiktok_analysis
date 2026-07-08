package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_wallet_api_tracking_enabled")
public final class LiveWalletApiTrackingSetting {
    public static final LiveWalletApiTrackingSetting INSTANCE = new LiveWalletApiTrackingSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_api_tracking_enabled", DEFAULT);
    }
}
