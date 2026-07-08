package com.ss.solution.gear_center;

/* JADX INFO: loaded from: classes36.dex */
public final class LyraxNetProbeResult {
    public final int bandwidth;
    public final int gearLevel;
    public final LyraxProbeNetworkGrade networkGrade;
    public final LyraxProbeOriginType probeOrigin;
    public final boolean succeed;

    public LyraxNetProbeResult() {
        this(false, -1, -1, LyraxProbeOriginType.Default, LyraxProbeNetworkGrade.Default);
    }

    public final int getBandwidth() {
        return this.bandwidth;
    }

    public final int getGearLevel() {
        return this.gearLevel;
    }

    public final LyraxProbeNetworkGrade getNetworkGrade() {
        return this.networkGrade;
    }

    public final LyraxProbeOriginType getProbeOrigin() {
        return this.probeOrigin;
    }

    public final boolean getSucceed() {
        return this.succeed;
    }

    public LyraxNetProbeResult(boolean z, int i, int i2, LyraxProbeOriginType lyraxProbeOriginType, LyraxProbeNetworkGrade lyraxProbeNetworkGrade) {
        this.succeed = z;
        this.bandwidth = i;
        this.gearLevel = i2;
        this.probeOrigin = lyraxProbeOriginType;
        this.networkGrade = lyraxProbeNetworkGrade;
    }
}
