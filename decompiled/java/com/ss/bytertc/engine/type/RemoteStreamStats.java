package com.ss.bytertc.engine.type;

import X.C2188811AlT;
import com.ss.bytertc.engine.InternalRemoteStreamStats;

/* JADX INFO: loaded from: classes21.dex */
public class RemoteStreamStats {
    public RemoteAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public String uid;
    public RemoteVideoStats videoStats;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteStreamStats{uid='");
        sbLIZ.append(this.uid);
        sbLIZ.append('\'');
        sbLIZ.append(", audioStats=");
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

    public RemoteStreamStats() {
    }

    public RemoteStreamStats(InternalRemoteStreamStats internalRemoteStreamStats) {
        RemoteAudioStats remoteAudioStats = new RemoteAudioStats(internalRemoteStreamStats.audioStats);
        RemoteVideoStats remoteVideoStats = new RemoteVideoStats(internalRemoteStreamStats.videoStats);
        this.audioStats = remoteAudioStats;
        this.videoStats = remoteVideoStats;
        this.uid = internalRemoteStreamStats.uid;
        this.isScreen = internalRemoteStreamStats.isScreen;
        this.rxQuality = internalRemoteStreamStats.rxQuality;
        this.txQuality = internalRemoteStreamStats.txQuality;
    }
}
