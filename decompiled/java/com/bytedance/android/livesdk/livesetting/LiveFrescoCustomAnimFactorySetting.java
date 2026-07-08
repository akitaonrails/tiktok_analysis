package com.bytedance.android.livesdk.livesetting;

import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
@SettingsKey(preciseExperiment = false, value = "live_fresco_custom_anim_factory_config")
public final class LiveFrescoCustomAnimFactorySetting {
    public static final LiveFrescoCustomAnimFactorySetting INSTANCE = new LiveFrescoCustomAnimFactorySetting();
    public static final LiveFrescoCustomAnimFactoryConfig DEFAULT = new LiveFrescoCustomAnimFactoryConfig();

    public final LiveFrescoCustomAnimFactoryConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveFrescoCustomAnimFactoryConfig liveFrescoCustomAnimFactoryConfig = DEFAULT;
        LiveFrescoCustomAnimFactoryConfig liveFrescoCustomAnimFactoryConfig2 = (LiveFrescoCustomAnimFactoryConfig) settingsManager.getValueSafely("live_fresco_custom_anim_factory_config", liveFrescoCustomAnimFactoryConfig);
        return liveFrescoCustomAnimFactoryConfig2 != null ? liveFrescoCustomAnimFactoryConfig2 : liveFrescoCustomAnimFactoryConfig;
    }

    public final AnimFactoryConfig getConfig(String str, String str2) {
        Map<String, AnimFactoryConfig> pathConfigs;
        Map<String, AnimFactoryConfig> sceneConfigs;
        if (!TextUtils.isEmpty(str) && (sceneConfigs = getValue().getSceneConfigs()) != null && sceneConfigs.get(str) != null) {
            Map<String, AnimFactoryConfig> sceneConfigs2 = getValue().getSceneConfigs();
            if (sceneConfigs2 == null) {
                return null;
            }
            return sceneConfigs2.get(str);
        }
        if (!TextUtils.isEmpty(str2) && (pathConfigs = getValue().getPathConfigs()) != null && pathConfigs.get(str2) != null) {
            Map<String, AnimFactoryConfig> pathConfigs2 = getValue().getPathConfigs();
            if (pathConfigs2 == null) {
                return null;
            }
            return pathConfigs2.get(str2);
        }
        if (!getValue().getShareAnimKey() || TextUtils.isEmpty(str2)) {
            return null;
        }
        AnimFactoryConfig animFactoryConfig = new AnimFactoryConfig();
        animFactoryConfig.setEnableShareKey(true);
        return animFactoryConfig;
    }
}
