package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("wallet_education_popup_recharge_url")
public final class WalletEducationPopupRechargeUrlSetting {
    public static final String DEFAULT = "";
    public static final WalletEducationPopupRechargeUrlSetting INSTANCE = new WalletEducationPopupRechargeUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("wallet_education_popup_recharge_url", DEFAULT);
    }
}
