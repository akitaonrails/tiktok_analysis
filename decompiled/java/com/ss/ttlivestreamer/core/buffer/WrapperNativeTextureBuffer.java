package com.ss.ttlivestreamer.core.buffer;

import X.C1274040jG6;
import X.C1274080jGA;
import X.EnumC1273550jFJ;
import X.InterfaceC1268620j7M;
import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;

/* JADX INFO: loaded from: classes21.dex */
public class WrapperNativeTextureBuffer extends k {
    public long mNativeObj;

    private native void nativeRelease(long j);

    private native void nativeRetain(long j);

    private native VideoFrame.I420Buffer nativeToI420(long j);

    @Override // com.ss.ttlivestreamer.core.buffer.k, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer, com.ss.ttlivestreamer.core.buffer.VideoFrame.I420Buffer
    public int getBufferType() {
        return 1;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.k, com.ss.ttlivestreamer.core.buffer.VideoFrame.a, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public int getRefCount() {
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.k, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public synchronized void release() {
        nativeRelease(this.mNativeObj);
    }

    @Override // com.ss.ttlivestreamer.core.buffer.k, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void retain() {
        nativeRetain(this.mNativeObj);
    }

    @Override // com.ss.ttlivestreamer.core.buffer.k, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return nativeToI420(this.mNativeObj);
    }

    public static long isWrapperNativeFrame(VideoFrame videoFrame) {
        if (videoFrame == null) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("call isWrapperNativeFrame while frame is null");
            C1274080jGA.LIZ.LIZ("WrapperNativeTextureBuffer.isWrapperNativeFrame", androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
        if (videoFrame == null || !(videoFrame.getBuffer() instanceof WrapperNativeTextureBuffer)) {
            return 0L;
        }
        long j = ((WrapperNativeTextureBuffer) videoFrame.getBuffer()).mNativeObj;
        if (j != 0) {
            return j;
        }
        throw new AndroidRuntimeException("Wrapper texture buffer is null!, What happen!");
    }

    private void setROIInfoNative(long j) {
        if (j != 0) {
            setROIInfo(new RoiInfo(j));
        }
    }

    public WrapperNativeTextureBuffer(int i, int i2, int i3, long j) {
        this(i, i2, i3, new Matrix(), j);
        this.mNativeObj = j;
    }

    public WrapperNativeTextureBuffer(int i, int i2, int i3, Matrix matrix, long j) {
        super(i, i2, EnumC1273550jFJ.RGB, i3, matrix, (InterfaceC1268620j7M) null, (Runnable) null);
        this.mNativeObj = j;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.k, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i2 == i && i == 0 && i3 == i5 && i4 == i6) {
            retain();
            return this;
        }
        throw new AndroidRuntimeException("Please support matrix transcat and see construct method");
    }
}
