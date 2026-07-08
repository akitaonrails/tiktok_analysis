package com.bytedance.helios.api.config;

import X.C08CX;
import X.C093Y;
import X.C09CT;
import X.C13BV;
import X.C13LQ;
import X.C1697810uHb;
import X.C2097908Jt;
import com.bytedance.pumbaa.base.settings.FrequencyConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.h;
import com.google.gson.n;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class SettingsModel {

    @C09CT("ab_tag")
    public final String abTag;

    @C09CT("alog_duration")
    public final long alogDuration;

    @C09CT("alog_enabled")
    public final boolean alogEnabled;

    @C09CT("anchor_configs")
    public final List<Object> anchorConfigs;

    @C09CT("api_statistics_configs")
    public final List<Object> apiStatisticsConfigs;

    @C09CT("api_time_out_duration")
    public final long apiTimeOutDuration;

    @C09CT("api_white_list")
    public volatile List<String> apiWhiteList;

    @C09CT("appops_ignore_known_api")
    public final boolean appOpsIgnoreKnownApi;

    @C09CT("background_freeze_duration")
    public final long backgroundFreezeDuration;

    @C09CT("binder_config")
    public final BinderConfig binderConfig;

    @C09CT("cache_config")
    public final n cacheConfig;

    @C09CT("check_app_scenes")
    public final Set<String> checkAppScenes;

    @C09CT("crp_config")
    public final CrpConfig crpConfig;

    @C09CT("CustomAnchor")
    public final CustomAnchorConfig customAnchor;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("engine_type")
    public final String engineType;

    @C09CT("error_warning_types")
    public final Set<String> errorWarningTypes;

    @C09CT("feature_register_configs")
    public h featureRegisterConfig;

    @C09CT("frequency_configs")
    public final List<FrequencyConfig> frequencyConfigs;

    @C09CT("ignore_api_ids")
    public volatile Set<Integer> ignoreApiIds;

    @C09CT("ignore_classes")
    public final List<String> ignoreClasses;

    @C09CT("intercept_ignore_api_ids")
    public final List<Integer> interceptIgnoreApiIds;

    @C09CT("interested_appops")
    public final List<String> interestedAppOps;

    @C09CT("network_config")
    public final NetworkConfig networkConfig;

    @C09CT("permission_check")
    public final boolean permissionCheck;

    @C09CT("sample_rate_config")
    public final SampleRateConfig sampleRateConfig;

    @C09CT("signal_config")
    public final SignalConfig signalConfig;

    @C09CT("storage_config")
    public final StorageConfig storageConfig;

    @C09CT("strict_mode_config")
    public final Map<String, StrictModeConfig> strictModeConfigs;

    @C09CT("test_env_channels")
    public final List<String> testEnvChannels;

    @C09CT("ttp_region")
    public final Set<String> ttpRegion;

    @C09CT("version")
    public String version;

    public SettingsModel() {
        this(null, null, false, false, false, 0L, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsModel)) {
            return false;
        }
        SettingsModel settingsModel = (SettingsModel) obj;
        return Intrinsics.LJFF(this.version, settingsModel.version) && Intrinsics.LJFF(this.abTag, settingsModel.abTag) && this.enabled == settingsModel.enabled && this.alogEnabled == settingsModel.alogEnabled && this.permissionCheck == settingsModel.permissionCheck && this.alogDuration == settingsModel.alogDuration && this.apiTimeOutDuration == settingsModel.apiTimeOutDuration && Intrinsics.LJFF(this.anchorConfigs, settingsModel.anchorConfigs) && Intrinsics.LJFF(this.testEnvChannels, settingsModel.testEnvChannels) && Intrinsics.LJFF(this.frequencyConfigs, settingsModel.frequencyConfigs) && Intrinsics.LJFF(this.interestedAppOps, settingsModel.interestedAppOps) && Intrinsics.LJFF(this.sampleRateConfig, settingsModel.sampleRateConfig) && this.backgroundFreezeDuration == settingsModel.backgroundFreezeDuration && Intrinsics.LJFF(this.binderConfig, settingsModel.binderConfig) && Intrinsics.LJFF(this.apiStatisticsConfigs, settingsModel.apiStatisticsConfigs) && Intrinsics.LJFF(this.interceptIgnoreApiIds, settingsModel.interceptIgnoreApiIds) && Intrinsics.LJFF(this.ignoreApiIds, settingsModel.ignoreApiIds) && Intrinsics.LJFF(this.ignoreClasses, settingsModel.ignoreClasses) && Intrinsics.LJFF(this.crpConfig, settingsModel.crpConfig) && this.appOpsIgnoreKnownApi == settingsModel.appOpsIgnoreKnownApi && Intrinsics.LJFF(this.customAnchor, settingsModel.customAnchor) && Intrinsics.LJFF(this.engineType, settingsModel.engineType) && Intrinsics.LJFF(this.errorWarningTypes, settingsModel.errorWarningTypes) && Intrinsics.LJFF(this.cacheConfig, settingsModel.cacheConfig) && Intrinsics.LJFF(this.checkAppScenes, settingsModel.checkAppScenes) && Intrinsics.LJFF(this.networkConfig, settingsModel.networkConfig) && Intrinsics.LJFF(this.storageConfig, settingsModel.storageConfig) && Intrinsics.LJFF(this.signalConfig, settingsModel.signalConfig) && Intrinsics.LJFF(this.ttpRegion, settingsModel.ttpRegion) && Intrinsics.LJFF(this.strictModeConfigs, settingsModel.strictModeConfigs) && Intrinsics.LJFF(this.apiWhiteList, settingsModel.apiWhiteList) && Intrinsics.LJFF(this.featureRegisterConfig, settingsModel.featureRegisterConfig);
    }

    public SettingsModel(String str, String str2, boolean z, boolean z2, boolean z3, long j, long j2, List<Object> list, List<String> list2, List<FrequencyConfig> list3, List<String> list4, SampleRateConfig sampleRateConfig, long j3, BinderConfig binderConfig, List<Object> list5, List<Integer> list6, Set<Integer> set, List<String> list7, CrpConfig crpConfig, boolean z4, CustomAnchorConfig customAnchorConfig, String str3, Set<String> set2, n nVar, Set<String> set3, NetworkConfig networkConfig, StorageConfig storageConfig, SignalConfig signalConfig, Set<String> set4, Map<String, StrictModeConfig> map, List<String> list8, h hVar) {
        this.version = str;
        this.abTag = str2;
        this.enabled = z;
        this.alogEnabled = z2;
        this.permissionCheck = z3;
        this.alogDuration = j;
        this.apiTimeOutDuration = j2;
        this.anchorConfigs = list;
        this.testEnvChannels = list2;
        this.frequencyConfigs = list3;
        this.interestedAppOps = list4;
        this.sampleRateConfig = sampleRateConfig;
        this.backgroundFreezeDuration = j3;
        this.binderConfig = binderConfig;
        this.apiStatisticsConfigs = list5;
        this.interceptIgnoreApiIds = list6;
        this.ignoreApiIds = set;
        this.ignoreClasses = list7;
        this.crpConfig = crpConfig;
        this.appOpsIgnoreKnownApi = z4;
        this.customAnchor = customAnchorConfig;
        this.engineType = str3;
        this.errorWarningTypes = set2;
        this.cacheConfig = nVar;
        this.checkAppScenes = set3;
        this.networkConfig = networkConfig;
        this.storageConfig = storageConfig;
        this.signalConfig = signalConfig;
        this.ttpRegion = set4;
        this.strictModeConfigs = map;
        this.apiWhiteList = list8;
        this.featureRegisterConfig = hVar;
    }

    public SettingsModel(String str, String str2, boolean z, boolean z2, boolean z3, long j, long j2, List list, List list2, List list3, List list4, SampleRateConfig sampleRateConfig, long j3, BinderConfig binderConfig, List list5, List list6, Set set, List list7, CrpConfig crpConfig, boolean z4, CustomAnchorConfig customAnchorConfig, String str3, Set set2, n nVar, Set set3, NetworkConfig networkConfig, StorageConfig storageConfig, SignalConfig signalConfig, Set set4, Map map, List list8, h hVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "default" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? TimeUnit.HOURS.toMillis(2L) : j, (i & 64) != 0 ? TimeUnit.SECONDS.toMillis(6L) : j2, (i & 128) != 0 ? C13BV.INSTANCE : list, (i & 256) != 0 ? C1697810uHb.LJIIJJI("snpqa_permission_test", "tools_autotest", "local_test", "autotest", "monkey", "qtp") : list2, (i & 512) != 0 ? C13BV.INSTANCE : list3, (i & 1024) != 0 ? C13BV.INSTANCE : list4, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new SampleRateConfig(false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 2047, null) : sampleRateConfig, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? TimeUnit.SECONDS.toMillis(2L) : j3, (i & 8192) != 0 ? new BinderConfig(false, null, null, null, 15, null) : binderConfig, (i & 16384) != 0 ? C13BV.INSTANCE : list5, (32768 & i) != 0 ? C13BV.INSTANCE : list6, (65536 & i) != 0 ? C08CX.INSTANCE : set, (131072 & i) != 0 ? C13BV.INSTANCE : list7, (262144 & i) != 0 ? new CrpConfig(100L, 50L) : crpConfig, (524288 & i) != 0 ? false : z4, (1048576 & i) != 0 ? new CustomAnchorConfig(true, 2000L, new String[0]) : customAnchorConfig, (2097152 & i) != 0 ? "rule_engine" : str3, (4194304 & i) != 0 ? C093Y.LJ("pair_not_close", "pair_delay_close", "CustomAnchor", "no_permission") : set2, (8388608 & i) != 0 ? new n() : nVar, (16777216 & i) != 0 ? new LinkedHashSet() : set3, (33554432 & i) != 0 ? new NetworkConfig(false, false, 0L, 0L, null, null, null, null, null, 0L, 0L, 0.0d, null, null, null, 0.0d, false, false, 0.0d, null, null, null, null, null, null, null, null, 0L, 0, false, null, null, false, null, false, false, false, false, false, 0.0d, null, null, false, -1, 2047, null) : networkConfig, (67108864 & i) != 0 ? new StorageConfig(1.0d, 1, 100, false, new StorageInterceptConfig(false, false, null, null), new String[0]) : storageConfig, (134217728 & i) != 0 ? new SignalConfig(false, 0, null, false, null, null, false, 127, null) : signalConfig, (268435456 & i) != 0 ? C13LQ.LJLIIL(new String[]{"us", "as", "gu", "mp", "pr", "vi", "um"}) : set4, (536870912 & i) != 0 ? C2097908Jt.LIZJ(new Pair("kids_mode_overseas_scene", new StrictModeConfig(C1697810uHb.LJIIJJI(102003, 102004, 103000), null, 2, null))) : map, (1073741824 & i) != 0 ? C13BV.INSTANCE : list8, (i & Integer.MIN_VALUE) != 0 ? new h() : hVar);
    }
}
