package com.ss.bytertc.engine.video.builder;

import X.C1C7U;
import android.opengl.EGLContext;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.video.VideoExternalData;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.builder.CpuBufferVideoFrameBuilder;
import com.ss.bytertc.engine.video.impl.DirectBufferVideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class CpuBufferVideoFrameBuilder {
    public final DirectBufferVideoFrame frame;

    public VideoFrame build() {
        return this.frame;
    }

    public CpuBufferVideoFrameBuilder(VideoPixelFormat videoPixelFormat) {
        this.frame = new DirectBufferVideoFrame(videoPixelFormat);
    }

    public CpuBufferVideoFrameBuilder setColorSpace(ColorSpace colorSpace) {
        this.frame.setColorSpace(colorSpace);
        return this;
    }

    public CpuBufferVideoFrameBuilder setExternalDataArray(VideoExternalData[] videoExternalDataArr) {
        this.frame.setExternalDataArray(videoExternalDataArr);
        return this;
    }

    public CpuBufferVideoFrameBuilder setExternalDataInfo(ByteBuffer byteBuffer) {
        this.frame.setExternalDataInfo(byteBuffer);
        return this;
    }

    public CpuBufferVideoFrameBuilder setHeight(int i) {
        this.frame.setHeight(i);
        return this;
    }

    public CpuBufferVideoFrameBuilder setOriginalCaptureTimestampMs(long j) {
        this.frame.setOriginalCaptureTimestampMs(j);
        return this;
    }

    public CpuBufferVideoFrameBuilder setOriginalEffectTimestampMs(long j) {
        this.frame.setOriginalEffectTimestampMs(j);
        return this;
    }

    public CpuBufferVideoFrameBuilder setReleaseCallback(final Runnable runnable) {
        if (runnable == null) {
            this.frame.setFrameDestroyedListener(null);
            return this;
        }
        this.frame.setFrameDestroyedListener(new VideoFrame.OnFrameDestroyedListener() { // from class: X.0jJI
            @Override // com.ss.bytertc.engine.video.VideoFrame.OnFrameDestroyedListener
            public final void OnFrameDestroyed(EGLContext eGLContext, int i, long j) {
                CpuBufferVideoFrameBuilder.lambda$setReleaseCallback$0(runnable, eGLContext, i, j);
            }
        });
        return this;
    }

    public CpuBufferVideoFrameBuilder setRotation(VideoRotation videoRotation) {
        this.frame.setRotation(videoRotation);
        return this;
    }

    public CpuBufferVideoFrameBuilder setSupplementaryInfo(ByteBuffer byteBuffer) {
        this.frame.setSupplementaryInfo(byteBuffer);
        return this;
    }

    public CpuBufferVideoFrameBuilder setTimeStampUs(long j) {
        this.frame.setTimeStampUs(j);
        return this;
    }

    public CpuBufferVideoFrameBuilder setWidth(int i) {
        this.frame.setWidth(i);
        return this;
    }

    public CpuBufferVideoFrameBuilder setPlaneData(int i, ByteBuffer byteBuffer) {
        this.frame.setPlaneData(i, byteBuffer);
        return this;
    }

    public CpuBufferVideoFrameBuilder setPlaneStride(int i, int i2) {
        this.frame.setPlaneStride(i, i2);
        return this;
    }

    public static /* synthetic */ void lambda$setReleaseCallback$0(Runnable runnable, EGLContext eGLContext, int i, long j) {
        C1C7U.LIZ("CpuBufferVideoFrameBuilder@6e8.setReleaseCallback$1L");
        if (runnable != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("CpuBufferVideoFrameBuilder@6e8.setReleaseCallback$1L");
    }
}
