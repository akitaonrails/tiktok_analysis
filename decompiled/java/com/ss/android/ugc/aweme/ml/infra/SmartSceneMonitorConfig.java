package com.ss.android.ugc.aweme.ml.infra;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartSceneMonitorConfig {

    @C09CT("enable_monitor")
    public boolean enableMonitor;

    @C09CT("enable_strategy")
    public boolean enableStrategy;

    @C09CT("event_name")
    public String eventNameToTriggerCollecting;

    @C09CT("predict_strategy_name")
    public String predictStrategyName;

    @C09CT("run_sampling_rate")
    public float runSamplingRate;

    @C09CT("skip_times")
    public int skipTimesBeforeReport;

    @C09CT("collecting_timing")
    public int timingForCollecting = 103;

    @C09CT("truth_strategy_name")
    public String truthStrategyName;

    public final boolean getEnableMonitor() {
        return this.enableMonitor;
    }

    public final boolean getEnableStrategy() {
        return this.enableStrategy;
    }

    public final String getEventNameToTriggerCollecting() {
        return this.eventNameToTriggerCollecting;
    }

    public final String getPredictStrategyName() {
        return this.predictStrategyName;
    }

    public final float getRunSamplingRate() {
        return this.runSamplingRate;
    }

    public final int getSkipTimesBeforeReport() {
        return this.skipTimesBeforeReport;
    }

    public final int getTimingForCollecting() {
        return this.timingForCollecting;
    }

    public final String getTruthStrategyName() {
        return this.truthStrategyName;
    }

    public final void setEnableMonitor(boolean z) {
        this.enableMonitor = z;
    }

    public final void setEnableStrategy(boolean z) {
        this.enableStrategy = z;
    }

    public final void setEventNameToTriggerCollecting(String str) {
        this.eventNameToTriggerCollecting = str;
    }

    public final void setPredictStrategyName(String str) {
        this.predictStrategyName = str;
    }

    public final void setRunSamplingRate(float f) {
        this.runSamplingRate = f;
    }

    public final void setSkipTimesBeforeReport(int i) {
        this.skipTimesBeforeReport = i;
    }

    public final void setTimingForCollecting(int i) {
        this.timingForCollecting = i;
    }

    public final void setTruthStrategyName(String str) {
        this.truthStrategyName = str;
    }
}
