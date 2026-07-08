package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("retention_consumption_task_reward_amount")
public final class RetentionConsumptionTaskRewardAmount {
    public static final int DEFAULT = 0;
    public static final RetentionConsumptionTaskRewardAmount INSTANCE = new RetentionConsumptionTaskRewardAmount();

    public final int getAmount() {
        return SettingsManager.INSTANCE.getIntValue("retention_consumption_task_reward_amount", DEFAULT);
    }
}
