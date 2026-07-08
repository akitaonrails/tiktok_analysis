package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_social")
public final class MultiGuestSocialConfigSetting {
    public static final MultiGuestSocialConfigSetting INSTANCE = new MultiGuestSocialConfigSetting();
    public static final MultiGuestSocialConfig DEFAULT = new MultiGuestSocialConfig(120, 500, 10);

    public final MultiGuestSocialConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MultiGuestSocialConfig multiGuestSocialConfig = DEFAULT;
        MultiGuestSocialConfig multiGuestSocialConfig2 = (MultiGuestSocialConfig) settingsManager.getValueSafely("multi_guest_social", multiGuestSocialConfig);
        return multiGuestSocialConfig2 != null ? multiGuestSocialConfig2 : multiGuestSocialConfig;
    }
}
