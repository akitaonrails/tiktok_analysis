package com.ss.bytertc.engine.type;

import X.C2188811AlT;
import com.ss.bytertc.engine.InternalLocalStreamStats;

/* JADX INFO: loaded from: classes21.dex */
public class LocalStreamStats {
    public LocalAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public LocalVideoStats videoStats;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalStreamStats{audioStats=");
        sbLIZ.append(this.audioStats);
        sbLIZ.append(", videoStats=");
        sbLIZ.append(this.videoStats);
        sbLIZ.append(", isScreen=");
        sbLIZ.append(this.isScreen);
        sbLIZ.append(", txQuality=");
        sbLIZ.append(this.txQuality);
        sbLIZ.append(", rxQuality=");
        sbLIZ.append(this.rxQuality);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LocalStreamStats() {
    }

    public LocalStreamStats(InternalLocalStreamStats internalLocalStreamStats) {
        LocalAudioStats localAudioStats = new LocalAudioStats(internalLocalStreamStats.audioStats);
        LocalVideoStats localVideoStats = new LocalVideoStats(internalLocalStreamStats.videoStats);
        this.audioStats = localAudioStats;
        this.videoStats = localVideoStats;
        this.isScreen = internalLocalStreamStats.isScreen;
        this.txQuality = internalLocalStreamStats.txQuality;
        this.rxQuality = internalLocalStreamStats.rxQuality;
    }
}
