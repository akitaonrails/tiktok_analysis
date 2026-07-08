package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "partnership_anchor_frequency_control")
public final class PartnershipAnchorFrequencyControlSetting {
    public static final PartnershipAnchorFrequencyControlSetting INSTANCE = new PartnershipAnchorFrequencyControlSetting();
    public static final PartnershipAnchorFrequencyControlConfig DEFAULT = new PartnershipAnchorFrequencyControlConfig(false, 10, false);

    public final PartnershipAnchorFrequencyControlConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PartnershipAnchorFrequencyControlConfig partnershipAnchorFrequencyControlConfig = DEFAULT;
        PartnershipAnchorFrequencyControlConfig partnershipAnchorFrequencyControlConfig2 = (PartnershipAnchorFrequencyControlConfig) settingsManager.getValueSafely("partnership_anchor_frequency_control", partnershipAnchorFrequencyControlConfig);
        return partnershipAnchorFrequencyControlConfig2 != null ? partnershipAnchorFrequencyControlConfig2 : partnershipAnchorFrequencyControlConfig;
    }
}
