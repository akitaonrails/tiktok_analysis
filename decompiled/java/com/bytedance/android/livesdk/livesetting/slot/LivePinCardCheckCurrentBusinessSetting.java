package com.bytedance.android.livesdk.livesetting.slot;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_pin_card_check_current_business_setting")
public final class LivePinCardCheckCurrentBusinessSetting {
    public static final boolean DEFAULT = true;
    public static final LivePinCardCheckCurrentBusinessSetting INSTANCE = new LivePinCardCheckCurrentBusinessSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pin_card_check_current_business_setting", DEFAULT);
    }
}
