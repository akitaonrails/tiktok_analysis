package com.bytedance.pumbaa.piz.discover;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class PIIDiscoverConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("report_by")
    public final int reportBy;

    @C09CT("sampling_before_calculation")
    public final double samplingBeforeCalculation;

    @C09CT("sampling_before_report")
    public final double samplingBeforeReport;

    @C09CT("throttle_interval")
    public final int throttleInterval;

    public PIIDiscoverConfig() {
        this(false, 500, 1.0d, 1.0d, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PIIDiscoverConfig)) {
            return false;
        }
        PIIDiscoverConfig pIIDiscoverConfig = (PIIDiscoverConfig) obj;
        return this.enable == pIIDiscoverConfig.enable && this.throttleInterval == pIIDiscoverConfig.throttleInterval && Double.compare(this.samplingBeforeCalculation, pIIDiscoverConfig.samplingBeforeCalculation) == 0 && Double.compare(this.samplingBeforeReport, pIIDiscoverConfig.samplingBeforeReport) == 0 && this.reportBy == pIIDiscoverConfig.reportBy;
    }

    public PIIDiscoverConfig(boolean z, int i, double d, double d2, int i2) {
        this.enable = z;
        this.throttleInterval = i;
        this.samplingBeforeCalculation = d;
        this.samplingBeforeReport = d2;
        this.reportBy = i2;
    }
}
