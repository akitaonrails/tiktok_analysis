package com.bytedance.realx.video;

import com.bytedance.realx.base.RefCountDelegate;
import com.bytedance.realx.video.VideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class NV12Buffer implements VideoFrame.NV12Buffer {
    public final ByteBuffer buffer;
    public final ByteBuffer dataUV;
    public final ByteBuffer dataY;
    public final int height;
    public final RefCountDelegate refCountDelegate;
    public final int sliceHeight;
    public final int stride;
    public final int strideUV;
    public final int strideY;
    public final int width;

    public static native void nativeCropAndScale(int i, int i2, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer, int i7, int i8, int i9, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13);

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.NV12Buffer, com.bytedance.realx.video.VideoFrame.Buffer
    public int getBufferType() {
        return 1;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        int i = this.width;
        int i2 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i, i2, i, i2);
    }

    @Override // com.bytedance.realx.video.VideoFrame.NV12Buffer
    public ByteBuffer getDataUV() {
        return this.dataUV.slice();
    }

    @Override // com.bytedance.realx.video.VideoFrame.NV12Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
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

    @Override // com.bytedance.realx.video.VideoFrame.NV12Buffer
    public int getStrideUV() {
        return this.strideUV;
    }

    @Override // com.bytedance.realx.video.VideoFrame.NV12Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.NV12Buffer toNV12() {
        retain();
        return this;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(i, i2);
        if (javaI420BufferAllocate == null) {
            return null;
        }
        return javaI420BufferAllocate;
    }

    public NV12Buffer(int i, int i2, int i3, int i4, ByteBuffer byteBuffer, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.stride = i3;
        this.sliceHeight = i4;
        this.buffer = byteBuffer;
        this.strideY = i3;
        this.strideUV = i3;
        int i5 = i3 * i2;
        byteBuffer.position(0);
        byteBuffer.limit(i5);
        this.dataY = byteBuffer.slice();
        byteBuffer.position(i5);
        byteBuffer.limit(i5 + (((i2 + 1) / 2) * i3));
        this.dataUV = byteBuffer.slice();
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(i5, i6);
        if (javaI420BufferAllocate == null) {
            return null;
        }
        nativeCropAndScale(i, i2, i3, i4, i5, i6, this.buffer, this.width, this.height, this.stride, this.sliceHeight, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV());
        return javaI420BufferAllocate;
    }
}
