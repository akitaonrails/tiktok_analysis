package com.ss.android.vesdk.audio;

import X.C2218091Brb;
import X.C2218101Brc;
import X.C2218111Brd;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes35.dex */
public class VEAudioSample {
    public int byteSize;
    public C2218111Brd sampleBuffer;
    public long timeStamp;

    public int getByteSize() {
        return this.byteSize;
    }

    public C2218111Brd getSampleBuffer() {
        return this.sampleBuffer;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public VEAudioSample(C2218111Brd c2218111Brd, int i) {
        this.sampleBuffer = c2218111Brd;
        this.byteSize = i;
    }

    public static VEAudioSample createByteArrayAudioSample(byte[] bArr, int i) {
        return new VEAudioSample(new C2218091Brb(bArr), i);
    }

    public static VEAudioSample createByteBufferAudioSample(ByteBuffer byteBuffer, int i) {
        return new VEAudioSample(new C2218101Brc(byteBuffer), i);
    }
}
