package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_play_opt_config")
public final class LinkMicPlayOptConfigSetting {
    public static final LinkMicPlayOptConfigSetting INSTANCE = new LinkMicPlayOptConfigSetting();
    public static final LinkMicPlayOptConfig DEFAULT = new LinkMicPlayOptConfig(1, 1, 10000, false, 15000);

    public final LinkMicPlayOptConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LinkMicPlayOptConfig linkMicPlayOptConfig = DEFAULT;
        LinkMicPlayOptConfig linkMicPlayOptConfig2 = (LinkMicPlayOptConfig) settingsManager.getValueSafely("linkmic_play_opt_config", linkMicPlayOptConfig);
        return linkMicPlayOptConfig2 != null ? linkMicPlayOptConfig2 : linkMicPlayOptConfig;
    }

    public final long entityShowSettingPageTimeOut() {
        return getSettingValue().entityShowSettingPageTimeOut;
    }

    public final boolean isForceDelay() {
        return getSettingValue().isForceDelay;
    }

    public final boolean isLiveShowCodeTechSwitch() {
        return getSettingValue().codeTechSwitchForLiveShow != 0;
    }

    public final boolean isMutualExclusionCodeTechSwitch() {
        return getSettingValue().codeTechSwitchForMutualExclusion != 0;
    }

    public final long mutexFinishDelayTime() {
        return getSettingValue().mutexFinishDelayTime;
    }
}
