package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes14.dex */
public final class AutoSkipApiConfig {

    @C09CT("average_cost")
    public final long averageCost;

    @C09CT("count")
    public final int count;

    @C09CT("skip_interval")
    public final long skipInterval;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSkipApiConfig)) {
            return false;
        }
        AutoSkipApiConfig autoSkipApiConfig = (AutoSkipApiConfig) obj;
        return this.count == autoSkipApiConfig.count && this.averageCost == autoSkipApiConfig.averageCost && this.skipInterval == autoSkipApiConfig.skipInterval;
    }

    public final int hashCode() {
        return (((this.count * 31) + C786410Ut5.Y2(this.averageCost)) * 31) + C786410Ut5.Y2(this.skipInterval);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoSkipApiConfig(count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", averageCost=");
        sbLIZ.append(this.averageCost);
        sbLIZ.append(", skipInterval=");
        sbLIZ.append(this.skipInterval);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AutoSkipApiConfig() {
        this(10, 20L, 180000L);
    }

    public AutoSkipApiConfig(int i, long j, long j2) {
        this.count = i;
        this.averageCost = j;
        this.skipInterval = j2;
    }
}
