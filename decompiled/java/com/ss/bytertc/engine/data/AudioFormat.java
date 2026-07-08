package com.ss.bytertc.engine.data;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class AudioFormat {
    public AudioChannel channel;
    public AudioSampleRate sampleRate;
    public int samplesPerCall;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioFormat{sampleRate='");
        sbLIZ.append(this.sampleRate);
        sbLIZ.append('\'');
        sbLIZ.append(", channel='");
        sbLIZ.append(this.channel);
        sbLIZ.append('\'');
        sbLIZ.append(", samplesPerCall=");
        sbLIZ.append(this.samplesPerCall);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AudioFormat(AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
    }

    public AudioFormat(AudioSampleRate audioSampleRate, AudioChannel audioChannel, int i) {
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
        this.samplesPerCall = i;
    }
}
