package com.bytedance.helios.network.api.config;

import X.C08CX;
import X.C09CT;
import X.C13BV;
import X.C13LQ;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.n;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

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
    public final List<AllowNetworkApiConfig> allowNetworkApiConfigs;

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

    @C09CT("parse_body")
    public final boolean parseBody;

    @C09CT("report_block_list")
    public final List<String> reportBlockList;

    @C09CT("shutdown_config")
    public final ShutdownConfig shutdownConfig;

    @C09CT("stack_config")
    public final StackConfig stackConfig;

    @C09CT("third_party_sdk_call_site")
    public final Set<String> thirdPartySDKCallSite;

    @C09CT("upload_backtrace_url")
    public final UploadBacktraceConfig uploadBacktraceUrl;

    @C09CT("use_domain_if_tnc_empty")
    public boolean useDomainIfTncEmpty;

    public NetworkConfig() {
        this(false, false, 0L, 0L, null, null, null, null, null, 0L, 0.0d, null, null, null, 0.0d, false, false, 0.0d, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, 0.0d, null, null, false, -1, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkConfig)) {
            return false;
        }
        NetworkConfig networkConfig = (NetworkConfig) obj;
        return this.enabled == networkConfig.enabled && this.parseBody == networkConfig.parseBody && this.beforeDelayInterval == networkConfig.beforeDelayInterval && this.afterDelayInterval == networkConfig.afterDelayInterval && Intrinsics.LJFF(this.allowNetworkIdConfigs, networkConfig.allowNetworkIdConfigs) && Intrinsics.LJFF(this.allowNetworkApiConfigs, networkConfig.allowNetworkApiConfigs) && Intrinsics.LJFF(this.blockNetworkApiConfigs, networkConfig.blockNetworkApiConfigs) && Intrinsics.LJFF(this.allowNetworkApmConfigs, networkConfig.allowNetworkApmConfigs) && Intrinsics.LJFF(this.blockNetworkApmConfigs, networkConfig.blockNetworkApmConfigs) && this.bodyDelayInterval == networkConfig.bodyDelayInterval && Double.compare(this.costTimeSampleRate, networkConfig.costTimeSampleRate) == 0 && Intrinsics.LJFF(this.reportBlockList, networkConfig.reportBlockList) && Intrinsics.LJFF(this.autoSkipApiConfigs, networkConfig.autoSkipApiConfigs) && Intrinsics.LJFF(this.uploadBacktraceUrl, networkConfig.uploadBacktraceUrl) && Double.compare(this.networkBacktraceSampleRate, networkConfig.networkBacktraceSampleRate) == 0 && this.enableFuseEngineControl == networkConfig.enableFuseEngineControl && this.enableGuardEngineControl == networkConfig.enableGuardEngineControl && Double.compare(this.allowApiSampleRate, networkConfig.allowApiSampleRate) == 0 && Intrinsics.LJFF(this.stackConfig, networkConfig.stackConfig) && Intrinsics.LJFF(this.shutdownConfig, networkConfig.shutdownConfig) && Intrinsics.LJFF(this.dfidCheckerConfig, networkConfig.dfidCheckerConfig) && Intrinsics.LJFF(this.inventoryConfig, networkConfig.inventoryConfig) && Intrinsics.LJFF(this.attributionInventoryConfig, networkConfig.attributionInventoryConfig) && Intrinsics.LJFF(this.dataConfig, networkConfig.dataConfig) && Intrinsics.LJFF(this.nativeInterceptorConfig, networkConfig.nativeInterceptorConfig) && Intrinsics.LJFF(this.netWorkTrafficDataTypeConfigs, networkConfig.netWorkTrafficDataTypeConfigs) && Intrinsics.LJFF(this.thirdPartySDKCallSite, networkConfig.thirdPartySDKCallSite) && this.jsbRecognitionEnable == networkConfig.jsbRecognitionEnable && Intrinsics.LJFF(this.agControlConfig, networkConfig.agControlConfig) && this.useDomainIfTncEmpty == networkConfig.useDomainIfTncEmpty && this.addPbaHeader == networkConfig.addPbaHeader && this.autoIsolateFor3rd == networkConfig.autoIsolateFor3rd && this.autoIsolateForAll3rd == networkConfig.autoIsolateForAll3rd && this.autoIsolateFor1stCDN == networkConfig.autoIsolateFor1stCDN && Double.compare(this.interceptorCheckSample, networkConfig.interceptorCheckSample) == 0 && Intrinsics.LJFF(this.cdnDomainList, networkConfig.cdnDomainList) && Intrinsics.LJFF(this.cdnPathList, networkConfig.cdnPathList) && this.enableNativeRequestInterceptorModifyQuery == networkConfig.enableNativeRequestInterceptorModifyQuery;
    }

    public final String toString() {
        return "NetworkConfig(enabled=" + this.enabled + ", parseBody=" + this.parseBody + ", beforeDelayInterval=" + this.beforeDelayInterval + ", afterDelayInterval=" + this.afterDelayInterval + ", allowNetworkIdConfigs=" + this.allowNetworkIdConfigs + ", allowNetworkApiConfigs=" + this.allowNetworkApiConfigs + ", blockNetworkApiConfigs=" + this.blockNetworkApiConfigs + ", allowNetworkApmConfigs=" + this.allowNetworkApmConfigs + ", blockNetworkApmConfigs=" + this.blockNetworkApmConfigs + ", bodyDelayInterval=" + this.bodyDelayInterval + ", costTimeSampleRate=" + this.costTimeSampleRate + ", reportBlockList=" + this.reportBlockList + ", autoSkipApiConfigs=" + this.autoSkipApiConfigs + ", uploadBacktraceUrl=" + this.uploadBacktraceUrl + ", networkBacktraceSampleRate=" + this.networkBacktraceSampleRate + ", enableFuseEngineControl=" + this.enableFuseEngineControl + ", enableGuardEngineControl=" + this.enableGuardEngineControl + ", allowApiSampleRate=" + this.allowApiSampleRate + ", stackConfig=" + this.stackConfig + ", shutdownConfig=" + this.shutdownConfig + ", dfidCheckerConfig=" + this.dfidCheckerConfig + ", inventoryConfig=" + this.inventoryConfig + ", attributionInventoryConfig=" + this.attributionInventoryConfig + ", dataConfig=" + this.dataConfig + ", nativeInterceptorConfig=" + this.nativeInterceptorConfig + ", netWorkTrafficDataTypeConfigs=" + this.netWorkTrafficDataTypeConfigs + ", thirdPartySDKCallSite=" + this.thirdPartySDKCallSite + ", jsbRecognitionEnable=" + this.jsbRecognitionEnable + ", agControlConfig=" + this.agControlConfig + ", useDomainIfTncEmpty=" + this.useDomainIfTncEmpty + ", addPbaHeader=" + this.addPbaHeader + ", autoIsolateFor3rd=" + this.autoIsolateFor3rd + ", autoIsolateForAll3rd=" + this.autoIsolateForAll3rd + ", autoIsolateFor1stCDN=" + this.autoIsolateFor1stCDN + ", interceptorCheckSample=" + this.interceptorCheckSample + ", cdnDomainList=" + this.cdnDomainList + ", cdnPathList=" + this.cdnPathList + ", enableNativeRequestInterceptorModifyQuery=" + this.enableNativeRequestInterceptorModifyQuery + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r0v51, types: [int] */
    /* JADX WARN: Type inference failed for: r0v57, types: [int] */
    /* JADX WARN: Type inference failed for: r0v61, types: [int] */
    /* JADX WARN: Type inference failed for: r0v63, types: [int] */
    /* JADX WARN: Type inference failed for: r0v65, types: [int] */
    /* JADX WARN: Type inference failed for: r0v67, types: [int] */
    /* JADX WARN: Type inference failed for: r0v69, types: [int] */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    public final int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.parseBody;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int iY2 = (((((((((((((((((((((((((((i + r02) * 31) + C786410Ut5.Y2(this.beforeDelayInterval)) * 31) + C786410Ut5.Y2(this.afterDelayInterval)) * 31) + this.allowNetworkIdConfigs.hashCode()) * 31) + this.allowNetworkApiConfigs.hashCode()) * 31) + this.blockNetworkApiConfigs.hashCode()) * 31) + this.allowNetworkApmConfigs.hashCode()) * 31) + this.blockNetworkApmConfigs.hashCode()) * 31) + C786410Ut5.Y2(this.bodyDelayInterval)) * 31) + C786410Ut5.X2(this.costTimeSampleRate)) * 31) + this.reportBlockList.hashCode()) * 31) + this.autoSkipApiConfigs.hashCode()) * 31) + this.uploadBacktraceUrl.hashCode()) * 31) + C786410Ut5.X2(this.networkBacktraceSampleRate)) * 31;
        boolean z3 = this.enableFuseEngineControl;
        ?? r03 = z3;
        if (z3) {
            r03 = 1;
        }
        int i2 = (iY2 + r03) * 31;
        boolean z4 = this.enableGuardEngineControl;
        ?? r04 = z4;
        if (z4) {
            r04 = 1;
        }
        int iX2 = (((((i2 + r04) * 31) + C786410Ut5.X2(this.allowApiSampleRate)) * 31) + this.stackConfig.hashCode()) * 31;
        ShutdownConfig shutdownConfig = this.shutdownConfig;
        int iHashCode = (((((((((iX2 + (shutdownConfig == null ? 0 : shutdownConfig.hashCode())) * 31) + this.dfidCheckerConfig.hashCode()) * 31) + this.inventoryConfig.hashCode()) * 31) + this.attributionInventoryConfig.hashCode()) * 31) + this.dataConfig.hashCode()) * 31;
        boolean z5 = this.nativeInterceptorConfig.enabled;
        ?? r05 = z5;
        if (z5) {
            r05 = 1;
        }
        int iHashCode2 = (((((iHashCode + r05) * 31) + this.netWorkTrafficDataTypeConfigs.hashCode()) * 31) + this.thirdPartySDKCallSite.hashCode()) * 31;
        boolean z6 = this.jsbRecognitionEnable;
        ?? r06 = z6;
        if (z6) {
            r06 = 1;
        }
        int iHashCode3 = (((iHashCode2 + r06) * 31) + this.agControlConfig.hashCode()) * 31;
        boolean z7 = this.useDomainIfTncEmpty;
        ?? r07 = z7;
        if (z7) {
            r07 = 1;
        }
        int i3 = (iHashCode3 + r07) * 31;
        boolean z8 = this.addPbaHeader;
        ?? r08 = z8;
        if (z8) {
            r08 = 1;
        }
        int i4 = (i3 + r08) * 31;
        boolean z9 = this.autoIsolateFor3rd;
        ?? r09 = z9;
        if (z9) {
            r09 = 1;
        }
        int i5 = (i4 + r09) * 31;
        boolean z10 = this.autoIsolateForAll3rd;
        ?? r010 = z10;
        if (z10) {
            r010 = 1;
        }
        int i6 = (i5 + r010) * 31;
        boolean z11 = this.autoIsolateFor1stCDN;
        ?? r011 = z11;
        if (z11) {
            r011 = 1;
        }
        return ((((((((i6 + r011) * 31) + C786410Ut5.X2(this.interceptorCheckSample)) * 31) + this.cdnDomainList.hashCode()) * 31) + this.cdnPathList.hashCode()) * 31) + (this.enableNativeRequestInterceptorModifyQuery ? 1 : 0);
    }

    public NetworkConfig(boolean z, boolean z2, long j, long j2, List<AllowNetworkIdConfig> list, List<AllowNetworkApiConfig> list2, List<AllowNetworkApiConfig> list3, List<AllowNetworkApmConfig> list4, List<AllowNetworkApmConfig> list5, long j3, double d, List<String> list6, Map<Integer, AutoSkipApiConfig> map, UploadBacktraceConfig uploadBacktraceConfig, double d2, boolean z3, boolean z4, double d3, StackConfig stackConfig, ShutdownConfig shutdownConfig, DFIDCheckerConfig dFIDCheckerConfig, InventoryConfig inventoryConfig, InventoryConfig inventoryConfig2, NetworkDataConfig networkDataConfig, NativeInterceptorConfig nativeInterceptorConfig, n nVar, Set<String> set, boolean z5, AgControlConfig agControlConfig, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, double d4, Set<String> set2, Set<String> set3, boolean z11) {
        this.enabled = z;
        this.parseBody = z2;
        this.beforeDelayInterval = j;
        this.afterDelayInterval = j2;
        this.allowNetworkIdConfigs = list;
        this.allowNetworkApiConfigs = list2;
        this.blockNetworkApiConfigs = list3;
        this.allowNetworkApmConfigs = list4;
        this.blockNetworkApmConfigs = list5;
        this.bodyDelayInterval = j3;
        this.costTimeSampleRate = d;
        this.reportBlockList = list6;
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
        this.netWorkTrafficDataTypeConfigs = nVar;
        this.thirdPartySDKCallSite = set;
        this.jsbRecognitionEnable = z5;
        this.agControlConfig = agControlConfig;
        this.useDomainIfTncEmpty = z6;
        this.addPbaHeader = z7;
        this.autoIsolateFor3rd = z8;
        this.autoIsolateForAll3rd = z9;
        this.autoIsolateFor1stCDN = z10;
        this.interceptorCheckSample = d4;
        this.cdnDomainList = set2;
        this.cdnPathList = set3;
        this.enableNativeRequestInterceptorModifyQuery = z11;
    }

    public NetworkConfig(boolean z, boolean z2, long j, long j2, List list, List list2, List list3, List list4, List list5, long j3, double d, List list6, Map map, UploadBacktraceConfig uploadBacktraceConfig, double d2, boolean z3, boolean z4, double d3, StackConfig stackConfig, ShutdownConfig shutdownConfig, DFIDCheckerConfig dFIDCheckerConfig, InventoryConfig inventoryConfig, InventoryConfig inventoryConfig2, NetworkDataConfig networkDataConfig, NativeInterceptorConfig nativeInterceptorConfig, n nVar, Set set, boolean z5, AgControlConfig agControlConfig, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, double d4, Set set2, Set set3, boolean z11, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z12;
        boolean z13;
        Set set4 = set2;
        boolean z14 = z8;
        boolean z15 = z6;
        AgControlConfig agControlConfig2 = agControlConfig;
        boolean z16 = z5;
        Set set5 = set;
        n nVar2 = nVar;
        NativeInterceptorConfig nativeInterceptorConfig2 = nativeInterceptorConfig;
        InventoryConfig inventoryConfig3 = inventoryConfig2;
        DFIDCheckerConfig dFIDCheckerConfig2 = dFIDCheckerConfig;
        boolean z17 = z4;
        boolean z18 = z3;
        InventoryConfig inventoryConfig4 = inventoryConfig;
        boolean z19 = z2;
        double d5 = d2;
        double d6 = d3;
        Set set6 = set3;
        UploadBacktraceConfig uploadBacktraceConfig2 = uploadBacktraceConfig;
        boolean z20 = z9;
        Map mapLJ = map;
        long j4 = j3;
        List list7 = list5;
        boolean z21 = z7;
        List listLJIIJJI = list6;
        List listSingletonList = list4;
        List list8 = list3;
        List listSingletonList2 = list2;
        double d7 = d;
        ShutdownConfig shutdownConfig2 = shutdownConfig;
        long j5 = j;
        NetworkDataConfig networkDataConfig2 = networkDataConfig;
        List listSingletonList3 = list;
        StackConfig stackConfig2 = stackConfig;
        boolean z22 = (i & 1) != 0 ? false : z;
        z19 = (i & 2) != 0 ? false : z19;
        j5 = (i & 4) != 0 ? 0L : j5;
        long j6 = (i & 8) == 0 ? j2 : 0L;
        listSingletonList3 = (i & 16) != 0 ? Collections.singletonList(new AllowNetworkIdConfig(C13LQ.LJLIIL(new Integer[]{400401, 400402, 400500, 400501, 400600}), "before")) : listSingletonList3;
        listSingletonList2 = (i & 32) != 0 ? Collections.singletonList(new AllowNetworkApiConfig(null, C13LQ.LJLIIL(new String[]{"/api/checkLogSensitiveWords/", "/service/2/app_log_test/", "/service/2/app_log/", "/monitor/collect/batch/", "/monitor/collect/c/logcollect", "/monitor/collect/c/exception", "/common"}), null, 5, null)) : listSingletonList2;
        list8 = (i & 64) != 0 ? C13BV.INSTANCE : list8;
        listSingletonList = (i & 128) != 0 ? Collections.singletonList(new AllowNetworkApmConfig(null, C13LQ.LJLIIL(new String[]{"pns_network", "api_all", "sky_eye_apm_log"}), null, 5, null)) : listSingletonList;
        list7 = (i & 256) != 0 ? C13BV.INSTANCE : list7;
        j4 = (i & 512) != 0 ? 500L : j4;
        d7 = (i & 1024) != 0 ? 1.0E-4d : d7;
        listLJIIJJI = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C1697810uHb.LJIIJJI("url", "content", "call_time", "json_body", "content_type", "content_sub_type", "res_content", "res_header_keys", "res_content_type", "res_content_sub_type", "map_content", "json_object_content", "redirect_headers_keys", "redirect_res_headers_keys") : listLJIIJJI;
        mapLJ = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C2097608Jq.LJ() : mapLJ;
        uploadBacktraceConfig2 = (i & 8192) != 0 ? new UploadBacktraceConfig(null, null, 3, null) : uploadBacktraceConfig2;
        d5 = (i & 16384) != 0 ? 1.0d : d5;
        z18 = (32768 & i) != 0 ? true : z18;
        z17 = (65536 & i) != 0 ? true : z17;
        d6 = (131072 & i) != 0 ? 0.1d : d6;
        stackConfig2 = (262144 & i) != 0 ? new StackConfig(false, null, null, null, 15, null) : stackConfig2;
        shutdownConfig2 = (524288 & i) != 0 ? null : shutdownConfig2;
        dFIDCheckerConfig2 = (1048576 & i) != 0 ? new DFIDCheckerConfig(false, 0.001d, 0.01d) : dFIDCheckerConfig2;
        inventoryConfig4 = (2097152 & i) != 0 ? new InventoryConfig(true, 0.001d, 0.0d, 1.0d, 1.0d, 0.0d, 1.0d, new NetworkCondition(null, null, null, 7, null)) : inventoryConfig4;
        inventoryConfig3 = (4194304 & i) != 0 ? new InventoryConfig(true, 0.001d, 0.0d, 1.0d, 1.0d, 0.0d, 1.0d, new NetworkCondition(null, null, null, 7, null)) : inventoryConfig3;
        networkDataConfig2 = (8388608 & i) != 0 ? new NetworkDataConfig(false, null, null, null, 15, null) : networkDataConfig2;
        if ((16777216 & i) != 0) {
            z12 = true;
            z13 = false;
            nativeInterceptorConfig2 = new NativeInterceptorConfig(true);
        } else {
            z12 = true;
            z13 = false;
        }
        this(z22, z19, j5, j6, listSingletonList3, listSingletonList2, list8, listSingletonList, list7, j4, d7, listLJIIJJI, mapLJ, uploadBacktraceConfig2, d5, z18, z17, d6, stackConfig2, shutdownConfig2, dFIDCheckerConfig2, inventoryConfig4, inventoryConfig3, networkDataConfig2, nativeInterceptorConfig2, (33554432 & i) != 0 ? new n() : nVar2, (67108864 & i) != 0 ? C08CX.INSTANCE : set5, (134217728 & i) != 0 ? false : z16, (268435456 & i) != 0 ? new AgControlConfig(z13, z13, z13, null, z13, null, null, null, null, null, null, null, null, null, null, null, 65535, null) : agControlConfig2, (536870912 & i) != 0 ? false : z15, (1073741824 & i) != 0 ? true : z21, (i & Integer.MIN_VALUE) != 0 ? false : z14, (i2 & 1) != 0 ? false : z20, (i2 & 2) == 0 ? z10 : z13, (i2 & 4) == 0 ? d4 : 0.1d, (i2 & 8) != 0 ? C13LQ.LJLIIL(new String[]{"tiktokcdn-us.com", "tiktokcdn.com", "tiktokcdn-eu.com", "image-va.tiktokv.com", "image-sg.tiktokv.com", "image.tiktokv.us", "ibytedtos.com"}) : set4, (i2 & 16) != 0 ? Collections.singleton("/tos-") : set6, (i2 & 32) == 0 ? z11 : z12);
    }
}
