package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import X.C2097608Jq;
import X.EnumC2178851APb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerSettings;
import com.google.gson.TypeAdapter;
import com.ss.ttlivestreamer.livestreamv2.videoquality.probe.model.select.BwProbeGameGearSelectConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.BitrateConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.StrategyConfig;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("ttlh_video_quality_strategy_manager_game")
public final class TTLHVideoQualityStrategyManagerGameSettings {
    public static TTLHVideoQualityGameSettings configs;
    public static final TTLHVideoQualityStrategyManagerGameSettings INSTANCE = new TTLHVideoQualityStrategyManagerGameSettings();
    public static final TTLHVideoQualityGameSettings DEFAULT = new TTLHVideoQualityGameSettings();

    private final TTLHVideoQualityGameSettings getConfigs() {
        if (configs == null) {
            SettingsManager settingsManager = SettingsManager.INSTANCE;
            TTLHVideoQualityGameSettings tTLHVideoQualityGameSettings = DEFAULT;
            TTLHVideoQualityGameSettings tTLHVideoQualityGameSettings2 = (TTLHVideoQualityGameSettings) settingsManager.getValueSafely("ttlh_video_quality_strategy_manager_game", tTLHVideoQualityGameSettings);
            if (tTLHVideoQualityGameSettings2 != null) {
                tTLHVideoQualityGameSettings = tTLHVideoQualityGameSettings2;
            }
            configs = tTLHVideoQualityGameSettings;
        }
        TTLHVideoQualityGameSettings tTLHVideoQualityGameSettings3 = configs;
        return tTLHVideoQualityGameSettings3 == null ? DEFAULT : tTLHVideoQualityGameSettings3;
    }

    public final Map<String, Map<String, BitrateConfig>> getBitrateConfig() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Map<String, TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig>> bitrateConfigs = getConfigs().getBitrateConfigs();
        if (bitrateConfigs != null) {
            for (Map.Entry<String, Map<String, TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig>> entry : bitrateConfigs.entrySet()) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                INSTANCE.fillBitrateMap(linkedHashMap2, entry.getValue());
                linkedHashMap.put(entry.getKey(), linkedHashMap2);
            }
        }
        return linkedHashMap;
    }

    public final String getConfigJson() {
        String customOriginalValue = SettingsManager.INSTANCE.getCustomOriginalValue("ttlh_video_quality_strategy_manager_game");
        return customOriginalValue == null ? "{}" : customOriginalValue;
    }

    public final Map<String, BwProbeGameGearSelectConfig> getGearSelectConfig() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, SettingsGearSelectGameConfig> settingsGearSelectGameConfigs = getConfigs().getSettingsGearSelectGameConfigs();
        if (settingsGearSelectGameConfigs == null) {
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        INSTANCE.fillGearSelectMap(linkedHashMap2, settingsGearSelectGameConfigs);
        return linkedHashMap2;
    }

    public final Map<String, StrategyConfig> getStrategyConfig() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig> strategyConfigs = getConfigs().getStrategyConfigs();
        if (strategyConfigs != null) {
            for (Map.Entry<String, TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig> entry : strategyConfigs.entrySet()) {
                StrategyConfig strategyConfig = new StrategyConfig();
                TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig value = entry.getValue();
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

    public final int getLogReportConfig() {
        return getConfigs().getLogReportSetting();
    }

    public final SettingsVideoQualityGameProbeConfig getProbeConfig() {
        return getConfigs().getSettingsVideoQualityGameProbeConfig();
    }

    public final RtcProbeConfig getRtcProbeConfig() {
        return getConfigs().getRtcProbeConfig();
    }

    public final long getSyncTimeoutMs() {
        return getConfigs().getGearCenterSyncTimeoutMs();
    }

    public final boolean isALogReportEnabled() {
        return getConfigs().getEnableALogReport() == 1;
    }

    public final boolean isOverwriteGearResultEnabled() {
        return getConfigs().getEnableOverwriteGearResult() == 1;
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

    /* JADX INFO: loaded from: classes19.dex */
    public static final class RtcProbeConfig implements Serializable {
        public static final TypeAdapter ADAPTER;

        @C09CT("enable_lyrax_prober")
        public int enableAnchorNetLyraxProbe;

        @C09CT("enable_rtc_probe")
        public int enableRtcProbe;

        static {
            NormalGson.singleton();
            ADAPTER = new TTLHVideoQualityStrategyManagerGameSettings_RtcProbeConfig_OptTypeAdapter();
        }

        public final int getEnableAnchorNetLyraxProbe() {
            return this.enableAnchorNetLyraxProbe;
        }

        public final int getEnableRtcProbe() {
            return this.enableRtcProbe;
        }

        public final void setEnableAnchorNetLyraxProbe(int i) {
            this.enableAnchorNetLyraxProbe = i;
        }

        public final void setEnableRtcProbe(int i) {
            this.enableRtcProbe = i;
        }
    }

    public static final class SettingsGearSelectGameConfig implements Serializable {
        public static final TypeAdapter ADAPTER;

        @C09CT("BWProbeBottomLevel")
        public int bWProbeBottomLevel;

        @C09CT("BottomLine1080p30")
        public long bottomLine1080p30;

        @C09CT("BottomLine1080p30Bwe")
        public long bottomLine1080p30Bwe;

        @C09CT("BottomLine1080p60")
        public long bottomLine1080p60;

        @C09CT("BottomLine1080p60Bwe")
        public long bottomLine1080p60Bwe;

        @C09CT("BottomLine480p25")
        public long bottomLine480p25;

        @C09CT("BottomLine480p25Bwe")
        public long bottomLine480p25Bwe;

        @C09CT("BottomLine540p25")
        public long bottomLine540p25;

        @C09CT("BottomLine540p25Bwe")
        public long bottomLine540p25Bwe;

        @C09CT("BottomLine720p30")
        public long bottomLine720p30;

        @C09CT("BottomLine720p30Bwe")
        public long bottomLine720p30Bwe;

        @C09CT("BottomLine720p60")
        public long bottomLine720p60;

        @C09CT("BottomLine720p60Bwe")
        public long bottomLine720p60Bwe;

        @C09CT("BWProbeAimLevel")
        public int bwProbeAimLevel;

        @C09CT("priority")
        public int priority;

        static {
            NormalGson.singleton();
            ADAPTER = new TTLHVideoQualityStrategyManagerGameSettings_SettingsGearSelectGameConfig_OptTypeAdapter();
        }

        public final int getBWProbeBottomLevel() {
            return this.bWProbeBottomLevel;
        }

        public final long getBottomLine1080p30() {
            return this.bottomLine1080p30;
        }

        public final long getBottomLine1080p30Bwe() {
            return this.bottomLine1080p30Bwe;
        }

        public final long getBottomLine1080p60() {
            return this.bottomLine1080p60;
        }

        public final long getBottomLine1080p60Bwe() {
            return this.bottomLine1080p60Bwe;
        }

        public final long getBottomLine480p25() {
            return this.bottomLine480p25;
        }

        public final long getBottomLine480p25Bwe() {
            return this.bottomLine480p25Bwe;
        }

        public final long getBottomLine540p25() {
            return this.bottomLine540p25;
        }

        public final long getBottomLine540p25Bwe() {
            return this.bottomLine540p25Bwe;
        }

        public final long getBottomLine720p30() {
            return this.bottomLine720p30;
        }

        public final long getBottomLine720p30Bwe() {
            return this.bottomLine720p30Bwe;
        }

        public final long getBottomLine720p60() {
            return this.bottomLine720p60;
        }

        public final long getBottomLine720p60Bwe() {
            return this.bottomLine720p60Bwe;
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

        public final void setBottomLine1080p30(long j) {
            this.bottomLine1080p30 = j;
        }

        public final void setBottomLine1080p30Bwe(long j) {
            this.bottomLine1080p30Bwe = j;
        }

        public final void setBottomLine1080p60(long j) {
            this.bottomLine1080p60 = j;
        }

        public final void setBottomLine1080p60Bwe(long j) {
            this.bottomLine1080p60Bwe = j;
        }

        public final void setBottomLine480p25(long j) {
            this.bottomLine480p25 = j;
        }

        public final void setBottomLine480p25Bwe(long j) {
            this.bottomLine480p25Bwe = j;
        }

        public final void setBottomLine540p25(long j) {
            this.bottomLine540p25 = j;
        }

        public final void setBottomLine540p25Bwe(long j) {
            this.bottomLine540p25Bwe = j;
        }

        public final void setBottomLine720p30(long j) {
            this.bottomLine720p30 = j;
        }

        public final void setBottomLine720p30Bwe(long j) {
            this.bottomLine720p30Bwe = j;
        }

        public final void setBottomLine720p60(long j) {
            this.bottomLine720p60 = j;
        }

        public final void setBottomLine720p60Bwe(long j) {
            this.bottomLine720p60Bwe = j;
        }

        public final void setBwProbeAimLevel(int i) {
            this.bwProbeAimLevel = i;
        }

        public final void setPriority(int i) {
            this.priority = i;
        }
    }

    public static final class SettingsVideoQualityGameProbeConfig implements Serializable {
        public static final TypeAdapter ADAPTER;

        @C09CT("cache_check_interval")
        public int cacheCheckInterval;

        @C09CT("cache_valid_days")
        public int cacheValidDays;

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

        @C09CT("enable_current_probe_result")
        public int enableCurrentProbeResult;

        @C09CT("enable_io_cache")
        public int enableIOCache;

        @C09CT("enable_probe")
        public int enableProbe;

        @C09CT("enable_probe_opt_v2")
        public int enableProbeOptV2;

        @C09CT("enable_probe_timeout")
        public int enableProbeTimeout;

        @C09CT("good_network_bottom_line")
        public int goodNetworkBottomLine;

        @C09CT("manual_probe_switch")
        public int manualProbeSwitch;

        @C09CT("memory_cache_valid_time")
        public int memoryCacheValidTime;

        @C09CT("normal_network_bottom_line")
        public int normalNetworkBottomLine;

        @C09CT("probe_align_report_probe_result")
        public int probeAlignReportProbeResult;

        @C09CT("probe_finish_bad_bitrate")
        public int probeFinishBadBitrate;

        @C09CT("probe_max_times")
        public int probeMaxTimes;

        @C09CT("probe_timeout_ms")
        public int probeTimeoutMs;

        static {
            NormalGson.singleton();
            ADAPTER = new TTLHVideoQualityStrategyManagerGameSettings_SettingsVideoQualityGameProbeConfig_OptTypeAdapter();
        }

        public final int getCacheCheckInterval() {
            return this.cacheCheckInterval;
        }

        public final int getCacheValidDays() {
            return this.cacheValidDays;
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

        public final int getEnableCurrentProbeResult() {
            return this.enableCurrentProbeResult;
        }

        public final int getEnableIOCache() {
            return this.enableIOCache;
        }

        public final int getEnableProbe() {
            return this.enableProbe;
        }

        public final int getEnableProbeOptV2() {
            return this.enableProbeOptV2;
        }

        public final int getEnableProbeTimeout() {
            return this.enableProbeTimeout;
        }

        public final int getGoodNetworkBottomLine() {
            return this.goodNetworkBottomLine;
        }

        public final int getManualProbeSwitch() {
            return this.manualProbeSwitch;
        }

        public final int getMemoryCacheValidTime() {
            return this.memoryCacheValidTime;
        }

        public final int getNormalNetworkBottomLine() {
            return this.normalNetworkBottomLine;
        }

        public final int getProbeAlignReportProbeResult() {
            return this.probeAlignReportProbeResult;
        }

        public final int getProbeFinishBadBitrate() {
            return this.probeFinishBadBitrate;
        }

        public final int getProbeMaxTimes() {
            return this.probeMaxTimes;
        }

        public final int getProbeTimeoutMs() {
            return this.probeTimeoutMs;
        }

        public final void setCacheCheckInterval(int i) {
            this.cacheCheckInterval = i;
        }

        public final void setCacheValidDays(int i) {
            this.cacheValidDays = i;
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

        public final void setEnableCurrentProbeResult(int i) {
            this.enableCurrentProbeResult = i;
        }

        public final void setEnableIOCache(int i) {
            this.enableIOCache = i;
        }

        public final void setEnableProbe(int i) {
            this.enableProbe = i;
        }

        public final void setEnableProbeOptV2(int i) {
            this.enableProbeOptV2 = i;
        }

        public final void setEnableProbeTimeout(int i) {
            this.enableProbeTimeout = i;
        }

        public final void setGoodNetworkBottomLine(int i) {
            this.goodNetworkBottomLine = i;
        }

        public final void setManualProbeSwitch(int i) {
            this.manualProbeSwitch = i;
        }

        public final void setMemoryCacheValidTime(int i) {
            this.memoryCacheValidTime = i;
        }

        public final void setNormalNetworkBottomLine(int i) {
            this.normalNetworkBottomLine = i;
        }

        public final void setProbeAlignReportProbeResult(int i) {
            this.probeAlignReportProbeResult = i;
        }

        public final void setProbeFinishBadBitrate(int i) {
            this.probeFinishBadBitrate = i;
        }

        public final void setProbeMaxTimes(int i) {
            this.probeMaxTimes = i;
        }

        public final void setProbeTimeoutMs(int i) {
            this.probeTimeoutMs = i;
        }
    }

    public static final class TTLHVideoQualityGameSettings implements Serializable {
        public static final TypeAdapter ADAPTER = new TTLHVideoQualityStrategyManagerGameSettings_TTLHVideoQualityGameSettings_OptTypeAdapter(NormalGson.singleton());

        @C09CT("ttlh_video_quality_enable_alog")
        public int enableALogReport;

        @C09CT("enable_new_structure")
        public int enableNewStructure;

        @C09CT("enable_overwrite_gear_result")
        public int enableOverwriteGearResult;

        @C09CT("ttlh_enable_vq_strategy_center")
        public int enableStrategyCenter;

        @C09CT("ttlh_video_quality_enable_trace")
        public int enableTraceReport;

        @C09CT("ttlh_video_quality_log_report_settings")
        public int logReportSetting;

        @C09CT("ttlh_enable_video_quality_downgrade_mock")
        public int mockSettings;

        @C09CT("ttlh_set_bitrate_params_type")
        public int setBitrateParamsType;

        @C09CT("ttlh_video_quality_strategy_settings")
        public Map<String, TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig> strategyConfigs = C2097608Jq.LJ();

        @C09CT("ttlh_video_quality_bitrate_settings_map")
        public Map<String, ? extends Map<String, TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig>> bitrateConfigs = C2097608Jq.LJ();

        @C09CT("ttlh_video_quality_gear_select_settings")
        public Map<String, SettingsGearSelectGameConfig> settingsGearSelectGameConfigs = C2097608Jq.LJ();

        @C09CT("ttlh_video_quality_probe_config")
        public SettingsVideoQualityGameProbeConfig settingsVideoQualityGameProbeConfig = new SettingsVideoQualityGameProbeConfig();

        @C09CT("ttlh_video_quality_rtc_probe_config")
        public RtcProbeConfig rtcProbeConfig = new RtcProbeConfig();

        @C09CT("gear_center_mock_data")
        public Map<String, ? extends Object> gearCenterMockData = C2097608Jq.LJ();

        @C09CT("gear_center_strategy_config")
        public Map<String, ? extends Object> gearCenterStrategyConfig = C2097608Jq.LJ();

        @C09CT("gear_center_probe_config")
        public Map<String, ? extends Object> gearCenterProbeConfig = C2097608Jq.LJ();

        @C09CT("gear_center_sync_timeout_ms")
        public long gearCenterSyncTimeoutMs = 200;

        public final Map<String, Map<String, TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig>> getBitrateConfigs() {
            return this.bitrateConfigs;
        }

        public final int getEnableALogReport() {
            return this.enableALogReport;
        }

        public final int getEnableNewStructure() {
            return this.enableNewStructure;
        }

        public final int getEnableOverwriteGearResult() {
            return this.enableOverwriteGearResult;
        }

        public final int getEnableStrategyCenter() {
            return this.enableStrategyCenter;
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

        public final RtcProbeConfig getRtcProbeConfig() {
            return this.rtcProbeConfig;
        }

        public final int getSetBitrateParamsType() {
            return this.setBitrateParamsType;
        }

        public final Map<String, SettingsGearSelectGameConfig> getSettingsGearSelectGameConfigs() {
            return this.settingsGearSelectGameConfigs;
        }

        public final SettingsVideoQualityGameProbeConfig getSettingsVideoQualityGameProbeConfig() {
            return this.settingsVideoQualityGameProbeConfig;
        }

        public final Map<String, TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig> getStrategyConfigs() {
            return this.strategyConfigs;
        }

        public final void setBitrateConfigs(Map<String, ? extends Map<String, TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig>> map) {
            this.bitrateConfigs = map;
        }

        public final void setEnableALogReport(int i) {
            this.enableALogReport = i;
        }

        public final void setEnableNewStructure(int i) {
            this.enableNewStructure = i;
        }

        public final void setEnableOverwriteGearResult(int i) {
            this.enableOverwriteGearResult = i;
        }

        public final void setEnableStrategyCenter(int i) {
            this.enableStrategyCenter = i;
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

        public final void setRtcProbeConfig(RtcProbeConfig rtcProbeConfig) {
            this.rtcProbeConfig = rtcProbeConfig;
        }

        public final void setSetBitrateParamsType(int i) {
            this.setBitrateParamsType = i;
        }

        public final void setSettingsGearSelectGameConfigs(Map<String, SettingsGearSelectGameConfig> map) {
            this.settingsGearSelectGameConfigs = map;
        }

        public final void setSettingsVideoQualityGameProbeConfig(SettingsVideoQualityGameProbeConfig settingsVideoQualityGameProbeConfig) {
            this.settingsVideoQualityGameProbeConfig = settingsVideoQualityGameProbeConfig;
        }

        public final void setStrategyConfigs(Map<String, TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig> map) {
            this.strategyConfigs = map;
        }
    }

    private final void fillBitrateMap(Map<String, BitrateConfig> map, Map<String, TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig> map2) {
        for (Map.Entry<String, TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig> entry : map2.entrySet()) {
            BitrateConfig bitrateConfig = new BitrateConfig();
            TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig value = entry.getValue();
            bitrateConfig.defaultBitrate = value.getDefaultBitrate();
            bitrateConfig.maxBitrate = value.getMaxBitrate();
            bitrateConfig.minBitrate = value.getMinBitrate();
            bitrateConfig.width = value.getWidth();
            bitrateConfig.height = value.getHeight();
            bitrateConfig.fps = value.getFps();
            bitrateConfig.sdkKey = value.getSdkKey();
            bitrateConfig.LIZ = EnumC2178851APb.sdkKeyToGameLevel(value.getSdkKey());
            map.put(entry.getKey(), bitrateConfig);
        }
    }

    private final void fillGearSelectMap(Map<String, BwProbeGameGearSelectConfig> map, Map<String, SettingsGearSelectGameConfig> map2) {
        for (Map.Entry<String, SettingsGearSelectGameConfig> entry : map2.entrySet()) {
            BwProbeGameGearSelectConfig bwProbeGameGearSelectConfig = new BwProbeGameGearSelectConfig();
            SettingsGearSelectGameConfig value = entry.getValue();
            bwProbeGameGearSelectConfig.bottomLine480p25Bwe = value.getBottomLine480p25Bwe();
            bwProbeGameGearSelectConfig.bottomLine540p25Bwe = value.getBottomLine540p25Bwe();
            bwProbeGameGearSelectConfig.bottomLine720p30Bwe = value.getBottomLine720p30Bwe();
            bwProbeGameGearSelectConfig.bottomLine720p60Bwe = value.getBottomLine720p60Bwe();
            bwProbeGameGearSelectConfig.bottomLine1080p30Bwe = value.getBottomLine1080p30Bwe();
            bwProbeGameGearSelectConfig.bottomLine1080p60Bwe = value.getBottomLine1080p60Bwe();
            bwProbeGameGearSelectConfig.bottomLine480p25 = value.getBottomLine480p25();
            bwProbeGameGearSelectConfig.bottomLine540p25 = value.getBottomLine540p25();
            bwProbeGameGearSelectConfig.bottomLine720p30 = value.getBottomLine720p30();
            bwProbeGameGearSelectConfig.bottomLine720p60 = value.getBottomLine720p60();
            bwProbeGameGearSelectConfig.bottomLine1080p30 = value.getBottomLine1080p30();
            bwProbeGameGearSelectConfig.bottomLine1080p60 = value.getBottomLine1080p60();
            bwProbeGameGearSelectConfig.bwProbeBottomLevel = value.getBWProbeBottomLevel();
            bwProbeGameGearSelectConfig.bwProbeAimLevel = value.getBwProbeAimLevel();
            bwProbeGameGearSelectConfig.priority = value.getPriority();
            map.put(entry.getKey(), bwProbeGameGearSelectConfig);
        }
    }
}
