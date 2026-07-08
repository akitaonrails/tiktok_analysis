package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoFramePool {
    public int align;
    public LyraxVideoColorSpace colorSpace;
    public LyraxVideoPixelFormat format;
    public int height;
    public long nativeHandle;
    public LyraxVideoRotation rotation;
    public int width;

    public static native LyraxVideoPooledFrame nativeAcquireFrame(long j);

    public static native long nativeCreateVideoFramePool(int i, int i2, LyraxVideoFrameType lyraxVideoFrameType, LyraxVideoPixelFormat lyraxVideoPixelFormat, int i3, int i4, int i5, LyraxVideoRotation lyraxVideoRotation, LyraxVideoColorSpace lyraxVideoColorSpace);

    public static native int nativeCurrentRemaining(long j);

    public static native void nativeRelease(long j);

    public synchronized LyraxVideoPooledFrame acquireFrame() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeAcquireFrame(j);
    }

    public synchronized int currentRemaining() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeCurrentRemaining(j);
    }

    public synchronized void release() {
        long j = this.nativeHandle;
        if (j == 0) {
            return;
        }
        nativeRelease(j);
        this.nativeHandle = 0L;
    }

    public LyraxVideoFramePool(long j) {
        this.nativeHandle = j;
    }

    public synchronized boolean isFramePoolEligible(LyraxVideoPixelFormat lyraxVideoPixelFormat, int i, int i2, int i3, LyraxVideoRotation lyraxVideoRotation, LyraxVideoColorSpace lyraxVideoColorSpace) {
        if (this.nativeHandle == 0) {
            return false;
        }
        if (lyraxVideoPixelFormat == this.format && i == this.width && i2 == this.height && i3 == this.align && lyraxVideoRotation == this.rotation) {
            if (lyraxVideoColorSpace == this.colorSpace) {
                return true;
            }
        }
        return false;
    }

    public LyraxVideoFramePool(int i, int i2, LyraxVideoPixelFormat lyraxVideoPixelFormat, int i3, int i4, int i5, LyraxVideoRotation lyraxVideoRotation, LyraxVideoColorSpace lyraxVideoColorSpace) {
        LyraxVideoFrameType lyraxVideoFrameType;
        this.format = lyraxVideoPixelFormat;
        this.width = i3;
        this.height = i4;
        this.align = i5;
        this.rotation = lyraxVideoRotation;
        this.colorSpace = lyraxVideoColorSpace;
        if (lyraxVideoPixelFormat != LyraxVideoPixelFormat.TEXTURE_OES && lyraxVideoPixelFormat != LyraxVideoPixelFormat.TEXTURE_2D) {
            lyraxVideoFrameType = LyraxVideoFrameType.RAW_MEMORY;
        } else {
            lyraxVideoFrameType = LyraxVideoFrameType.GL_TEXTURE;
        }
        this.nativeHandle = nativeCreateVideoFramePool(i, i2, lyraxVideoFrameType, lyraxVideoPixelFormat, i3, i4, i5, lyraxVideoRotation, lyraxVideoColorSpace);
    }
}
