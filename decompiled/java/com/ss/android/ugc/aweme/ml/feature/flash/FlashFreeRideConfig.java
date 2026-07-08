package com.ss.android.ugc.aweme.ml.feature.flash;

import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FlashFreeRideConfig {
    public final FilterConfig filterConfig;
    public final List<FlashFreeRideFeatureConfig> flashFreeRideFeatureConfigs;
    public final FilterConfig notFilterConfig;
    public final String url;

    public FlashFreeRideConfig() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashFreeRideConfig)) {
            return false;
        }
        FlashFreeRideConfig flashFreeRideConfig = (FlashFreeRideConfig) obj;
        return Intrinsics.LJFF(this.url, flashFreeRideConfig.url) && Intrinsics.LJFF(this.filterConfig, flashFreeRideConfig.filterConfig) && Intrinsics.LJFF(this.notFilterConfig, flashFreeRideConfig.notFilterConfig) && Intrinsics.LJFF(this.flashFreeRideFeatureConfigs, flashFreeRideConfig.flashFreeRideFeatureConfigs);
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        FilterConfig filterConfig = this.filterConfig;
        int iHashCode2 = (iHashCode + (filterConfig == null ? 0 : filterConfig.hashCode())) * 31;
        FilterConfig filterConfig2 = this.notFilterConfig;
        return ((iHashCode2 + (filterConfig2 != null ? filterConfig2.hashCode() : 0)) * 31) + this.flashFreeRideFeatureConfigs.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashFreeRideConfig(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", filterConfig=");
        sbLIZ.append(this.filterConfig);
        sbLIZ.append(", notFilterConfig=");
        sbLIZ.append(this.notFilterConfig);
        sbLIZ.append(", flashFreeRideFeatureConfigs=");
        sbLIZ.append(this.flashFreeRideFeatureConfigs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FlashFreeRideConfig(String str, FilterConfig filterConfig, FilterConfig filterConfig2, List<FlashFreeRideFeatureConfig> list) {
        this.url = str;
        this.filterConfig = filterConfig;
        this.notFilterConfig = filterConfig2;
        this.flashFreeRideFeatureConfigs = list;
    }

    public FlashFreeRideConfig(String str, FilterConfig filterConfig, FilterConfig filterConfig2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : filterConfig, (i & 4) != 0 ? null : filterConfig2, (i & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
