package com.ss.lyrax.audio;

import X.C2188811AlT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioLocalStats {
    public int aacAot;
    public float audioLossRate;
    public ArrayList<Integer> audioPostEncStall;
    public int bandwidth;
    public String codecName;
    public int dataSize;
    public int dataSizeIncrement;
    public int jitter;
    public int netSendElapse;
    public int networkQuality;
    public int numChannels;
    public int recordSampleRate;
    public int rtt;
    public int sendKBitrate;
    public int sentSampleRate;
    public int txQuality;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxAudioLocalStats{audioLossRate='");
        sbLIZ.append(this.audioLossRate);
        sbLIZ.append('\'');
        sbLIZ.append(", sendKBitrate='");
        sbLIZ.append(this.sendKBitrate);
        sbLIZ.append('\'');
        sbLIZ.append(", recordSampleRate='");
        sbLIZ.append(this.recordSampleRate);
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
        sbLIZ.append(", dataSizeIncrement='");
        sbLIZ.append(this.dataSizeIncrement);
        sbLIZ.append('\'');
        sbLIZ.append(", dataSize='");
        sbLIZ.append(this.dataSize);
        sbLIZ.append('\'');
        sbLIZ.append(", networkQuality='");
        sbLIZ.append(this.networkQuality);
        sbLIZ.append('\'');
        sbLIZ.append(", txQuality='");
        sbLIZ.append(this.txQuality);
        sbLIZ.append('\'');
        sbLIZ.append(", codecName='");
        sbLIZ.append(this.codecName);
        sbLIZ.append('\'');
        sbLIZ.append(", aacAot='");
        sbLIZ.append(this.aacAot);
        sbLIZ.append('\'');
        sbLIZ.append(", netSendElapse='");
        sbLIZ.append(this.netSendElapse);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxAudioLocalStats(int i, float f, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, ArrayList<Integer> arrayList, int i10, int i11, String str, int i12, int i13) {
        this.bandwidth = i;
        this.audioLossRate = f;
        this.sendKBitrate = i2;
        this.recordSampleRate = i3;
        this.rtt = i4;
        this.numChannels = i5;
        this.sentSampleRate = i6;
        this.jitter = i7;
        this.dataSizeIncrement = i8;
        this.dataSize = i9;
        this.audioPostEncStall = arrayList;
        this.networkQuality = i10;
        this.txQuality = i11;
        this.codecName = str;
        this.aacAot = i12;
        this.netSendElapse = i13;
    }
}
