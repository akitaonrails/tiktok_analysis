package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_param_check_setting")
public final class LinkMicParamCheckSetting {
    public static final LinkMicParamCheckSetting INSTANCE = new LinkMicParamCheckSetting();
    public static final LiveParamCheckConfig DEFAULT = new LiveParamCheckConfig(true, new LiveParamCheckDebugConfig(false, null, 3, null));

    public static final LiveParamCheckConfig config() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveParamCheckConfig liveParamCheckConfig = DEFAULT;
        LiveParamCheckConfig liveParamCheckConfig2 = (LiveParamCheckConfig) settingsManager.getValueSafely("linkmic_param_check_setting", liveParamCheckConfig);
        return liveParamCheckConfig2 != null ? liveParamCheckConfig2 : liveParamCheckConfig;
    }
}
