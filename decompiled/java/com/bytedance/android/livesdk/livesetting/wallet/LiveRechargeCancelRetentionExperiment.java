package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("enable_coin_recharge_cancel_retention")
public final class LiveRechargeCancelRetentionExperiment {
    public static final int DEFAULT = 0;
    public static final LiveRechargeCancelRetentionExperiment INSTANCE = new LiveRechargeCancelRetentionExperiment();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enable_coin_recharge_cancel_retention", DEFAULT);
    }

    public final boolean disableCancelRetention() {
        return getValue() == 0;
    }

    public final boolean enableCancelRetentionForExitRechargePage() {
        return getValue() == 2;
    }

    public final boolean enableCancelRetentionForPaymentCancel() {
        return getValue() == 1 || getValue() == 2;
    }
}
