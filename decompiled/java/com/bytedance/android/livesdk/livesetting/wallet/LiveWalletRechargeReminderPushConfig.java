package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("recharge_reminder_config")
public final class LiveWalletRechargeReminderPushConfig {
    public static final LiveWalletRechargeReminderPushConfig INSTANCE = new LiveWalletRechargeReminderPushConfig();
    public static final RechargeReminderConfig DEFAULT = new RechargeReminderConfig();

    public final RechargeReminderConfig getValue() {
        RechargeReminderConfig rechargeReminderConfig = (RechargeReminderConfig) SettingsManager.INSTANCE.getValueSafely(LiveWalletRechargeReminderPushConfig.class);
        return rechargeReminderConfig == null ? DEFAULT : rechargeReminderConfig;
    }
}
