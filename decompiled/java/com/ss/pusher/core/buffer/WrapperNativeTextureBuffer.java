package com.ss.pusher.core.buffer;

import X.C1277790jM9;
import android.util.AndroidRuntimeException;
import com.ss.pusher.core.buffer.VideoFrame;

/* JADX INFO: loaded from: classes21.dex */
public class WrapperNativeTextureBuffer extends C1277790jM9 {
    private native void nativeRelease(long j);

    private native void nativeRetain(long j);

    private native VideoFrame.I420Buffer nativeToI420(long j);

    @Override // X.C1277790jM9, X.InterfaceC1278160jMk
    public final long LIZ() {
        return 0L;
    }

    @Override // X.C1277790jM9, com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final synchronized void release() {
        nativeRelease(0L);
    }

    @Override // X.C1277790jM9, com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void retain() {
        nativeRetain(0L);
    }

    @Override // X.C1277790jM9, com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final VideoFrame.I420Buffer toI420() {
        return nativeToI420(0L);
    }

    @Override // X.C1277790jM9, com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i2 == i && i == 0 && i3 == i5 && i4 == i6) {
            retain();
            return this;
        }
        throw new AndroidRuntimeException("Please support matrix transcat and see construct method");
    }
}
