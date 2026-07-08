package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import X.C0NDD;
import X.C1D5C;
import X.C2097608Jq;
import X.EnumC2215461BnM;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.ttlivestreamer.livestreamv2.videoquality.portrait.VideoQualityPortrait;
import com.ss.ttlivestreamer.livestreamv2.videoquality.probe.model.select.BwProbeStageGearSelectConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.BitrateConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.StrategyConfig;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("ttlh_video_quality_strategy_manager")
public final class TTLHVideoQualityStrategyManagerSettings {
    public static TTLHVideoQualitySettings configs;
    public static final TTLHVideoQualityStrategyManagerSettings INSTANCE = new TTLHVideoQualityStrategyManagerSettings();
    public static final TTLHVideoQualitySettings DEFAULT = new TTLHVideoQualitySettings();

    private final TTLHVideoQualitySettings getConfigs() {
        if (configs == null) {
            SettingsManager settingsManager = SettingsManager.INSTANCE;
            TTLHVideoQualitySettings tTLHVideoQualitySettings = DEFAULT;
            TTLHVideoQualitySettings tTLHVideoQualitySettings2 = (TTLHVideoQualitySettings) settingsManager.getValueSafely("ttlh_video_quality_strategy_manager", tTLHVideoQualitySettings);
            if (tTLHVideoQualitySettings2 != null) {
                tTLHVideoQualitySettings = tTLHVideoQualitySettings2;
            }
            configs = tTLHVideoQualitySettings;
        }
        TTLHVideoQualitySettings tTLHVideoQualitySettings3 = configs;
        return tTLHVideoQualitySettings3 == null ? DEFAULT : tTLHVideoQualitySettings3;
    }

    public final Map<String, Map<String, BitrateConfig>> getBitrateConfig() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Map<String, SettingsBitrateConfig>> bitrateConfigs = getConfigs().getBitrateConfigs();
        if (bitrateConfigs != null) {
            for (Map.Entry<String, Map<String, SettingsBitrateConfig>> entry : bitrateConfigs.entrySet()) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                INSTANCE.fillMap(linkedHashMap2, entry.getValue());
                linkedHashMap.put(entry.getKey(), linkedHashMap2);
            }
        }
        return linkedHashMap;
    }

    public final String getConfigJson() {
        String customOriginalValue = SettingsManager.INSTANCE.getCustomOriginalValue("ttlh_video_quality_strategy_manager");
        return customOriginalValue == null ? "{}" : customOriginalValue;
    }

    public final C1D5C getServerGlobalSettings() {
        C1D5C c1d5c = new C1D5C();
        TTLHVideoQualitySettings configs2 = getConfigs();
        c1d5c.LIZIZ = configs2.getEnableGearSelect();
        c1d5c.LIZ = configs2.getEnableSupportResolutionList();
        c1d5c.LIZJ = configs2.getEnablePortraits();
        c1d5c.LIZLLL = configs2.getEnableGoLiveStopProbe();
        c1d5c.LJIIIIZZ = configs2.getEnableAnchorNetLyraxProbe();
        c1d5c.LJ = configs2.getEnableTTLHValidResolutionList();
        c1d5c.LJFF = configs2.getEnableTTLHRecommendResolution();
        c1d5c.LJI = configs2.getEnableTTLHOffline540p();
        c1d5c.LJII = configs2.getEnableCacheGearSelect();
        c1d5c.LJIIIZ = configs2.getEnablePostProcessDelegation();
        c1d5c.LJIIJ = configs2.getEnableCacheIgnoreRecommendLevel();
        c1d5c.LJIIJJI = configs2.getEnableCacheReadWriteOpt();
        return c1d5c;
    }

    public final Map<String, StrategyConfig> getStrategyConfig() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, SettingsStrategyConfig> strategyConfigs = getConfigs().getStrategyConfigs();
        if (strategyConfigs != null) {
            for (Map.Entry<String, SettingsStrategyConfig> entry : strategyConfigs.entrySet()) {
                StrategyConfig strategyConfig = new StrategyConfig();
                SettingsStrategyConfig value = entry.getValue();
                strategyConfig.priority = value.getPriority();
                strategyConfig.bitrateConfigListIndex = value.getBitrateConfigListIndex();
                strategyConfig.defaultLevel = value.getDefaultLevel();
                strategyConfig.gearShiftRule = value.getGearShiftRule();
                strategyConfig.gearShiftType = value.getGearShiftType();
                strategyConfig.LIZ = entry.getKey();
                linkedHashMap.put(entry.getKey(), strategyConfig);
            }
        }
        return linkedHashMap;
    }

    public final boolean enableMock() {
        return getConfigs().getMockSettings() != 0;
    }

    public final boolean enableMockGearShift() {
        return getConfigs().getMockSettings() == 1;
    }

    public final boolean enableNewStructure() {
        return getConfigs().getEnableNewStructure() == 1;
    }

    public final boolean enabledStrategyCenter() {
        return getConfigs().getEnableStrategyCenter() == 1;
    }

    public final Map<String, BwProbeStageGearSelectConfig> getGearSelectConfig() {
        Map<String, SettingsGearSelectStageConfig> settingsGearSelectStageConfigs = getConfigs().getSettingsGearSelectStageConfigs();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        INSTANCE.fillGearSelectMap(linkedHashMap, settingsGearSelectStageConfigs);
        return linkedHashMap;
    }

    public final int getLogReportConfig() {
        return getConfigs().getLogReportSetting();
    }

    public final Map<String, VideoQualityPortrait> getServerPortraitsMap() {
        Map<String, SettingsPortraitsConfig> portraitsConfigs = getConfigs().getPortraitsConfigs();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        INSTANCE.fillPortraitsMap(linkedHashMap, portraitsConfigs);
        return linkedHashMap;
    }

    public final SettingsProbeSettings getServerProbeSettings() {
        return getConfigs().getServerProbeSettings();
    }

    public final long getSyncTimeoutMs() {
        return getConfigs().getGearCenterSyncTimeoutMs();
    }

    public final boolean isALogReportEnabled() {
        return getConfigs().getEnableALogReport() == 1;
    }

    public final boolean isSetBitrateParamsDirectly() {
        return getConfigs().getSetBitrateParamsType() == 1;
    }

    public final boolean isSetBitrateParamsThrowApi() {
        return getConfigs().getSetBitrateParamsType() == 0;
    }

    public final boolean isTraceLogReportEnabled() {
        return getConfigs().getEnableTraceReport() == 1;
    }

    /* JADX INFO: loaded from: classes35.dex */
    public static final class SettingsPortraitsConfig implements Serializable {
        public static final TypeAdapter ADAPTER;

        @C09CT("rule_name")
        public String ruleName = "";

        @C09CT("rule_data_type")
        public String ruleDataType = "";

        @C09CT("portraits_source")
        public String portraitsSource = "";

        static {
            NormalGson.singleton();
            ADAPTER = new TTLHVideoQualityStrategyManagerSettings_SettingsPortraitsConfig_OptTypeAdapter();
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

    public static final class SettingsBitrateConfig implements Serializable {
        public static final TypeAdapter ADAPTER;

        @C09CT("fps")
        public int fps;

        @C09CT("height")
        public int height;

        @C09CT("size")
        public String level;

        @C09CT("sdk_key")
        public String sdkKey;

        @C09CT("width")
        public int width;

        @C09CT("defaultBitrate")
        public long defaultBitrate = -1;

        @C09CT("maxBitrate")
        public long maxBitrate = -1;

        @C09CT("minBitrate")
        public long minBitrate = -1;

        static {
            NormalGson.singleton();
            ADAPTER = new TTLHVideoQualityStrategyManagerSettings_SettingsBitrateConfig_OptTypeAdapter();
        }

        public final long getDefaultBitrate() {
            return this.defaultBitrate;
        }

        public final int getFps() {
            return this.fps;
        }

        public final int getHeight() {
            return this.height;
        }

        public final String getLevel() {
            return this.level;
        }

        public final long getMaxBitrate() {
            return this.maxBitrate;
        }

        public final long getMinBitrate() {
            return this.minBitrate;
        }

        public final String getSdkKey() {
            return this.sdkKey;
        }

        public final int getWidth() {
            return this.width;
        }

        public final void setDefaultBitrate(long j) {
            this.defaultBitrate = j;
        }

        public final void setFps(int i) {
            this.fps = i;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        public final void setLevel(String str) {
            this.level = str;
        }

        public final void setMaxBitrate(long j) {
            this.maxBitrate = j;
        }

        public final void setMinBitrate(long j) {
            this.minBitrate = j;
        }

        public final void setSdkKey(String str) {
            this.sdkKey = str;
        }

        public final void setWidth(int i) {
            this.width = i;
        }
    }

    public static final class SettingsGearSelectStageConfig implements Serializable {
        public static final TypeAdapter ADAPTER;

        @C09CT("BWProbeBottomLevel")
        public int bWProbeBottomLevel;

        @C09CT("BottomLine1080p")
        public long bottomLine1080p;

        @C09CT("BottomLine1080pBwe")
        public long bottomLine1080pBwe;

        @C09CT("BottomLine480p")
        public long bottomLine480p;

        @C09CT("BottomLine480pBwe")
        public long bottomLine480pBwe;

        @C09CT("BottomLine540p")
        public long bottomLine540p;

        @C09CT("BottomLine540pBwe")
        public long bottomLine540pBwe;

        @C09CT("BottomLine720p")
        public long bottomLine720p;

        @C09CT("BottomLine720pBwe")
        public long bottomLine720pBwe;

        @C09CT("BWProbeAimLevel")
        public int bwProbeAimLevel;

        @C09CT("priority")
        public int priority;

        static {
            NormalGson.singleton();
            ADAPTER = new TTLHVideoQualityStrategyManagerSettings_SettingsGearSelectStageConfig_OptTypeAdapter();
        }

        public final int getBWProbeBottomLevel() {
            return this.bWProbeBottomLevel;
        }

        public final long getBottomLine1080p() {
            return this.bottomLine1080p;
        }

        public final long getBottomLine1080pBwe() {
            return this.bottomLine1080pBwe;
        }

        public final long getBottomLine480p() {
            return this.bottomLine480p;
        }

        public final long getBottomLine480pBwe() {
            return this.bottomLine480pBwe;
        }

        public final long getBottomLine540p() {
            return this.bottomLine540p;
        }

        public final long getBottomLine540pBwe() {
            return this.bottomLine540pBwe;
        }

        public final long getBottomLine720p() {
            return this.bottomLine720p;
        }

        public final long getBottomLine720pBwe() {
            return this.bottomLine720pBwe;
        }

        public final int getBwProbeAimLevel() {
            return this.bwProbeAimLevel;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final void setBWProbeBottomLevel(int i) {
            this.bWProbeBottomLevel = i;
        }

        public final void setBottomLine1080p(long j) {
            this.bottomLine1080p = j;
        }

        public final void setBottomLine1080pBwe(long j) {
            this.bottomLine1080pBwe = j;
        }

        public final void setBottomLine480p(long j) {
            this.bottomLine480p = j;
        }

        public final void setBottomLine480pBwe(long j) {
            this.bottomLine480pBwe = j;
        }

        public final void setBottomLine540p(long j) {
            this.bottomLine540p = j;
        }

        public final void setBottomLine540pBwe(long j) {
            this.bottomLine540pBwe = j;
        }

        public final void setBottomLine720p(long j) {
            this.bottomLine720p = j;
        }

        public final void setBottomLine720pBwe(long j) {
            this.bottomLine720pBwe = j;
        }

        public final void setBwProbeAimLevel(int i) {
            this.bwProbeAimLevel = i;
        }

        public final void setPriority(int i) {
            this.priority = i;
        }
    }

    public static final class SettingsProbeSettings implements Serializable {
        public static final TypeAdapter ADAPTER;

        @C09CT("cmp_history_and_realtime")
        public int cmpHistoryAndRealtime;

        @C09CT("duration_thres")
        public long durationThreshold;

        @C09CT("enable_anchor_net_probe_confirm_release_opt")
        public int enableAnchorNetProbeConfirmReleaseOpt;

        @C09CT("enable_anchor_net_probe_get_thread_opt")
        public int enableAnchorNetProbeGetThreadOpt;

        @C09CT("enable_anchor_net_probe_init_thread_opt")
        public int enableAnchorNetProbeInitThreadOpt;

        @C09CT("enable_anchor_net_probe_release_thread_opt")
        public int enableAnchorNetProbeReleaseThreadOpt;

        @C09CT("enable_anchor_net_probe_release_wait_ms")
        public int enableAnchorNetProbeReleaseWaitMs;

        @C09CT("enable_portrait_optimize_speed")
        public int enablePortraitOptimizeSpeed;

        @C09CT("fail_no_cache_use_portrait")
        public int failNoCacheUsePortrait;

        @C09CT("high_probability_thres")
        public float highProbeThreshold;

        @C09CT("low_probability_thres")
        public float lowProbeThreshold;

        @C09CT("running_probe_always_use_portrait_result")
        public int runningProbeAlwaysUsePortraitResult;

        @C09CT("running_probe_low_optimize")
        public int runningProbeLowOptimize;

        static {
            NormalGson.singleton();
            ADAPTER = new TTLHVideoQualityStrategyManagerSettings_SettingsProbeSettings_OptTypeAdapter();
        }

        public final int getCmpHistoryAndRealtime() {
            return this.cmpHistoryAndRealtime;
        }

        public final long getDurationThreshold() {
            return this.durationThreshold;
        }

        public final int getEnableAnchorNetProbeConfirmReleaseOpt() {
            return this.enableAnchorNetProbeConfirmReleaseOpt;
        }

        public final int getEnableAnchorNetProbeGetThreadOpt() {
            return this.enableAnchorNetProbeGetThreadOpt;
        }

        public final int getEnableAnchorNetProbeInitThreadOpt() {
            return this.enableAnchorNetProbeInitThreadOpt;
        }

        public final int getEnableAnchorNetProbeReleaseThreadOpt() {
            return this.enableAnchorNetProbeReleaseThreadOpt;
        }

        public final int getEnableAnchorNetProbeReleaseWaitMs() {
            return this.enableAnchorNetProbeReleaseWaitMs;
        }

        public final int getEnablePortraitOptimizeSpeed() {
            return this.enablePortraitOptimizeSpeed;
        }

        public final int getFailNoCacheUsePortrait() {
            return this.failNoCacheUsePortrait;
        }

        public final float getHighProbeThreshold() {
            return this.highProbeThreshold;
        }

        public final float getLowProbeThreshold() {
            return this.lowProbeThreshold;
        }

        public final int getRunningProbeAlwaysUsePortraitResult() {
            return this.runningProbeAlwaysUsePortraitResult;
        }

        public final int getRunningProbeLowOptimize() {
            return this.runningProbeLowOptimize;
        }

        public final void setCmpHistoryAndRealtime(int i) {
            this.cmpHistoryAndRealtime = i;
        }

        public final void setDurationThreshold(long j) {
            this.durationThreshold = j;
        }

        public final void setEnableAnchorNetProbeConfirmReleaseOpt(int i) {
            this.enableAnchorNetProbeConfirmReleaseOpt = i;
        }

        public final void setEnableAnchorNetProbeGetThreadOpt(int i) {
            this.enableAnchorNetProbeGetThreadOpt = i;
        }

        public final void setEnableAnchorNetProbeInitThreadOpt(int i) {
            this.enableAnchorNetProbeInitThreadOpt = i;
        }

        public final void setEnableAnchorNetProbeReleaseThreadOpt(int i) {
            this.enableAnchorNetProbeReleaseThreadOpt = i;
        }

        public final void setEnableAnchorNetProbeReleaseWaitMs(int i) {
            this.enableAnchorNetProbeReleaseWaitMs = i;
        }

        public final void setEnablePortraitOptimizeSpeed(int i) {
            this.enablePortraitOptimizeSpeed = i;
        }

        public final void setFailNoCacheUsePortrait(int i) {
            this.failNoCacheUsePortrait = i;
        }

        public final void setHighProbeThreshold(float f) {
            this.highProbeThreshold = f;
        }

        public final void setLowProbeThreshold(float f) {
            this.lowProbeThreshold = f;
        }

        public final void setRunningProbeAlwaysUsePortraitResult(int i) {
            this.runningProbeAlwaysUsePortraitResult = i;
        }

        public final void setRunningProbeLowOptimize(int i) {
            this.runningProbeLowOptimize = i;
        }
    }

    public static final class SettingsStrategyConfig implements Serializable {
        public static final TypeAdapter ADAPTER;

        @C09CT("default_level")
        public int defaultLevel;

        @C09CT("gearshift_rule")
        public String gearShiftRule;

        @C09CT("gearshift_type")
        public int gearShiftType;

        @C09CT("priority")
        public int priority = -1;

        @C09CT("resolution_list_key")
        public String bitrateConfigListIndex = "default";

        static {
            NormalGson.singleton();
            ADAPTER = new TTLHVideoQualityStrategyManagerSettings_SettingsStrategyConfig_OptTypeAdapter();
        }

        public final String getBitrateConfigListIndex() {
            return this.bitrateConfigListIndex;
        }

        public final int getDefaultLevel() {
            return this.defaultLevel;
        }

        public final String getGearShiftRule() {
            return this.gearShiftRule;
        }

        public final int getGearShiftType() {
            return this.gearShiftType;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final void setBitrateConfigListIndex(String str) {
            this.bitrateConfigListIndex = str;
        }

        public final void setDefaultLevel(int i) {
            this.defaultLevel = i;
        }

        public final void setGearShiftRule(String str) {
            this.gearShiftRule = str;
        }

        public final void setGearShiftType(int i) {
            this.gearShiftType = i;
        }

        public final void setPriority(int i) {
            this.priority = i;
        }
    }

    public static final class TTLHVideoQualitySettings implements Serializable {
        public static final TypeAdapter ADAPTER = new TTLHVideoQualityStrategyManagerSettings_TTLHVideoQualitySettings_OptTypeAdapter(NormalGson.singleton());

        @C09CT("ttlh_video_quality_enable_alog")
        public int enableALogReport;

        @C09CT("enable_lyrax_prober")
        public int enableAnchorNetLyraxProbe;

        @C09CT("ttlh_enable_cache_gear_select")
        public int enableCacheGearSelect;

        @C09CT("enable_cache_ignore_recommend_level")
        public int enableCacheIgnoreRecommendLevel;

        @C09CT("enable_cache_read_write_opt")
        public int enableCacheReadWriteOpt;

        @C09CT("ttlh_gear_select_enable")
        public int enableGearSelect;

        @C09CT("ttlh_stop_probe_after_golive")
        public int enableGoLiveStopProbe;

        @C09CT("enable_new_structure")
        public int enableNewStructure;

        @C09CT("ttlh_portraits_enable")
        public int enablePortraits;

        @C09CT("enable_post_process_delegation")
        public int enablePostProcessDelegation;

        @C09CT("ttlh_enable_vq_strategy_center")
        public int enableStrategyCenter;

        @C09CT("ttlh_support_resolution_list_enable")
        public int enableSupportResolutionList;

        @C09CT("ttlh_offline_540p")
        public int enableTTLHOffline540p;

        @C09CT("ttlh_recommend_resolution_enable")
        public int enableTTLHRecommendResolution;

        @C09CT("ttlh_valid_resolution_list_enable")
        public int enableTTLHValidResolutionList;

        @C09CT("ttlh_video_quality_enable_trace")
        public int enableTraceReport;

        @C09CT("ttlh_video_quality_log_report_settings")
        public int logReportSetting;

        @C09CT("ttlh_enable_video_quality_downgrade_mock")
        public int mockSettings;

        @C09CT("ttlh_set_bitrate_params_type")
        public int setBitrateParamsType;

        @C09CT("ttlh_video_quality_strategy_settings")
        public Map<String, SettingsStrategyConfig> strategyConfigs = C2097608Jq.LJ();

        @C09CT("ttlh_video_quality_bitrate_settings_map")
        public Map<String, ? extends Map<String, SettingsBitrateConfig>> bitrateConfigs = C2097608Jq.LJ();

        @C09CT("ttlh_video_quality_gear_select_settings")
        public Map<String, SettingsGearSelectStageConfig> settingsGearSelectStageConfigs = C2097608Jq.LJ();

        @C09CT("ttlh_video_quality_portraits_config")
        public Map<String, SettingsPortraitsConfig> portraitsConfigs = C2097608Jq.LJ();

        @C09CT("ttlh_video_quality_probe_settings")
        public SettingsProbeSettings serverProbeSettings = new SettingsProbeSettings();

        @C09CT("gear_center_mock_data")
        public Map<String, ? extends Object> gearCenterMockData = C2097608Jq.LJ();

        @C09CT("gear_center_strategy_config")
        public Map<String, ? extends Object> gearCenterStrategyConfig = C2097608Jq.LJ();

        @C09CT("gear_center_probe_config")
        public Map<String, ? extends Object> gearCenterProbeConfig = C2097608Jq.LJ();

        @C09CT("gear_center_sync_timeout_ms")
        public long gearCenterSyncTimeoutMs = 200;

        public final Map<String, Map<String, SettingsBitrateConfig>> getBitrateConfigs() {
            return this.bitrateConfigs;
        }

        public final int getEnableALogReport() {
            return this.enableALogReport;
        }

        public final int getEnableAnchorNetLyraxProbe() {
            return this.enableAnchorNetLyraxProbe;
        }

        public final int getEnableCacheGearSelect() {
            return this.enableCacheGearSelect;
        }

        public final int getEnableCacheIgnoreRecommendLevel() {
            return this.enableCacheIgnoreRecommendLevel;
        }

        public final int getEnableCacheReadWriteOpt() {
            return this.enableCacheReadWriteOpt;
        }

        public final int getEnableGearSelect() {
            return this.enableGearSelect;
        }

        public final int getEnableGoLiveStopProbe() {
            return this.enableGoLiveStopProbe;
        }

        public final int getEnableNewStructure() {
            return this.enableNewStructure;
        }

        public final int getEnablePortraits() {
            return this.enablePortraits;
        }

        public final int getEnablePostProcessDelegation() {
            return this.enablePostProcessDelegation;
        }

        public final int getEnableStrategyCenter() {
            return this.enableStrategyCenter;
        }

        public final int getEnableSupportResolutionList() {
            return this.enableSupportResolutionList;
        }

        public final int getEnableTTLHOffline540p() {
            return this.enableTTLHOffline540p;
        }

        public final int getEnableTTLHRecommendResolution() {
            return this.enableTTLHRecommendResolution;
        }

        public final int getEnableTTLHValidResolutionList() {
            return this.enableTTLHValidResolutionList;
        }

        public final int getEnableTraceReport() {
            return this.enableTraceReport;
        }

        public final Map<String, Object> getGearCenterMockData() {
            return this.gearCenterMockData;
        }

        public final Map<String, Object> getGearCenterProbeConfig() {
            return this.gearCenterProbeConfig;
        }

        public final Map<String, Object> getGearCenterStrategyConfig() {
            return this.gearCenterStrategyConfig;
        }

        public final long getGearCenterSyncTimeoutMs() {
            return this.gearCenterSyncTimeoutMs;
        }

        public final int getLogReportSetting() {
            return this.logReportSetting;
        }

        public final int getMockSettings() {
            return this.mockSettings;
        }

        public final Map<String, SettingsPortraitsConfig> getPortraitsConfigs() {
            return this.portraitsConfigs;
        }

        public final SettingsProbeSettings getServerProbeSettings() {
            return this.serverProbeSettings;
        }

        public final int getSetBitrateParamsType() {
            return this.setBitrateParamsType;
        }

        public final Map<String, SettingsGearSelectStageConfig> getSettingsGearSelectStageConfigs() {
            return this.settingsGearSelectStageConfigs;
        }

        public final Map<String, SettingsStrategyConfig> getStrategyConfigs() {
            return this.strategyConfigs;
        }

        public final void setBitrateConfigs(Map<String, ? extends Map<String, SettingsBitrateConfig>> map) {
            this.bitrateConfigs = map;
        }

        public final void setEnableALogReport(int i) {
            this.enableALogReport = i;
        }

        public final void setEnableAnchorNetLyraxProbe(int i) {
            this.enableAnchorNetLyraxProbe = i;
        }

        public final void setEnableCacheGearSelect(int i) {
            this.enableCacheGearSelect = i;
        }

        public final void setEnableCacheIgnoreRecommendLevel(int i) {
            this.enableCacheIgnoreRecommendLevel = i;
        }

        public final void setEnableCacheReadWriteOpt(int i) {
            this.enableCacheReadWriteOpt = i;
        }

        public final void setEnableGearSelect(int i) {
            this.enableGearSelect = i;
        }

        public final void setEnableGoLiveStopProbe(int i) {
            this.enableGoLiveStopProbe = i;
        }

        public final void setEnableNewStructure(int i) {
            this.enableNewStructure = i;
        }

        public final void setEnablePortraits(int i) {
            this.enablePortraits = i;
        }

        public final void setEnablePostProcessDelegation(int i) {
            this.enablePostProcessDelegation = i;
        }

        public final void setEnableStrategyCenter(int i) {
            this.enableStrategyCenter = i;
        }

        public final void setEnableSupportResolutionList(int i) {
            this.enableSupportResolutionList = i;
        }

        public final void setEnableTTLHOffline540p(int i) {
            this.enableTTLHOffline540p = i;
        }

        public final void setEnableTTLHRecommendResolution(int i) {
            this.enableTTLHRecommendResolution = i;
        }

        public final void setEnableTTLHValidResolutionList(int i) {
            this.enableTTLHValidResolutionList = i;
        }

        public final void setEnableTraceReport(int i) {
            this.enableTraceReport = i;
        }

        public final void setGearCenterMockData(Map<String, ? extends Object> map) {
            this.gearCenterMockData = map;
        }

        public final void setGearCenterProbeConfig(Map<String, ? extends Object> map) {
            this.gearCenterProbeConfig = map;
        }

        public final void setGearCenterStrategyConfig(Map<String, ? extends Object> map) {
            this.gearCenterStrategyConfig = map;
        }

        public final void setGearCenterSyncTimeoutMs(long j) {
            this.gearCenterSyncTimeoutMs = j;
        }

        public final void setLogReportSetting(int i) {
            this.logReportSetting = i;
        }

        public final void setMockSettings(int i) {
            this.mockSettings = i;
        }

        public final void setPortraitsConfigs(Map<String, SettingsPortraitsConfig> map) {
            this.portraitsConfigs = map;
        }

        public final void setServerProbeSettings(SettingsProbeSettings settingsProbeSettings) {
            this.serverProbeSettings = settingsProbeSettings;
        }

        public final void setSetBitrateParamsType(int i) {
            this.setBitrateParamsType = i;
        }

        public final void setSettingsGearSelectStageConfigs(Map<String, SettingsGearSelectStageConfig> map) {
            this.settingsGearSelectStageConfigs = map;
        }

        public final void setStrategyConfigs(Map<String, SettingsStrategyConfig> map) {
            this.strategyConfigs = map;
        }
    }

    private final void fillGearSelectMap(Map<String, BwProbeStageGearSelectConfig> map, Map<String, SettingsGearSelectStageConfig> map2) {
        for (Map.Entry<String, SettingsGearSelectStageConfig> entry : map2.entrySet()) {
            BwProbeStageGearSelectConfig bwProbeStageGearSelectConfig = new BwProbeStageGearSelectConfig();
            SettingsGearSelectStageConfig value = entry.getValue();
            bwProbeStageGearSelectConfig.bottomLine480pBwe = value.getBottomLine480pBwe();
            bwProbeStageGearSelectConfig.bottomLine540pBwe = value.getBottomLine540pBwe();
            bwProbeStageGearSelectConfig.bottomLine720pBwe = value.getBottomLine720pBwe();
            bwProbeStageGearSelectConfig.bottomLine1080pBwe = value.getBottomLine1080pBwe();
            bwProbeStageGearSelectConfig.bottomLine480p = value.getBottomLine480p();
            bwProbeStageGearSelectConfig.bottomLine540p = value.getBottomLine540p();
            bwProbeStageGearSelectConfig.bottomLine720p = value.getBottomLine720p();
            bwProbeStageGearSelectConfig.bottomLine1080p = value.getBottomLine1080p();
            bwProbeStageGearSelectConfig.bwProbeBottomLevel = value.getBWProbeBottomLevel();
            bwProbeStageGearSelectConfig.bwProbeAimLevel = value.getBwProbeAimLevel();
            bwProbeStageGearSelectConfig.priority = value.getPriority();
            map.put(entry.getKey(), bwProbeStageGearSelectConfig);
        }
    }

    private final void fillMap(Map<String, BitrateConfig> map, Map<String, SettingsBitrateConfig> map2) {
        for (Map.Entry<String, SettingsBitrateConfig> entry : map2.entrySet()) {
            BitrateConfig bitrateConfig = new BitrateConfig();
            SettingsBitrateConfig value = entry.getValue();
            bitrateConfig.defaultBitrate = value.getDefaultBitrate();
            bitrateConfig.maxBitrate = value.getMaxBitrate();
            bitrateConfig.minBitrate = value.getMinBitrate();
            bitrateConfig.width = value.getWidth();
            bitrateConfig.height = value.getHeight();
            bitrateConfig.level = value.getLevel();
            map.put(entry.getKey(), bitrateConfig);
        }
    }

    private final void fillPortraitsMap(Map<String, VideoQualityPortrait> map, Map<String, SettingsPortraitsConfig> map2) {
        for (Map.Entry<String, SettingsPortraitsConfig> entry : map2.entrySet()) {
            VideoQualityPortrait videoQualityPortrait = new VideoQualityPortrait();
            SettingsPortraitsConfig value = entry.getValue();
            videoQualityPortrait.name = value.getRuleName();
            videoQualityPortrait.dataType = EnumC2215461BnM.fromString(value.getRuleDataType());
            videoQualityPortrait.source = C0NDD.fromString(value.getPortraitsSource());
            map.put(entry.getKey(), videoQualityPortrait);
        }
    }
}
