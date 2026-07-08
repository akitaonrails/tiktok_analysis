package com.ss.bytertc.engine.type;

import X.C2188811AlT;
import com.ss.bytertc.engine.InternalLocalAudioStats;

/* JADX INFO: loaded from: classes21.dex */
public class LocalAudioStats {
    public float audioLossRate;
    public int jitter;
    public int numChannels;
    public int recordSampleRate;
    public int rtt;
    public float sendKBitrate;
    public int sentSampleRate;
    public int statsInterval;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalAudioStats{audioLossRate='");
        sbLIZ.append(this.audioLossRate);
        sbLIZ.append('\'');
        sbLIZ.append(", sendKBitrate='");
        sbLIZ.append(this.sendKBitrate);
        sbLIZ.append('\'');
        sbLIZ.append(", recordSampleRate='");
        sbLIZ.append(this.recordSampleRate);
        sbLIZ.append('\'');
        sbLIZ.append(", statsInterval='");
        sbLIZ.append(this.statsInterval);
        sbLIZ.append('\'');
        sbLIZ.append(", rtt='");
        sbLIZ.append(this.rtt);
        sbLIZ.append('\'');
        sbLIZ.append(", numChannels='");
        sbLIZ.append(this.numChannels);
        sbLIZ.append('\'');
        sbLIZ.append(", sentSampleRate='");
        sbLIZ.append(this.sentSampleRate);
        sbLIZ.append('\'');
        sbLIZ.append(", jitter='");
        sbLIZ.append(this.jitter);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LocalAudioStats() {
    }

    public LocalAudioStats(InternalLocalAudioStats internalLocalAudioStats) {
        this.audioLossRate = internalLocalAudioStats.audioLossRate;
        this.sendKBitrate = internalLocalAudioStats.sendKBitrate;
        this.recordSampleRate = internalLocalAudioStats.recordSampleRate;
        this.statsInterval = internalLocalAudioStats.statsInterval;
        this.rtt = internalLocalAudioStats.rtt;
        this.numChannels = internalLocalAudioStats.numChannels;
        this.sentSampleRate = internalLocalAudioStats.sentSampleRate;
        this.jitter = internalLocalAudioStats.jitter;
    }
}
