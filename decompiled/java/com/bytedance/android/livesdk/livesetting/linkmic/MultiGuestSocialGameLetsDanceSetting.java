package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_social_game_lets_dance_config")
public final class MultiGuestSocialGameLetsDanceSetting {
    public static final MultiGuestSocialGameLetsDanceSetting INSTANCE = new MultiGuestSocialGameLetsDanceSetting();
    public static final LetsDanceConfig DEFAULT = new LetsDanceConfig("7599509308841136641", 2, 2, "https://p16-linkmic-img.tiktokcdn-us.com/tos-alisg-i-0gv1ynv35u-sg/just_dance_v1_x1.png~tplv-0gv1ynv35u-image.image", true, true, "7603370640413823489", false, true, true, true, true);

    public static final LetsDanceConfig config() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LetsDanceConfig letsDanceConfig = DEFAULT;
        LetsDanceConfig letsDanceConfig2 = (LetsDanceConfig) settingsManager.getValueSafely("multi_guest_social_game_lets_dance_config", letsDanceConfig);
        return letsDanceConfig2 != null ? letsDanceConfig2 : letsDanceConfig;
    }
}
