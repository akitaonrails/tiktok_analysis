package com.ss.lyrax.audio;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioFrame {
    public byte[] buffer;
    public LyraxAudioChannel channel;
    public long inputTimeNs;
    public LyraxAudioSampleRate sampleRate;
    public int samples;

    public byte[] getBuffer() {
        return this.buffer;
    }

    public LyraxAudioChannel getChannel() {
        return this.channel;
    }

    public long getInputTimeNs() {
        return this.inputTimeNs;
    }

    public LyraxAudioSampleRate getSampleRate() {
        return this.sampleRate;
    }

    public int getSamples() {
        return this.samples;
    }

    public LyraxAudioFrame(byte[] bArr, int i, LyraxAudioSampleRate lyraxAudioSampleRate, LyraxAudioChannel lyraxAudioChannel, long j) {
        this.buffer = bArr;
        this.samples = i;
        this.sampleRate = lyraxAudioSampleRate;
        this.channel = lyraxAudioChannel;
        this.inputTimeNs = j;
    }

    public static LyraxAudioFrame create(byte[] bArr, int i, LyraxAudioSampleRate lyraxAudioSampleRate, LyraxAudioChannel lyraxAudioChannel, long j) {
        return new LyraxAudioFrame(bArr, i, lyraxAudioSampleRate, lyraxAudioChannel, j);
    }
}
