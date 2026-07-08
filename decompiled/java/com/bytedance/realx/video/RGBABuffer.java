package com.bytedance.realx.video;

import X.C1280200jQ2;
import com.bytedance.realx.base.RefCountDelegate;
import com.bytedance.realx.video.VideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public abstract class RGBABuffer implements VideoFrame.Buffer {
    public ByteBuffer buffer_;
    public int height_;
    public RefCountDelegate refCountDelegate;
    public int stride_;
    public int width_;

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getBufferType() {
        return 5;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return null;
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

    public ByteBuffer getBuffer() {
        return this.buffer_;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.height_;
    }

    public int getStride() {
        return this.stride_;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.width_;
    }
}
