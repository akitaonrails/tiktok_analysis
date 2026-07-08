package com.ss.solution.gear_center;

/* JADX INFO: loaded from: classes36.dex */
public final class LyraxStartProbeOption {
    public final long callNativeStartTime;
    public final long callStartTime;
    public final LyraxProbeNetworkStatus networkStatus;
    public final LyraxProbeNetworkType networkType;
    public final LyraxProbeOriginType probeOrigin;

    public LyraxStartProbeOption() {
        this(LyraxProbeOriginType.Default, -1L, -1L, LyraxProbeNetworkType.Wifi, LyraxProbeNetworkStatus.Ok);
    }

    public final long getCallNativeStartTime() {
        return this.callNativeStartTime;
    }

    public final long getCallStartTime() {
        return this.callStartTime;
    }

    public final LyraxProbeNetworkStatus getNetworkStatus() {
        return this.networkStatus;
    }

    public final LyraxProbeNetworkType getNetworkType() {
        return this.networkType;
    }

    public final LyraxProbeOriginType getProbeOrigin() {
        return this.probeOrigin;
    }

    public LyraxStartProbeOption(LyraxProbeOriginType lyraxProbeOriginType, long j, long j2, LyraxProbeNetworkType lyraxProbeNetworkType, LyraxProbeNetworkStatus lyraxProbeNetworkStatus) {
        this.probeOrigin = lyraxProbeOriginType;
        this.callStartTime = j;
        this.callNativeStartTime = j2;
        this.networkType = lyraxProbeNetworkType;
        this.networkStatus = lyraxProbeNetworkStatus;
    }
}
