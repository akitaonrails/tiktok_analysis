package com.ss.lyrax.video;

import X.C1C7U;
import android.opengl.EGLContext;
import com.ss.lyrax.video.LyraxVideoFrame;
import com.ss.lyrax.video.LyraxVideoGLTextureFrameBuilder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoGLTextureFrameBuilder {
    public final LyraxVideoDirectBufferFrame frame;

    public LyraxVideoFrame build() {
        return this.frame;
    }

    public LyraxVideoGLTextureFrameBuilder(LyraxVideoPixelFormat lyraxVideoPixelFormat) {
        this.frame = new LyraxVideoDirectBufferFrame(lyraxVideoPixelFormat);
    }

    public LyraxVideoGLTextureFrameBuilder setColorSpace(LyraxVideoColorSpace lyraxVideoColorSpace) {
        this.frame.setColorSpace(lyraxVideoColorSpace);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setEGLContext(EGLContext eGLContext) {
        this.frame.setEGLContext(eGLContext);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setExtraDataArray(LyraxVideoExtraData[] lyraxVideoExtraDataArr) {
        this.frame.setExtraDataArray(lyraxVideoExtraDataArr);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setExtraDataInfo(ByteBuffer byteBuffer) {
        this.frame.setExtraDataInfo(byteBuffer);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setGLSync(long j) {
        this.frame.setGLSync(j);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setHeight(int i) {
        this.frame.setHeight(i);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setOriginalCaptureTimestampMs(long j) {
        this.frame.setOriginalCaptureTimestampMs(j);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setOriginalEffectTimestampMs(long j) {
        this.frame.setOriginalEffectTimestampMs(j);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setPipelineEvents(LyraxPipelineEvent[] lyraxPipelineEventArr) {
        this.frame.setPipelineEvents(lyraxPipelineEventArr);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setReleaseCallback(final Runnable runnable) {
        if (runnable == null) {
            this.frame.setFrameDestroyedListener(null);
            return this;
        }
        this.frame.setFrameDestroyedListener(new LyraxVideoFrame.OnFrameDestroyedListener() { // from class: X.0jN5
            @Override // com.ss.lyrax.video.LyraxVideoFrame.OnFrameDestroyedListener
            public final void OnFrameDestroyed(EGLContext eGLContext, int i, long j) {
                LyraxVideoGLTextureFrameBuilder.lambda$setReleaseCallback$0(runnable, eGLContext, i, j);
            }
        });
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setRotation(LyraxVideoRotation lyraxVideoRotation) {
        this.frame.setRotation(lyraxVideoRotation);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setSupplementaryInfo(ByteBuffer byteBuffer) {
        this.frame.setSupplementaryInfo(byteBuffer);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setTextureID(int i) {
        this.frame.setTextureID(i);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setTextureMatrix(float[] fArr) {
        this.frame.setTextureMatrix(fArr);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setTimeStampUs(long j) {
        this.frame.setTimeStampUs(j);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder setWidth(int i) {
        this.frame.setWidth(i);
        return this;
    }

    public LyraxVideoGLTextureFrameBuilder(LyraxVideoDirectBufferFrame lyraxVideoDirectBufferFrame) {
        this.frame = lyraxVideoDirectBufferFrame;
    }

    public static /* synthetic */ void lambda$setReleaseCallback$0(Runnable runnable, EGLContext eGLContext, int i, long j) {
        C1C7U.LIZ("LyraxVideoGLTextureFrameBuilder@bf1a.setReleaseCallback$1L");
        if (runnable != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("LyraxVideoGLTextureFrameBuilder@bf1a.setReleaseCallback$1L");
    }
}
