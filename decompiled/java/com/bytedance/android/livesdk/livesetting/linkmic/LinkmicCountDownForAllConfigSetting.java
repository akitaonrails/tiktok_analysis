package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_count_down_for_all_config")
public final class LinkmicCountDownForAllConfigSetting {
    public static final LinkmicCountDownForAllConfigSetting INSTANCE = new LinkmicCountDownForAllConfigSetting();
    public static final LinkmicCountDownForAllConfig DEFAULT = new LinkmicCountDownForAllConfig("sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_banner%2Fpages%2Fcountdown-for-all-faq%2Ftemplate.js&height=60%25&use_spark=1", 1, 3, 8, 5, 1, 1, "countdown", "tiktok_live_interaction_normal_4", "count_down_for_all_start.zip", "count_down_for_all_end.zip");

    public final LinkmicCountDownForAllConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LinkmicCountDownForAllConfig linkmicCountDownForAllConfig = DEFAULT;
        LinkmicCountDownForAllConfig linkmicCountDownForAllConfig2 = (LinkmicCountDownForAllConfig) settingsManager.getValueSafely("linkmic_count_down_for_all_config", linkmicCountDownForAllConfig);
        return linkmicCountDownForAllConfig2 != null ? linkmicCountDownForAllConfig2 : linkmicCountDownForAllConfig;
    }

    public final boolean isCodeTechSwitchForAndroidEnable() {
        return getSettingValue().codeTechSwitchForAndroid != 0;
    }

    public final boolean isCodeTechSwitchForPlayerBannerShowEnable() {
        return getSettingValue().codeTechSwitchForPlayerBannerShow != 0;
    }
}
