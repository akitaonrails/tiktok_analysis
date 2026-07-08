package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_playbook_non_multiguest_config")
public final class LinkMicPlaybookNonMultiGuestConfigSetting {
    public static final LinkMicPlaybookNonMultiGuestConfigSetting INSTANCE = new LinkMicPlaybookNonMultiGuestConfigSetting();
    public static final LinkmicPlaybookNonMultiGuestConfig DEFAULT = new LinkmicPlaybookNonMultiGuestConfig(1);

    public final LinkmicPlaybookNonMultiGuestConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LinkmicPlaybookNonMultiGuestConfig linkmicPlaybookNonMultiGuestConfig = DEFAULT;
        LinkmicPlaybookNonMultiGuestConfig linkmicPlaybookNonMultiGuestConfig2 = (LinkmicPlaybookNonMultiGuestConfig) settingsManager.getValueSafely("linkmic_playbook_non_multiguest_config", linkmicPlaybookNonMultiGuestConfig);
        return linkmicPlaybookNonMultiGuestConfig2 != null ? linkmicPlaybookNonMultiGuestConfig2 : linkmicPlaybookNonMultiGuestConfig;
    }

    public final boolean isCodeTechSwitchForAndroidEnable() {
        return getSettingValue().codeTechSwitchForAndroid != 0;
    }
}
