package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_revenue_area_back_up")
public final class MultiGuestRevenueAreaBackUpSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestRevenueAreaBackUpSetting INSTANCE = new MultiGuestRevenueAreaBackUpSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestRevenueAreaBackUpSetting.class);
    }

    public final boolean isShieldUs() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestRevenueAreaBackUpSetting.class) == 0;
    }
}
