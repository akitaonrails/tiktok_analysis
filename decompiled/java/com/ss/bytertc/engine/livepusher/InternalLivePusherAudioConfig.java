package com.ss.bytertc.engine.livepusher;

import com.ss.bytertc.engine.live.MixedStreamConfig;

/* JADX INFO: loaded from: classes21.dex */
public class InternalLivePusherAudioConfig {
    public int aacBitrateMode;
    public MixedStreamConfig.MixedStreamAudioProfile aacCodecProfile;
    public int aacEncType;
    public MixedStreamConfig.MixedStreamAudioConfig.MixedStreamAudioCodecType audioCodecType;
    public int bitrateKbps;
    public int channelNum;
    public int sampleRate;

    public String getAacCodecProfile() {
        return this.aacCodecProfile.getValue();
    }

    public String getAudioCodecType() {
        return this.audioCodecType.getValue();
    }

    public int getAacBitrateMode() {
        return this.aacBitrateMode;
    }

    public int getAacEncType() {
        return this.aacEncType;
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

    public InternalLivePusherAudioConfig(LivePusherAudioConfig livePusherAudioConfig) {
        this.audioCodecType = MixedStreamConfig.MixedStreamAudioConfig.MixedStreamAudioCodecType.MIXED_STREAM_AUDIO_CODEC_TYPE_AAC;
        this.aacCodecProfile = MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;
        this.sampleRate = livePusherAudioConfig.sampleRate;
        this.channelNum = livePusherAudioConfig.channelNum;
        this.bitrateKbps = livePusherAudioConfig.bitrateKbps;
        this.audioCodecType = livePusherAudioConfig.audioCodecType;
        this.aacCodecProfile = livePusherAudioConfig.aacCodecProfile;
        this.aacEncType = livePusherAudioConfig.aacEncType;
        this.aacBitrateMode = livePusherAudioConfig.aacBitrateMode;
    }
}
