package com.ss.lyrax.ttlh_adapter.push_param.capture_base;

/* JADX INFO: loaded from: classes21.dex */
public class AudioCaptureParams {
    public int audioCaptureBitwidth;
    public int channel;
    public int channelOnVoIP;
    public float gameInnerVolume;
    public boolean incrementalParsing;
    public int sample;
    public int sampleOnVoIP;

    public int getChannel() {
        if (this.channel == -1) {
            this.channel = 1;
        }
        return this.channel;
    }

    public AudioCaptureParams() {
        this.gameInnerVolume = 0.1f;
        this.sample = 44100;
        this.channel = -1;
        this.audioCaptureBitwidth = 16;
        this.sampleOnVoIP = 16000;
        this.channelOnVoIP = 1;
    }

    public int getChannelOnVoIP() {
        return this.channelOnVoIP;
    }

    public float getGameInnerVolume() {
        return this.gameInnerVolume;
    }

    public int getSample() {
        return this.sample;
    }

    public int getSampleOnVoIP() {
        return this.sampleOnVoIP;
    }

    public void setChannel(int i) {
        this.channel = i;
    }

    public void setIncrementalParsing(boolean z) {
        this.incrementalParsing = z;
    }

    public AudioCaptureParams(float f, int i, int i2, int i3, int i4) {
        this.audioCaptureBitwidth = 16;
        this.gameInnerVolume = f;
        this.sample = i;
        this.channel = i2;
        this.sampleOnVoIP = i3;
        this.channelOnVoIP = i4;
    }
}
