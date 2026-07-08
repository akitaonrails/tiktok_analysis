package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ug_balance_request_opt")
public final class LiveUgBalanceRequestOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveUgBalanceRequestOptSetting INSTANCE = new LiveUgBalanceRequestOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_ug_balance_request_opt", DEFAULT);
    }
}
