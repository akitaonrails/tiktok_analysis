package com.ss.ttlivestreamer.core.engine;

import X.C1282290jTP;
import com.tts.oecverify.BdTuring;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class FFMpegAudioResampler extends NativeObject {
    public C1282290jTP mInFormat;
    public C1282290jTP mOutFormat;

    public static int bytesPerSample(int i) {
        switch (i) {
            case 0:
            case 5:
                return 1;
            case 1:
            case 6:
                return 2;
            case 2:
            case 3:
            case 7:
            case 8:
                return 4;
            case 4:
            case BdTuring.TYPE_ECAF /* 9 */:
                return 8;
            default:
                return 0;
        }
    }

    public static boolean isPlaneFormat(int i) {
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
                return true;
            default:
                return false;
        }
    }

    private native int nativeConvert(ByteBuffer[] byteBufferArr, int i, ByteBuffer[] byteBufferArr2);

    private native void nativeCreate(int i, int i2, int i3, int i4, int i5, int i6);

    private native void nativeRelease(long j);

    public C1282290jTP getInAudioFormat() {
        return null;
    }

    public C1282290jTP getOutAudioFormat() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        nativeRelease(this.mNativeObj);
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void finalize() {
        release();
    }

    public FFMpegAudioResampler(C1282290jTP c1282290jTP, C1282290jTP c1282290jTP2) {
        throw null;
    }

    public int convert(ByteBuffer[] byteBufferArr, int i, ByteBuffer[] byteBufferArr2) {
        return nativeConvert(byteBufferArr, i, byteBufferArr2);
    }
}
