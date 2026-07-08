package com.ss.lyrax.stream;

import com.ss.lyrax.transcoder.LyraxTranscoderAudioCodecProfile;
import com.ss.lyrax.transcoder.LyraxTranscoderAudioCodecType;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxPublisherAudioConfig {
    public LyraxTranscoderAudioCodecProfile aacCodecProfile;
    public LyraxTranscoderAudioCodecType audioCodecType;
    public int bitrateKbps;
    public int channelNum;
    public int sampleRate;

    public int getAacCodecProfile() {
        return this.aacCodecProfile.value();
    }

    public int getAudioCodecType() {
        return this.audioCodecType.value();
    }

    public int getBitrateKbps() {
        return this.bitrateKbps;
    }

    public int getChannelNum() {
        return this.channelNum;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public LyraxPublisherAudioConfig(int i, int i2, int i3, LyraxTranscoderAudioCodecType lyraxTranscoderAudioCodecType, LyraxTranscoderAudioCodecProfile lyraxTranscoderAudioCodecProfile) {
        this.audioCodecType = LyraxTranscoderAudioCodecType.AUDIOCODEC_AAC;
        this.sampleRate = i;
        this.channelNum = i2;
        this.bitrateKbps = i3;
        this.audioCodecType = lyraxTranscoderAudioCodecType;
        this.aacCodecProfile = lyraxTranscoderAudioCodecProfile;
    }
}
