package com.ss.lyrax.stream;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxPublisherAudioStats {
    public float audioLossRate;
    public int jitter;
    public int numChannels;
    public int recordSampleRate;
    public int rtt;
    public int sendKBitrate;
    public int sentSampleRate;
    public int statsInterval;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxPublisherAudioStats{audioLossRate='");
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

    public LyraxPublisherAudioStats(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.audioLossRate = f;
        this.sendKBitrate = i;
        this.recordSampleRate = i2;
        this.statsInterval = i3;
        this.rtt = i4;
        this.numChannels = i5;
        this.sentSampleRate = i6;
        this.jitter = i7;
    }
}
