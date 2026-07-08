package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_recharge_age_threshold")
public final class LiveRechargeAgeThresholdSetting {
    public static final int DEFAULT = 18;
    public static final LiveRechargeAgeThresholdSetting INSTANCE = new LiveRechargeAgeThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_recharge_age_threshold", DEFAULT);
    }
}
