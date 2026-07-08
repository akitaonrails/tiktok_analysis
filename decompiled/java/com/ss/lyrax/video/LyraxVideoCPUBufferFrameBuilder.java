package com.ss.lyrax.video;

import X.C1C7U;
import android.opengl.EGLContext;
import com.ss.lyrax.video.LyraxVideoCPUBufferFrameBuilder;
import com.ss.lyrax.video.LyraxVideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoCPUBufferFrameBuilder {
    public final LyraxVideoDirectBufferFrame frame;

    public LyraxVideoFrame build() {
        return this.frame;
    }

    public LyraxVideoCPUBufferFrameBuilder(LyraxVideoPixelFormat lyraxVideoPixelFormat) {
        this.frame = new LyraxVideoDirectBufferFrame(lyraxVideoPixelFormat);
    }

    public LyraxVideoCPUBufferFrameBuilder setColorSpace(LyraxVideoColorSpace lyraxVideoColorSpace) {
        this.frame.setColorSpace(lyraxVideoColorSpace);
        return this;
    }

    public LyraxVideoCPUBufferFrameBuilder setExtraDataArray(LyraxVideoExtraData[] lyraxVideoExtraDataArr) {
        this.frame.setExtraDataArray(lyraxVideoExtraDataArr);
        return this;
    }

    public LyraxVideoCPUBufferFrameBuilder setExtraDataInfo(ByteBuffer byteBuffer) {
        this.frame.setExtraDataInfo(byteBuffer);
        return this;
    }

    public LyraxVideoCPUBufferFrameBuilder setHeight(int i) {
        this.frame.setHeight(i);
        return this;
    }

    public LyraxVideoCPUBufferFrameBuilder setOriginalCaptureTimestampMs(long j) {
        this.frame.setOriginalCaptureTimestampMs(j);
        return this;
    }

    public LyraxVideoCPUBufferFrameBuilder setOriginalEffectTimestampMs(long j) {
        this.frame.setOriginalEffectTimestampMs(j);
        return this;
    }

    public LyraxVideoCPUBufferFrameBuilder setPipelineEvents(LyraxPipelineEvent[] lyraxPipelineEventArr) {
        this.frame.setPipelineEvents(lyraxPipelineEventArr);
        return this;
    }

    public LyraxVideoCPUBufferFrameBuilder setReleaseCallback(final Runnable runnable) {
        if (runnable == null) {
            this.frame.setFrameDestroyedListener(null);
            return this;
        }
        this.frame.setFrameDestroyedListener(new LyraxVideoFrame.OnFrameDestroyedListener() { // from class: X.0jN2
            @Override // com.ss.lyrax.video.LyraxVideoFrame.OnFrameDestroyedListener
            public final void OnFrameDestroyed(EGLContext eGLContext, int i, long j) {
                LyraxVideoCPUBufferFrameBuilder.lambda$setReleaseCallback$0(runnable, eGLContext, i, j);
            }
        });
        return this;
    }

    public LyraxVideoCPUBufferFrameBuilder setRotation(LyraxVideoRotation lyraxVideoRotation) {
        this.frame.setRotation(lyraxVideoRotation);
        return this;
    }

    public LyraxVideoCPUBufferFrameBuilder setSupplementaryInfo(ByteBuffer byteBuffer) {
        this.frame.setSupplementaryInfo(byteBuffer);
        return this;
    }

    public LyraxVideoCPUBufferFrameBuilder setTimeStampUs(long j) {
        this.frame.setTimeStampUs(j);
        return this;
    }

    public LyraxVideoCPUBufferFrameBuilder setWidth(int i) {
        this.frame.setWidth(i);
        return this;
    }

    public LyraxVideoCPUBufferFrameBuilder setPlaneData(int i, ByteBuffer byteBuffer) {
        this.frame.setPlaneData(i, byteBuffer);
        return this;
    }

    public LyraxVideoCPUBufferFrameBuilder setPlaneStride(int i, int i2) {
        this.frame.setPlaneStride(i, i2);
        return this;
    }

    public static /* synthetic */ void lambda$setReleaseCallback$0(Runnable runnable, EGLContext eGLContext, int i, long j) {
        C1C7U.LIZ("LyraxVideoCPUBufferFrameBuilder@4dfa.setReleaseCallback$1L");
        if (runnable != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("LyraxVideoCPUBufferFrameBuilder@4dfa.setReleaseCallback$1L");
    }
}
