package com.bytedance.tt.reliability.queuemonitor.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class WarnThresholdConfig {

    @C09CT("contrib_warn")
    public final double contribWarn;

    @C09CT("enqueue_rate_warn")
    public final int enqueueRateWarn;

    @C09CT("filter")
    public final Filter filter;

    @C09CT("length_warn_slope")
    public final int lengthWarnSlope;

    @C09CT("traffic_warn")
    public final double trafficWarn;

    @C09CT("wait_warn_ms")
    public final long waitWarnMs;

    public WarnThresholdConfig() {
        this(null, 0L, 0, 0, 0.0d, 0.0d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarnThresholdConfig)) {
            return false;
        }
        WarnThresholdConfig warnThresholdConfig = (WarnThresholdConfig) obj;
        return Intrinsics.LJFF(this.filter, warnThresholdConfig.filter) && this.waitWarnMs == warnThresholdConfig.waitWarnMs && this.lengthWarnSlope == warnThresholdConfig.lengthWarnSlope && this.enqueueRateWarn == warnThresholdConfig.enqueueRateWarn && Intrinsics.LJFF(Double.valueOf(this.trafficWarn), Double.valueOf(warnThresholdConfig.trafficWarn)) && Intrinsics.LJFF(Double.valueOf(this.contribWarn), Double.valueOf(warnThresholdConfig.contribWarn));
    }

    public int hashCode() {
        Filter filter = this.filter;
        return ((((((((((filter == null ? 0 : filter.hashCode()) * 31) + C786410Ut5.Y2(this.waitWarnMs)) * 31) + this.lengthWarnSlope) * 31) + this.enqueueRateWarn) * 31) + C786410Ut5.X2(this.trafficWarn)) * 31) + C786410Ut5.X2(this.contribWarn);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WarnThresholdConfig(filter=");
        sbLIZ.append(this.filter);
        sbLIZ.append(", waitWarnMs=");
        sbLIZ.append(this.waitWarnMs);
        sbLIZ.append(", lengthWarnSlope=");
        sbLIZ.append(this.lengthWarnSlope);
        sbLIZ.append(", enqueueRateWarn=");
        sbLIZ.append(this.enqueueRateWarn);
        sbLIZ.append(", trafficWarn=");
        sbLIZ.append(this.trafficWarn);
        sbLIZ.append(", contribWarn=");
        sbLIZ.append(this.contribWarn);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public WarnThresholdConfig(Filter filter, long j, int i, int i2, double d, double d2) {
        this.filter = filter;
        this.waitWarnMs = j;
        this.lengthWarnSlope = i;
        this.enqueueRateWarn = i2;
        this.trafficWarn = d;
        this.contribWarn = d2;
    }
}
