package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_recharge_optimal_list")
public final class LiveOptimalRechargeListSetting {
    public static final boolean DEFAULT = true;
    public static final LiveOptimalRechargeListSetting INSTANCE = new LiveOptimalRechargeListSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_recharge_optimal_list", DEFAULT);
    }
}
