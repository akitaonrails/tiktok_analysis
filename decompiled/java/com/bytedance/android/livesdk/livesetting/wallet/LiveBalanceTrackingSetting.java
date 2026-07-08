package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_wallet_balance_tracking_enabled")
public final class LiveBalanceTrackingSetting {
    public static final LiveBalanceTrackingSetting INSTANCE = new LiveBalanceTrackingSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_balance_tracking_enabled", DEFAULT);
    }
}
