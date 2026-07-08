package com.ss.bytertc.engine.livepusher;

import com.ss.bytertc.engine.live.MixedStreamConfig;

/* JADX INFO: loaded from: classes21.dex */
public class LivePusherAudioConfig {
    public int aacBitrateMode;
    public int aacEncType;
    public int bitrateKbps;
    public int channelNum;
    public int sampleRate;
    public MixedStreamConfig.MixedStreamAudioConfig.MixedStreamAudioCodecType audioCodecType = MixedStreamConfig.MixedStreamAudioConfig.MixedStreamAudioCodecType.MIXED_STREAM_AUDIO_CODEC_TYPE_AAC;
    public MixedStreamConfig.MixedStreamAudioProfile aacCodecProfile = MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;
}
