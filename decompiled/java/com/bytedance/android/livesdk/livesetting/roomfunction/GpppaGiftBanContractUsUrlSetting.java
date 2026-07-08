package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("gpppa_gift_ban_contract_us_url")
public final class GpppaGiftBanContractUsUrlSetting {
    public static final String DEFAULT = "";
    public static final GpppaGiftBanContractUsUrlSetting INSTANCE = new GpppaGiftBanContractUsUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("gpppa_gift_ban_contract_us_url", DEFAULT);
    }
}
