package com.ss.pusher.core.buffer;

import X.C1277780jM8;
import X.InterfaceC1279250jOV;
import com.ss.pusher.core.buffer.VideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class NV12Buffer implements VideoFrame.Buffer {
    public RoiInfo LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public static native void nativeCropAndScale(int i, int i2, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer, int i7, int i8, int i9, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13);

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final InterfaceC1279250jOV getExtData() {
        return null;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final int getHeight() {
        return 0;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final int getWidth() {
        return 0;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final boolean isTexture() {
        return false;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final VideoFrame.I420Buffer toI420() {
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, 0, 0, 0, 0);
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final long getCaptureMs() {
        return this.LIZIZ;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final long getCaptureTimeStampMs() {
        return this.LIZJ;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final long getEffectTimeStampMs() {
        return this.LIZLLL;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final RoiInfo getROIInfo() {
        return this.LIZ;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void release() {
        throw null;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void retain() {
        throw null;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void setCaptureTimeStampMs(long j) {
        this.LIZJ = j;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void setEffecTimeStampMs(long j) {
        this.LIZLLL = j;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void setROIInfo(RoiInfo roiInfo) {
        RoiInfo roiInfo2 = this.LIZ;
        if (roiInfo2 != roiInfo) {
            if (roiInfo2 != null) {
                roiInfo2.release();
            }
            this.LIZ = roiInfo;
        }
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void updateCaptureMs(long j) {
        this.LIZIZ = j;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        C1277780jM8 c1277780jM8LIZIZ = C1277780jM8.LIZIZ(i5, i6, null);
        nativeCropAndScale(i, i2, i3, i4, i5, i6, null, 0, 0, 0, 0, c1277780jM8LIZIZ.getDataY(), c1277780jM8LIZIZ.LJFF, c1277780jM8LIZIZ.getDataU(), c1277780jM8LIZIZ.LJI, c1277780jM8LIZIZ.getDataV(), c1277780jM8LIZIZ.LJII);
        return c1277780jM8LIZIZ;
    }
}
