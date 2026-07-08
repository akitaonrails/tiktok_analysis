package com.ss.solution.tako;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class TakoAudioFrameInfo {
    public ByteBuffer[] mBuffers;
    public int mSamples;

    public ByteBuffer[] getBuffers() {
        return this.mBuffers;
    }

    public int getSamples() {
        return this.mSamples;
    }

    public TakoAudioFrameInfo(ByteBuffer[] byteBufferArr, int i) {
        this.mBuffers = byteBufferArr;
        this.mSamples = i;
    }

    public static TakoAudioFrameInfo create(ByteBuffer[] byteBufferArr, int i) {
        return new TakoAudioFrameInfo(byteBufferArr, i);
    }
}
