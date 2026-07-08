package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_sub_gift_merchant_id")
public final class LiveGiftSubMerchantIdSetting {
    public static final LiveGiftSubMerchantIdSetting INSTANCE = new LiveGiftSubMerchantIdSetting();
    public static final String DEFAULT = "05816USpPkJiyBnttk";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_sub_gift_merchant_id", DEFAULT);
    }
}
