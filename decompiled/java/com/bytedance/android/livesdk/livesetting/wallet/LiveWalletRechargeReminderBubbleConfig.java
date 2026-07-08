package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("recharge_reminder_bubble_delay")
public final class LiveWalletRechargeReminderBubbleConfig {
    public static final LiveWalletRechargeReminderBubbleConfig INSTANCE = new LiveWalletRechargeReminderBubbleConfig();
    public static final RechargeReminderBubbleConfig DEFAULT = new RechargeReminderBubbleConfig();

    public final RechargeReminderBubbleConfig getValue() {
        RechargeReminderBubbleConfig rechargeReminderBubbleConfig = (RechargeReminderBubbleConfig) SettingsManager.INSTANCE.getValueSafely(LiveWalletRechargeReminderBubbleConfig.class);
        return rechargeReminderBubbleConfig == null ? DEFAULT : rechargeReminderBubbleConfig;
    }
}
