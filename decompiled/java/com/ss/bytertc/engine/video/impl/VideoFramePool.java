package com.ss.bytertc.engine.video.impl;

import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFramePool {
    public int align;
    public ColorSpace colorSpace;
    public VideoPixelFormat format;
    public int height;
    public long nativeHandle;
    public VideoRotation rotation;
    public int width;

    public static native LyraxVideoFrame nativeAcquireFrame(long j);

    public static native long nativeCreateVideoFramePool(int i, int i2, VideoFrameType videoFrameType, VideoPixelFormat videoPixelFormat, int i3, int i4, int i5, VideoRotation videoRotation, ColorSpace colorSpace);

    public static native int nativeCurrentRemaining(long j);

    public static native void nativeRelease(long j);

    public synchronized LyraxVideoFrame acquireFrame() {
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

    public VideoFramePool(long j) {
        this.nativeHandle = j;
    }

    public synchronized boolean isFramePoolEligible(VideoPixelFormat videoPixelFormat, int i, int i2, int i3, VideoRotation videoRotation, ColorSpace colorSpace) {
        if (this.nativeHandle == 0) {
            return false;
        }
        if (videoPixelFormat == this.format && i == this.width && i2 == this.height && i3 == this.align && videoRotation == this.rotation) {
            if (colorSpace == this.colorSpace) {
                return true;
            }
        }
        return false;
    }

    public VideoFramePool(int i, int i2, VideoPixelFormat videoPixelFormat, int i3, int i4, int i5, VideoRotation videoRotation, ColorSpace colorSpace) {
        VideoFrameType videoFrameType;
        this.format = videoPixelFormat;
        this.width = i3;
        this.height = i4;
        this.align = i5;
        this.rotation = videoRotation;
        this.colorSpace = colorSpace;
        if (videoPixelFormat != VideoPixelFormat.TEXTURE_OES && videoPixelFormat != VideoPixelFormat.TEXTURE_2D) {
            videoFrameType = VideoFrameType.RAW_MEMORY;
        } else {
            videoFrameType = VideoFrameType.GL_TEXTURE;
        }
        this.nativeHandle = nativeCreateVideoFramePool(i, i2, videoFrameType, videoPixelFormat, i3, i4, i5, videoRotation, colorSpace);
    }
}
