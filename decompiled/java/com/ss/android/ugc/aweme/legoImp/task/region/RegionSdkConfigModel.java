package com.ss.android.ugc.aweme.legoImp.task.region;

import X.C09CT;
import X.C13BV;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class RegionSdkConfigModel {

    @C09CT("check_physical_network_proxy")
    public final boolean checkPhysicalNetworkProxy;

    @C09CT("domain_proxy_check_list")
    public final List<String> domainProxyCheckList;

    @C09CT("downgrade_timeout_ms")
    public final long downgradeTimeoutMs;

    @C09CT("enable_gp_region")
    public final boolean enableGpRegion;

    @C09CT("enable_param_injection")
    public final boolean enableParamInjection;

    @C09CT("force_update_control_configs")
    public final boolean forceUpdateControlConfigs;

    @C09CT("network_retry_delayed_mills")
    public final long networkRetryDelayedMills;

    @C09CT("push_frequency_limit")
    public final PushFrequencyLimit pushFrequencyLimit;

    @C09CT("request_config_allowed_scenes")
    public final List<Integer> requestConfigAllowedScenes;

    @C09CT("upload_delayed_mills")
    public final long uploadDelayedMills;

    public RegionSdkConfigModel() {
        this(false, 0L, null, 0L, null, false, 0L, null, false, false, 1023, null);
    }

    public RegionSdkConfigModel(boolean z, long j, PushFrequencyLimit pushFrequencyLimit, long j2, List<Integer> list, boolean z2, long j3, List<String> list2, boolean z3, boolean z4) {
        this.enableParamInjection = z;
        this.uploadDelayedMills = j;
        this.pushFrequencyLimit = pushFrequencyLimit;
        this.networkRetryDelayedMills = j2;
        this.requestConfigAllowedScenes = list;
        this.forceUpdateControlConfigs = z2;
        this.downgradeTimeoutMs = j3;
        this.domainProxyCheckList = list2;
        this.checkPhysicalNetworkProxy = z3;
        this.enableGpRegion = z4;
    }

    public RegionSdkConfigModel(boolean z, long j, PushFrequencyLimit pushFrequencyLimit, long j2, List list, boolean z2, long j3, List list2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 3000L : j, (i & 4) != 0 ? new PushFrequencyLimit(10, TimeUnit.MINUTES.toMillis(5L)) : pushFrequencyLimit, (i & 8) != 0 ? TimeUnit.SECONDS.toMillis(5L) : j2, (i & 16) != 0 ? C13BV.INSTANCE : list, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? TimeUnit.SECONDS.toMillis(5L) : j3, (i & 128) != 0 ? C13BV.INSTANCE : list2, (i & 256) == 0 ? z3 : false, (i & 512) != 0 ? true : z4);
    }
}
