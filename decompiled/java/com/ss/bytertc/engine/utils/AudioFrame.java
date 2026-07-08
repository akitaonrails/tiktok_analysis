package com.ss.bytertc.engine.utils;

import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioSampleRate;

/* JADX INFO: loaded from: classes21.dex */
public class AudioFrame {
    public byte[] buffer;
    public AudioChannel channel;
    public AudioSampleRate sampleRate;
    public int samples;
    public long timestamp_us;

    public AudioFrame() {
    }

    public AudioFrame(byte[] bArr, int i, AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this.buffer = bArr;
        this.samples = i;
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
    }

    public AudioFrame(byte[] bArr, int i, AudioSampleRate audioSampleRate, AudioChannel audioChannel, long j) {
        this.buffer = bArr;
        this.samples = i;
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
        this.timestamp_us = j;
    }
}
