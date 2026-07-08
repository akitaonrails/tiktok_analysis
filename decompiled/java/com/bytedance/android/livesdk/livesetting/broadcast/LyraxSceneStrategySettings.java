package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "lyrax_scene_strategy_config")
public final class LyraxSceneStrategySettings {
    public static final LyraxSceneStrategySettings INSTANCE = new LyraxSceneStrategySettings();
    public static final SceneStrategySettings DEFAULT = new SceneStrategySettings(false, false, false, 30000);

    public static final int getHarDetectIntervalMs() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SceneStrategySettings sceneStrategySettings = DEFAULT;
        SceneStrategySettings sceneStrategySettings2 = (SceneStrategySettings) settingsManager.getValueSafely("lyrax_scene_strategy_config", sceneStrategySettings);
        if (sceneStrategySettings2 != null) {
            sceneStrategySettings = sceneStrategySettings2;
        }
        return sceneStrategySettings.harDetectIntervalMs;
    }

    public static final boolean isBatteryStrategyEnable() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SceneStrategySettings sceneStrategySettings = DEFAULT;
        SceneStrategySettings sceneStrategySettings2 = (SceneStrategySettings) settingsManager.getValueSafely("lyrax_scene_strategy_config", sceneStrategySettings);
        if (sceneStrategySettings2 != null) {
            sceneStrategySettings = sceneStrategySettings2;
        }
        return sceneStrategySettings.enableBatteryStrategy;
    }

    public static final boolean isECLiveStatusEnable() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SceneStrategySettings sceneStrategySettings = DEFAULT;
        SceneStrategySettings sceneStrategySettings2 = (SceneStrategySettings) settingsManager.getValueSafely("lyrax_scene_strategy_config", sceneStrategySettings);
        if (sceneStrategySettings2 != null) {
            sceneStrategySettings = sceneStrategySettings2;
        }
        return sceneStrategySettings.enableECLiveStatus;
    }

    public static final boolean isHARDetectEnable() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SceneStrategySettings sceneStrategySettings = DEFAULT;
        SceneStrategySettings sceneStrategySettings2 = (SceneStrategySettings) settingsManager.getValueSafely("lyrax_scene_strategy_config", sceneStrategySettings);
        if (sceneStrategySettings2 != null) {
            sceneStrategySettings = sceneStrategySettings2;
        }
        return sceneStrategySettings.enableHarDetect;
    }

    public static final class SceneStrategySettings {
        public static final TypeAdapter ADAPTER = new LyraxSceneStrategySettings_SceneStrategySettings_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable_battery_strategy")
        public boolean enableBatteryStrategy;

        @C09CT("enable_ec_live_status")
        public boolean enableECLiveStatus;

        @C09CT("enable_har_detect")
        public boolean enableHarDetect;

        @C09CT("har_detect_interval_ms")
        public int harDetectIntervalMs;

        public SceneStrategySettings() {
            this(false, false, false, 30000);
        }

        public SceneStrategySettings(boolean z, boolean z2, boolean z3, int i) {
            this.enableBatteryStrategy = z;
            this.enableHarDetect = z2;
            this.enableECLiveStatus = z3;
            this.harDetectIntervalMs = i;
        }
    }
}
