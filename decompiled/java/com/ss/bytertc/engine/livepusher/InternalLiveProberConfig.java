package com.ss.bytertc.engine.livepusher;

/* JADX INFO: loaded from: classes21.dex */
public class InternalLiveProberConfig {
    public int bottomLine1080pKbps;
    public int bottomLine540pKbps;
    public int bottomLine720pKbps;
    public String clientNetwork;
    public float firstOrderFilterParam;
    public int netInfoLogIntervalMs;
    public int peakAvgCount;
    public int probeAimLevel;
    public int probeBandwidthCalcType;
    public int probeBottomLevel;
    public int probeDurationMs;
    public int probeTargetBwKbps;
    public int probeValidTimeMs;

    public int getBottomLine1080pKbps() {
        return this.bottomLine1080pKbps;
    }

    public int getBottomLine540pKbps() {
        return this.bottomLine540pKbps;
    }

    public int getBottomLine720pKbps() {
        return this.bottomLine720pKbps;
    }

    public String getClientNetwork() {
        return this.clientNetwork;
    }

    public float getFirstOrderFilterParam() {
        return this.firstOrderFilterParam;
    }

    public int getNetInfoLogIntervalMs() {
        return this.netInfoLogIntervalMs;
    }

    public int getPeakAvgCount() {
        return this.peakAvgCount;
    }

    public int getProbeAimLevel() {
        return this.probeAimLevel;
    }

    public int getProbeBandwidthCalcType() {
        return this.probeBandwidthCalcType;
    }

    public int getProbeBottomLevel() {
        return this.probeBottomLevel;
    }

    public int getProbeDurationMs() {
        return this.probeDurationMs;
    }

    public int getProbeTargetBwKbps() {
        return this.probeTargetBwKbps;
    }

    public int getProbeValidTimeMs() {
        return this.probeValidTimeMs;
    }

    public InternalLiveProberConfig(LiveProberConfig liveProberConfig) {
        this.probeDurationMs = liveProberConfig.probeDurationMs;
        this.probeValidTimeMs = liveProberConfig.probeValidTimeMs;
        this.netInfoLogIntervalMs = liveProberConfig.netInfoLogIntervalMs;
        this.bottomLine540pKbps = liveProberConfig.bottomLine540pKbps;
        this.bottomLine720pKbps = liveProberConfig.bottomLine720pKbps;
        int i = liveProberConfig.bottomLine1080pKbps;
        this.bottomLine1080pKbps = i;
        this.probeBottomLevel = liveProberConfig.probeBottomLevel;
        this.probeAimLevel = liveProberConfig.probeAimLevel;
        int i2 = liveProberConfig.probeTargetBwKbps;
        this.probeTargetBwKbps = i2;
        if (i2 <= i) {
            this.probeTargetBwKbps = (int) (((double) i) * 1.2d);
        }
        LiveProbeBandwidthCalcType liveProbeBandwidthCalcType = liveProberConfig.probeBandwidthCalcType;
        if (liveProbeBandwidthCalcType == null) {
            this.probeBandwidthCalcType = LiveProbeBandwidthCalcType.LIVE_PROBER_BANDWIDTH_CALC_TYPE_NEWEST.value();
        } else {
            this.probeBandwidthCalcType = liveProbeBandwidthCalcType.value();
        }
        this.firstOrderFilterParam = liveProberConfig.firstOrderFilterParam;
        this.peakAvgCount = liveProberConfig.peakAvgCount;
        this.clientNetwork = liveProberConfig.clientNetwork;
    }
}
