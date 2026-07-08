package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import X.C0NDD;
import X.C2097608Jq;
import X.EnumC2215461BnM;
import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.ttlivestreamer.livestreamv2.videoquality.controler.model.VideoQualityMockConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.portrait.VideoQualityPortrait;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("ttlh_video_quality_strategy_manager_test")
public final class TTLHVideoQualityStrategyManagerTestSettings {
    public static TTLHVideoQualityTestSettings configs;
    public static final TTLHVideoQualityStrategyManagerTestSettings INSTANCE = new TTLHVideoQualityStrategyManagerTestSettings();
    public static final TTLHVideoQualityTestSettings DEFAULT = new TTLHVideoQualityTestSettings();

    private final TTLHVideoQualityTestSettings getConfigs() {
        if (configs == null) {
            SettingsManager settingsManager = SettingsManager.INSTANCE;
            TTLHVideoQualityTestSettings tTLHVideoQualityTestSettings = DEFAULT;
            TTLHVideoQualityTestSettings tTLHVideoQualityTestSettings2 = (TTLHVideoQualityTestSettings) settingsManager.getValueSafely("ttlh_video_quality_strategy_manager_test", tTLHVideoQualityTestSettings);
            if (tTLHVideoQualityTestSettings2 != null) {
                tTLHVideoQualityTestSettings = tTLHVideoQualityTestSettings2;
            }
            configs = tTLHVideoQualityTestSettings;
        }
        TTLHVideoQualityTestSettings tTLHVideoQualityTestSettings3 = configs;
        return tTLHVideoQualityTestSettings3 == null ? DEFAULT : tTLHVideoQualityTestSettings3;
    }

    public final VideoQualityMockConfig getMockConfig() {
        VideoQualityMockConfig videoQualityMockConfig = new VideoQualityMockConfig();
        TTLHVideoQualityTestSettings configs2 = getConfigs();
        videoQualityMockConfig.mockProbeSwitch = configs2.getMockProbeSwitch();
        videoQualityMockConfig.mockProbeStatusCode = configs2.getMockProbeStatusCode();
        videoQualityMockConfig.mockProbeNetSpeed = configs2.getMockProbeNetSpeed();
        videoQualityMockConfig.mockProbeDuration = configs2.getMockProbeDuration();
        videoQualityMockConfig.mockProbeNetworkType = configs2.getMockProbeNetworkType();
        videoQualityMockConfig.gearCaptureLevel = configs2.getGearCaptureLevel();
        videoQualityMockConfig.gearEffectLevel = configs2.getGearEffectLevel();
        videoQualityMockConfig.gearEncodeLevel = configs2.getGearEncodeLevel();
        videoQualityMockConfig.mockAsyncReleaseSleepMs = configs2.getMockAsyncReleaseSleepMs();
        videoQualityMockConfig.ignoreWifiProbeCache = configs2.getIgnoreWifiProbeCache();
        videoQualityMockConfig.ignoreMobileProbeCache = configs2.getIgnoreMobileProbeCache();
        return videoQualityMockConfig;
    }

    public final Map<String, VideoQualityPortrait> getServerPortraitsTestMap() {
        Map<String, SettingsPortraitsConfigTest> portraitsConfigs = getConfigs().getPortraitsConfigs();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        INSTANCE.fillPortraitsTestMap(linkedHashMap, portraitsConfigs);
        return linkedHashMap;
    }

    public static final class SettingsPortraitsConfigTest implements Serializable {
        public static final TypeAdapter ADAPTER;

        @C09CT("rule_name")
        public String ruleName = "";

        @C09CT("rule_data_type")
        public String ruleDataType = "";

        @C09CT("portraits_source")
        public String portraitsSource = "";

        @C09CT("mock_data")
        public String mockData = "";

        static {
            NormalGson.singleton();
            ADAPTER = new TTLHVideoQualityStrategyManagerTestSettings_SettingsPortraitsConfigTest_OptTypeAdapter();
        }

        public final String getMockData() {
            return this.mockData;
        }

        public final String getPortraitsSource() {
            return this.portraitsSource;
        }

        public final String getRuleDataType() {
            return this.ruleDataType;
        }

        public final String getRuleName() {
            return this.ruleName;
        }

        public final void setMockData(String str) {
            this.mockData = str;
        }

        public final void setPortraitsSource(String str) {
            this.portraitsSource = str;
        }

        public final void setRuleDataType(String str) {
            this.ruleDataType = str;
        }

        public final void setRuleName(String str) {
            this.ruleName = str;
        }
    }

    public static final class TTLHVideoQualityTestSettings implements Serializable {
        public static final TypeAdapter ADAPTER = new TTLHVideoQualityStrategyManagerTestSettings_TTLHVideoQualityTestSettings_OptTypeAdapter(NormalGson.singleton());

        @C09CT("mock_probe_switch")
        public int mockProbeSwitch = -1;

        @C09CT("mock_probe_network_type")
        public int mockProbeNetworkType = -1;

        @C09CT("mock_probe_status_code")
        public int mockProbeStatusCode = -1;

        @C09CT("mock_probe_net_speed")
        public int mockProbeNetSpeed = -1;

        @C09CT("mock_probe_duration")
        public int mockProbeDuration = -1;

        @C09CT("mock_gear_adaptive_encode_level")
        public int gearEncodeLevel = -1;

        @C09CT("mock_gear_adaptive_effect_level")
        public int gearEffectLevel = -1;

        @C09CT("mock_gear_adaptive_capture_level")
        public int gearCaptureLevel = -1;

        @C09CT("mock_async_release_sleep_ms")
        public int mockAsyncReleaseSleepMs = -1;

        @C09CT("ignore_wifi_probe_cache")
        public int ignoreWifiProbeCache = -1;

        @C09CT("ignore_mobile_probe_cache")
        public int ignoreMobileProbeCache = -1;

        @C09CT("ttlh_video_quality_portraits_config_test")
        public Map<String, SettingsPortraitsConfigTest> portraitsConfigs = C2097608Jq.LJ();

        public final int getGearCaptureLevel() {
            return this.gearCaptureLevel;
        }

        public final int getGearEffectLevel() {
            return this.gearEffectLevel;
        }

        public final int getGearEncodeLevel() {
            return this.gearEncodeLevel;
        }

        public final int getIgnoreMobileProbeCache() {
            return this.ignoreMobileProbeCache;
        }

        public final int getIgnoreWifiProbeCache() {
            return this.ignoreWifiProbeCache;
        }

        public final int getMockAsyncReleaseSleepMs() {
            return this.mockAsyncReleaseSleepMs;
        }

        public final int getMockProbeDuration() {
            return this.mockProbeDuration;
        }

        public final int getMockProbeNetSpeed() {
            return this.mockProbeNetSpeed;
        }

        public final int getMockProbeNetworkType() {
            return this.mockProbeNetworkType;
        }

        public final int getMockProbeStatusCode() {
            return this.mockProbeStatusCode;
        }

        public final int getMockProbeSwitch() {
            return this.mockProbeSwitch;
        }

        public final Map<String, SettingsPortraitsConfigTest> getPortraitsConfigs() {
            return this.portraitsConfigs;
        }

        public final void setGearCaptureLevel(int i) {
            this.gearCaptureLevel = i;
        }

        public final void setGearEffectLevel(int i) {
            this.gearEffectLevel = i;
        }

        public final void setGearEncodeLevel(int i) {
            this.gearEncodeLevel = i;
        }

        public final void setIgnoreMobileProbeCache(int i) {
            this.ignoreMobileProbeCache = i;
        }

        public final void setIgnoreWifiProbeCache(int i) {
            this.ignoreWifiProbeCache = i;
        }

        public final void setMockAsyncReleaseSleepMs(int i) {
            this.mockAsyncReleaseSleepMs = i;
        }

        public final void setMockProbeDuration(int i) {
            this.mockProbeDuration = i;
        }

        public final void setMockProbeNetSpeed(int i) {
            this.mockProbeNetSpeed = i;
        }

        public final void setMockProbeNetworkType(int i) {
            this.mockProbeNetworkType = i;
        }

        public final void setMockProbeStatusCode(int i) {
            this.mockProbeStatusCode = i;
        }

        public final void setMockProbeSwitch(int i) {
            this.mockProbeSwitch = i;
        }

        public final void setPortraitsConfigs(Map<String, SettingsPortraitsConfigTest> map) {
            this.portraitsConfigs = map;
        }
    }

    private final void fillPortraitsTestMap(Map<String, VideoQualityPortrait> map, Map<String, SettingsPortraitsConfigTest> map2) {
        for (Map.Entry<String, SettingsPortraitsConfigTest> entry : map2.entrySet()) {
            VideoQualityPortrait videoQualityPortrait = new VideoQualityPortrait();
            SettingsPortraitsConfigTest value = entry.getValue();
            videoQualityPortrait.name = value.getRuleName();
            videoQualityPortrait.dataType = EnumC2215461BnM.fromString(value.getRuleDataType());
            videoQualityPortrait.source = C0NDD.fromString(value.getPortraitsSource());
            if (!TextUtils.isEmpty(value.getMockData())) {
                videoQualityPortrait.LIZ(value.getMockData());
            }
            map.put(entry.getKey(), videoQualityPortrait);
        }
    }
}
