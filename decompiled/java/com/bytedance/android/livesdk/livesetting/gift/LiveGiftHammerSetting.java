package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_hammer")
public final class LiveGiftHammerSetting {
    public static final LiveGiftHammerSetting INSTANCE = new LiveGiftHammerSetting();
    public static final HammerParams DEFAULT = new HammerParams(true, 5, 100);

    private final HammerParams getSettingParams() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        HammerParams hammerParams = DEFAULT;
        HammerParams hammerParams2 = (HammerParams) settingsManager.getValueSafely("live_gift_hammer", hammerParams);
        return hammerParams2 != null ? hammerParams2 : hammerParams;
    }

    public final int getMinComboPrice() {
        return getSettingParams().minComboPrice;
    }

    public final int getMinHammerPrice() {
        return getSettingParams().minHammerPrice;
    }

    public final boolean isEnabled() {
        return getSettingParams().enabled;
    }

    public final HammerParams getDEFAULT() {
        return DEFAULT;
    }
}
