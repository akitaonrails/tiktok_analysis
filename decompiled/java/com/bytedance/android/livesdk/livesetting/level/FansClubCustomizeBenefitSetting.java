package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fan_customize_benefit")
public final class FansClubCustomizeBenefitSetting {
    public static final int DEFAULT = 0;
    public static final FansClubCustomizeBenefitSetting INSTANCE = new FansClubCustomizeBenefitSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getIntValue("fan_customize_benefit", DEFAULT) == 1;
    }
}
