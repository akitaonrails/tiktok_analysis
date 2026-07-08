package com.ss.lyrax.video;

import X.C1C7U;
import android.opengl.EGLContext;
import com.bytedance.realx.video.memory.RefObject;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public abstract class LyraxVideoFrame {
    public static final LyraxPipelineEvent[] EMPTY_PIPELINE_EVENTS = new LyraxPipelineEvent[0];
    public LyraxPipelineEvent[] pipelineEvents = EMPTY_PIPELINE_EVENTS;
    public RefObject refCount;
    public Runnable userReleaseCallback;

    public interface OnFrameDestroyedListener {
        void OnFrameDestroyed(EGLContext eGLContext, int i, long j);
    }

    public abstract void freeVideoFrame();

    public abstract LyraxVideoColorSpace getColorSpace();

    public abstract EGLContext getEGLContext();

    public abstract long getEnterDecoderTimestampMs();

    public abstract LyraxVideoExtraData[] getExtraDataArray();

    public abstract ByteBuffer getExtraDataInfo();

    public abstract LyraxVideoFrameType getFrameType();

    public abstract long getGLSync();

    public abstract int getHeight();

    public abstract long getLeaveDecoderTimestampMs();

    public abstract int getNumberOfPlanes();

    public abstract long getOriginalCaptureTimestampMs();

    public abstract long getOriginalEffectTimestampMs();

    public abstract LyraxVideoPixelFormat getPixelFormat();

    public abstract ByteBuffer getPlaneData(int i);

    public abstract int getPlaneStride(int i);

    public abstract LyraxVideoRotation getRotation();

    public abstract ByteBuffer getSupplementaryInfo();

    public abstract int getTextureID();

    public abstract float[] getTextureMatrix();

    public abstract long getTimeStampUs();

    public abstract int getWidth();

    public boolean hasReleaseCallback() {
        return true;
    }

    public abstract boolean isBlackFrame();

    public synchronized void release() {
        RefObject refObject = this.refCount;
        if (refObject != null) {
            refObject.release();
        }
    }

    public synchronized void retain() {
        RefObject refObject = this.refCount;
        if (refObject != null) {
            refObject.retain();
        }
    }

    public abstract boolean setColorSpace(LyraxVideoColorSpace lyraxVideoColorSpace);

    public abstract boolean setEGLContext(EGLContext eGLContext);

    public abstract boolean setExtraDataArray(LyraxVideoExtraData[] lyraxVideoExtraDataArr);

    public abstract boolean setExtraDataInfo(ByteBuffer byteBuffer);

    public abstract void setFrameDestroyedListener(OnFrameDestroyedListener onFrameDestroyedListener);

    public abstract boolean setGLSync(long j);

    public abstract boolean setOriginalCaptureTimestampMs(long j);

    public abstract boolean setOriginalEffectTimestampMs(long j);

    public abstract boolean setRotation(LyraxVideoRotation lyraxVideoRotation);

    public abstract boolean setSupplementaryInfo(ByteBuffer byteBuffer);

    public abstract boolean setTextureID(int i);

    public abstract boolean setTextureMatrix(float[] fArr);

    public abstract boolean setTimeStampUs(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetRefCount$0() {
        C1C7U.LIZ("LyraxVideoFrame@6f94.resetRefCount$1L");
        freeVideoFrame();
        C1C7U.LIZIZ("LyraxVideoFrame@6f94.resetRefCount$1L");
    }

    public void resetRefCount() {
        this.refCount = new RefObject(new Runnable() { // from class: X.0jNO
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$resetRefCount$0();
            }
        });
    }

    public LyraxVideoFrame() {
        resetRefCount();
    }

    public LyraxPipelineEvent[] getPipelineEvents() {
        return this.pipelineEvents;
    }

    public boolean setPipelineEvents(LyraxPipelineEvent[] lyraxPipelineEventArr) {
        if (lyraxPipelineEventArr == null) {
            lyraxPipelineEventArr = EMPTY_PIPELINE_EVENTS;
        }
        this.pipelineEvents = lyraxPipelineEventArr;
        return true;
    }
}
