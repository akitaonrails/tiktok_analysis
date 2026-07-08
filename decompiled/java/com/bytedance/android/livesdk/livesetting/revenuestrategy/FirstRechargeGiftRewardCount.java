package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_first_recharge_gift_reward_count")
public final class FirstRechargeGiftRewardCount {
    public static final int DEFAULT = 1;
    public static final FirstRechargeGiftRewardCount INSTANCE = new FirstRechargeGiftRewardCount();

    public final int getCount() {
        return SettingsManager.INSTANCE.getIntValue("live_first_recharge_gift_reward_count", DEFAULT);
    }
}
