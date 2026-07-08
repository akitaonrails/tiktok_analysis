package com.ss.pusher.core.buffer;

import X.C1277780jM8;
import X.InterfaceC1278160jMk;
import X.InterfaceC1279250jOV;
import Y.ARunnableS120S0100000_20;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFrame {
    public final Buffer buffer;
    public final int rotation;
    public long timestampNs;

    public interface Buffer {
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        long getCaptureMs();

        long getCaptureTimeStampMs();

        long getEffectTimeStampMs();

        InterfaceC1279250jOV getExtData();

        int getHeight();

        RoiInfo getROIInfo();

        int getWidth();

        boolean isTexture();

        void release();

        void retain();

        void setCaptureTimeStampMs(long j);

        void setEffecTimeStampMs(long j);

        void setROIInfo(RoiInfo roiInfo);

        I420Buffer toI420();

        void updateCaptureMs(long j);
    }

    public interface I420Buffer extends Buffer {
        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);

    public InterfaceC1279250jOV getExtraData() {
        this.buffer.getExtData();
        return null;
    }

    public int getRotatedHeight() {
        return this.rotation % 180 == 0 ? this.buffer.getHeight() : this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        return this.rotation % 180 == 0 ? this.buffer.getWidth() : this.buffer.getHeight();
    }

    public boolean isTexture() {
        return this.buffer instanceof InterfaceC1278160jMk;
    }

    public void release() {
        this.buffer.release();
    }

    public void retain() {
        this.buffer.retain();
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    public void setTimestampNs(long j) {
        this.timestampNs = j;
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        if (buffer != null) {
            if (i % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i;
                this.timestampNs = j;
                return;
            }
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        throw new IllegalArgumentException("buffer not allowed to be null");
    }

    public static Buffer cropAndScaleI420(I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == i5 && i4 == i6 && i == 0 && i2 == 0) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            i420Buffer.getStrideY();
            dataY.position(0);
            i420Buffer.getStrideU();
            dataU.position(0);
            dataV.position(0 + (i420Buffer.getStrideV() * 0));
            i420Buffer.retain();
            int width = i420Buffer.getWidth();
            int height = i420Buffer.getHeight();
            ByteBuffer byteBufferSlice = dataY.slice();
            int strideY = i420Buffer.getStrideY();
            ByteBuffer byteBufferSlice2 = dataU.slice();
            int strideU = i420Buffer.getStrideU();
            return C1277780jM8.LIZJ(byteBufferSlice, byteBufferSlice2, dataV.slice(), width, height, strideY, strideU, i420Buffer.getCaptureMs(), i420Buffer.getStrideV(), new ARunnableS120S0100000_20(i420Buffer, 90));
        }
        C1277780jM8 c1277780jM8LIZIZ = C1277780jM8.LIZIZ(i5, i6, null);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i, i2, i3, i4, c1277780jM8LIZIZ.getDataY(), c1277780jM8LIZIZ.LJFF, c1277780jM8LIZIZ.getDataU(), c1277780jM8LIZIZ.LJI, c1277780jM8LIZIZ.getDataV(), c1277780jM8LIZIZ.LJII, i5, i6);
        c1277780jM8LIZIZ.LJIIL = i420Buffer.getCaptureMs();
        return c1277780jM8LIZIZ;
    }
}
