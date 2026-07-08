package com.bytedance.realx.video;

import X.C1280200jQ2;
import com.bytedance.realx.base.RefCountDelegate;
import com.bytedance.realx.video.VideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class NV21Buffer implements VideoFrame.Buffer {
    public final byte[] data;
    public final int height;
    public final RefCountDelegate refCountDelegate;
    public final int stride;
    public final int width;

    public static native void nativeCropAndScale(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, int i8, ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11);

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getBufferType() {
        return 2;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        int i = this.stride;
        int i2 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i, i2, i, i2);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public final /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return C1280200jQ2.LIZ(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    public NV21Buffer(byte[] bArr, int i, int i2, Runnable runnable) {
        this.data = bArr;
        this.width = i;
        this.stride = i;
        this.height = i2;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(i, i2);
        if (javaI420BufferAllocate == null) {
            return null;
        }
        return javaI420BufferAllocate;
    }

    public NV21Buffer(byte[] bArr, int i, int i2, int i3, Runnable runnable) {
        this.data = bArr;
        this.stride = i;
        this.width = i2;
        this.height = i3;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(i5, i6);
        if (javaI420BufferAllocate == null) {
            return null;
        }
        nativeCropAndScale(i, i2, i3, i4, i5, i6, this.data, this.stride, this.height, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV());
        return javaI420BufferAllocate;
    }
}
