package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "repurchase_gift_price_threshold")
public final class RepurchaseGiftPriceThresholdSetting {
    public static final int DEFAULT = 500;
    public static final RepurchaseGiftPriceThresholdSetting INSTANCE = new RepurchaseGiftPriceThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("repurchase_gift_price_threshold", DEFAULT);
    }
}
