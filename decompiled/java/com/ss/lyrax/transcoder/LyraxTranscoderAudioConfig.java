package com.ss.lyrax.transcoder;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderAudioConfig {
    public int sampleRate = 48000;
    public int channels = 2;
    public int bitrateKBPS = 64;
    public LyraxTranscoderAudioCodecProfile audioCodecProfile = LyraxTranscoderAudioCodecProfile.AACPROFILE_LC;
    public LyraxTranscoderAudioCodecType audioCodecType = LyraxTranscoderAudioCodecType.AUDIOCODEC_AAC;

    public LyraxTranscoderAudioCodecProfile getAudioCodecProfile() {
        return this.audioCodecProfile;
    }

    public LyraxTranscoderAudioCodecType getAudioCodecType() {
        return this.audioCodecType;
    }

    public int getBitrateKBPS() {
        return this.bitrateKBPS;
    }

    public int getChannels() {
        return this.channels;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public void setAudioCodecProfile(LyraxTranscoderAudioCodecProfile lyraxTranscoderAudioCodecProfile) {
        this.audioCodecProfile = lyraxTranscoderAudioCodecProfile;
    }

    public void setAudioCodecType(LyraxTranscoderAudioCodecType lyraxTranscoderAudioCodecType) {
        this.audioCodecType = lyraxTranscoderAudioCodecType;
    }

    public void setBitrateKBPS(int i) {
        this.bitrateKBPS = i;
    }

    public void setChannels(int i) {
        this.channels = i;
    }

    public void setSampleRate(int i) {
        this.sampleRate = i;
    }
}
