package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_shiny_card_bypass_stable_mode_setting")
public final class GiftShinyCardBypassStableModelSetting {
    public static final int DEFAULT = 0;
    public static final int config;
    public static final boolean enabled;
    public static final GiftShinyCardBypassStableModelSetting INSTANCE = new GiftShinyCardBypassStableModelSetting();
    public static final int ENABLED = 1;

    static {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int i = DEFAULT;
        int intValue = settingsManager.getIntValue("gift_shiny_card_bypass_stable_mode_setting", i);
        config = intValue;
        enabled = intValue > i;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getENABLED() {
        return ENABLED;
    }

    public final boolean getEnabled() {
        return enabled;
    }
}
