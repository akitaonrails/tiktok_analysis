package com.ss.android.ugc.aweme.ml.infra;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartOffloadingConfig {

    @C09CT("enable_cloud_calculation")
    public boolean enableCloudCalculation = true;

    @C09CT("enable_monitor")
    public boolean enableMonitor;

    @C09CT("frequency_time_gap")
    public long frequencyTimeGap;

    @C09CT("keep_offloading_status")
    public boolean keepOffloadingStatus;

    @C09CT("offloading_strategy_name")
    public String offloadingStrategyName;

    public String toString() {
        return super.toString();
    }

    public final boolean getEnableCloudCalculation() {
        return this.enableCloudCalculation;
    }

    public final boolean getEnableMonitor() {
        return this.enableMonitor;
    }

    public final long getFrequencyTimeGap() {
        return this.frequencyTimeGap;
    }

    public final boolean getKeepOffloadingStatus() {
        return this.keepOffloadingStatus;
    }

    public final String getOffloadingStrategyName() {
        return this.offloadingStrategyName;
    }

    public final void setEnableCloudCalculation(boolean z) {
        this.enableCloudCalculation = z;
    }

    public final void setEnableMonitor(boolean z) {
        this.enableMonitor = z;
    }

    public final void setFrequencyTimeGap(long j) {
        this.frequencyTimeGap = j;
    }

    public final void setKeepOffloadingStatus(boolean z) {
        this.keepOffloadingStatus = z;
    }

    public final void setOffloadingStrategyName(String str) {
        this.offloadingStrategyName = str;
    }
}
