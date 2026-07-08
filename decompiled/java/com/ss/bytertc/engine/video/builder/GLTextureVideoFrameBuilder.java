package com.ss.bytertc.engine.video.builder;

import X.C1C7U;
import android.opengl.EGLContext;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.video.VideoExternalData;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.builder.GLTextureVideoFrameBuilder;
import com.ss.bytertc.engine.video.impl.DirectBufferVideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class GLTextureVideoFrameBuilder {
    public final DirectBufferVideoFrame frame;

    public VideoFrame build() {
        return this.frame;
    }

    public GLTextureVideoFrameBuilder(VideoPixelFormat videoPixelFormat) {
        this.frame = new DirectBufferVideoFrame(videoPixelFormat);
    }

    public GLTextureVideoFrameBuilder setColorSpace(ColorSpace colorSpace) {
        this.frame.setColorSpace(colorSpace);
        return this;
    }

    public GLTextureVideoFrameBuilder setEGLContext(EGLContext eGLContext) {
        this.frame.setEGLContext(eGLContext);
        return this;
    }

    public GLTextureVideoFrameBuilder setExternalDataArray(VideoExternalData[] videoExternalDataArr) {
        this.frame.setExternalDataArray(videoExternalDataArr);
        return this;
    }

    public GLTextureVideoFrameBuilder setExternalDataInfo(ByteBuffer byteBuffer) {
        this.frame.setExternalDataInfo(byteBuffer);
        return this;
    }

    public GLTextureVideoFrameBuilder setGLSync(long j) {
        this.frame.setGLSync(j);
        return this;
    }

    public GLTextureVideoFrameBuilder setHeight(int i) {
        this.frame.setHeight(i);
        return this;
    }

    public GLTextureVideoFrameBuilder setOriginalCaptureTimestampMs(long j) {
        this.frame.setOriginalCaptureTimestampMs(j);
        return this;
    }

    public GLTextureVideoFrameBuilder setOriginalEffectTimestampMs(long j) {
        this.frame.setOriginalEffectTimestampMs(j);
        return this;
    }

    public GLTextureVideoFrameBuilder setReleaseCallback(final Runnable runnable) {
        if (runnable == null) {
            this.frame.setFrameDestroyedListener(null);
            return this;
        }
        this.frame.setFrameDestroyedListener(new VideoFrame.OnFrameDestroyedListener() { // from class: X.0jJl
            @Override // com.ss.bytertc.engine.video.VideoFrame.OnFrameDestroyedListener
            public final void OnFrameDestroyed(EGLContext eGLContext, int i, long j) {
                GLTextureVideoFrameBuilder.lambda$setReleaseCallback$0(runnable, eGLContext, i, j);
            }
        });
        return this;
    }

    public GLTextureVideoFrameBuilder setRotation(VideoRotation videoRotation) {
        this.frame.setRotation(videoRotation);
        return this;
    }

    public GLTextureVideoFrameBuilder setSupplementaryInfo(ByteBuffer byteBuffer) {
        this.frame.setSupplementaryInfo(byteBuffer);
        return this;
    }

    public GLTextureVideoFrameBuilder setTextureID(int i) {
        this.frame.setTextureID(i);
        return this;
    }

    public GLTextureVideoFrameBuilder setTextureMatrix(float[] fArr) {
        this.frame.setTextureMatrix(fArr);
        return this;
    }

    public GLTextureVideoFrameBuilder setTimeStampUs(long j) {
        this.frame.setTimeStampUs(j);
        return this;
    }

    public GLTextureVideoFrameBuilder setWidth(int i) {
        this.frame.setWidth(i);
        return this;
    }

    public static /* synthetic */ void lambda$setReleaseCallback$0(Runnable runnable, EGLContext eGLContext, int i, long j) {
        C1C7U.LIZ("GLTextureVideoFrameBuilder@ea0e.setReleaseCallback$1L");
        if (runnable != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("GLTextureVideoFrameBuilder@ea0e.setReleaseCallback$1L");
    }
}
