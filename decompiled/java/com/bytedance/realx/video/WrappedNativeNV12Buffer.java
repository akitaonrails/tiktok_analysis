package com.bytedance.realx.video;

import X.C1280520jQY;
import com.bytedance.realx.base.JniCommon;
import com.bytedance.realx.base.Logging;
import com.bytedance.realx.video.VideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class WrappedNativeNV12Buffer implements VideoFrame.NV12Buffer {
    public final ByteBuffer dataUV;
    public final ByteBuffer dataY;
    public final int height;
    public final long nativeBuffer;
    public final int strideUV;
    public final int strideY;
    public final int width;

    public static native void nativeNV12ToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.NV12Buffer, com.bytedance.realx.video.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        return C1280520jQY.LIZ(this);
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
        JniCommon.nativeReleaseRef(this.nativeBuffer);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        JniCommon.nativeAddRef(this.nativeBuffer);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(this.width, this.height);
        if (javaI420BufferAllocate == null) {
            return null;
        }
        nativeNV12ToI420(this.dataY, this.strideY, this.dataUV, this.strideUV, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV(), this.width, this.height);
        return javaI420BufferAllocate;
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
        Logging.e("WrappedNativeNV12Buffer", "scaleAndFill has not been implemented, default return null");
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        Logging.e("WrappedNativeNV12Buffer", "cropAndScale has not been implemented, default return null");
        return null;
    }

    public WrappedNativeNV12Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, long j) {
        this.width = i;
        this.height = i2;
        this.dataY = byteBuffer;
        this.strideY = i3;
        this.dataUV = byteBuffer2;
        this.strideUV = i4;
        this.nativeBuffer = j;
        retain();
    }
}
