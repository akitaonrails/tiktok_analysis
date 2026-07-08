package com.ss.solution.tako;

/* JADX INFO: loaded from: classes21.dex */
public class TakoAudioMediaInfo {
    public int mChannels;
    public TakoAudioPCMFormat mFormat;
    public int mSampleRate;

    public int getChannels() {
        return this.mChannels;
    }

    public TakoAudioPCMFormat getFormat() {
        return this.mFormat;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public TakoAudioMediaInfo(int i, int i2, TakoAudioPCMFormat takoAudioPCMFormat) {
        this.mSampleRate = i;
        this.mChannels = i2;
        this.mFormat = takoAudioPCMFormat;
    }

    public static TakoAudioMediaInfo create(int i, int i2, TakoAudioPCMFormat takoAudioPCMFormat) {
        return new TakoAudioMediaInfo(i, i2, takoAudioPCMFormat);
    }
}
