package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class SampleRateConfig {

    @C09CT("api_high_priority_configs")
    public final List<ApiSampleRateConfig> apiHighPriorityConfigs;

    @C09CT("default_low_priority_config")
    public final DefaultSampleRateConfig defaultLowPriorityConfig;

    @C09CT("local_apm_config")
    public final double localAPMConfig;

    @C09CT("resource_medium_priority_configs")
    public final List<ResourceSampleRateConfig> resourceMediumPriorityConfigs;

    public SampleRateConfig() {
        this(0.0d, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SampleRateConfig)) {
            return false;
        }
        SampleRateConfig sampleRateConfig = (SampleRateConfig) obj;
        return Double.compare(this.localAPMConfig, sampleRateConfig.localAPMConfig) == 0 && Intrinsics.LJFF(this.defaultLowPriorityConfig, sampleRateConfig.defaultLowPriorityConfig) && Intrinsics.LJFF(this.resourceMediumPriorityConfigs, sampleRateConfig.resourceMediumPriorityConfigs) && Intrinsics.LJFF(this.apiHighPriorityConfigs, sampleRateConfig.apiHighPriorityConfigs);
    }

    public final int hashCode() {
        return (((((C786410Ut5.X2(this.localAPMConfig) * 31) + this.defaultLowPriorityConfig.hashCode()) * 31) + this.resourceMediumPriorityConfigs.hashCode()) * 31) + this.apiHighPriorityConfigs.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SampleRateConfig(localAPMConfig=");
        sbLIZ.append(this.localAPMConfig);
        sbLIZ.append(", defaultLowPriorityConfig=");
        sbLIZ.append(this.defaultLowPriorityConfig);
        sbLIZ.append(", resourceMediumPriorityConfigs=");
        sbLIZ.append(this.resourceMediumPriorityConfigs);
        sbLIZ.append(", apiHighPriorityConfigs=");
        sbLIZ.append(this.apiHighPriorityConfigs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SampleRateConfig(double d, DefaultSampleRateConfig defaultSampleRateConfig, List<ResourceSampleRateConfig> list, List<ApiSampleRateConfig> list2) {
        this.localAPMConfig = d;
        this.defaultLowPriorityConfig = defaultSampleRateConfig;
        this.resourceMediumPriorityConfigs = list;
        this.apiHighPriorityConfigs = list2;
    }

    public SampleRateConfig(double d, DefaultSampleRateConfig defaultSampleRateConfig, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0E-4d : d, (i & 2) != 0 ? new DefaultSampleRateConfig(0.0d, 0.01d, 1.0d, 1.0d) : defaultSampleRateConfig, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2);
    }
}
