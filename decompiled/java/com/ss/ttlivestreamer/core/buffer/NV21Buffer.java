package com.ss.ttlivestreamer.core.buffer;

import X.C1271900jCe;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class NV21Buffer extends VideoFrame.a {
    public long captureMs;
    public long captureServerNtpMs;
    public final byte[] data;
    public long effectServerNtpMs;
    public final int height;
    public RoiInfo mROIInfo;
    public final Runnable releaseCallback;
    public final int width;
    public final Object refCountLock = new Object();
    public int refCount = 1;

    public static native void nativeCropAndScale(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, int i8, ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11);

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer, com.ss.ttlivestreamer.core.buffer.VideoFrame.I420Buffer
    public int getBufferType() {
        return 5;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public VideoFrame.IExtraData getExtData() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public boolean isTexture() {
        return false;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        int i = this.width;
        int i2 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i, i2, i, i2);
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void release() {
        synchronized (this.refCountLock) {
            try {
                int i = this.refCount - 1;
                this.refCount = i;
                if (i == 0) {
                    Runnable runnable = this.releaseCallback;
                    if (runnable != null) {
                        runnable.run();
                    }
                    onBufferReleased();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void retain() {
        synchronized (this.refCountLock) {
            try {
                this.refCount++;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public long getCaptureMs() {
        return this.captureMs;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public long getCaptureServerNtpMs() {
        return this.captureServerNtpMs;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public long getEffectServerNtpMs() {
        return this.effectServerNtpMs;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public RoiInfo getROIInfo() {
        return this.mROIInfo;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void setROIInfo(RoiInfo roiInfo) {
        RoiInfo roiInfo2 = this.mROIInfo;
        if (roiInfo2 != roiInfo) {
            if (roiInfo2 != null) {
                roiInfo2.release();
            }
            this.mROIInfo = roiInfo;
        }
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void updateCaptureMs(long j) {
        this.captureMs = j;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void updateCaptureServerNtpMs(long j) {
        this.captureServerNtpMs = j;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void updateEffectServerNtpMs(long j) {
        this.effectServerNtpMs = j;
    }

    public NV21Buffer(byte[] bArr, int i, int i2, Runnable runnable) {
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.releaseCallback = runnable;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        C1271900jCe c1271900jCeLIZ = C1271900jCe.LIZ(i5, i6, null);
        nativeCropAndScale(i, i2, i3, i4, i5, i6, this.data, this.width, this.height, c1271900jCeLIZ.getDataY(), c1271900jCeLIZ.LJFF, c1271900jCeLIZ.getDataU(), c1271900jCeLIZ.LJI, c1271900jCeLIZ.getDataV(), c1271900jCeLIZ.LJII);
        c1271900jCeLIZ.LJIIL = this.captureMs;
        return c1271900jCeLIZ;
    }
}
