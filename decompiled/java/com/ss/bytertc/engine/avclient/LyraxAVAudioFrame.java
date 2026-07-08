package com.ss.bytertc.engine.avclient;

import X.C2188811AlT;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LyraxAVAudioFrame {
    public final ByteBuffer[] mBuffers;
    public final int mSamples;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyraxAVAudioFrame)) {
            return false;
        }
        LyraxAVAudioFrame lyraxAVAudioFrame = (LyraxAVAudioFrame) obj;
        return Intrinsics.LJFF(this.mBuffers, lyraxAVAudioFrame.mBuffers) && this.mSamples == lyraxAVAudioFrame.mSamples;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.mBuffers) * 31) + this.mSamples;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxAVAudioFrame(mBuffers=");
        sbLIZ.append(Arrays.toString(this.mBuffers));
        sbLIZ.append(", mSamples=");
        sbLIZ.append(this.mSamples);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxAVAudioFrame(ByteBuffer[] byteBufferArr, int i) {
        this.mBuffers = byteBufferArr;
        this.mSamples = i;
    }
}
