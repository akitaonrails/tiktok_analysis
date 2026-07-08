package com.bytedance.android.livestrategy.config;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_feature_center_config")
public final class LiveFeatureCenterConfigSetting {
    public static final LiveFeatureCenterConfigSetting INSTANCE = new LiveFeatureCenterConfigSetting();
    public static final LiveFeatureCenterConfig DEFAULT = new LiveFeatureCenterConfig(new FeatureCenter(null, null, null, null, 15, null), new FeatureCenter(null, null, null, null, 15, null), new FeatureCenter(null, null, null, null, 15, null), new FeatureCenter(null, null, null, null, 15, null));

    public final LiveFeatureCenterConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveFeatureCenterConfig liveFeatureCenterConfig = DEFAULT;
        LiveFeatureCenterConfig liveFeatureCenterConfig2 = (LiveFeatureCenterConfig) settingsManager.getValueSafely("live_feature_center_config", liveFeatureCenterConfig);
        return liveFeatureCenterConfig2 != null ? liveFeatureCenterConfig2 : liveFeatureCenterConfig;
    }
}
