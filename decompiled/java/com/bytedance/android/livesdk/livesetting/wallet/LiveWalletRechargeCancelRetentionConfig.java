package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("coin_recharge_cancel_config")
public final class LiveWalletRechargeCancelRetentionConfig {
    public static final LiveWalletRechargeCancelRetentionConfig INSTANCE = new LiveWalletRechargeCancelRetentionConfig();
    public static final CancelRetentionTimeConfig DEFAULT = new CancelRetentionTimeConfig();

    public final CancelRetentionTimeConfig getValue() {
        CancelRetentionTimeConfig cancelRetentionTimeConfig = (CancelRetentionTimeConfig) SettingsManager.INSTANCE.getValueSafely(LiveWalletRechargeCancelRetentionConfig.class);
        return cancelRetentionTimeConfig == null ? DEFAULT : cancelRetentionTimeConfig;
    }
}
