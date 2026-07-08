package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey("multi_guest_live_show_config")
public final class MultiGuestLiveShowConfigSetting {
    public static final MultiGuestLiveShowConfigSetting INSTANCE = new MultiGuestLiveShowConfigSetting();
    public static final MultiGuestLiveShowConfig DEFAULT = new MultiGuestLiveShowConfig(1, 0, 2870, 4, 5, 0, 4, 0, -1);

    public final MultiGuestLiveShowConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MultiGuestLiveShowConfig multiGuestLiveShowConfig = DEFAULT;
        MultiGuestLiveShowConfig multiGuestLiveShowConfig2 = (MultiGuestLiveShowConfig) settingsManager.getValueSafely("multi_guest_live_show_config", multiGuestLiveShowConfig);
        return multiGuestLiveShowConfig2 != null ? multiGuestLiveShowConfig2 : multiGuestLiveShowConfig;
    }

    public final boolean isAllowOpenMic() {
        return getSettingValue().initialAllowOpenMic == 1;
    }

    public final boolean isAnimationDowngradeEnabled() {
        return getSettingValue().animationDowngradeEnabled == 1;
    }

    public final boolean isBackUpIm() {
        return getSettingValue().enableCalibrateContent == 1;
    }

    public final boolean isOpenLiveShow() {
        return getSettingValue().audienceMainSwitch == 1;
    }
}
