package com.ss.lyrax.ttlh_adapter.push_param.push_base;

/* JADX INFO: loaded from: classes21.dex */
public class PushAudioConfig {
    public int audioBitrate;
    public int audioEncFrameLength;
    public String audioProfileStr;
    public int audioSample;
    public boolean enableAudioRenderSinkStartOpt;
    public boolean enableScreenAudioStereoCapture;
    public boolean incrementalParsing;

    public int getAudioBitrate() {
        if (this.audioBitrate == -1) {
            this.audioBitrate = 32000;
        }
        return this.audioBitrate;
    }

    public int getAudioSample() {
        if (this.audioSample == -1) {
            this.audioSample = 44100;
        }
        return this.audioSample;
    }

    public PushAudioConfig() {
        this.audioSample = -1;
        this.audioBitrate = -1;
        this.enableAudioRenderSinkStartOpt = true;
        this.enableScreenAudioStereoCapture = true;
        this.audioEncFrameLength = 10;
    }

    public int getAudioEncFrameLength() {
        return this.audioEncFrameLength;
    }

    public String getAudioProfileStr() {
        return this.audioProfileStr;
    }

    public boolean getEnableAudioRenderSinkStartOpt() {
        return this.enableAudioRenderSinkStartOpt;
    }

    public boolean getEnableScreenAudioStereoCapture() {
        return this.enableScreenAudioStereoCapture;
    }

    public void setAudioBitrate(int i) {
        if (this.audioBitrate == -1 || !this.incrementalParsing) {
            this.audioBitrate = i;
        }
    }

    public void setAudioSample(int i) {
        if (this.audioSample == -1 || !this.incrementalParsing) {
            this.audioSample = i;
        }
    }

    public void setIncrementalParsing(boolean z) {
        this.incrementalParsing = z;
    }

    public PushAudioConfig(String str, int i, int i2, boolean z, boolean z2, int i3) {
        this.audioProfileStr = str;
        this.audioSample = i;
        this.audioBitrate = i2;
        this.enableAudioRenderSinkStartOpt = z;
        this.enableScreenAudioStereoCapture = z2;
        this.audioEncFrameLength = i3;
    }
}
