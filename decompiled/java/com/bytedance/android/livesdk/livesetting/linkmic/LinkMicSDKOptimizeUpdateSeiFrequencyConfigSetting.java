package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_sdk_optimize_update_sei_frequency")
public final class LinkMicSDKOptimizeUpdateSeiFrequencyConfigSetting {
    public static final LinkMicSDKOptimizeUpdateSeiFrequencyConfigSetting INSTANCE = new LinkMicSDKOptimizeUpdateSeiFrequencyConfigSetting();
    public static final LinkMicSDKOptimizeUpdateSeiFrequencyConfig DEFAULT = new LinkMicSDKOptimizeUpdateSeiFrequencyConfig(true, 0.15f, 2);

    public final LinkMicSDKOptimizeUpdateSeiFrequencyConfig getValue() {
        LinkMicSDKOptimizeUpdateSeiFrequencyConfig linkMicSDKOptimizeUpdateSeiFrequencyConfig = (LinkMicSDKOptimizeUpdateSeiFrequencyConfig) SettingsManager.INSTANCE.getValueSafely(LinkMicSDKOptimizeUpdateSeiFrequencyConfigSetting.class);
        return linkMicSDKOptimizeUpdateSeiFrequencyConfig == null ? DEFAULT : linkMicSDKOptimizeUpdateSeiFrequencyConfig;
    }
}
