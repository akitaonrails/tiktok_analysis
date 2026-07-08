package com.ss.pusher.core.engine;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class FFMpegAudioResampler extends NativeObject {
    private native int nativeConvert(ByteBuffer[] byteBufferArr, int i, ByteBuffer[] byteBufferArr2);

    private native void nativeCreate(int i, int i2, int i3, int i4, int i5, int i6);

    private native void nativeRelease(long j);

    @Override // com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        nativeRelease(this.mNativeObj);
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public final void finalize() {
        release();
    }
}
