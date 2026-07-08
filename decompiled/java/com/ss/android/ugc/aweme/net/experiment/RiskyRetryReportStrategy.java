package com.ss.android.ugc.aweme.net.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class RiskyRetryReportStrategy {

    @C09CT("backoff_initial_ms")
    public final long backoffInitialMs;

    @C09CT("backoff_max_level")
    public final int backoffMaxLevel;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("lru_capacity")
    public final int lruCapacity;

    @C09CT("qps_threshold")
    public final double qpsThreshold;

    @C09CT("sample_rate")
    public final double sampleRate;

    public RiskyRetryReportStrategy() {
        this(false, 1.0d, 8.0d, 100, 60000L, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RiskyRetryReportStrategy)) {
            return false;
        }
        RiskyRetryReportStrategy riskyRetryReportStrategy = (RiskyRetryReportStrategy) obj;
        return this.enable == riskyRetryReportStrategy.enable && Double.compare(this.sampleRate, riskyRetryReportStrategy.sampleRate) == 0 && Double.compare(this.qpsThreshold, riskyRetryReportStrategy.qpsThreshold) == 0 && this.lruCapacity == riskyRetryReportStrategy.lruCapacity && this.backoffInitialMs == riskyRetryReportStrategy.backoffInitialMs && this.backoffMaxLevel == riskyRetryReportStrategy.backoffMaxLevel;
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.X2(this.sampleRate)) * 31) + C786410Ut5.X2(this.qpsThreshold)) * 31) + this.lruCapacity) * 31) + C786410Ut5.Y2(this.backoffInitialMs)) * 31) + this.backoffMaxLevel;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RiskyRetryReportStrategy(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", sampleRate=");
        sbLIZ.append(this.sampleRate);
        sbLIZ.append(", qpsThreshold=");
        sbLIZ.append(this.qpsThreshold);
        sbLIZ.append(", lruCapacity=");
        sbLIZ.append(this.lruCapacity);
        sbLIZ.append(", backoffInitialMs=");
        sbLIZ.append(this.backoffInitialMs);
        sbLIZ.append(", backoffMaxLevel=");
        sbLIZ.append(this.backoffMaxLevel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RiskyRetryReportStrategy(boolean z, double d, double d2, int i, long j, int i2) {
        this.enable = z;
        this.sampleRate = d;
        this.qpsThreshold = d2;
        this.lruCapacity = i;
        this.backoffInitialMs = j;
        this.backoffMaxLevel = i2;
    }
}
