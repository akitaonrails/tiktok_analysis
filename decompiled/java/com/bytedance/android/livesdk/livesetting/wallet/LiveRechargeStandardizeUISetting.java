package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_recharge_standardize_ui_setting")
public final class LiveRechargeStandardizeUISetting {
    public static final boolean DEFAULT = false;
    public static final LiveRechargeStandardizeUISetting INSTANCE = new LiveRechargeStandardizeUISetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_recharge_standardize_ui_setting", DEFAULT);
    }
}
