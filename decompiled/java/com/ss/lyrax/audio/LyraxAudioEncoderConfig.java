package com.ss.lyrax.audio;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioEncoderConfig {
    public int aacBitrateMode;
    public LyraxAudioAACCodecProfile aacCodecProfile;
    public int aacEncType;
    public int aacPerfOptLevel;
    public int bitrateKbps;
    public LyraxAudioChannel channelNum;
    public LyraxAudioCodecType codecType;
    public boolean resetPreEncoderConfig;
    public LyraxAudioSampleRate sampleRate;
    public boolean useDtx;
    public boolean userCodecPriority;

    public LyraxAudioEncoderConfig() {
        LyraxAudioSampleRate lyraxAudioSampleRate = LyraxAudioSampleRate.AUDIO_SAMPLE_RATE_AUTO;
        this.sampleRate = lyraxAudioSampleRate;
        LyraxAudioChannel lyraxAudioChannel = LyraxAudioChannel.AUTO;
        this.channelNum = lyraxAudioChannel;
        this.bitrateKbps = 64;
        LyraxAudioCodecType lyraxAudioCodecType = LyraxAudioCodecType.OPUS;
        this.codecType = lyraxAudioCodecType;
        LyraxAudioAACCodecProfile lyraxAudioAACCodecProfile = LyraxAudioAACCodecProfile.AACLC;
        this.sampleRate = lyraxAudioSampleRate;
        this.channelNum = lyraxAudioChannel;
        this.bitrateKbps = 64;
        this.codecType = lyraxAudioCodecType;
        this.aacCodecProfile = lyraxAudioAACCodecProfile;
    }

    public LyraxAudioAACCodecProfile getAACCodecProfile() {
        return this.aacCodecProfile;
    }

    public int getAacBitrateMode() {
        return this.aacBitrateMode;
    }

    public int getAacEncType() {
        return this.aacEncType;
    }

    public int getAacPerfOptLevel() {
        return this.aacPerfOptLevel;
    }

    public int getBitrateKbps() {
        return this.bitrateKbps;
    }

    public LyraxAudioChannel getChannelNum() {
        return this.channelNum;
    }

    public LyraxAudioCodecType getCodecType() {
        return this.codecType;
    }

    public boolean getResetPreEncoderConfig() {
        return this.resetPreEncoderConfig;
    }

    public LyraxAudioSampleRate getSampleRate() {
        return this.sampleRate;
    }

    public boolean getUseDtx() {
        return this.useDtx;
    }

    public boolean getUserCodecPriority() {
        return this.userCodecPriority;
    }

    public void setAACCodecProfile(LyraxAudioAACCodecProfile lyraxAudioAACCodecProfile) {
        this.aacCodecProfile = lyraxAudioAACCodecProfile;
    }

    public void setAacBitrateMode(int i) {
        this.aacBitrateMode = i;
    }

    public void setAacEncType(int i) {
        this.aacEncType = i;
    }

    public void setAacPerfOptLevel(int i) {
        this.aacPerfOptLevel = i;
    }

    public void setBitrateKbps(int i) {
        this.bitrateKbps = i;
    }

    public void setChannelNum(LyraxAudioChannel lyraxAudioChannel) {
        this.channelNum = lyraxAudioChannel;
    }

    public void setCodecType(LyraxAudioCodecType lyraxAudioCodecType) {
        this.codecType = lyraxAudioCodecType;
    }

    public void setResetPreEncoderConfig(boolean z) {
        this.resetPreEncoderConfig = z;
    }

    public void setSampleRate(LyraxAudioSampleRate lyraxAudioSampleRate) {
        this.sampleRate = lyraxAudioSampleRate;
    }

    public void setUserCodecPriority(boolean z) {
        this.userCodecPriority = z;
    }

    public LyraxAudioEncoderConfig(LyraxAudioSampleRate lyraxAudioSampleRate, LyraxAudioChannel lyraxAudioChannel, int i, LyraxAudioCodecType lyraxAudioCodecType, LyraxAudioAACCodecProfile lyraxAudioAACCodecProfile, boolean z, boolean z2, boolean z3) {
        this.sampleRate = LyraxAudioSampleRate.AUDIO_SAMPLE_RATE_AUTO;
        this.channelNum = LyraxAudioChannel.AUTO;
        this.bitrateKbps = 64;
        this.codecType = LyraxAudioCodecType.OPUS;
        this.sampleRate = lyraxAudioSampleRate;
        this.channelNum = lyraxAudioChannel;
        this.bitrateKbps = i;
        this.codecType = lyraxAudioCodecType;
        this.aacCodecProfile = lyraxAudioAACCodecProfile;
        this.resetPreEncoderConfig = z;
        this.userCodecPriority = z2;
        this.useDtx = z3;
    }
}
