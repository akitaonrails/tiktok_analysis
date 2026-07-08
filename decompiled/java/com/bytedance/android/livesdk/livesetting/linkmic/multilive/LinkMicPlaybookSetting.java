package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_playbook_config")
public final class LinkMicPlaybookSetting {
    public static final LinkMicPlaybookSetting INSTANCE = new LinkMicPlaybookSetting();
    public static final LinkmicPlaybookConfig DEFAULT = new LinkmicPlaybookConfig(3);

    public final LinkmicPlaybookConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LinkmicPlaybookConfig linkmicPlaybookConfig = DEFAULT;
        LinkmicPlaybookConfig linkmicPlaybookConfig2 = (LinkmicPlaybookConfig) settingsManager.getValueSafely("linkmic_playbook_config", linkmicPlaybookConfig);
        return linkmicPlaybookConfig2 != null ? linkmicPlaybookConfig2 : linkmicPlaybookConfig;
    }

    public final int getRetryInterval() {
        return getSettingValue().retryInterval;
    }
}
