package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_fans_customize_benefit_new_expiration_date")
public final class LiveFansCustomizeBenefitNewExpirationDateSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFansCustomizeBenefitNewExpirationDateSetting INSTANCE = new LiveFansCustomizeBenefitNewExpirationDateSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_customize_benefit_new_expiration_date", DEFAULT);
    }
}
