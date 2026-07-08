package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_first_recharge_gift_iapid")
public final class LiveFirstRechargeGiftIapidSetting {
    public static final String DEFAULT = "";
    public static final LiveFirstRechargeGiftIapidSetting INSTANCE = new LiveFirstRechargeGiftIapidSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_first_recharge_gift_iapid", DEFAULT);
    }
}
