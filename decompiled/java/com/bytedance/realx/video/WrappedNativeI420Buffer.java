package com.bytedance.realx.video;

import X.C1280200jQ2;
import X.C1280510jQX;
import com.bytedance.realx.base.JniCommon;
import com.bytedance.realx.video.VideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class WrappedNativeI420Buffer implements VideoFrame.I420Buffer {
    public final ByteBuffer dataU;
    public final ByteBuffer dataV;
    public final ByteBuffer dataY;
    public final int height;
    public final long nativeBuffer;
    public final int strideU;
    public final int strideV;
    public final int strideY;
    public final int width;

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer, com.bytedance.realx.video.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        return C1280510jQX.LIZ(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public final /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return C1280200jQ2.LIZ(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
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
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        return JavaI420Buffer.scaleAndFillI420(this, i, i2, i3, i4);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return JavaI420Buffer.cropAndScaleI420(this, i, i2, i3, i4, i5, i6);
    }

    public WrappedNativeI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, long j) {
        this.width = i;
        this.height = i2;
        this.dataY = byteBuffer;
        this.strideY = i3;
        this.dataU = byteBuffer2;
        this.strideU = i4;
        this.dataV = byteBuffer3;
        this.strideV = i5;
        this.nativeBuffer = j;
        retain();
    }
}
