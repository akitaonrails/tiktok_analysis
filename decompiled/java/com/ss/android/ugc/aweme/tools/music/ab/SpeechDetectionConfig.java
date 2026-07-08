package com.ss.android.ugc.aweme.tools.music.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class SpeechDetectionConfig {

    @C09CT("enable_reduce_bit_rate")
    public final int bitRate;

    @C09CT("enable_reduce_channels")
    public final int channels;

    @C09CT("disable_mix_at_one_track")
    public final int disableMixAtOneTrack;

    @C09CT("enable")
    public final int enable;

    @C09CT("enable_dispatch_io")
    public final int enableDispatchIO;

    @C09CT("enable_reduce_extract_audio_file")
    public final int enableReduceExtractAudioFile;

    @C09CT("enable_reduce_sample_rate")
    public final int sampleRate;

    public SpeechDetectionConfig() {
        this(0, 0, 0, 2, 64000, 16000, 0);
    }

    public SpeechDetectionConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.enable = i;
        this.enableDispatchIO = i2;
        this.enableReduceExtractAudioFile = i3;
        this.channels = i4;
        this.bitRate = i5;
        this.sampleRate = i6;
        this.disableMixAtOneTrack = i7;
    }
}
