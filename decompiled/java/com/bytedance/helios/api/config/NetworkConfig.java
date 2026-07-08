package com.bytedance.helios.api.config;

import X.C093Y;
import X.C09CT;
import X.C13BV;
import X.C13LQ;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C2097908Jt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.n;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkConfig {

    @C09CT("add_pba_header")
    public boolean addPbaHeader;

    @C09CT("after_delay_interval")
    public final long afterDelayInterval;

    @C09CT("ag_control_config")
    public AgControlConfig agControlConfig;

    @C09CT("allow_api_sample_rate")
    public final double allowApiSampleRate;

    @C09CT("allow_network_api_configs")
    public final CopyOnWriteArrayList<AllowNetworkApiConfig> allowNetworkApiConfigs;

    @C09CT("allow_network_apm_configs")
    public final List<AllowNetworkApmConfig> allowNetworkApmConfigs;

    @C09CT("allow_network_id_configs")
    public final List<AllowNetworkIdConfig> allowNetworkIdConfigs;

    @C09CT("attribution_inventory_config")
    public final InventoryConfig attributionInventoryConfig;

    @C09CT("auto_isolate_for_1st_cdn")
    public boolean autoIsolateFor1stCDN;

    @C09CT("auto_isolate_for_3rd")
    public boolean autoIsolateFor3rd;

    @C09CT("auto_isolate_for_all_3rd")
    public boolean autoIsolateForAll3rd;

    @C09CT("auto_skip_api_configs")
    public final Map<Integer, AutoSkipApiConfig> autoSkipApiConfigs;

    @C09CT("before_delay_interval")
    public final long beforeDelayInterval;

    @C09CT("block_network_api_configs")
    public final List<AllowNetworkApiConfig> blockNetworkApiConfigs;

    @C09CT("block_network_apm_configs")
    public final List<AllowNetworkApmConfig> blockNetworkApmConfigs;

    @C09CT("body_delay_interval")
    public final long bodyDelayInterval;

    @C09CT("cache_flush_period")
    public final long cacheFlushPeriod;

    @C09CT("cache_size")
    public final int cacheSize;

    @C09CT("cdn_domain_list")
    public final Set<String> cdnDomainList;

    @C09CT("cdn_path_list")
    public final Set<String> cdnPathList;

    @C09CT("cost_time_sample_rate")
    public final double costTimeSampleRate;

    @C09CT("data_config")
    public final NetworkDataConfig dataConfig;

    @C09CT("dfid_checker_config")
    public final DFIDCheckerConfig dfidCheckerConfig;

    @C09CT("enable_fuse_engine_control")
    public final boolean enableFuseEngineControl;

    @C09CT("enable_guard_engine_control")
    public final boolean enableGuardEngineControl;

    @C09CT("enable_native_request_interceptor_modify_query")
    public final boolean enableNativeRequestInterceptorModifyQuery;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("interceptor_check_sample")
    public double interceptorCheckSample;

    @C09CT("inventory_config")
    public final InventoryConfig inventoryConfig;

    @C09CT("jsb_recognition_enable")
    public boolean jsbRecognitionEnable;

    @C09CT("native_interceptor_config")
    public final NativeInterceptorConfig nativeInterceptorConfig;

    @C09CT("network_traffic_data_type_configs")
    public final n netWorkTrafficDataTypeConfigs;

    @C09CT("network_backtrace_sample_rate")
    public final double networkBacktraceSampleRate;

    @C09CT("pair_cache_interval")
    public final long pairCacheInterval;

    @C09CT("parse_body")
    public final boolean parseBody;

    @C09CT("report_block_list")
    public final List<String> reportBlockList;

    @C09CT("report_when_only_memory_cache")
    public final boolean reportWhenOnlyMemoryCache;

    @C09CT("shutdown_config")
    public final ShutdownConfig shutdownConfig;

    @C09CT("stack_config")
    public final StackConfig stackConfig;

    @C09CT("strategy_samples")
    public final Map<String, StrategySample> strategySamples;

    @C09CT("third_party_sdk_call_site")
    public final Set<String> thirdPartySDKCallSite;

    @C09CT("upload_backtrace_url")
    public final UploadBacktraceConfig uploadBacktraceUrl;

    @C09CT("use_domain_if_tnc_empty")
    public boolean useDomainIfTncEmpty;

    public NetworkConfig() {
        this(false, false, 0L, 0L, null, null, null, null, null, 0L, 0L, 0.0d, null, null, null, 0.0d, false, false, 0.0d, null, null, null, null, null, null, null, null, 0L, 0, false, null, null, false, null, false, false, false, false, false, 0.0d, null, null, false, -1, 2047, null);
    }

    public NetworkConfig(boolean z, boolean z2, long j, long j2, List<AllowNetworkIdConfig> list, CopyOnWriteArrayList<AllowNetworkApiConfig> copyOnWriteArrayList, List<AllowNetworkApiConfig> list2, List<AllowNetworkApmConfig> list3, List<AllowNetworkApmConfig> list4, long j3, long j4, double d, List<String> list5, Map<Integer, AutoSkipApiConfig> map, UploadBacktraceConfig uploadBacktraceConfig, double d2, boolean z3, boolean z4, double d3, StackConfig stackConfig, ShutdownConfig shutdownConfig, DFIDCheckerConfig dFIDCheckerConfig, InventoryConfig inventoryConfig, InventoryConfig inventoryConfig2, NetworkDataConfig networkDataConfig, NativeInterceptorConfig nativeInterceptorConfig, Map<String, StrategySample> map2, long j5, int i, boolean z5, n nVar, Set<String> set, boolean z6, AgControlConfig agControlConfig, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, double d4, Set<String> set2, Set<String> set3, boolean z12) {
        this.enabled = z;
        this.parseBody = z2;
        this.beforeDelayInterval = j;
        this.afterDelayInterval = j2;
        this.allowNetworkIdConfigs = list;
        this.allowNetworkApiConfigs = copyOnWriteArrayList;
        this.blockNetworkApiConfigs = list2;
        this.allowNetworkApmConfigs = list3;
        this.blockNetworkApmConfigs = list4;
        this.pairCacheInterval = j3;
        this.bodyDelayInterval = j4;
        this.costTimeSampleRate = d;
        this.reportBlockList = list5;
        this.autoSkipApiConfigs = map;
        this.uploadBacktraceUrl = uploadBacktraceConfig;
        this.networkBacktraceSampleRate = d2;
        this.enableFuseEngineControl = z3;
        this.enableGuardEngineControl = z4;
        this.allowApiSampleRate = d3;
        this.stackConfig = stackConfig;
        this.shutdownConfig = shutdownConfig;
        this.dfidCheckerConfig = dFIDCheckerConfig;
        this.inventoryConfig = inventoryConfig;
        this.attributionInventoryConfig = inventoryConfig2;
        this.dataConfig = networkDataConfig;
        this.nativeInterceptorConfig = nativeInterceptorConfig;
        this.strategySamples = map2;
        this.cacheFlushPeriod = j5;
        this.cacheSize = i;
        this.reportWhenOnlyMemoryCache = z5;
        this.netWorkTrafficDataTypeConfigs = nVar;
        this.thirdPartySDKCallSite = set;
        this.jsbRecognitionEnable = z6;
        this.agControlConfig = agControlConfig;
        this.useDomainIfTncEmpty = z7;
        this.addPbaHeader = z8;
        this.autoIsolateFor3rd = z9;
        this.autoIsolateForAll3rd = z10;
        this.autoIsolateFor1stCDN = z11;
        this.interceptorCheckSample = d4;
        this.cdnDomainList = set2;
        this.cdnPathList = set3;
        this.enableNativeRequestInterceptorModifyQuery = z12;
    }

    public NetworkConfig(boolean z, boolean z2, long j, long j2, List list, CopyOnWriteArrayList copyOnWriteArrayList, List list2, List list3, List list4, long j3, long j4, double d, List list5, Map map, UploadBacktraceConfig uploadBacktraceConfig, double d2, boolean z3, boolean z4, double d3, StackConfig stackConfig, ShutdownConfig shutdownConfig, DFIDCheckerConfig dFIDCheckerConfig, InventoryConfig inventoryConfig, InventoryConfig inventoryConfig2, NetworkDataConfig networkDataConfig, NativeInterceptorConfig nativeInterceptorConfig, Map map2, long j5, int i, boolean z5, n nVar, Set set, boolean z6, AgControlConfig agControlConfig, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, double d4, Set set2, Set set3, boolean z12, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 0L : j, (i2 & 8) == 0 ? j2 : 0L, (i2 & 16) != 0 ? Collections.singletonList(new AllowNetworkIdConfig(C13LQ.LJLIIL(new Integer[]{400401, 400402, 400500, 400501, 400600}), "before")) : list, (i2 & 32) != 0 ? new CopyOnWriteArrayList(new AllowNetworkApiConfig[]{new AllowNetworkApiConfig(null, C13LQ.LJLIIL(new String[]{"/api/checkLogSensitiveWords/", "/service/2/app_log_test/", "/service/2/app_log/", "/monitor/collect/batch/", "/monitor/collect/c/logcollect", "/monitor/collect/c/exception", "/monitor/collect/c/code_coverage", "/tfe/api/request_combine/v1/", "/tiktok/v1/kids/settings/", "/external/nvwa/start_consume", "/external/nvwa/upload_event", "/common"}), null, 5, null)}) : copyOnWriteArrayList, (i2 & 64) != 0 ? C13BV.INSTANCE : list2, (i2 & 128) != 0 ? Collections.singletonList(new AllowNetworkApmConfig(null, C13LQ.LJLIIL(new String[]{"pns_network", "api_all", "sky_eye_apm_log"}), null, 5, null)) : list3, (i2 & 256) != 0 ? C13BV.INSTANCE : list4, (i2 & 512) != 0 ? 1000L : j3, (i2 & 1024) != 0 ? 500L : j4, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 1.0E-4d : d, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C1697810uHb.LJIIJJI("url", "content", "call_time", "json_body", "content_type", "content_sub_type", "res_content", "res_header_keys", "res_content_type", "res_content_sub_type", "map_content", "json_object_content", "redirect_headers_keys", "redirect_res_headers_keys") : list5, (i2 & 8192) != 0 ? C2097608Jq.LJ() : map, (i2 & 16384) != 0 ? new UploadBacktraceConfig(null, null, 3, null) : uploadBacktraceConfig, (32768 & i2) != 0 ? 1.0d : d2, (65536 & i2) != 0 ? true : z3, (131072 & i2) != 0 ? true : z4, (262144 & i2) != 0 ? 0.1d : d3, (524288 & i2) != 0 ? new StackConfig(false, null, null, null, 15, null) : stackConfig, (1048576 & i2) != 0 ? null : shutdownConfig, (2097152 & i2) != 0 ? new DFIDCheckerConfig(false, 0.001d, 0.01d) : dFIDCheckerConfig, (4194304 & i2) != 0 ? new InventoryConfig(true, 0.001d, 0.0d, 1.0d, 1.0d, 0.0d, 1.0d, new NetworkCondition(null, null, null, 7, null)) : inventoryConfig, (8388608 & i2) != 0 ? new InventoryConfig(true, 0.001d, 0.0d, 1.0d, 1.0d, 0.0d, 1.0d, new NetworkCondition(null, null, null, 7, null)) : inventoryConfig2, (16777216 & i2) != 0 ? new NetworkDataConfig(false, null, null, null, 15, null) : networkDataConfig, (33554432 & i2) != 0 ? new NativeInterceptorConfig(true) : nativeInterceptorConfig, (67108864 & i2) != 0 ? C2097908Jt.LIZJ(new Pair("2011", new StrategySample(0.001d, C2097608Jq.LJ()))) : map2, (134217728 & i2) != 0 ? 60000L : j5, (268435456 & i2) != 0 ? 50000 : i, (536870912 & i2) != 0 ? false : z5, (1073741824 & i2) != 0 ? new n() : nVar, (i2 & Integer.MIN_VALUE) != 0 ? C093Y.LJ("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz1cEJOnFpNPfGz/D+qAVxNrfF00hvBxNex", "dzBzEgU1UM3QUBkgSxaWaaw9Bz50+GPobFdFnURDI6vGJGz7JkgqDVSdRUutPmGhNVjxSSrxjJ0=", "dzBzEgU1UM3QUBknTACBZOH3RnJ6T9ERrFzoh0B1wbceS2TXdPS/RhexHlCppnnIug6KBnMSHgrjpzOqqjeaBqfPJAbyYXRXA54=", "dzBzEgU1UM3QUBknTACBZOH3RnJ+RNEWrFftiFMy57TrcxjXa4qK1mGcYw==", "dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzxf0ZYwFlDNbpqzPOQ0GIxf0PPUDFqtbd8Yw==", "dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz9ekUFh1BJP6s0fCcTZvdzkKU=", "dzBzEgU1UM3QUBkgVRvKZW8qUDqMD2Q9p0gMTpnQqZl/PLCkJfcQqRtCoJQa9gcyCatszxQd0+xe0t0=", "dzBzEgU1UM3QUBksRAKXKFCwkAhtNPrPALQCuW5eQQHFvtJ5GzUFxtzgOL8=", "dzBzEgU1UM3QUBkgVRvKZW8qUDqMD2Q9p0gMTpnQqZl/PLCkJfcQqRtCoJQa9gcyCatszxQd0+xe0t0=", "dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz9a0JDwFVcOPHkJnRLuRy+92M1tOuHW/snlVnd", "dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bFsZeleyw==", "dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bNsZ+leyw==", "dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bBse+leyw==", "dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bdsfeleyw==", "dzBzEgQ7XM/eWlgqCzWWZ1GF44pku4/l+Q2VhJndovgCm+g=", "dzBzEgQ7XM/eWlgqCxOUdp/2nWxWKpBsAL11az6oBIc+48SITcxoYNy7nO2O+uES", "dzBzEgQ7XM/eWlgqCxuKcsSh7EXilqCc7nS0JW+Si2ZMJVQ5lhQJE89mlS2xNkM=", "dzBzEgQ7XM/eWlgqCxuKcsSh7EXilpqU7GajCHScy0X7fub3fQ==", "ejpqEg0qWsTVURkgVQKFcwd7GtRoEQ7sEu04+AgE5Y3POBl3zuRi81Zc9cQLr6suef1FtQ/MP+0=", "dzBzEhYtVt7IUEVvVhaPKAArG0PT8fhr3T9X5m9T3jOezltFRHulFLKxwRLrkwt612DyDkH9F2Q8rS5gHwv+Nw==", "dzBzEhYtVt7IUEVvVhaPKAArG0PT8fhr3T9X5m9T3jOezltFRHukELOyxk7P/DFlYIYWSqoMO0s=", "dzBzEhYtVt7IUEVvVhaPKAArG0PT8fhr3T9X5m9T3jOezltFRHu4ErSvzAWu7idjgRE5Gp2oNzM4jgbRbo8=", "YCtuUwA8StnfVEMkQVycNA==", "dzBzEhQxEcvMXBkyQRnKUFS27YXXknfGtyXBjzlD7g==", "dzBzEgk7VMvTG0QlTlyKYz0ujQxtyd0zaxVM/TS+iIM=") : set, (i3 & 1) != 0 ? false : z6, (i3 & 2) != 0 ? new AgControlConfig(false, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, 65535, null) : agControlConfig, (i3 & 4) != 0 ? false : z7, (i3 & 8) != 0 ? true : z8, (i3 & 16) != 0 ? false : z9, (i3 & 32) != 0 ? false : z10, (i3 & 64) != 0 ? false : z11, (i3 & 128) == 0 ? d4 : 0.1d, (i3 & 256) != 0 ? C13LQ.LJLIIL(new String[]{"tiktokcdn-us.com", "tiktokcdn.com", "tiktokcdn-eu.com", "image-va.tiktokv.com", "image-sg.tiktokv.com", "image.tiktokv.us", "ibytedtos.com"}) : set2, (i3 & 512) != 0 ? Collections.singleton("/tos-") : set3, (i3 & 1024) != 0 ? true : z12);
    }
}
