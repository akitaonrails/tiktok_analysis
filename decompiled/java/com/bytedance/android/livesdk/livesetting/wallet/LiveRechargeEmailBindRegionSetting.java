package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("recharge_should_bind_email")
public final class LiveRechargeEmailBindRegionSetting {
    public static final boolean DEFAULT = false;
    public static final LiveRechargeEmailBindRegionSetting INSTANCE = new LiveRechargeEmailBindRegionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("recharge_should_bind_email", DEFAULT);
    }
}
