package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("recharge_email_auth")
public final class LiveRechargeEmailUgConsentRegionSetting {
    public static final boolean DEFAULT = false;
    public static final LiveRechargeEmailUgConsentRegionSetting INSTANCE = new LiveRechargeEmailUgConsentRegionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("recharge_email_auth", DEFAULT);
    }
}
