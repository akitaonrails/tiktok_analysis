package com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class VCOptConfig {

    @C09CT("bit_rate")
    public final int bitRate;

    @C09CT("channel")
    public final int channels;

    @C09CT("sample_rate")
    public final int sampleRate;

    public VCOptConfig() {
        this(2, 44100, 128000);
    }

    public VCOptConfig(int i, int i2, int i3) {
        this.channels = i;
        this.sampleRate = i2;
        this.bitRate = i3;
    }
}
